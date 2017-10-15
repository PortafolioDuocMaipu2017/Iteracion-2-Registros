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

import com.jwt.model.Actividad;
import com.jwt.service.ActividadService;

@Controller
public class ActividadController {

	private static final Logger logger = Logger
			.getLogger(ActividadController.class);
	
	public ActividadController() {
		System.out.println("ActividadController");
	}
	@Autowired
	private ActividadService actividadservice;
	
	@RequestMapping(value = "/datos3")
	public ModelAndView listaActividad(ModelAndView model) throws IOException {
		List<Actividad> listActividad = actividadservice.getAllActividad();
		model.addObject("listActividad", listActividad);
		model.setViewName("Datos3");
		return model;
	}
	@RequestMapping(value = "/nuevoActividad", method = RequestMethod.GET)
	public ModelAndView nuevoActividad(ModelAndView model) {
		Actividad actividad = new Actividad();
		model.addObject("actividad" , actividad);
		model.setViewName("ActividadForm");
		return model;
	}
	
	@RequestMapping(value = "/guardarActividad", method = RequestMethod.POST)
	public ModelAndView guardarActividad(@ModelAttribute Actividad actividad) {
		if(actividad.getCodigoActividad() == 0) {
			actividadservice.addActividad(actividad);
		} else {
			actividadservice.updateActividad(actividad);
		}
		return new ModelAndView("redirect:/datos3");		
	}
	@RequestMapping(value = "/borrarActividad", method = RequestMethod.GET)
	public ModelAndView borrarActividad(HttpServletRequest request) {
		int codigoActividad = Integer.parseInt(request.getParameter("codigoActividad"));
		actividadservice.deleteActividad(codigoActividad);
		return new ModelAndView("redirect:/datos3");
	}
	@RequestMapping(value = "/editarActividad", method = RequestMethod.GET)
	public ModelAndView editarActividad(HttpServletRequest request) {
		int codigoActividad = Integer.parseInt(request.getParameter("codigoActividad"));
		Actividad actividad = actividadservice.getActividad(codigoActividad);
		ModelAndView model = new ModelAndView("ActividadForm");
		model.addObject("actividad", actividad);
		
		return model;
	}
}
