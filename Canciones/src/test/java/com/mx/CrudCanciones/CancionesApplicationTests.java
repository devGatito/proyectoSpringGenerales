package com.mx.CrudCanciones;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mx.CrudCanciones.Dominio.Cancion;
import com.mx.CrudCanciones.Services.Implementacion;

@SpringBootTest
class CancionesApplicationTests {

    @Autowired
    Implementacion imp;

    Cancion cancion = new Cancion();
    
    @Test
    @Order(1)
    void guardar() {
        cancion.setId(8);
        cancion.setNombre("X");
        cancion.setCantante("V1");
        cancion.setAutor("Sheeran");
        cancion.setPrecio(29);
        cancion.setGenero("Pop");
        cancion.setDuracion_segundos(235);
        cancion.setAlbum("Divide");
        cancion.setAnioLanzammiento(new Date(2021, 30, 01));
        cancion.setDisponible(true);
        imp.guardar(cancion);
        
        System.out.println("\n \033[32m Se guardo \033[0m" + cancion);
    }

    @Test
    @Order(2)
    void buscar() {
        cancion.setId(8);
        Cancion encontrada = imp.buscar(cancion);
        System.out.println("Encontrada: " + encontrada);
        System.out.println("\n \033[32m Se encontro \033[0m " + encontrada);
    }

    @Test
    @Order(3)
    void editar() {
        cancion.setId(1);
        Cancion buscarCancion = imp.buscar(cancion);
        cancion.setPrecio(1999);
       
        imp.editar(buscarCancion);
        System.out.println("\n \033[32m Se edito \033[0m" +buscarCancion );
    }

    @Test
    @Order(4)
    void eliminar() {
        cancion.setId(1);
        imp.eliminar(cancion);
        System.out.println("\n \033[32m Se elimino \033[0m" + cancion);
    }

    @Test
    @Order(5)
    void listar() {
        List<Cancion> lista = imp.listar();
        assertFalse(lista.isEmpty());
        System.out.println("\n \033[32m Se listo \033[0m");
    }

}
