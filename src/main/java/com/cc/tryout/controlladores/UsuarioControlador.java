package com.cc.tryout.controlladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cc.tryout.servicios.IUsuarioServicio;

@Controller
@RequestMapping("/usuario")
public class UsuarioControlador {
	
	@Autowired
	IUsuarioServicio servicio;
	
	@GetMapping("/todo")
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
	}
}
