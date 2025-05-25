package com.caiogabrielalves.waterbackend.repository;

import com.caiogabrielalves.waterbackend.model.Consumo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumoRepository extends JpaRepository<Consumo, Long> {
}