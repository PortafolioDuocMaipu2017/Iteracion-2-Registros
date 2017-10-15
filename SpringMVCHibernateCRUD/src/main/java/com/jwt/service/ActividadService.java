package com.jwt.service;

import java.util.List;

import com.jwt.model.Actividad;

public interface ActividadService {
	
	public void addActividad(Actividad actividad);
	
	public List<Actividad> getAllActividad();
	
	public void deleteActividad(Integer codigoActividad);
	
	public Actividad updateActividad(Actividad actividad);
	
	public Actividad  getActividad(int codigoActividad);
	
	
}
