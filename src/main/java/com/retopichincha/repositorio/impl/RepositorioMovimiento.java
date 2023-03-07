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
	public void guardar(Movimiento movimiento) {
		// TODO Auto-generated method stub
		em.persist(movimiento);
		
	}

	@Override
	public Movimiento actualizar(Movimiento movimiento) {
		// TODO Auto-generated method stub
		return em.merge(movimiento);
	}

	@Override
	public Movimiento buscar(Integer id) {
		// TODO Auto-generated method stub
		return em.find(Movimiento.class,id);
	}

	@Override
	public void eliminar(Movimiento movimiento) {
		// TODO Auto-generated method stub
		em.remove(movimiento);
	}

}
