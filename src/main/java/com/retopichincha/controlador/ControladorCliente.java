package com.retopichincha.controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retopichincha.dto.ClienteDto;
import com.retopichincha.entidades.Cliente;
import com.retopichincha.servicio.IServicioCliente;
import com.retopichincha.utils.Utils;

@RestController
@RequestMapping("/clientes")
public class ControladorCliente {
	
	@Autowired
	private IServicioCliente servicioCliente;
	
		
	@GetMapping("/{idCliente}")
	private ClienteDto getCliente(@PathVariable("idCliente") Integer idCliente) {
		
		Cliente cliente= servicioCliente.buscar(idCliente);
		return Utils.convertToDto(cliente);		
		
	}
	
	

}
