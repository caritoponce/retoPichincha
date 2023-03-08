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
import com.retopichincha.dto.MovimientoDto;
import com.retopichincha.servicio.IServicioMovimiento;


@RestController
@RequestMapping("/movimientos")
public class ControladorMovimientos {
	
	@Autowired
	private IServicioMovimiento servicioMovimiento;
	
	private static final Logger logger = LoggerFactory.getLogger(ControladorMovimientos.class);
	
	@GetMapping("/{idMovimiento}")
	private ResponseEntity<MovimientoDto> getMovimiento(@PathVariable("idMovimiento") Integer idMovimiento) {
		
		try {	
			MovimientoDto movimientoDto= servicioMovimiento.buscar(idMovimiento);
			logger.debug("Movimiento a consultar {}", movimientoDto.toString());
			return ResponseEntity.ok(movimientoDto);
		}catch(Exception e) {
			logger.error("Error al consultar movimiento", e.toString());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@PostMapping("/")
	private ResponseEntity<MovimientoDto> crearMovimiento(@RequestBody MovimientoDto movimientoDto){
		
		try {			
			servicioMovimiento.guardar(movimientoDto);
			logger.debug("Movimiento a crear {}", movimientoDto.toString());
			return ResponseEntity.ok(movimientoDto);	
		}catch(Exception e) {
			logger.error("Error al crear movimiento", e.toString());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@DeleteMapping("/")
	private ResponseEntity<MovimientoDto> eliminarCliente(@RequestBody MovimientoDto movimientoDto){
		
		try {			
			servicioMovimiento.eliminar(movimientoDto);
			logger.debug("Movimiento a eliminar {}", movimientoDto.toString());
			return ResponseEntity.ok(movimientoDto);	
		}catch(Exception e) {
			logger.error("Error al eliminar movimiento", e.toString());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@PutMapping("/")
	private ResponseEntity<MovimientoDto> actualizarCliente(@RequestBody MovimientoDto movimientoDto){
		
		try {			
			servicioMovimiento.actualizar(movimientoDto);
			logger.debug("Movimiento actualizar {}", movimientoDto.toString());
			return ResponseEntity.ok(movimientoDto);	
		}catch(Exception e) {
			logger.error("Error al actualizar movimiento", e.toString());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}

}
