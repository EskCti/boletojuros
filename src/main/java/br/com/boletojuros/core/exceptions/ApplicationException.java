package br.com.boletojuros.core.exceptions;

import br.com.boletojuros.core.domain.enums.TipoExcecao;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApplicationException extends RuntimeException {
    private TipoExcecao tipoExcecao;
}
