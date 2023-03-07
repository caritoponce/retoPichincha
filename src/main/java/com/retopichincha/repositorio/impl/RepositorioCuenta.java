package com.retopichincha.repositorio.impl;

import org.springframework.stereotype.Repository;
import com.retopichincha.entidades.Cuenta;
import com.retopichincha.repositorio.ObjetoRepositorio;

@Repository
public class RepositorioCuenta  implements ObjetoRepositorio<Cuenta> {

	@Override
	public void guardar(Cuenta t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cuenta actualizar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cuenta buscar(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cuenta eliminar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
