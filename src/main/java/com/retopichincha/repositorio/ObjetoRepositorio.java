package com.retopichincha.repositorio;

public interface ObjetoRepositorio<T> {

	public void guardar(T t);

	public T actualizar(int id);

	public T buscar(String name);

	public T eliminar(int id);
}
