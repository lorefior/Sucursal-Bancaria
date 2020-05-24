package com.lorefior.banco.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "PERSONA")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PERSONA")
	private Long id;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "APELLIDO")
	private String apellido;
	
	@Column(name = "FECHA_NACIMIENTO")
	private Date fechaNacimiento;
	
	@Column(name = "DNI")
	private Integer dni;
	
	@Column(name = "DIRECCION")
	private String direccion;
	
	@Column(name = "CIUDAD")
	private String ciudad;

	@Column(name = "PROVINCIA")
	private String provincia;
	
	@Column(name = "TELEFONO")
	private String telefono;

	
    @OneToOne
    @MapsId
    private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", "
				+ "nombre=" + nombre + ", "
				+ "apellido=" + apellido + ", "
                + "fechaNacimiento=" + fechaNacimiento 
                + ", dni=" + dni 
                + ", direccion=" + direccion 
                + ", ciudad=" + ciudad 
                + ", provincia=" + provincia 
                + ", telefono=" + telefono  + "]";
	}
	

}