package com.rolclientes.modelo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rolclientes.modelo.beans.Cliente;

@Repository
public class ClienteDaoImpl implements ClienteDao {
	
	//creamos una lista de Clientes 
	private List<Cliente> listaClientes;
	
	public ClienteDaoImpl() {
		listaClientes = new ArrayList <>();
		cargarDatosClientes();
	}
	
	private void cargarDatosClientes () {
		listaClientes.add (new Cliente (1, "Homer", "Simpson1", "homer@simpson.com", "Homero", "Calle San Francisco", 1, "20 de noviembre de 2022"));
		listaClientes.add (new Cliente (2, "Marge", "Simpson2", "marge@simpson.com", "Marggarite", "Calle San Juan", 1, "19 de noviembre de 2022"));
		listaClientes.add (new Cliente (3, "Bart", "Simpson3", "bart@simpson.com", "Bartolome", "Calle San Pedro", 1, "21 de noviembre de 2022"));
		listaClientes.add (new Cliente (4, "Lisa", "Simpson4", "lisa@simpson.com", "Elisabeth", "Calle San Pablo", 1, "18 de noviembre de 2022"));
	}
	@Override
	public List<Cliente> buscarTodos() {
		return listaClientes;
	}
	
	//el método recibe un cliente. Devolverá 1 si se ha creado el nuevo cliente y 0 si no se ha hecho
	@Override
	public int altaCliente(Cliente cliente) {
		return listaClientes.add(cliente) ? 1 : 0;
	}

	//el método buscarPorNombreUsuario me devolverá el cliente que se corresponda con el nombre de usuario del cliente que buscamos
	@Override
	public Cliente buscarPorNombreUsuario(String nombreUsuario) {
		for (Cliente cliente : listaClientes) {
			if (cliente.getNombreUsuario().equals(nombreUsuario)) return cliente;
		}
		return null;
	}

	//el método buscarPorId me devolverá el cliente que se corresponda con la id del cliente que buscamos
	@Override
	public Cliente buscarPorId(int idCliente) {
		for (Cliente cliente : listaClientes) {
			if (cliente.getIdCliente() == idCliente) return cliente;
		}
		return null;
	}

	@Override
	public int login(String nombreUsuario, String password) {
		for (Cliente cliente : listaClientes) {
			if (cliente.getNombreUsuario().equals(nombreUsuario)) {
				if (cliente.getPassword().equals(password))
					return 1;
				}
			}
			return 0;}

}
			
			
	
	
