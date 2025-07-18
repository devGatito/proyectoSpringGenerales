package com.mx.CrudCanciones.Services;

import java.util.List;

import com.mx.CrudCanciones.Dominio.Canciones;

public interface Metodos {
	  void guardar(Canciones cancion);
	    void editar(Canciones cancion);
	    void eliminar(Canciones cancion);
	    Canciones buscar(Canciones cancion);
	    List<Canciones> listar();
}
