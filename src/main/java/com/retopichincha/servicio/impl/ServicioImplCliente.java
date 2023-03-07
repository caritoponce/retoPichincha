package com.retopichincha.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retopichincha.dto.ClienteDto;
import com.retopichincha.repositorio.impl.RepositorioCliente;
import com.retopichincha.servicio.IServicioCliente;
import com.retopichincha.utils.Utils;

@Service
public class ServicioImplCliente implements IServicioCliente {

	@Autowired
	private RepositorioCliente repositorioCliente;

	@Override
	public void guardar(ClienteDto clienteDto) {
		// TODO Auto-generated method stub
		try {
			repositorioCliente.guardar(Utils.convertirToCliente(clienteDto));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public ClienteDto actualizar(ClienteDto clienteDto) {
		// TODO Auto-generated method stub
		try {
			return Utils.convertirToDtoCliente(repositorioCliente.actualizar(Utils.convertirToCliente(clienteDto)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ClienteDto buscar(Integer id) {
		// TODO Auto-generated method stub
		try {
			return Utils.convertirToDtoCliente(repositorioCliente.buscar(id));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void eliminar(ClienteDto clienteDto) {
		// TODO Auto-generated method stub
		try {
			repositorioCliente.eliminar(Utils.convertirToCliente(clienteDto));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
