package com.example.rsc.repository;

import com.example.rsc.entity.Oferta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfertaRepository extends JpaRepository<Oferta, Integer> {
    List<Oferta> findByDestino(String destino);
}
