package com.retopichincha.utils;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.retopichincha.dto.ClienteDto;
import com.retopichincha.entidades.Cliente;

public class Utils {
	
	@Autowired
	private static ModelMapper modelMapper;

	public static ClienteDto convertToDto(Cliente cliente) {
		ClienteDto clienteDto = modelMapper.map(cliente, ClienteDto.class);		
	    return clienteDto;
	}
}
