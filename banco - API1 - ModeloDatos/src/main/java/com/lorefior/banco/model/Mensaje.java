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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "MENSAJE")
public class Mensaje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_MENSAJE")
	private Long id;
	
	@Column(name = "MENSAJE")
	private String mensaje;
	
	@Column(name = "HORA")
	private Date hora;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "ID_DESTINATARIO", nullable = false)
	@JsonManagedReference
    private Persona destinatario;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "ID_REMITENTE", nullable = false)
	@JsonManagedReference
    private Persona remitente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public Persona getRemitente() {
		return remitente;
	}

	public void setRemitente(Persona remitente) {
		this.remitente = remitente;
	}

	public Persona getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Persona destinatario) {
		this.destinatario = destinatario;
	}

	@Override
	public String toString() {
		return "Mensaje [id=" + id + ", mensaje=" + mensaje + ", hora=" + hora + ", destinatario=" + destinatario
				+ ", remitente=" + remitente + "]";
	}
}