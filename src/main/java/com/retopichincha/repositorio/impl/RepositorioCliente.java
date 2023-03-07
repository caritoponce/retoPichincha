package com.retopichincha.repositorio.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.retopichincha.entidades.Cliente;
import com.retopichincha.repositorio.ObjetoRepositorio;

@Repository
public class RepositorioCliente implements ObjetoRepositorio<Cliente> {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		em.persist(cliente);
		
	}

	@Override
	public Cliente actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		return em.merge(cliente);
	}

	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return em.find(Cliente.class, id);
	}

	@Override
	public void eliminar(Cliente cliente) {
		// TODO Auto-generated method stub
		em.remove(cliente);
	}

}
