package cl.miaccidente.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ingresarasesoria")
public class IngresarAsesoria {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public int id;

	@Column(name = "idCliente")
	public int idCliente;

	@Column(name = "tipoAsesoria")
	public String tipoAsesoria;

	@Column(name = "idProfesional")
	public int idProfesional;

	@Column(name = "fechaAccidente")
	public Date fechaAccidente;

	@Column(name = "descripcion")
	public String descripcion;

	public IngresarAsesoria() {
		super();
	}

	public IngresarAsesoria(int id, int idCliente, String tipoAsesoria, int idProfesional, Date fechaAccidente,
			String descripcion) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.tipoAsesoria = tipoAsesoria;
		this.idProfesional = idProfesional;
		this.fechaAccidente = fechaAccidente;
		this.descripcion = descripcion;
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

	public String getTipoAsesoria() {
		return tipoAsesoria;
	}

	public void setTipoAsesoria(String tipoAsesoria) {
		this.tipoAsesoria = tipoAsesoria;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}