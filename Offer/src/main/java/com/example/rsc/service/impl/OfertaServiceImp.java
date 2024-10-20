package com.example.rsc.service.impl;

import com.example.rsc.dto.OfertaDto;
import com.example.rsc.entity.Oferta;
import com.example.rsc.mapper.OfertaMapper;
import com.example.rsc.repository.OfertaRepository;
import com.example.rsc.service.OfertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("offerService")
public class OfertaServiceImp implements OfertaService {

    private final OfertaRepository ofertaRepository;
    private final OfertaMapper ofertaMapper = OfertaMapper.INSTANCE;

    @Autowired
    public OfertaServiceImp(OfertaRepository ofertaRepository) {
        this.ofertaRepository = ofertaRepository;
    }

    @Override
    public List<OfertaDto> findAll() {

        List<Oferta> oferta = ofertaRepository.findAll();
        List<OfertaDto> ofertaDtos = new ArrayList<>();

        for (Oferta entidad : oferta) {
            ofertaDtos.add(ofertaMapper.toDto(entidad));
        }

        return ofertaDtos;
    }

    @Override
    public Optional<OfertaDto> find(Integer id) {

        Optional<Oferta> oferta = ofertaRepository.findById(id);
        Optional<OfertaDto> ofertaDtos = Optional.empty();

        ofertaDtos = oferta.map(ofertaMapper::toDto);
        return ofertaDtos;
    }

    @Override
    public OfertaDto create(OfertaDto ofertaDto) {
        Oferta entidadOferta = new Oferta();

        entidadOferta = ofertaMapper.toEntity(ofertaDto);
        entidadOferta = ofertaRepository.save(entidadOferta);

        ofertaDto = ofertaMapper.toDto(entidadOferta);
        return ofertaDto;
    }

    @Override
    public Optional<OfertaDto> update(Integer id, OfertaDto newOfertaDto) {

        return ofertaRepository.findById(id).map(OfertaInDB -> {
            OfertaInDB = ofertaMapper.toEntity(newOfertaDto);
            OfertaInDB = ofertaRepository.save(OfertaInDB);

            return ofertaMapper.toDto(OfertaInDB);
        });
    }

    @Override
    public void delete(Integer id) {
        ofertaRepository.deleteById(id);
    }

    @Override
    public List<OfertaDto> findByDestino(String destino) {

        List<Oferta> ofertas = ofertaRepository.findByDestino(destino);
        List<OfertaDto> ofertaDtos = new ArrayList<>();

        for (Oferta entidad : ofertas) {
            ofertaDtos.add(ofertaMapper.toDto(entidad));
        }
        return ofertaDtos;
    }
}
