package com.mx.CrudCanciones.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudCanciones.Dominio.Cancion;
import com.mx.CrudCanciones.Services.Implementacion;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/webservice")
@CrossOrigin("*")

public class CancionWS  {
	
	
	@Autowired
	Implementacion imp;
	
	@PostMapping("/guardar")
	public ResponseEntity<String> guardar(@RequestBody Cancion cancion){
		imp.guardar(cancion);
		return ResponseEntity.ok("Cancion guardada");
		
	}
	
	
	@PutMapping("/editar")
	public ResponseEntity<String> editar(@RequestBody Cancion cancion){
		imp.editar(cancion);
		return ResponseEntity.ok("Cancion guardada");
		
	}
	
	@DeleteMapping("/eliminar")
	public ResponseEntity<String> eliminar(@RequestBody Cancion cancion){
		imp.eliminar(cancion);
		return ResponseEntity.ok("Cancion borrada");
		
	}
	
	@PostMapping("/buscar")
	public ResponseEntity<Cancion> buscar(@RequestBody Cancion cancion){
		Cancion encontrada = imp.buscar(cancion);
		
		if(encontrada != null) {
		return ResponseEntity.ok(encontrada);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/listar")
	public ResponseEntity<List<Cancion>> litar(){
		return ResponseEntity.ok(imp.listar());
	}
	
	
	

}
