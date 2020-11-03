package cl.miaccidente.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actividadmejora")
public class ActividadMejora {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public int id;

	@Column(name = "actividadMejora")
	public String actividadMejora;

	@Column(name = "empresaCliente")
	public String empresaCliente;

	public ActividadMejora() {
		super();
	}

	public ActividadMejora(int id, String actividadMejora, String empresaCliente) {
		super();
		this.id = id;
		this.actividadMejora = actividadMejora;
		this.empresaCliente = empresaCliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActividadMejora() {
		return actividadMejora;
	}

	public void setActividadMejora(String actividadMejora) {
		this.actividadMejora = actividadMejora;
	}

	public String getEmpresaCliente() {
		return empresaCliente;
	}

	public void setEmpresaCliente(String empresaCliente) {
		this.empresaCliente = empresaCliente;
	}

}