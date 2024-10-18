package com.example.rsc.service.impl;

import com.example.rsc.dto.OfertaDto;
import com.example.rsc.service.OfertaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfertaServiceImp implements OfertaService {

    @Override
    public List<OfertaDto> findAll() {
        return List.of();
    }

    @Override
    public Optional<OfertaDto> find(Integer id) {
        return Optional.empty();
    }

    @Override
    public OfertaDto create(OfertaDto ofertaDto) {
        return null;
    }

    @Override
    public Optional<OfertaDto> update(Integer id, OfertaDto newOfertaDto) {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<OfertaDto> findByName(String name) {
        return List.of();
    }
}
