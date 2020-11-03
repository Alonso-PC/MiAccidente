package cl.miaccidente.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "crearcapacitacion")
public class CrearCapacitacion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public int id;

	@Column(name = "idCliente")
	public int idCliente;

	@Column(name = "tipoCapacitacion")
	public String tipoCapacitacion;

	@Column(name = "idProfesional")
	public int idProfesional;

	@Column(name = "fechaAccidente")
	public Date fechaAccidente;

	@Column(name = "cantidad")
	public int cantidad;

	public CrearCapacitacion() {
		super();
	}

	public CrearCapacitacion(int id, int idCliente, String tipoCapacitacion, int idProfesional, Date fechaAccidente,
			int cantidad) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.tipoCapacitacion = tipoCapacitacion;
		this.idProfesional = idProfesional;
		this.fechaAccidente = fechaAccidente;
		this.cantidad = cantidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getTipoCapacitacion() {
		return tipoCapacitacion;
	}

	public void setTipoCapacitacion(String tipoCapacitacion) {
		this.tipoCapacitacion = tipoCapacitacion;
	}

	public int getIdProfesional() {
		return idProfesional;
	}

	public void setIdProfesional(int idProfesional) {
		this.idProfesional = idProfesional;
	}

	public Date getFechaAccidente() {
		return fechaAccidente;
	}

	public void setFechaAccidente(Date fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}