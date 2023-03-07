package com.retopichincha.dto;

import java.util.Date;

import lombok.Data;

@Data
public class MovimientoDto{
	
	private Integer idMovimiento;
	private Date fecha;
	private String tipoMovimiento;
	private Double valor;
	private Double saldo;

}