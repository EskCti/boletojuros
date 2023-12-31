package br.com.boletojuros.adapter.datasource.integration.client;

import br.com.boletojuros.adapter.datasource.integration.dto.BoletoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        value = "complemento",
        url = "${api.boleto}"
)
public interface ComplementoBoletoClient {

    @GetMapping(path = "/{codigo}")
    BoletoDTO getBoleto(@PathVariable String codigo);
}
