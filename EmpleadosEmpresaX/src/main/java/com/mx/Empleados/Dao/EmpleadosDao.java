package com.mx.Empleados.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.Empleados.Dominio.Empleados;

@Repository // indica que va tener acceso a la bd generica 


//CrudRepository es una interfaz de spring data y contiene todos los metodos de acceso a la bd con una interface generica
/*
 * 
 * Metodos
 * Guardar
 * Editar
 * Buscar
 * Eliminar
 * */
public interface EmpleadosDao extends CrudRepository<Empleados, Integer>{
	

}
