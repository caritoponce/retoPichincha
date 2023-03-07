package com.retopichincha.servicio;

import com.retopichincha.entidades.Cliente;

public interface IServicioCliente {

	public void guardar(Cliente cliente);

	public Cliente actualizar(Cliente cliente);

	public Cliente buscar(Integer id);

	public void eliminar(Cliente cliente);
}
