package com.jwt.dao;

import java.util.List;

import com.jwt.model.Actividad;

public interface ActividadDAO {

	public void addActividad(Actividad actividad);
	
	public List<Actividad> getAllActividad();
	
	public void deleteActividad(Integer codigoActividad);
	
	public Actividad updateActividad(Actividad actividad);
	
	public Actividad getActividad(int codigoActividad);
	
}
