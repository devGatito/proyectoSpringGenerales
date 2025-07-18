package com.mx.Empleados.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Empleados.Dominio.Empleados;
import com.mx.Empleados.Services.Implementacion;

@RestController
@RequestMapping(path="Api/WebService")
@CrossOrigin("*")
public class EmpleadosWS {

	
	@Autowired
	Implementacion imp;
	//local
	
	//https://localhost:9001/Api/WebService/listar
	@GetMapping(value="listar")
	public List<Empleados> listar() {
	return imp.listar();
	}
	
	@PostMapping(value = "guardar")
	public void guardar(@RequestBody Empleados empleado) {
		imp.guardar(empleado);
	}
	
	@PostMapping(value = "editar")
	public void editar(@RequestBody Empleados empleado) {
		imp.editar(empleado);
	}
	@PostMapping(value = "eliminar")
	public void eliminar(@RequestBody Empleados empleado) {
		imp.eliminar(empleado);
	}
	
}
