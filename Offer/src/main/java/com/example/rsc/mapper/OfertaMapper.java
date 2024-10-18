package com.example.rsc.mapper;

import com.example.rsc.dto.OfertaDto;
import com.example.rsc.entity.Oferta;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OfertaMapper {
    OfertaMapper INSTANCE = Mappers.getMapper(OfertaMapper.class);

    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "transporteDto", source = "transporte"),
            @Mapping(target = "proveedorDto", source = "proveedor"),
            @Mapping(target = "departureDateTime", source = "fechaHoraSalida"),
            @Mapping(target = "origen", source = "origen"),
            @Mapping(target = "destino", source = "destino"),
    })
    OfertaDto toDto(Oferta oferta);

    @InheritInverseConfiguration
    Oferta toEntity(OfertaDto ofertaDto);
}
