package com.mx.CrudComputadoras.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudComputadoras.Dominio.Computadoras;
import com.mx.CrudComputadoras.Service.Implementacion;

@RestController
@RequestMapping("Api/WebService")
@CrossOrigin("*")
public class ComputadorasWS {
	 @Autowired
	    Implementacion imp;

	    @PostMapping("/guardar")
	    public void guardar(@RequestBody Computadoras computadora) {
	        imp.guardar(computadora);
	    }

	    @PostMapping("/editar")
	    public void editar(@RequestBody Computadoras computadora) {
	        imp.editar(computadora);
	    }

	    @GetMapping("/listar")
	    public List<Computadoras> listar() {
	        return imp.listar();
	    }

	    @DeleteMapping("/eliminar")
	    public void eliminar(@RequestBody Computadoras computadora) {
	        imp.eliminar(computadora);
	    }

	    @PostMapping("/buscar")
	    public Computadoras buscar(@RequestBody Computadoras computadora) {
	        return imp.buscar(computadora);
	    }
}
