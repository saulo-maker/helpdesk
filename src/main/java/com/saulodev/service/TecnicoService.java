package com.saulodev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.saulodev.domain.Tecnico;
import com.saulodev.repository.TecnicoRepository;

@Service
public class TecnicoService {
	
	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
	public List<Tecnico> findAll() {
		return repository.findAll();
	}
	
	public Tecnico save(Tecnico tecnico) {
		return repository.save(tecnico);
	}
	
	public Tecnico updateTecnico(@PathVariable Integer id, Tecnico tecnico) {
		
		Tecnico tecnicoUpdate = repository.findById(id).orElseThrow();
		
		tecnicoUpdate.setNome(tecnico.getNome());
		tecnicoUpdate.setEmail(tecnico.getEmail());
		tecnicoUpdate.setSenha(tecnico.getSenha());
		tecnicoUpdate.setCpf(tecnico.getCpf());
		tecnicoUpdate.setChamados(tecnico.getChamados());
		
		return repository.save(tecnicoUpdate);
		
	}
}
