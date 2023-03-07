package com.retopichincha.servicio;

import com.retopichincha.dto.CuentaDto;

public interface IServicioCuenta {
	
	public void guardar(CuentaDto cuentaDto);

	public CuentaDto actualizar(CuentaDto cuentaDto);

	public CuentaDto buscar(Integer id);

	public void eliminar(CuentaDto cuentaDto);

}
