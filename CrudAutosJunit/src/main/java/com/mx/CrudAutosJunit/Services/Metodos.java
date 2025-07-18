package com.mx.CrudAutosJunit.Services;

import java.util.List;

import com.mx.CrudAutosJunit.Dominio.Autos;

public interface Metodos {
void guardar(Autos auto);
void editar(Autos auto);
void eliminar(Autos auto);
Autos buscar(Autos auto);
List<Autos> listar();

}
