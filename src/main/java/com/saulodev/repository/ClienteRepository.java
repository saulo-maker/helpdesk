package com.saulodev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saulodev.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}