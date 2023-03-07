package com.retopichincha.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retopichincha.servicio.IServicioCuenta;

@RestController
@RequestMapping("/cuentas")
public class ControladorCuenta {
	
	@Autowired
	private IServicioCuenta servicioCuenta;

}
