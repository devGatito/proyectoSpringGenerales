package com.mx.CrudCanciones.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudCanciones.Dominio.Cancion;
import com.mx.Dao.CancionDao;

@Service
public class Implementacion implements Metodos{

	@Autowired
	CancionDao cancionDao;
	
	@Override
	public void guardar(Cancion cancion) {
		cancionDao.save(cancion);
		System.out.println("Cancion Guardada");
	}

	@Override
	public void editar(Cancion cancion) {
		cancionDao.save(cancion);
		System.out.println("Cancion editada");
		
	}

	@Override
	public void eliminar(Cancion cancion) {
		// TODO Auto-generated method stub
		cancionDao.delete(cancion);

		System.out.println("Cancion borrada");
		
	}

	@Override
	public Cancion buscar(Cancion cancion) {
		// TODO Auto-generated method stub
		return cancionDao.findById(cancion.getId()).orElse(null);
	}

	@Override
	public List<Cancion> listar() {
		// TODO Auto-generated method stub
		return (List<Cancion>) cancionDao.findAll();
	}
	

}
