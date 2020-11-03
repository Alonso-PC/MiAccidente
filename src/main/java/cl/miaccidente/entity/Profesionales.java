package cl.miaccidente.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profesionales")
public class Profesionales {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "rutProfesional")
	private String rutProfesional;

	@Column(name = "nombreProfesional")
	private String nombreProfesional;

	@Column(name = "apellidoProfesional")
	private String apellidoProfesional;

	@Column(name = "cargoProfesional")
	private String cargoProfesional;

	public Profesionales() {
		super();
	}

	public Profesionales(int id, String rutProfesional, String nombreProfesional, String apellidoProfesional,
			String cargoProfesional) {
		super();
		this.id = id;
		this.rutProfesional = rutProfesional;
		this.nombreProfesional = nombreProfesional;
		this.apellidoProfesional = apellidoProfesional;
		this.cargoProfesional = cargoProfesional;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRutProfesional() {
		return rutProfesional;
	}

	public void setRutProfesional(String rutProfesional) {
		this.rutProfesional = rutProfesional;
	}

	public String getNombreProfesional() {
		return nombreProfesional;
	}

	public void setNombreProfesional(String nombreProfesional) {
		this.nombreProfesional = nombreProfesional;
	}

	public String getApellidoProfesional() {
		return apellidoProfesional;
	}

	public void setApellidoProfesional(String apellidoProfesional) {
		this.apellidoProfesional = apellidoProfesional;
	}

	public String getCargoProfesional() {
		return cargoProfesional;
	}

	public void setCargoProfesional(String cargoProfesional) {
		this.cargoProfesional = cargoProfesional;
	}

}