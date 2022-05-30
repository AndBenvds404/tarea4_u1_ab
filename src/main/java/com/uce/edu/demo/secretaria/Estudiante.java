package com.uce.edu.demo.secretaria;

import java.util.Date;

public class Estudiante {
	
	private String nombre;
	private String apllido;
	private Date fechaNacimiento;
	
		//SET AND GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApllido() {
		return apllido;
	}
	public void setApllido(String apllido) {
		this.apllido = apllido;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	

	

}
