package com.example.rsc.service.impl;

import com.example.rsc.dto.ReservaDto;
import com.example.rsc.repository.ReservaRepository;
import com.example.rsc.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaServiceImp implements ReservaService {

    private final ReservaRepository reservaRepository;

    @Autowired
    public ReservaServiceImp(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    @Override
    public List<ReservaDto> findAll() {
        return List.of();
    }

    @Override
    public Optional<ReservaDto> find(Integer id) {
        return Optional.empty();
    }

    @Override
    public ReservaDto create(ReservaDto reservaDto) {
        return null;
    }

    @Override
    public Optional<ReservaDto> update(Integer id, ReservaDto newReservaDto) {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<ReservaDto> findByName(String name) {
        return List.of();
    }
}
