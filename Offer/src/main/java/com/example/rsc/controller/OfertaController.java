package com.example.rsc.controller;

import com.example.rsc.dto.OfertaDto;
import com.example.rsc.service.OfertaService;
import jakarta.servlet.ServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/oferta")
public class OfertaController {

    private final OfertaService ofertaService;

    @Autowired
    public OfertaController(@Qualifier("offerService") OfertaService ofertaService) {
        this.ofertaService = ofertaService;
    }

    @GetMapping("/ofertas")
    public ResponseEntity<List<OfertaDto>> getAllReservas() {
        return ResponseEntity.ok(ofertaService.findAll());
    }

    @GetMapping("/ofertas/{idOferta}")
    public ResponseEntity<OfertaDto> getReservaById(@PathVariable("idOferta") Integer id, ServletRequest servletRequest) {
        Optional<OfertaDto> ofertaDto = ofertaService.find(id);

        return ofertaDto.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/{id}")
    public ResponseEntity<OfertaDto> createReserva(@RequestBody OfertaDto ofertaDto) throws URISyntaxException {
        OfertaDto newOfertaDto = ofertaService.create(ofertaDto);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newOfertaDto.getId())
                .toUri();

        return ResponseEntity.created(location).body(newOfertaDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OfertaDto> update(@PathVariable Integer id, @RequestBody OfertaDto ofertaDto) throws URISyntaxException {
        Optional<OfertaDto> ofertaUpdated = ofertaService.update(id, ofertaDto);

        return ofertaUpdated
                .map(ResponseEntity::ok)
                .orElseGet(() -> {
                    OfertaDto newOfertaDto = ofertaService.create(ofertaDto);
                    URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                            .path("/{id}")
                            .buildAndExpand(newOfertaDto.getId())
                            .toUri();

                    return ResponseEntity.created(location).body(newOfertaDto);
                });
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOferta(@PathVariable Integer id) {
        ofertaService.delete(id);
        return ResponseEntity.badRequest().build();
    }
}
