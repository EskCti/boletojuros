package br.com.boletojuros.adapter.http.mapper;

import br.com.boletojuros.adapter.datasource.database.entities.BoletoCalculadoEntity;
import br.com.boletojuros.adapter.http.dto.CalculoBoletoResponse;
import br.com.boletojuros.core.domain.BoletoCalculado;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CalculoBoletoMapper {

    CalculoBoletoResponse toDTO(BoletoCalculado boletoCalculado);
}
