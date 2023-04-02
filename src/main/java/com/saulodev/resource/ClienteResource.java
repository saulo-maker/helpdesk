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

import com.saulodev.domain.Cliente;
import com.saulodev.service.ClienteService;

@RestController
@RequestMapping(value = "/tecnicos")
public class ClienteResource {
	@Autowired
	private ClienteService service;
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cliente> findById(@PathVariable Integer id) {
		Cliente obj = service.findById(id);
		System.out.println(obj);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping
	public List<Cliente> findAll() {
		return service.findAll();
	}
	
	@PostMapping(path = "/cadastro", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Cliente create(@RequestBody Cliente cliente) {
		return service.save(cliente);
	}
	
	@PutMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Cliente atulizarTecnico(@PathVariable Integer id, @RequestBody Cliente cliente) {
		return service.updateTecnico(id, cliente);
	}
}