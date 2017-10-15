package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Actividad;

@Repository
public class ActividadDAOImpl implements ActividadDAO {

	@Autowired
	private SessionFactory session;
	
	@Override
	public void addActividad(Actividad actividad) {
		session.getCurrentSession().saveOrUpdate(actividad);

	}

	@SuppressWarnings("unchecked")
	public List<Actividad> getAllActividad() {
		return session.getCurrentSession().createQuery("from Actividad").list();
	}

	@Override
	public void deleteActividad(Integer codigoActividad) {
		Actividad actividad = (Actividad)session.getCurrentSession().load(Actividad.class, codigoActividad);
		if(null != actividad) {
			this.session.getCurrentSession().delete(actividad);
		}

	}

	
	public Actividad updateActividad(Actividad actividad) {
		session.getCurrentSession().saveOrUpdate(actividad);
		return actividad;
	}

	
	public Actividad getActividad(int codigoActividad) {
		return (Actividad)session.getCurrentSession().get(Actividad.class, codigoActividad);
	}

}
