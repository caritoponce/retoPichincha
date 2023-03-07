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
@Table(name="Cliente")
@Data
public class Cliente{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idCliente;	
	
	@Column(name="contrasena")
	private String contrasena;
	
	@Column(name="estado")
	private String estado;
	
	@ManyToOne
    @JoinColumn(name="idPersona", nullable=false)
	private Persona persona;
	
	
	
}