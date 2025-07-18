package com.mx.Celulares.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Celulares.Dao.CelularDao;
import com.mx.Celulares.Dominio.Celulares;

@Service
public class Implementacion  implements CelularService{

	@Autowired
	CelularDao celularDao;
	
	@Override
	public void guardar(Celulares celular) {
		celularDao.save(celular);
		System.out.print("Celular Guardado");
		
		
	}

	@Override
	public void eliminar(Celulares celular) {
		celularDao.delete(celular);
		System.out.print("Celular Guardado");		
	}

	@Override
	public void editar(Celulares celular) {
		celularDao.save(celular);
		System.out.print("Celular Guardado");

		
	}

	@Override
	public Celulares buscar(Celulares celular) {
		
		
		return celularDao.findById(celular.getId()).orElse(null);
	}

	@Override
	public List<Celulares> listar() {

		return (List<Celulares>) celularDao.findAll() ;
	}

}
