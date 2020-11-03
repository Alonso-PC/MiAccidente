package cl.miaccidente.service;

import java.util.List;

import cl.miaccidente.entity.Clientes;

public interface ClientesService {

 public abstract List<Clientes> listarClientes();
 public abstract Clientes agregarClientes(Clientes clientes);
 public abstract Clientes findClientesById(int id);
 public abstract void removeCliente(int id);

}
