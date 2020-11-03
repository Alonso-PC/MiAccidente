package cl.miaccidente.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cl.miaccidente.entity.Pagos;

@Repository("pagosrepository")
public interface PagosRepository extends JpaRepository<Pagos, Serializable> {

}
