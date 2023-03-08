package com.retopichincha.controlador;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.retopichincha.dto.ClienteDto;
import com.retopichincha.servicio.IServicioCliente;


@RestController
@RequestMapping("/clientes")
public class ControladorCliente {
	
	@Autowired
	private IServicioCliente servicioCliente;
	
	private static final Logger logger = LoggerFactory.getLogger(ControladorCliente.class);
	
		
	@GetMapping("/{idCliente}")
	private ResponseEntity<ClienteDto> getCliente(@PathVariable("idCliente") Integer idCliente) {
		
		try {	
			ClienteDto clienteDto= servicioCliente.buscar(idCliente);
			logger.debug("Cliente a consultar {}", clienteDto.toString());
			return ResponseEntity.ok(clienteDto);
		}catch(Exception e) {
			logger.error("Error al consultar cliente", e.toString());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
			
		}
		
	}
	
	@PostMapping("/")
	private ResponseEntity<ClienteDto> crearCliente(@RequestBody ClienteDto clienteDto){
		
		try {			
			servicioCliente.guardar(clienteDto);
			logger.debug("Cliente creado {}", clienteDto.toString());
			return ResponseEntity.ok(clienteDto);	
		}catch(Exception e) {
			logger.error("Error al crear cliente", e.toString());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@DeleteMapping("/")
	private ResponseEntity<ClienteDto> eliminarCliente(@RequestBody ClienteDto clienteDto){
		
		try {			
			servicioCliente.eliminar(clienteDto);
			logger.debug("Cliente eliminado {}", clienteDto.toString());
			return ResponseEntity.ok(clienteDto);	
		}catch(Exception e) {
			logger.error("Error al eliminar cliente", e.toString());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@PutMapping("/")
	private ResponseEntity<ClienteDto> actualizarCliente(@RequestBody ClienteDto clienteDto){
		
		try {			
			servicioCliente.actualizar(clienteDto);
			logger.debug("Cliente actualizado {}", clienteDto.toString());
			return ResponseEntity.ok(clienteDto);	
		}catch(Exception e) {
			logger.error("Error al actualizar cliente", e.toString());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	

	

}
