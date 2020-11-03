package cl.miaccidente.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.miaccidente.entity.ActividadMejora;

@Repository("actividadmejorarepository")
public interface ActividadMejoraRepository extends JpaRepository<ActividadMejora, Serializable> {

	public abstract ActividadMejora findById(int id);

}
