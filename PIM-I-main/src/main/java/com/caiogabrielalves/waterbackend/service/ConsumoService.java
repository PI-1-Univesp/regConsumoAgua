package com.caiogabrielalves.waterbackend.service;

import com.caiogabrielalves.waterbackend.model.Consumo;
import com.caiogabrielalves.waterbackend.repository.ConsumoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumoService {

    private final ConsumoRepository repository;

    public ConsumoService(ConsumoRepository repository) {
        this.repository = repository;
    }

    public List<Consumo> listarTodos() {
        return repository.findAll();
    }

    public Consumo salvar(Consumo consumo) {
        return repository.save(consumo);
    }
}