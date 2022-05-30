package com.uce.edu.demo.secretaria;

import java.time.LocalDate;


public class Estudiante {
	
	private String nombre;
	private String apllido;
	private LocalDate fechaNacimiento;
	
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
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	

}
