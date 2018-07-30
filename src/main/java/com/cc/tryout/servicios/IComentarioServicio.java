package com.cc.tryout.servicios;

import java.util.List;

import com.cc.tryout.entidades.Comentario;

public interface IComentarioServicio {

	public List<Comentario> obtenerComentariosByPublicacion(Integer idPublicacion);
	public Comentario guardarComentario(Comentario comentario);
	public Comentario eliminarComentario(Integer idComentario);
}
