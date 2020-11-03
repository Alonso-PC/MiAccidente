package cl.miaccidente.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actividades")
public class Actividades {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idActividad")
	private int idActividad;

	@Column(name = "nombreCliente")
	private String nombreCliente;

	@Column(name = "tipoActividad")
	private String tipoActividad;

	@Column(name = "resumenActividad")
	private String resumenActividad;

	@Column(name = "fechaActividad")
	private String fechaActividad;

	public Actividades() {
		super();
	}

	public Actividades(int idActividad, String nombreCliente, String tipoActividad, String resumenActividad,
			String fechaActividad) {
		super();
		this.idActividad = idActividad;
		this.nombreCliente = nombreCliente;
		this.tipoActividad = tipoActividad;
		this.resumenActividad = resumenActividad;
		this.fechaActividad = fechaActividad;
	}

	public int getIdActividad() {
		return idActividad;
	}

	public void setIdActividad(int idActividad) {
		this.idActividad = idActividad;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getTipoActividad() {
		return tipoActividad;
	}

	public void setTipoActividad(String tipoActividad) {
		this.tipoActividad = tipoActividad;
	}

	public String getResumenActividad() {
		return resumenActividad;
	}

	public void setResumenActividad(String resumenActividad) {
		this.resumenActividad = resumenActividad;
	}

	public String getFechaActividad() {
		return fechaActividad;
	}

	public void setFechaActividad(String fechaActividad) {
		this.fechaActividad = fechaActividad;
	}

}