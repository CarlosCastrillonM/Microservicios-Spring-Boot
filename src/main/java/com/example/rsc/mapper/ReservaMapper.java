package com.example.rsc.mapper;

import com.example.rsc.dto.ReservaDto;
import com.example.rsc.entity.Reserva;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ReservaMapper {
    ReservaMapper INSTANCE = Mappers.getMapper(ReservaMapper.class);

    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "usuarioId", source = "usuarioId"),
            @Mapping(target = "ofertaId", source = "ofertaId"),
            @Mapping(target = "fechaReserva", source = "fechaReserva"),
            @Mapping(target = "totalPago", source = "totalPago"),
    })
    ReservaDto toDto(Reserva airline);

    @InheritInverseConfiguration
    Reserva toEntity(ReservaDto airlineDto);
}
