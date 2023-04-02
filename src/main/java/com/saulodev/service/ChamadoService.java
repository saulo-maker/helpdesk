package com.saulodev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saulodev.domain.Chamado;
import com.saulodev.repository.ChamadoRepository;

@Service
public class ChamadoService {
    
    @Autowired
    private ChamadoRepository repository;

    public Chamado findByid(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    public List<Chamado> findAll() {
        return repository.findAll();
    }

    public Chamado createChamado(Chamado chamado) {
        return repository.save(chamado);
    }
}
