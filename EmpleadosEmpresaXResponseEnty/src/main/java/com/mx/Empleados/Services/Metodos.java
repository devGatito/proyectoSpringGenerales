package com.mx.Empleados.Services;

import java.util.List;

import com.mx.Empleados.Dominio.Empleados;

public interface Metodos {
void guardar(Empleados empleado);
void editar(Empleados empleado);
void eliminar(Empleados empleado);
Empleados buscar(Empleados empleado);

List<Empleados> listar();;
}
	