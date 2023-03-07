package com.retopichincha.repositorio;


public interface ObjetoRepositorio<T> {

	public void guardar(T t);

	public T actualizar(T t);

	public T buscar(Integer id);

	public void eliminar(T t);
}
