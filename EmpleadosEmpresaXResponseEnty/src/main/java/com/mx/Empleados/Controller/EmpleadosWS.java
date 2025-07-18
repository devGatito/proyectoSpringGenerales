package com.mx.Empleados.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Empleados.Dominio.Empleados;
import com.mx.Empleados.Services.Implementacion;

@RestController
@RequestMapping(path = "Api/WebService")
@CrossOrigin("*")
public class EmpleadosWS {

	/*
	 * Spring proporciona librerias para lanzar mensajes personalidos mmm es un
	 * clase que se ocupa para respuesta http completa en una aplicacion o api de
	 * topo rest
	 * 
	 * status 200,400,405, 500 Status https, os success
	 * 
	 * ResponseEnti<T> trabaja con tipo, int, String,m double, float, object, lista,
	 * hashmap
	 * 
	 * 
	 * 
	 */

	@Autowired
	Implementacion imp;
	// local

	// https://localhost:9001/Api/WebService/listar
	@RequestMapping(value = "lista", method = RequestMethod.GET)
	public ResponseEntity<?> listar() {
		String respuesta = null;
		if (imp.listar().isEmpty()) {
			respuesta = "la lista esta vacia";
			return new ResponseEntity<String>(respuesta, HttpStatus.NO_CONTENT);
		} else {
			return ResponseEntity.status(HttpStatus.CREATED).body(imp.listar());
		}

	}

	// https://localhost:9001/Api/WebService/listar
	/*
	 * @GetMapping(value="listar") public List<Empleados> listar() { return
	 * imp.listar(); }
	 */

	/*
	 * @PostMapping(value = "guardar") public void guardar(@RequestBody Empleados
	 * empleado) { imp.guardar(empleado); }
	 */

	@RequestMapping(value = "guardar", method = RequestMethod.POST)
	public ResponseEntity<?> guardar(@RequestBody Empleados empleado) {
		imp.guardar(empleado);
		String respuesta = "Empleado Guardado \n" + "Nombre Empleado:" ; 
		
		
		return new ResponseEntity<String>(respuesta, HttpStatus.NO_CONTENT);
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
