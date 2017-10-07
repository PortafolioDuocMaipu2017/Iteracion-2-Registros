package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.ApoderadoDAO;
import com.jwt.model.Apoderado;


@Service
@Transactional
public class ApoderadoServiceImpl  implements ApoderadoService {

	@Autowired
	private ApoderadoDAO apoderadoDAO;
	
	@Override
	@Transactional
	public void addApoderado(Apoderado apoderado) {
		apoderadoDAO.addApoderado(apoderado);
	}

	@Override
	@Transactional
	public List<Apoderado> getAllApoderado() {
		return apoderadoDAO.getAllApoderado();
	}

	@Override
	@Transactional
	public void deleteApoderado(Integer codigoApoderado) {
		apoderadoDAO.deleteApoderado(codigoApoderado);
	}

	public Apoderado updateApoderado(Apoderado apoderado) {
		return apoderadoDAO.updateApoderado(apoderado);
	}

	public Apoderado getApoderado(int codigoApoderado) {
		return apoderadoDAO.getApoderado(codigoApoderado);
	}

	public void setApoderadoDAO(ApoderadoDAO apoderadoDAO) {
		this.apoderadoDAO = apoderadoDAO;
	}
}
