package com.retopichincha.dto;


import lombok.Data;

@Data
public class ClienteDto {
    private Integer idCliente;
    private String contraseña;
    private String estado;
    private PersonaDto personaDto;
}