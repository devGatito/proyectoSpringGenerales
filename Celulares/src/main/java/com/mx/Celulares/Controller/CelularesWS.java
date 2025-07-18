package com.mx.Celulares.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Celulares.Dominio.Celulares;
import com.mx.Celulares.Services.Implementacion;

@RestController
@RequestMapping("api")
@CrossOrigin("*")
public class CelularesWS {

    @Autowired
    Implementacion serve;

    @PostMapping("/guardar")
    public void guardar(@RequestBody Celulares celular) {
        serve.guardar(celular);
    }

    @DeleteMapping("/eliminar")
    public void eliminar(@RequestBody Celulares celular) {
        serve.eliminar(celular);
    }

    @PutMapping("/editar")
    public void editar(@RequestBody Celulares celular) {
        serve.editar(celular);
    }

    @PostMapping("/buscar")
    public Celulares buscar(@RequestBody Celulares celular) {
        return serve.buscar(celular);
    }

    @GetMapping("/listar")
    public List<Celulares> listar() {
        return serve.listar();
    }
}