package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.ActividadDAO;
import com.jwt.model.Actividad;

@Service
@Transactional
public class ActividadServiceImpl implements ActividadService {
	
	@Autowired
	private ActividadDAO actividadDAO;

	@Override
	@Transactional
	public void addActividad(Actividad actividad) {
		actividadDAO.addActividad(actividad);

	}

	@Override
	@Transactional
	public List<Actividad> getAllActividad() {
		return actividadDAO.getAllActividad();
	}

	@Override
	@Transactional
	public void deleteActividad(Integer codigoActividad) {
		actividadDAO.deleteActividad(codigoActividad);

	}	
	public Actividad updateActividad(Actividad actividad) {
		return actividadDAO.updateActividad(actividad);
	}
	
	public Actividad getActividad(int codigoActividad) {
		return actividadDAO.getActividad(codigoActividad);
	}
	public void setActividad(ActividadDAO actividadDAO) {
		this.actividadDAO = actividadDAO;
	}

}
