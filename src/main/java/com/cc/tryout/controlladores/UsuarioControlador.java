package com.cc.tryout.controlladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cc.tryout.servicios.IUsuarioServicio;

@Controller
@RequestMapping("/usuario")
public class UsuarioControlador {
	
	@Autowired
	IUsuarioServicio servicio;
	
	@GetMapping("/todo")
	public ModelAndView obtenerUsuarios()
	{
		ModelAndView model = new ModelAndView("usuario");
		model.addObject("usuario", servicio.obtenerUsuarios());
		return model;
	}
}
