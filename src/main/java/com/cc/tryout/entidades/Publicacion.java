package com.cc.tryout.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "publicacion")
public class Publicacion extends AbstractBaseEntity{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "isPublicacion")
	private Integer idPublicacion;
	@Column(name = "nombrePublicacion")
	private String nombrePublicacion;
	@Column(name = "fecha")
	private java.util.Date fecha;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario")
	private Usuario usuario;
	private Publicacion() {}
	public Publicacion(Integer idPublicacion, String nombrePublicacion, Date fecha, Usuario usuario) {
		super();
		this.idPublicacion = idPublicacion;
		this.nombrePublicacion = nombrePublicacion;
		this.fecha = fecha;
		this.usuario = usuario;
	}
	public Integer getIdPublicacion() {
		return idPublicacion;
	}
	public void setIdPublicacion(Integer idPublicacion) {
		this.idPublicacion = idPublicacion;
	}
	public String getNombrePublicacion() {
		return nombrePublicacion;
	}
	public void setNombrePublicacion(String nombrePublicacion) {
		this.nombrePublicacion = nombrePublicacion;
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
