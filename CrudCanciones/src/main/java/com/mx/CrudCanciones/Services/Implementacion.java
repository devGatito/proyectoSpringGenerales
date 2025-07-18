package com.mx.CrudCanciones.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudCanciones.Dao.CancionesDao;
import com.mx.CrudCanciones.Dominio.Canciones;

@Service
public class Implementacion implements Metodos{

    @Autowired
    CancionesDao dao;

    @Override
    public void guardar(Canciones cancion) {
        dao.save(cancion);
        System.out.println("Canción guardada");
    }

    @Override
    public void editar(Canciones cancion) {
        dao.save(cancion);
        System.out.println("Canción editada");
    }

    @Override
    public void eliminar(Canciones cancion) {
        dao.delete(cancion);
        System.out.println("Canción eliminada");
    }

    @Override
    public Canciones buscar(Canciones cancion) {
        System.out.println("Buscando canción con ID: " + cancion.getId());
        return dao.findById(cancion.getId()).orElse(null);
    }

    @Override
    public List<Canciones> listar() {
        return (List<Canciones>) dao.findAll();
    }
}
