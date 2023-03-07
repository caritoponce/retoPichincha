package com.retopichincha.servicio;

import com.retopichincha.dto.MovimientoDto;

public interface IServicioMovimiento {
	
	public void guardar(MovimientoDto movimientoDto);

	public MovimientoDto actualizar(MovimientoDto movimientoDto);

	public MovimientoDto buscar(Integer id);

	public void eliminar(MovimientoDto movimientoDto);


}
