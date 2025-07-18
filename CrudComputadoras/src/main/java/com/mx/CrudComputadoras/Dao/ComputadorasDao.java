package com.mx.CrudComputadoras.Dao;

import org.springframework.stereotype.Repository;

import com.mx.CrudComputadoras.Dominio.Computadoras;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface ComputadorasDao extends CrudRepository<Computadoras, Integer> {

}
