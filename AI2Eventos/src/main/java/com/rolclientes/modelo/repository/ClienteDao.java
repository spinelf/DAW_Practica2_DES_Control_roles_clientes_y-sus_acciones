package com.rolclientes.modelo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rolclientes.modelo.beans.Cliente;

//creamos la interfaz que va a determinar los métodos para los clientes
@Repository
public interface ClienteDao {
	
	List<Cliente> buscarTodos();
	
	int altaCliente(Cliente cliente);
	
	Cliente buscarPorNombreUsuario(String nombreUsuario);
	Cliente buscarPorId(int idCliente);
	int login(String nombreUsuario, String password);
}
