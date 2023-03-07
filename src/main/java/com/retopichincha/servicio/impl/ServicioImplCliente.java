package com.retopichincha.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retopichincha.entidades.Cliente;
import com.retopichincha.repositorio.impl.RepositorioCliente;
import com.retopichincha.servicio.IServicioCliente;

@Service
public class ServicioImplCliente implements IServicioCliente {

	@Autowired
	private RepositorioCliente repositorioCliente;

	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		try {
			repositorioCliente.guardar(cliente);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public Cliente actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		try {
			return repositorioCliente.actualizar(cliente);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		try {
			return repositorioCliente.buscar(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void eliminar(Cliente cliente) {
		// TODO Auto-generated method stub
		try {
			repositorioCliente.eliminar(cliente);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
