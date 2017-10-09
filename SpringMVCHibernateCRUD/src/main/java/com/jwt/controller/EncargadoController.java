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

import com.jwt.model.Encargado;
import com.jwt.service.EncargadoService;

@Controller
public class EncargadoController {
	private static final Logger logger = Logger
			.getLogger(EncargadoController.class);
	
	public EncargadoController(){
		System.out.println("EncargadoController()");
	}
	
	@Autowired
	private EncargadoService encargadoService;
	
	@RequestMapping(value = "/datos2")
	public ModelAndView listaEncargado(ModelAndView model) throws IOException {
		List<Encargado> listEncargado = encargadoService.getAllEncargado();
		model.addObject("listEncargado", listEncargado);
		model.setViewName("Datos2");
		return model;
	}
	
	@RequestMapping(value = "/nuevoEncargado", method = RequestMethod.GET)
	public ModelAndView nuevoEncargado(ModelAndView model) {
		Encargado encargado = new Encargado();
		model.addObject("encargado", encargado);
		model.setViewName("EncargadoForm");
		return model;
	}

	@RequestMapping(value = "/guardarEncargado", method = RequestMethod.POST)
	public ModelAndView guardarEncargado(@ModelAttribute Encargado encargado) {
		if (encargado.getCodigoEncargado() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			encargadoService.addEncargado(encargado);
		} else {
			encargadoService.updateEncargado(encargado);
		}
		return new ModelAndView("redirect:/datos2");
	}

	@RequestMapping(value = "/borrarEncargado", method = RequestMethod.GET)
	public ModelAndView borrarEncargado(HttpServletRequest request) {
		int codigoEncargado = Integer.parseInt(request.getParameter("codigoEncargado"));
		encargadoService.deleteEncargado(codigoEncargado);
		return new ModelAndView("redirect:/datos2");
	}

	@RequestMapping(value = "/editarEncargado", method = RequestMethod.GET)
	public ModelAndView editarApoderado(HttpServletRequest request) {
		int codigoEncargado = Integer.parseInt(request.getParameter("codigoEncargado"));
		Encargado encargado = encargadoService.getEncargado(codigoEncargado);
		ModelAndView model = new ModelAndView("EncargadoForm");
		model.addObject("encargado", encargado);

		return model;
	}
}
