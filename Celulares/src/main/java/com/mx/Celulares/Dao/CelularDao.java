package com.mx.Celulares.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.Celulares.Dominio.Celulares;

@Repository
public interface CelularDao extends CrudRepository<Celulares, Integer>{
	

}
