package com.retopichincha.servicio;

import com.retopichincha.entidades.Cuenta;

public interface IServicioCuenta {
	
	public void guardar(Cuenta cuenta);

	public Cuenta actualizar(Cuenta cuenta);

	public Cuenta buscar(Integer id);

	public void eliminar(Cuenta cuenta);

}
