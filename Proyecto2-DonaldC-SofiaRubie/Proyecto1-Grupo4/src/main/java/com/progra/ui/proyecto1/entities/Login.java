package com.progra.ui.proyecto1.entities;

import java.util.Date;

public class Login {

	private int id;
	private String usuario;
	private String password;
	private String rol;
	private String nombre;
	private Date fechaCreacion;
	private Date fechaLogeo;

	//Constructor
	public Login(){
	}

	public Login(String usuario, String password){
		this.usuario = usuario;
		this.password = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the rol
	 */
	public String getRol() {
		return rol;
	}

	/**
	 * @param rol the rol to set
	 */
	public void setRol(String rol) {
		this.rol = rol;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaLogeo() {
		return fechaLogeo;
	}

	public void setFechaLogeo(Date fechaLogeo) {
		this.fechaLogeo = fechaLogeo;
	}

	/**
	 * @return the ultimafechalogin
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
