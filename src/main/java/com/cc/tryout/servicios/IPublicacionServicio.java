package com.cc.tryout.servicios;

import java.util.List;

import com.cc.tryout.entidades.Publicacion;

public interface IPublicacionServicio {

	
	public List<Publicacion> obtenerPublicaciones();
	public Publicacion obtenerPublicacion(Integer idPublicacion);
	public Publicacion guardarPublicacion(Publicacion nuevaPublicacion);
	
}
