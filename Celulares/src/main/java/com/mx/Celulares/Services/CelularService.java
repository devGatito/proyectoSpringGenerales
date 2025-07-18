package com.mx.Celulares.Services;

import java.util.List;

import com.mx.Celulares.Dominio.Celulares;

public interface CelularService {
	
	void guardar(Celulares celular);

	void eliminar(Celulares celular);

	void editar(Celulares celular);

	Celulares buscar(Celulares celular);
	
	List<Celulares> listar();

}
//cru
