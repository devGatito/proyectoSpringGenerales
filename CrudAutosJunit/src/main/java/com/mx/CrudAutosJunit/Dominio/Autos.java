package com.mx.CrudAutosJunit.Dominio;

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



@Entity 
@Table(name = "VEHICULOS_2025")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Data

public class Autos {

	/*
	 * 
	 * CREATE TABLE VEHICULOS_2025(
ID NUMBER PRIMARY KEY,
PLACA NVARCHAR2(50),
MODELO NVARCHAR2(50),
COLOR NVARCHAR2(50),
NUMERO_PUERTAS NUMBER,
PRECIO NUMBER,
CILINDROS NUMBER,
FECHA_VENTAS DATE
);
	 * */
	
	@Id
	int id;
	String placa;
	String modelo;
	String color;
	@Column(name = "NUMERO_PUERTAS", columnDefinition = "NUMBER", nullable  = false)
	int numeroPuertas;
	double precio;
	int cilindros;
	@Column(name= "FECHA_VENTAS", columnDefinition = "DATE")
	Date fechaVentas;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumeroPuertas() {
		return numeroPuertas;
	}
	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCilindros() {
		return cilindros;
	}
	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
	public Date getFechaVentas() {
		return fechaVentas;
	}
	public void setFechaVentas(Date fechaVentas) {
		this.fechaVentas = fechaVentas;
	}
	
	
	@Override
	public String toString() {
		return "Autos [id=" + id + ", placa=" + placa + ", modelo=" + modelo + ", color=" + color + ", numeroPuertas="
				+ numeroPuertas + ", precio=" + precio + ", cilindros=" + cilindros + ", fechaVentas=" + fechaVentas
				+ "\n";
	}
	
		
	
	

	
}
