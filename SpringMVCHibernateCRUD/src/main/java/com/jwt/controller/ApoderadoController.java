package com.jwt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.Apoderado;
import com.jwt.service.ApoderadoService;

@Controller
public class ApoderadoController {
	private static final Logger logger = Logger
			.getLogger(ApoderadoController.class);
	
	public ApoderadoController(){
		System.out.println("ApoderadoController()");
		System.out.println("Programas Operativos");
	}
	
	@Autowired
	private ApoderadoService apoderadoservice;
	
	@RequestMapping(value = "/")
	public ModelAndView inicio(ModelAndView model) throws IOException {
		model.setViewName("Index");
		return model;
	}
	
	@RequestMapping(value = "/datos")
	public ModelAndView listaApoderado(ModelAndView model) throws IOException {
		List<Apoderado> listApoderado = apoderadoservice.getAllApoderado();
		model.addObject("listApoderado", listApoderado);
		model.setViewName("Datos");
		return model;
	}
	
	@RequestMapping(value = "/nuevoApoderado", method = RequestMethod.GET)
	public ModelAndView nuevoApoderado(ModelAndView model) {
		Apoderado apoderado = new Apoderado();
		model.addObject("apoderado", apoderado);
		model.setViewName("ApoderadoForm");
		return model;
	}

	@RequestMapping(value = "/guardarApoderado", method = RequestMethod.POST)
	public ModelAndView guardarApoderado(@ModelAttribute Apoderado apoderado) {
		if (apoderado.getCodigoApoderado() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			apoderadoservice.addApoderado(apoderado);
		} else {
			apoderadoservice.updateApoderado(apoderado);
		}
		return new ModelAndView("redirect:/datos");
	}

	@RequestMapping(value = "/borrarApoderado", method = RequestMethod.GET)
	public ModelAndView borrarApoderado(HttpServletRequest request) {
		int codigoApoderado = Integer.parseInt(request.getParameter("codigoApoderado"));
		apoderadoservice.deleteApoderado(codigoApoderado);
		return new ModelAndView("redirect:/datos");
	}

	@RequestMapping(value = "/editarApoderado", method = RequestMethod.GET)
	public ModelAndView editarApoderado(HttpServletRequest request) {
		int codigoApoderado = Integer.parseInt(request.getParameter("codigoApoderado"));
		Apoderado apoderado = apoderadoservice.getApoderado(codigoApoderado);
		ModelAndView model = new ModelAndView("ApoderadoForm");
		model.addObject("apoderado", apoderado);

		return model;
	}
}
