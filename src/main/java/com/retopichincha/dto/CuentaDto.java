package com.retopichincha.dto;

import lombok.Data;

@Data
public class CuentaDto {
	
  private Integer idCuenta; 

  private Integer numeroCuenta;
  
  private String tipoCuenta;
  
  private Double saldoInicial;
  
  private String estado;
  
  private ClienteDto clienteDto;
}