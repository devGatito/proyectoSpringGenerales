package com.mx.CrudCanciones.Services;

import java.util.List;

import com.mx.CrudCanciones.Dominio.Cancion;

public interface Metodos {
public void guardar(Cancion cancion);
public void editar(Cancion cancion);
public void eliminar(Cancion cancion);
public Cancion buscar(Cancion cancion);
public List<Cancion> listar();
}
