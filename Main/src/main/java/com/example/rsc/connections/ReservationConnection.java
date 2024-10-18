package com.example.rsc.connections;

import com.example.rsc.dto.ReservaDto;
import com.example.rsc.includes.ExternalConnectionService;
import com.example.rsc.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service("reservationConnection")
public class ReservationConnection implements ReservaService, ExternalConnectionService {

    private static final String URL = "http://localhost:8080/api/reserva";

    @Override
    public List<ReservaDto> findAll() {
        ReservaDto[] reservas = getExternalObject(URL, ReservaDto[].class);
        return List.of(reservas);
    }

    @Override
    public Optional<ReservaDto> find(Integer id) {
        return Optional.ofNullable(getExternalObject(id + "", ReservaDto.class));
    }

    @Override
    public ReservaDto create(ReservaDto reservaDto) {
        return postExternalObject(reservaDto.getId() + "", reservaDto, ReservaDto.class);
    }

    @Override
    public Optional<ReservaDto> update(Integer id, ReservaDto newReservaDto) {
        putExternalObject(id + "", newReservaDto);
        return Optional.of(newReservaDto);
    }

    @Override
    public void delete(Integer id) {
        deleteExternalObject(id + "");
    }

    @Override
    public String getExternalServiceUrl() {
        return URL;
    }
}
