package com.saulodev.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.*;
import com.saulodev.domain.Tecnico;
import com.saulodev.service.TecnicoService;

@RestController
@RequestMapping(value = "/tecnico")
public class TecnicoResource {
	@Autowired
	private TecnicoService service;
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Tecnico> findById(@PathVariable Integer id) {
		Tecnico obj = service.findById(id);
		System.out.println(obj);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping
	public List<Tecnico> findAll() {
		return service.findAll();
	}
	
	@PostMapping(path = "/cadastro", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Tecnico create(@RequestBody Tecnico tecnico) {
		return service.save(tecnico);
	}
	
	@PutMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Tecnico atulizarTecnico(@PathVariable Integer id, @RequestBody Tecnico tecnico) {
		return service.updateTecnico(id, tecnico);
	}
	
	
}
