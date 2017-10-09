package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.EncargadoDAO;
import com.jwt.model.Encargado;


@Service
@Transactional
public class EncargadoServiceImpl  implements EncargadoService {

	@Autowired
	private EncargadoDAO encargadoDAO;
	
	@Override
	@Transactional
	public void addEncargado(Encargado encargado) {
		encargadoDAO.addEncargado(encargado);
	}

	@Override
	@Transactional
	public List<Encargado> getAllEncargado() {
		return encargadoDAO.getAllEncargado();
	}

	@Override
	@Transactional
	public void deleteEncargado(Integer codigoEncargado) {
		encargadoDAO.deleteEncargado(codigoEncargado);
	}

	public Encargado updateEncargado(Encargado encargado) {
		return encargadoDAO.updateEncargado(encargado);
	}

	public Encargado getEncargado(int codigoEncargado) {
		return encargadoDAO.getEncargado(codigoEncargado);
	}

	public void setEncargadoDAO(EncargadoDAO encargadoDAO) {
		this.encargadoDAO = encargadoDAO;
	}
}
