package cl.miaccidente.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cl.miaccidente.entity.Actividades;

@Repository("actividadesrepository")
public interface ActividadesRepository extends JpaRepository<Actividades, Serializable> {

}