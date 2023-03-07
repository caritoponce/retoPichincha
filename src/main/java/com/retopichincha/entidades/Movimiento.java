package com.retopichincha.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Movimiento")
@Data
public class Movimiento{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idMovimiento;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="tipoMovimiento")
	private String tipoMovimiento;
	
	@Column(name="valor")
	private Double valor;
	
	@Column(name="saldo")
	private Double saldo;
	

}