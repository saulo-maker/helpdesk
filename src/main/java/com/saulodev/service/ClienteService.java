package com.saulodev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.saulodev.domain.Cliente;
import com.saulodev.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	public Cliente findById(Integer id) {
		Optional<Cliente> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
	public List<Cliente> findAll() {
		return repository.findAll();
	}
	
	public Cliente save(Cliente cliente) {
		return repository.save(cliente);
	}
	
	public Cliente updateTecnico(@PathVariable Integer id, Cliente cliente) {
		
		Cliente clienteUpdate = repository.findById(id).orElseThrow();
		
		clienteUpdate.setNome(cliente.getNome());
		clienteUpdate.setEmail(cliente.getEmail());
		clienteUpdate.setSenha(cliente.getSenha());
		clienteUpdate.setCpf(cliente.getCpf());
		clienteUpdate.setChamados(cliente.getChamados());
		
		return repository.save(clienteUpdate);
		
	}
}
