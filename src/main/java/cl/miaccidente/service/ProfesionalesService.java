package cl.miaccidente.service;

import java.util.List;

import cl.miaccidente.entity.Profesionales;

public interface ProfesionalesService {

	public abstract Profesionales agregarProfesionales(Profesionales profesionales);
	public abstract List<Profesionales> listarProfesionales();
	public abstract Profesionales findProfesionalesById(int id);
	public abstract void removeProfesionales(int id);

}