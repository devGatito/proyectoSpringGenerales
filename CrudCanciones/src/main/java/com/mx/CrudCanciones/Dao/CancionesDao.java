package com.mx.CrudCanciones.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.CrudCanciones.Dominio.Canciones;

@Repository
public interface CancionesDao extends CrudRepository<Canciones, Integer> {

}
