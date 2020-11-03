package cl.miaccidente.service;

import java.util.List;

import cl.miaccidente.entity.ActividadMejora;

public interface ActividadMejoraService {

	public abstract List<ActividadMejora> listarActividadMejora();
	public abstract ActividadMejora agregarActividadMejora(ActividadMejora clientes);
	public abstract ActividadMejora findActividadMejoraById(int id);
	public abstract void removeActividadMejora(int id);

}