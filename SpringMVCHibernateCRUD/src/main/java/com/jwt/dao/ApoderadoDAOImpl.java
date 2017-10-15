package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Apoderado;

@Repository
public class ApoderadoDAOImpl implements ApoderadoDAO {

	@Autowired
	private SessionFactory sesion;
	public void addApoderado(Apoderado apoderado) {
		sesion.getCurrentSession().saveOrUpdate(apoderado);	
	}

	@SuppressWarnings("unchecked")
	public List<Apoderado> getAllApoderado() {
		return sesion.getCurrentSession().createQuery("from Apoderado").list();
	}

	@Override
	public void deleteApoderado(Integer codigoApoderado) {
		Apoderado apoderado = (Apoderado) sesion.getCurrentSession().load(
				Apoderado.class, codigoApoderado);
		if (null != apoderado) {
			this.sesion.getCurrentSession().delete(apoderado);
		}
	}

	public Apoderado updateApoderado(Apoderado apoderado) {
		sesion.getCurrentSession().update(apoderado);
		return apoderado;
	}

	@Override
	public Apoderado getApoderado(int codigoApoderado) {
		return (Apoderado)sesion.getCurrentSession().get(Apoderado.class, codigoApoderado);
	}
	
	@Override
	public Apoderado modificarMonto(Apoderado apoderado, Integer monto) {
		Integer saldo = apoderado.getMonto();
		Integer total = saldo + monto;
		apoderado.setMonto(total);
		return updateApoderado(apoderado);		
	}
	
}
