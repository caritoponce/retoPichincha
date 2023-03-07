package com.retopichincha.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retopichincha.dto.CuentaDto;
import com.retopichincha.repositorio.impl.RepositorioCuenta;
import com.retopichincha.servicio.IServicioCuenta;
import com.retopichincha.utils.Utils;

@Service
public class ServicioImplCuenta implements IServicioCuenta{
	
	@Autowired
	private RepositorioCuenta repositorioCuenta;

	@Override
	public void guardar(CuentaDto cuentaDto) {
		// TODO Auto-generated method stub
		try {
			repositorioCuenta.guardar(Utils.convertirToCuenta(cuentaDto));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public CuentaDto actualizar(CuentaDto cuentaDto) {
		// TODO Auto-generated method stub
		try {
			return Utils.convertirToDtoCuenta(repositorioCuenta.actualizar(Utils.convertirToCuenta(cuentaDto)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CuentaDto buscar(Integer id) {
		// TODO Auto-generated method stub
		try {
			return Utils.convertirToDtoCuenta(repositorioCuenta.buscar(id));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void eliminar(CuentaDto cuentaDto) {
		// TODO Auto-generated method stub
		try {
			repositorioCuenta.eliminar(Utils.convertirToCuenta(cuentaDto));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
