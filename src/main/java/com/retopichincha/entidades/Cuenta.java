package com.retopichincha.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Cuenta")
@Data
public class Cuenta{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idCuenta;	
	
	@Column(name="numeroCuenta")
	private Integer numeroCuenta;
	
	@Column(name="tipoCuenta")
	private String tipoCuenta;
	
	@Column(name="saldoInicial")
	private Double saldoInicial;
	
	@Column(name="estado")
	private String estado;
	
	@ManyToOne
    @JoinColumn(name="idCliente", nullable=false)
	private Cliente cliente;

}