package com.example.rsc.service.impl;

import com.example.rsc.dto.ReservaDto;
import com.example.rsc.entity.;
import com.example.rsc.mapper.ReservaMapper;
import com.example.rsc.repository.ReservaRepository;
import com.example.rsc.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReservaServiceImp implements ReservaService {
    private final ReservaRepository reservaRepository;
    private final ReservaMapper reservaMapper;

    @Autowired
    public ReservaServiceImp(ReservaRepository reservaRepository, ReservaMapper reservaMapper) {
        this.reservaRepository = reservaRepository;
        this.reservaMapper = reservaMapper;
    }

    public List<ReservaDto> getAllReservas() {
        List<Reserva> reserva = reservaRepository.finAll();
        List<ReservaDto> reservaDtos = new ArrayList<>();

        for (Reserva reservaDto : reserva) {
            reservaDtos.add(reservaMapper.toDto(reservaDto));
        }
        return reservaDtos;
    }

    @Override
    public Optional<ReservaDTO> find(Integer id) {
        Optional<Reserva> reserva = reservaRepository.findById(id);
        Optional<ReservaDto> reservaDtos = Optional.empty();

        reservaDtos = reserva.map(reservaMapper::toDto);
        return ReservaDtos;
    }

    @Override
    public ReservaDto create(ReservaDto reservaDto) {
        Reserva entidadReserva = new Reserva();

        entidadReserva = reservaMapper.toEntity(reservaDto);
        entidadReserva = reservaRepository.save(entidadReserva);

        reservaDto = reservaMapper.toDto(entidadReserva);
        return reservaDto;
    }

    @Override
    public Optional<ReservaDto> update(Integer id, ReservaDto newReservaDto) {
        return reservaRepository.findById(id).map(ReservaInDB -> {
            ReservaInDB = reservaMapper.toEntity(newReservaDto);
            ReservaInDB = reservaRepository.save(ReservaInDB);

            return reservaMapper.toDto(ReservaInDB);
        })  ;
    }

    @Override
    public void delete(Integer id) {
        reservaRepository.deleteById(id);
    }





}