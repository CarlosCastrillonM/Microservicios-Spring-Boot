package com.example.rsc.repository;

import com.example.rsc.entity.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservaRepository extends MongoRepository<Reserva, Integer> {
}
