package com.jwt.service;

import java.util.List;

import com.jwt.model.Apoderado;

public interface ApoderadoService {
	
	public void addApoderado(Apoderado apoderado);

	public List<Apoderado> getAllApoderado();

	public void deleteApoderado(Integer codigoApoderado);

	public Apoderado updateApoderado(Apoderado apoderado);

	public Apoderado getApoderado(int codigoApoderado);
}
