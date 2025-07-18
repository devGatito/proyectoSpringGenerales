package com.mx.CrudAutosJunit.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.CrudAutosJunit.Dominio.Autos;

@Repository
public interface AutosDao extends  CrudRepository<Autos, Integer>{

}
