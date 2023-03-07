package com.retopichincha.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.retopichincha.servicio.IServicioCuenta;

@RestController
public class ControladorCuenta {
	
	@Autowired
	private IServicioCuenta servicioCuenta;

}
