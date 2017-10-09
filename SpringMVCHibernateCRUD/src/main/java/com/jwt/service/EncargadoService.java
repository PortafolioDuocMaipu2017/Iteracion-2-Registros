package com.jwt.service;

import java.util.List;

import com.jwt.model.Encargado;

public interface EncargadoService {
	
	public void addEncargado(Encargado encargado);

	public List<Encargado> getAllEncargado();

	public void deleteEncargado(Integer codigoEncargado);

	public Encargado updateEncargado(Encargado encargado);

	public Encargado getEncargado(int codigoEncargado);
}
