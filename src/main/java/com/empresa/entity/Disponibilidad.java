package com.empresa.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "disponibilidad")
public class Disponibilidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDisponibilidad;
	@JsonFormat(pattern = "HH:mm:ss", timezone="America/Lima" )
	@DateTimeFormat(pattern = "HH:mm:ss")
	@Temporal(TemporalType.TIME)
	private Date horaInicio;
	@JsonFormat(pattern = "HH:mm:ss", timezone="America/Lima" )
	@DateTimeFormat(pattern = "HH:mm:ss")
	@Temporal(TemporalType.TIME)
	private Date horaFin;
	private String dia;
	
	@ManyToOne
	@JoinColumn(name = "idCiclo")
	private Ciclo idCiclo;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario idUsuario;
	
	
	
	
	
	
	public int getIdDisponibilidad() {
		return idDisponibilidad;
	}

	public void setIdDisponibilidad(int idDisponibilidad) {
		this.idDisponibilidad = idDisponibilidad;
	}

	public Date getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Date getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public Ciclo getIdCiclo() {
		return idCiclo;
	}

	public void setIdCiclo(Ciclo idCiclo) {
		this.idCiclo = idCiclo;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	
	
	
	
	
		
	
	
	
	
	
	
}






