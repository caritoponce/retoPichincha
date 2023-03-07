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
import com.retopichincha.dto.CuentaDto;
import com.retopichincha.servicio.IServicioCuenta;


@RestController
@RequestMapping("/cuentas")
public class ControladorCuenta {
	
	@Autowired
	private IServicioCuenta servicioCuenta;
	
	@GetMapping("/{idCuenta}")
	private ResponseEntity<CuentaDto> getCuenta(@PathVariable("idCuenta") Integer idCuenta) {		
		
		try {
			CuentaDto cuentaDto= servicioCuenta.buscar(idCuenta);
			return ResponseEntity.ok(cuentaDto);	
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
			
		
	}
	
	@PostMapping("/")
	private ResponseEntity<CuentaDto> crearCuenta(@RequestBody CuentaDto cuentaDto){
		
		try {			
			servicioCuenta.guardar(cuentaDto);
			return ResponseEntity.ok(cuentaDto);	
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@DeleteMapping("/")
	private ResponseEntity<CuentaDto> eliminarCuenta(@RequestBody CuentaDto cuentaDto){
		
		try {			
			servicioCuenta.eliminar(cuentaDto);
			return ResponseEntity.ok(cuentaDto);	
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@PutMapping("/")
	private ResponseEntity<CuentaDto> actualizarCuenta(@RequestBody CuentaDto cuentaDto){
		
		try {			
			servicioCuenta.actualizar(cuentaDto);
			return ResponseEntity.ok(cuentaDto);	
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}

}
