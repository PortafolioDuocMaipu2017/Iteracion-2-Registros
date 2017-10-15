package com.jwt.dao;

import java.util.List;

import com.jwt.model.Apoderado;

public interface ApoderadoDAO {

	public void addApoderado(Apoderado apoderado);

	public List<Apoderado> getAllApoderado();

	public void deleteApoderado(Integer codigoApoderado);

	public Apoderado updateApoderado(Apoderado apoderado);

	public Apoderado getApoderado(int codigoApoderado);
	
	public Apoderado modificarMonto(Apoderado apoderado, Integer monto);
}
