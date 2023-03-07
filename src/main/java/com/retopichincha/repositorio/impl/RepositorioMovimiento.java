package com.retopichincha.repositorio.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import com.retopichincha.entidades.Movimiento;
import com.retopichincha.repositorio.ObjetoRepositorio;

@Repository
public class RepositorioMovimiento  implements ObjetoRepositorio<Movimiento> {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void guardar(Movimiento t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Movimiento actualizar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movimiento buscar(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movimiento eliminar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
