package com.retopichincha.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.retopichincha.entidades.Movimiento;
import com.retopichincha.repositorio.impl.RepositorioMovimiento;
import com.retopichincha.servicio.IServicioMovimiento;

@Service
public class ServicioImplMovimiento implements IServicioMovimiento{

	@Autowired
	private RepositorioMovimiento repositorioMovimiento;
	
	@Override
	public void guardar(Movimiento movimiento) {
		// TODO Auto-generated method stub
		try {
			repositorioMovimiento.guardar(movimiento);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public Movimiento actualizar(Movimiento movimiento) {
		// TODO Auto-generated method stub
		try {
			return repositorioMovimiento.actualizar(movimiento);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Movimiento buscar(Integer id) {
		// TODO Auto-generated method stub
		try {
			return repositorioMovimiento.buscar(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void eliminar(Movimiento movimiento) {
		// TODO Auto-generated method stub
		try {
			repositorioMovimiento.eliminar(movimiento);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
