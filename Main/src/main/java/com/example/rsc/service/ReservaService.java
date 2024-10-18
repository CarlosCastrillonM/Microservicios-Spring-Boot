package com.example.rsc.service;

import com.example.rsc.dto.ReservaDto;

import java.util.List;
import java.util.Optional;

public interface ReservaService {
    List<ReservaDto> findAll();
    Optional<ReservaDto> find(Integer id);
    ReservaDto create(ReservaDto reservaDto);
    Optional<ReservaDto> update(Integer id, ReservaDto newReservaDto);
    void delete(Integer id);
}
