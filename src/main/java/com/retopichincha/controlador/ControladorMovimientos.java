package com.retopichincha.controlador;

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
import com.retopichincha.dto.MovimientoDto;
import com.retopichincha.servicio.IServicioMovimiento;


@RestController
@RequestMapping("/movimientos")
public class ControladorMovimientos {
	
	@Autowired
	private IServicioMovimiento servicioMovimiento;
	
	@GetMapping("/{idMovimiento}")
	private ResponseEntity<MovimientoDto> getMovimiento(@PathVariable("idMovimiento") Integer idMovimiento) {
		
		try {	
			MovimientoDto movimientoDto= servicioMovimiento.buscar(idMovimiento);
			return ResponseEntity.ok(movimientoDto);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@PostMapping("/")
	private ResponseEntity<MovimientoDto> crearMovimiento(@RequestBody MovimientoDto movimientoDto){
		
		try {			
			servicioMovimiento.guardar(movimientoDto);
			return ResponseEntity.ok(movimientoDto);	
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@DeleteMapping("/")
	private ResponseEntity<MovimientoDto> eliminarCliente(@RequestBody MovimientoDto movimientoDto){
		
		try {			
			servicioMovimiento.eliminar(movimientoDto);
			return ResponseEntity.ok(movimientoDto);	
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@PutMapping("/")
	private ResponseEntity<MovimientoDto> actualizarCliente(@RequestBody MovimientoDto movimientoDto){
		
		try {			
			servicioMovimiento.actualizar(movimientoDto);
			return ResponseEntity.ok(movimientoDto);	
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}

}
