package com.retopichincha.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.retopichincha.servicio.IServicioCliente;

@RestController
public class ControladorCliente {
	
	@Autowired
	private IServicioCliente servicioCliente;

}
