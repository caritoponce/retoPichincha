package com.retopichincha.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.retopichincha.servicio.IServicioMovimiento;

@RestController
public class ControladorMovimientos {
	
	@Autowired
	private IServicioMovimiento servicioMovimiento;

}
