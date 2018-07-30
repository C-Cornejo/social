package com.cc.tryout.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.tryout.entidades.Usuario;
import com.cc.tryout.repositorios.IUsuarioRepository;
import com.cc.tryout.servicios.IUsuarioServicio;
@Service("IUsuarioService")
public class UsuarioServicioImpl implements IUsuarioServicio {
	
	@Autowired
	private IUsuarioRepository repositorio;
	
	
	@Override
	public List<Usuario> obtenerUsuarios() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Usuario obtenerUsuario(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario guardarUsuario(Usuario nuevoUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
