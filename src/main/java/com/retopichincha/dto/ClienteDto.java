package com.retopichincha.dto;

import lombok.Data;

@Data
public class ClienteDto extends PersonaDto {
    private Integer clienteId;
    private String contraseña;
    private String estado;
}