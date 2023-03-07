package com.retopichincha.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.retopichincha.entidades.Cuenta;
import com.retopichincha.repositorio.impl.RepositorioCuenta;
import com.retopichincha.servicio.IServicioCuenta;

@Service
public class ServicioImplCuenta implements IServicioCuenta{
	
	@Autowired
	private RepositorioCuenta repositorioCuenta;

	@Override
	public void guardar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		try {
			repositorioCuenta.guardar(cuenta);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public Cuenta actualizar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		try {
			return repositorioCuenta.actualizar(cuenta);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Cuenta buscar(Integer id) {
		// TODO Auto-generated method stub
		try {
			return repositorioCuenta.buscar(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void eliminar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		try {
			repositorioCuenta.eliminar(cuenta);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
