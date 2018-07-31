package com.cc.tryout.servicios;

import java.util.List;

import com.cc.tryout.entidades.Usuario;

public interface IUsuarioServicio {

	
	public List<Usuario> obtenerUsuarios();
	public Usuario obtenerUsuario(Integer id);
	public Usuario guardarUsuario(Usuario nuevoUsuario);
	
	
}
