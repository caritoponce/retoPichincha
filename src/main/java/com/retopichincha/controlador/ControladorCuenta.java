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
import com.retopichincha.dto.CuentaDto;
import com.retopichincha.servicio.IServicioCuenta;


@RestController
@RequestMapping("/cuentas")
public class ControladorCuenta {
	
	@Autowired
	private IServicioCuenta servicioCuenta;
	
	private static final Logger logger = LoggerFactory.getLogger(ControladorCuenta.class);
	
	@GetMapping("/{idCuenta}")
	private ResponseEntity<CuentaDto> getCuenta(@PathVariable("idCuenta") Integer idCuenta) {		
		
		try {
			CuentaDto cuentaDto= servicioCuenta.buscar(idCuenta);
			logger.debug("Cuenta a consultar {}", cuentaDto.toString());
			return ResponseEntity.ok(cuentaDto);	
		}catch(Exception e) {
			logger.error("Error al consultar cuenta", e.toString());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
			
		
	}
	
	@PostMapping("/")
	private ResponseEntity<CuentaDto> crearCuenta(@RequestBody CuentaDto cuentaDto){
		
		try {			
			servicioCuenta.guardar(cuentaDto);
			logger.debug("Cuenta a crear {}", cuentaDto.toString());
			return ResponseEntity.ok(cuentaDto);	
		}catch(Exception e) {
			logger.error("Error al crear cuenta", e.toString());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@DeleteMapping("/")
	private ResponseEntity<CuentaDto> eliminarCuenta(@RequestBody CuentaDto cuentaDto){
		
		try {			
			servicioCuenta.eliminar(cuentaDto);
			logger.debug("Cuenta a eliminar {}", cuentaDto.toString());
			return ResponseEntity.ok(cuentaDto);	
		}catch(Exception e) {
			logger.error("Error al eliminar cuenta", e.toString());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@PutMapping("/")
	private ResponseEntity<CuentaDto> actualizarCuenta(@RequestBody CuentaDto cuentaDto){
		
		try {			
			servicioCuenta.actualizar(cuentaDto);
			logger.debug("Cuenta actualizar {}", cuentaDto.toString());
			return ResponseEntity.ok(cuentaDto);	
		}catch(Exception e) {
			logger.error("Error al actualizar cuenta", e.toString());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}

}
