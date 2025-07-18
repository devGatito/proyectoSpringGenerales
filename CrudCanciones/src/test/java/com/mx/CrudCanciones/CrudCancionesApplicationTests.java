package com.mx.CrudCanciones;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mx.CrudCanciones.Dominio.Canciones;
import com.mx.CrudCanciones.Services.Implementacion;

@RunWith(SpringRunner.class)
@SpringBootTest
class CrudCancionesApplicationTests {


    @Autowired
    Implementacion imp;

    Canciones cancion = new Canciones();

    @Test
    @Order(1)
    void guardar() {
        cancion.setId(1);
        cancion.setNombre("Bohemian Rhapsody");
        cancion.setCantante("Queen");
        cancion.setAutor("Freddie Mercury");
        cancion.setPrecio(25.99);

        imp.guardar(cancion);
        System.out.println("Canción guardada: " + cancion);
    }

    @Test
    @Order(2)
    void buscar() {
        cancion.setId(1);
        Canciones encontrada = imp.buscar(cancion);
        System.out.println(" Canción encontrada: " + encontrada);
    }

    @Test
    @Order(3)
    void editar() {
        cancion.setId(1);
        Canciones editar = imp.buscar(cancion);
        editar.setPrecio(30.00);
        imp.editar(editar);
        System.out.println(" Canción editada: " + editar);
    }

    @Test
    @Order(4)
    void eliminar() {
        cancion.setId(1);
        imp.eliminar(cancion);
        System.out.println(" Canción eliminada con ID: " + cancion.getId());
    }

    @Test
    @Order(5)
    void listar() {
        List<Canciones> lista = imp.listar();
        System.out.println(" Lista de canciones: " + lista);
        assertFalse(lista.isEmpty(), " La lista debería contener al menos una canción");
    }

}
