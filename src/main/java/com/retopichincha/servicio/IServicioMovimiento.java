package com.retopichincha.servicio;

import com.retopichincha.entidades.Movimiento;

public interface IServicioMovimiento {
	
	public void guardar(Movimiento movimiento);

	public Movimiento actualizar(Movimiento movimiento);

	public Movimiento buscar(Integer id);

	public void eliminar(Movimiento movimiento);


}
