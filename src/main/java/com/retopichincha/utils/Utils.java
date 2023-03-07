package com.retopichincha.utils;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.retopichincha.dto.ClienteDto;
import com.retopichincha.dto.CuentaDto;
import com.retopichincha.dto.MovimientoDto;
import com.retopichincha.entidades.Cliente;
import com.retopichincha.entidades.Cuenta;
import com.retopichincha.entidades.Movimiento;

public class Utils {
	
	@Autowired
	private static ModelMapper modelMapper;

	public static ClienteDto convertirToDtoCliente(Cliente cliente) {
		ClienteDto clienteDto = modelMapper.map(cliente, ClienteDto.class);		
	    return clienteDto;
	}
	
	public static CuentaDto convertirToDtoCuenta(Cuenta cuenta) {
		CuentaDto cuentaDto = modelMapper.map(cuenta, CuentaDto.class);		
	    return cuentaDto;
	}
	
	public static MovimientoDto convertirToDtoMovimiento(Movimiento movimiento) {
		MovimientoDto movimientoDto = modelMapper.map(movimiento, MovimientoDto.class);		
	    return movimientoDto;
	}
	
	public static Cliente convertirToCliente(ClienteDto clienteDto) {
		Cliente cliente = modelMapper.map(clienteDto, Cliente.class);		
	    return cliente;
	}
	
	public static Cuenta convertirToCuenta(CuentaDto cuentaDto) {
		Cuenta cuenta = modelMapper.map(cuentaDto, Cuenta.class);		
	    return cuenta;
	}
	
	public static Movimiento convertirToMovimiento(MovimientoDto movimientoDto) {
		Movimiento movimiento = modelMapper.map(movimientoDto, Movimiento.class);		
	    return movimiento;
	}
}
