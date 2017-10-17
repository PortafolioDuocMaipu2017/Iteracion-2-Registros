package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "apoderado")
public class Apoderado implements Serializable {
	private static final long serialVersionUID = -3465813074586302847L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigoApoderado;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@Column
	private String fechaIngreso;	
	
	@Column
	private int rutAlCargo;
	
	@Column
	private char dv;
	
	@Column
	private int monto;

	public int getCodigoApoderado() {
		return codigoApoderado;
	}

	public void setCodigoApoderado(int codigoApoderado) {
		this.codigoApoderado = codigoApoderado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public int getRutAlCargo() {
		return rutAlCargo;
	}

	public void setRutAlCargo(int rutAlCargo) {
		this.rutAlCargo = rutAlCargo;
	}

	public char getDv() {
		return dv;
	}

	public void setDv(char dv) {
		this.dv = dv;
	}

	
}
