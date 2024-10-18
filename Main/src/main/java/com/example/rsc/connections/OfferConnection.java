package com.example.rsc.connections;

import com.example.rsc.dto.OfertaDto;
import com.example.rsc.includes.ExternalConnectionService;
import com.example.rsc.service.OfertaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("offerConnection")
public class OfferConnection implements OfertaService, ExternalConnectionService {
    private static final String URL = "http://localhost:8080/api/oferta";

    @Override
    public String getExternalServiceUrl() {
        return URL;
    }

    @Override
    public List<OfertaDto> findAll() {
        OfertaDto[] ofertas = getExternalObject("ofertas", OfertaDto[].class);
        return List.of(ofertas);
    }

    @Override
    public Optional<OfertaDto> find(Integer id) {
        return Optional.ofNullable(getExternalObject("ofertas/" + id, OfertaDto.class));
    }

    @Override
    public OfertaDto create(OfertaDto ofertaDto) {
        return postExternalObject(ofertaDto.getId() + "", ofertaDto, OfertaDto.class);
    }

    @Override
    public Optional<OfertaDto> update(Integer id, OfertaDto newOfertaDto) {
        putExternalObject(id + "", newOfertaDto);
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {
        deleteExternalObject(id + "");
    }

    @Override
    public List<OfertaDto> findByDestino(String destino) {
        OfertaDto[] ofertas = getExternalObject("ofertas/destino/" + destino, OfertaDto[].class);
        return List.of(ofertas);
    }
}
