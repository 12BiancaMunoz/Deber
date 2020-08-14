package com.tarea.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.OneToMany;


@Entity
public class Pais {
	
	@GeneratedValue
	@Id
	private int id;
	private String Nombre;
	
	@OneToMany(mappedBy = "pais")
	private List<Cliente> cliente = new ArrayList<Cliente>();
	
	
	private Pais () {
		
	}
	
	public Pais(int id, String nombre) {
		super();
		this.id = id;
		Nombre = nombre;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	@Override
	public String toString() {
		return "Pais [id=" + id + ", Nombre=" + Nombre + "]";
	}
	
	
	
	
	

}
