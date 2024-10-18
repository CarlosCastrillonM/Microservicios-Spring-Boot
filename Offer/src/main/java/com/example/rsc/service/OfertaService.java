package com.example.rsc.service;

import com.example.rsc.dto.OfertaDto;

import java.util.List;
import java.util.Optional;

public interface OfertaService {
    List<OfertaDto> findAll();
    Optional<OfertaDto> find(Integer id);
    OfertaDto create(OfertaDto ofertaDto);
    Optional<OfertaDto> update(Integer id, OfertaDto newOfertaDto);
    void delete(Integer id);
    List<OfertaDto> findByName(String name);
}
