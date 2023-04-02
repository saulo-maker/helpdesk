package com.saulodev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saulodev.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
