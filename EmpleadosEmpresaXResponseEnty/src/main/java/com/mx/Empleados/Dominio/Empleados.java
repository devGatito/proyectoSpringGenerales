package com.mx.Empleados.Dominio;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * 
 * Lombok es una depedencia para el ahorro de codigo reptitivo
 * trabaja con esteorotipos
 * */

@Entity // indica que esta clase va a representar una entidad
@Table(name = "EMPLEADOS") // Entidad que va representar una clase en java
@NoArgsConstructor //constructor vacio
@AllArgsConstructor //constructor con parametros
@ToString //concatenar
@Getter // encapsulamiento
@Setter
@Data //encapsulamiento
public class Empleados {
	
	
	@Id
	int id;
	String nombre;
	String app;
	@Column(name ="FECHA_NACIMIENTO", columnDefinition="DATE")
	Date fechaNacimiento;
	int edad;
	String depto;
	double sueldo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApp() {
		return app;
	}
	public void setApp(String app) {
		this.app = app;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDepto() {
		return depto;
	}
	public void setDepto(String depto) {
		this.depto = depto;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	

}
