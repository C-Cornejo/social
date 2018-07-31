package com.cc.tryout.controlladores;

<<<<<<< HEAD

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
>>>>>>> 832c4d996ab916d28f5adcf3d6dd3daae990123c

import com.cc.tryout.servicios.IUsuarioServicio;

@Controller
@RequestMapping("/usuario")
public class UsuarioControlador {
	
	@Autowired
	IUsuarioServicio servicio;
	
	@GetMapping("/todo")
<<<<<<< HEAD
	public ModelAndView obtenerUsuarios()
	{
		ModelAndView model = new ModelAndView("usuario");
		model.addObject("usuario", servicio.obtenerUsuarios());
		return model;
=======
	public ResponseEntity<?> obtenerUsuarios()
	{
		try
		{
			return new ResponseEntity<>(servicio.obtenerUsuarios(),HttpStatus.OK);
		}
		catch(Exception ex)
		{
			return new ResponseEntity<>("ERROR INTERNO DEL SERVER",HttpStatus.INTERNAL_SERVER_ERROR);
		}
>>>>>>> 832c4d996ab916d28f5adcf3d6dd3daae990123c
	}
}
