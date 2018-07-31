package com.cc.tryout.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.tryout.entidades.Publicacion;
import com.cc.tryout.repositorios.IPublicacionRepository;
import com.cc.tryout.servicios.IPublicacionServicio;
@Service("IPublicacionService")
public class PublicacionServicioImpl implements IPublicacionServicio {

	@Autowired
	private IPublicacionRepository repositorio;
	
	@Override
	public List<Publicacion> obtenerPublicaciones() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Publicacion obtenerPublicacion(Integer idPublicacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Publicacion guardarPublicacion(Publicacion nuevaPublicacion) {
		// TODO Auto-generated method stub
		return null;
	}

}
