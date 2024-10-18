package com.example.rsc.controller;

import com.example.rsc.dto.ReservaDto;
import com.example.rsc.entity.Reserva;
import com.example.rsc.service.ReservaService;
import jakarta.servlet.ServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reserva")
public class ReservaController {

    private final ReservaService reservaService;

    @Autowired
    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @GetMapping("/reservas")
    public ResponseEntity<List<ReservaDto>> getAllReservas() {
        return ResponseEntity.ok(reservaService.findAll());
    }

    @GetMapping("/reservas/{idReserva}")
    public ResponseEntity<ReservaDto> getReservaById(@PathVariable("idReserva") Integer id, ServletRequest servletRequest) {
        Optional<ReservaDto> reservaDto = reservaService.find(id);

        return reservaDto.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/{id")
    public ResponseEntity<ReservaDto> createReserva(@RequestBody ReservaDto reservaDto) throws URISyntaxException {
        ReservaDto newReservaDto = reservaService.create(reservaDto);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newReservaDto.getId())
                .toUri();

        return ResponseEntity.created(location).body(newReservaDto);
    }

    @PutMapping("/{id")
    public ResponseEntity<ReservaDto> update(@PathVariable Integer id, @RequestBody ReservaDto reservaDto) throws URISyntaxException {
        Optional<ReservaDto> reservaUpdated = reservaService.update(id, reservaDto);

        return reservaUpdated
                .map(ResponseEntity::ok)
                .orElseGet(() -> {
                    ReservaDto newReservaDto = reservaService.create(reservaDto);
                    URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                            .path("/{id")
                            .buildAndExpand(newReservaDto.getId())
                            .toUri();

                    return ResponseEntity.created(location).body(newReservaDto);
                });
    }

    @DeleteMapping("/{id")
    public ResponseEntity<Void> deleteReserva(@PathVariable Integer id) {
        reservaService.delete(id);
        return ResponseEntity.badRequest().build();
    }
}
