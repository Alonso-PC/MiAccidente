package cl.miaccidente.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.miaccidente.entity.Profesionales;

@Repository("profesionalesrepository")
public interface ProfesionalesRepository extends JpaRepository<Profesionales, Serializable> {

	public abstract Profesionales findById(int id);

}