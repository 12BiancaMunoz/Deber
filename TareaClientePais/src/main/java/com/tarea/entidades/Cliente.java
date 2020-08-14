package com.tarea.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Cliente {
	
	@GeneratedValue
	@Id
	private int id;
	private String nombres;
	private String ApellidoP;
	private String ApellidoM;
	
	
	@ManyToOne 
	private Pais pais;
	
	private Cliente () {
		
	}
	
	
	
	public Cliente(int id, String nombres, String apellidoP, String apellidoM) {
		super();
		this.id = id;
		this.nombres = nombres;
		ApellidoP = apellidoP;
		ApellidoM = apellidoM;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidoP() {
		return ApellidoP;
	}
	public void setApellidoP(String apellidoP) {
		ApellidoP = apellidoP;
	}
	public String getApellidoM() {
		return ApellidoM;
	}
	public void setApellidoM(String apellidoM) {
		ApellidoM = apellidoM;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombres=" + nombres + ", ApellidoP=" + ApellidoP + ", ApellidoM=" + ApellidoM
				+ "]";
	}
	
	
	
	

}
