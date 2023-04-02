package com.saulodev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saulodev.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}