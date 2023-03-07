package com.retopichincha.repositorio.impl;

import org.springframework.stereotype.Repository;

import com.retopichincha.entidades.Cliente;
import com.retopichincha.repositorio.ObjetoRepositorio;

@Repository
public class RepositorioCliente implements ObjetoRepositorio<Cliente> {

	@Override
	public void guardar(Cliente t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente actualizar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente buscar(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente eliminar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
