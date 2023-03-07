package com.retopichincha.repositorio.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import com.retopichincha.entidades.Cuenta;
import com.retopichincha.repositorio.ObjetoRepositorio;

@Repository
public class RepositorioCuenta  implements ObjetoRepositorio<Cuenta> {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void guardar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		em.persist(cuenta);
		
	}

	@Override
	public Cuenta actualizar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		return em.merge(cuenta);
	}

	@Override
	public Cuenta buscar(Integer id) {
		// TODO Auto-generated method stub
		return em.find(Cuenta.class, id);
	}

	@Override
	public void eliminar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		em.remove(cuenta);
	}

}
