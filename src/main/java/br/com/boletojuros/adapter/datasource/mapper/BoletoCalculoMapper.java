package br.com.boletojuros.adapter.datasource.mapper;

import br.com.boletojuros.adapter.datasource.database.entities.BoletoCalculadoEntity;
import br.com.boletojuros.core.domain.BoletoCalculado;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BoletoCalculoMapper {
    BoletoCalculadoEntity toEntity(BoletoCalculado boletoCalculado);
}
