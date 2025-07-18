package com.mx.CrudCanciones.Dominio;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "CANCION")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Cancion {
/*
 *           Null?    Type           
----------------- -------- -------------- 
ID                NOT NULL NUMBER         
NOMBRE                     NVARCHAR2(50)  
CANTANTE                   NVARCHAR2(50)  
AUTOR                      NVARCHAR2(50)  
PRECIO                     NUMBER         
GENERO                     NVARCHAR2(50)  
DURACION_SEGUNDOS          NUMBER         
ALBUM                      NVARCHAR2(100) 
ANIO_LANZAMIENTO           DATE           
DISPONIBLE                 NUMBER(1)      
ESTADO                     VARCHAR2(50)   

 * */
	
	@Id
	private int id;
	private String nombre;
	private String cantante;
	private String autor;
	private int precio;
	private String genero;
	private int duracion_segundos;
	private String album;
	private boolean disponible;
	private String ESTADO;

	
	@Column(name ="ANIO_LANZAMIENTO", columnDefinition = "DATE")
	Date anioLanzammiento;
	
	
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
	public String getCantante() {
		return cantante;
	}
	public void setCantante(String cantante) {
		this.cantante = cantante;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getDuracion_segundos() {
		return duracion_segundos;
	}
	public void setDuracion_segundos(int duracion_segundos) {
		this.duracion_segundos = duracion_segundos;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public Date getAnioLanzammiento() {
		return anioLanzammiento;
	}
	public void setAnioLanzammiento(Date anioLanzammiento) {
		this.anioLanzammiento = anioLanzammiento;
	}
	
	public String getESTADO() {
		return ESTADO;
	}
	public void setESTADO(String eSTADO) {
		ESTADO = eSTADO;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	@Override
	public String toString() {
		return "Cancion [id=" + id + ", nombre=" + nombre + ", cantante=" + cantante + ", autor=" + autor + ", precio="
				+ precio + ", genero=" + genero + ", duracion_segundos=" + duracion_segundos + ", album=" + album
				+ ", disponible=" + disponible + ", ESTADO=" + ESTADO + ", anioLanzammiento=" + anioLanzammiento + "]";
	}
	
	
	
	
	

	/*
	 * ID NUMBER PRIMARY KEY, 
	 * NOMBRE NVARCHAR2(50), CANTANTE NVARCHAR2(50), AUTOR
	 * NVARCHAR2(50), PRECIO NUMBER, GENERO NVARCHAR2(50), DURACION_SEGUNDOS NUMBER,
	 * ALBUM NVARCHAR2(100), ANIO_LANZAMIENTO DATE, DISPONIBLE NUMBER(1)
	 * 
	 * 
	 */
	
	
	
}
