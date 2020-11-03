package cl.miaccidente.entity;

//import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes /*implements Serializable*/{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public int id;

	@Column(name = "rutCliente")
	public String rutCliente;

	@Column(name = "nombreCliente")
	public String nombreCliente;

	@Column(name = "apellidoCliente")
	public String apellidoCliente;

	@Column(name = "empresaCliente")
	public String empresaCliente;

	@Column(name = "idProfesional")
	private int idProfesional;

	public Clientes(int id, String rutCliente, String nombreCliente, String apellidoCliente, String empresaCliente,
			int idProfesional) {
		super();
		this.id = id;
		this.rutCliente = rutCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.empresaCliente = empresaCliente;
		this.idProfesional = idProfesional;
	}

	public Clientes() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public String getEmpresaCliente() {
		return empresaCliente;
	}

	public void setEmpresaCliente(String empresaCliente) {
		this.empresaCliente = empresaCliente;
	}

	public int getIdProfesional() {
		return idProfesional;
	}

	public void setIdProfesional(int idProfesional) {
		this.idProfesional = idProfesional;
	}

}