package com.caiogabrielalves.waterbackend.controller;

import com.caiogabrielalves.waterbackend.model.Consumo;
import com.caiogabrielalves.waterbackend.service.ConsumoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consumos")
public class ConsumoController {

    private final ConsumoService service;

    public ConsumoController(ConsumoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Consumo> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Consumo adicionar(@RequestBody Consumo consumo) {
        return service.salvar(consumo);
    }
}