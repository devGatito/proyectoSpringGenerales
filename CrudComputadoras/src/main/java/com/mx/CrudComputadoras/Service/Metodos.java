package com.mx.CrudComputadoras.Service;

import java.util.List;

import com.mx.CrudComputadoras.Dominio.Computadoras;

public interface Metodos {
	   void guardar(Computadoras computadora);
	    void editar(Computadoras computadora);
	    void eliminar(Computadoras computadora);
	    Computadoras buscar(Computadoras computadora);
	    List<Computadoras> listar();
}
