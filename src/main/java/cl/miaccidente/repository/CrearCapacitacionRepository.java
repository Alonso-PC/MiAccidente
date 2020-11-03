package cl.miaccidente.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.miaccidente.entity.CrearCapacitacion;

@Repository("crearcapacitacionrepository")
public interface CrearCapacitacionRepository extends JpaRepository<CrearCapacitacion, Serializable> {

}