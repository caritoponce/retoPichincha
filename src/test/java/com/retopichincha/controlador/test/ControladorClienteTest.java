package com.retopichincha.controlador.test;


import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.retopichincha.dto.ClienteDto;
import com.retopichincha.entidades.Cliente;
import com.retopichincha.repositorio.impl.RepositorioCliente;
import com.retopichincha.servicio.impl.ServicioImplCliente;


import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ControladorClienteTest {
	
	@Mock
	private RepositorioCliente repositorioCliente;
	
	@InjectMocks
	private ServicioImplCliente servicioCliente;
	
	

	 
	 @DisplayName("JUnit test para consultar cliente")
	 @Test
	 public void givenCliente(){
		 //given
	     given(repositorioCliente.buscar(any()))
            .willReturn(traerCliente());
		 //When
	     ClienteDto result = servicioCliente.buscar(12);
		 //then
	     assertNotNull(result);
	     assertEquals(12, result.getIdCliente());
	     verify(repositorioCliente, times(1)).buscar(any());

	 }
	 
	 private Cliente traerCliente() {
		 return Cliente.builder()
         		.idCliente(12)
         		.build();
	 }

	
	
	
}
