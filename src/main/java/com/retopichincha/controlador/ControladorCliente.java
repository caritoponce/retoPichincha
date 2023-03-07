package com.retopichincha.controlador;


import java.util.Date;

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
	
		
	@GetMapping("/{idCliente}")
	private ResponseEntity<ClienteDto> getCliente(@PathVariable("idCliente") Integer idCliente) {
		
		try {	
			ClienteDto clienteDto= servicioCliente.buscar(idCliente);
			return ResponseEntity.ok(clienteDto);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
		
	}
	
	@PostMapping("/")
	private ResponseEntity<ClienteDto> crearCliente(@RequestBody ClienteDto clienteDto){
		
		try {			
			servicioCliente.guardar(clienteDto);
			return ResponseEntity.ok(clienteDto);	
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@DeleteMapping("/")
	private ResponseEntity<ClienteDto> eliminarCliente(@RequestBody ClienteDto clienteDto){
		
		try {			
			servicioCliente.eliminar(clienteDto);
			return ResponseEntity.ok(clienteDto);	
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@PutMapping("/")
	private ResponseEntity<ClienteDto> actualizarCliente(@RequestBody ClienteDto clienteDto){
		
		try {			
			servicioCliente.actualizar(clienteDto);
			return ResponseEntity.ok(clienteDto);	
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	

	

}
