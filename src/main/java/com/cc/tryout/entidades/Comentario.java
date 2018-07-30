package com.cc.tryout.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="comentario")
public class Comentario extends AbstractBaseEntity{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="idComentario")
	private String idComentario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="publicacion")
	private Publicacion publicacion;
	@Column(name="contenido")
	private String contenido;
	@Column(name="fecha")
	private java.util.Date fecha;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="usuario")
	private Usuario usuario;
	
	public Comentario(String idComentario, Publicacion publicacion, String contenido, Date fecha, Usuario usuario) {
		super();
		this.idComentario = idComentario;
		this.publicacion = publicacion;
		this.contenido = contenido;
		this.fecha = fecha;
		this.usuario = usuario;
	}
	private Comentario() {}
	
	public String getIdComentario() {
		return idComentario;
	}


	public void setIdComentario(String idComentario) {
		this.idComentario = idComentario;
	}


	public Publicacion getPublicacion() {
		return publicacion;
	}


	public void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}


	public String getContenido() {
		return contenido;
	}


	public void setContenido(String contenido) {
		this.contenido = contenido;
	}


	public java.util.Date getFecha() {
		return fecha;
	}


	public void setFecha(java.util.Date fecha) {
		this.fecha = fecha;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	
	
	
}
