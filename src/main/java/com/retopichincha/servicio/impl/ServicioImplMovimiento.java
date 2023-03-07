package com.retopichincha.servicio.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.retopichincha.dto.MovimientoDto;
import com.retopichincha.repositorio.impl.RepositorioMovimiento;
import com.retopichincha.servicio.IServicioMovimiento;
import com.retopichincha.utils.Utils;

@Service
public class ServicioImplMovimiento implements IServicioMovimiento{

	@Autowired
	private RepositorioMovimiento repositorioMovimiento;
	
	@Override
	public void guardar(MovimientoDto movimientoDto) {
		// TODO Auto-generated method stub
		try {
			repositorioMovimiento.guardar(Utils.convertirToMovimiento(movimientoDto));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public MovimientoDto actualizar(MovimientoDto movimientoDto) {
		// TODO Auto-generated method stub
		try {
			if(movimientoDto.getValor()>0) {
				movimientoDto.setSaldo(movimientoDto.getSaldo()+movimientoDto.getValor());				
			}else {
				if(movimientoDto.getSaldo()==0) {
					return null;
				}else {
					movimientoDto.setSaldo(movimientoDto.getSaldo()-movimientoDto.getValor());
				}
			}
			return Utils.convertirToDtoMovimiento(repositorioMovimiento.actualizar(Utils.convertirToMovimiento(movimientoDto)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public MovimientoDto buscar(Integer id) {
		// TODO Auto-generated method stub
		try {
			return Utils.convertirToDtoMovimiento(repositorioMovimiento.buscar(id));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void eliminar(MovimientoDto movimientoDto) {
		// TODO Auto-generated method stub
		try {
			repositorioMovimiento.eliminar(Utils.convertirToMovimiento(movimientoDto));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
