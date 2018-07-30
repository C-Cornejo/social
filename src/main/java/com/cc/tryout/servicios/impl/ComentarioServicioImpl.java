package com.cc.tryout.servicios.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cc.tryout.entidades.Comentario;
import com.cc.tryout.servicios.IComentarioServicio;

@Service("IComentarioService")
public class ComentarioServicioImpl implements IComentarioServicio {

	@Override
	public List<Comentario> obtenerComentariosByPublicacion(Integer idPublicacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comentario guardarComentario(Comentario comentario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comentario eliminarComentario(Integer idComentario) {
		// TODO Auto-generated method stub
		return null;
	}

}
