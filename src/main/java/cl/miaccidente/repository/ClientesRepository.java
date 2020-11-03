package cl.miaccidente.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.miaccidente.entity.Clientes;

@Repository("clientesrepository")
public interface ClientesRepository extends JpaRepository<Clientes, Serializable> {

 public abstract Clientes findById(int id);
 
}
