package cl.miaccidente.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.miaccidente.entity.IngresarAsesoria;

@Repository("ingresarasesoriarepository")
public interface IngresarAsesoriaRepository extends JpaRepository<IngresarAsesoria, Serializable> {

}