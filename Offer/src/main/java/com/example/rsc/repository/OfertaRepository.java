package com.example.rsc.repository;

import com.example.rsc.entity.Oferta;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OfertaRepository extends MongoRepository<Oferta, Integer> {
    List<Oferta> findByDestino(String destino);
}
