package com.retopichincha.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Persona")
@Data
public class Persona {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idPersona;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "genero")
	private String genero;
	
	@Column(name = "edad")
	private Integer edad;
	
	@Column(name = "identificacion")
	private String identificacion;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "telefono")
	private Integer telefono; 
	
	
	
}
