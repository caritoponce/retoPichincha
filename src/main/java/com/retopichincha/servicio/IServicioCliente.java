package com.retopichincha.servicio;

import com.retopichincha.dto.ClienteDto;


public interface IServicioCliente {

	public void guardar(ClienteDto clienteDto);

	public ClienteDto actualizar(ClienteDto clienteDto);

	public ClienteDto buscar(Integer id);

	public void eliminar(ClienteDto clienteDto);
}
