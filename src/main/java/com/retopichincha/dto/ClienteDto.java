package com.retopichincha.dto;

import lombok.Data;

@Data
public class ClienteDto extends PersonaDto {
    private Integer idCliente;
    private String contraseña;
    private String estado;
}