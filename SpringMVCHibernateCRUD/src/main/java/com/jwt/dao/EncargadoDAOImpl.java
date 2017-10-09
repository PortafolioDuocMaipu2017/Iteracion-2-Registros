package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Encargado;

@Repository
public class EncargadoDAOImpl implements EncargadoDAO {
	
	@Autowired
	private SessionFactory session;

	public void addEncargado(Encargado encargado) {
		session.getCurrentSession().saveOrUpdate(encargado);
	}

	@SuppressWarnings("unchecked")
	public List<Encargado> getAllEncargado() {
		return session.getCurrentSession().createQuery("from Encargado").list();
	}

	@Override
	public void deleteEncargado(Integer codigoEncargado) {
		Encargado encargado = (Encargado)session.getCurrentSession().load(Encargado.class, codigoEncargado);
		if(null != encargado) {
			this.session.getCurrentSession().delete(encargado);
		}
	}

	public Encargado updateEncargado(Encargado encargado) {
		session.getCurrentSession().update(encargado);
		return encargado;
	}

	public Encargado getEncargado(int codigoEncargado) {
		return (Encargado)session.getCurrentSession().get(Encargado.class, codigoEncargado);
	}
	
}
