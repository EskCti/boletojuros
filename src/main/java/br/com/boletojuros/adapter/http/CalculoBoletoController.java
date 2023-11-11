package br.com.boletojuros.adapter.http;

import br.com.boletojuros.adapter.http.dto.CalculoBoletoRequest;
import br.com.boletojuros.adapter.http.dto.CalculoBoletoResponse;
import br.com.boletojuros.adapter.http.mapper.CalculoBoletoMapper;
import br.com.boletojuros.core.port.in.CalculoBoletoPort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/boleto")
public class CalculoBoletoController {

    private final CalculoBoletoPort calculoBoletoPort;
    private final CalculoBoletoMapper mapper;

    public CalculoBoletoController(CalculoBoletoPort calculoBoletoPort, CalculoBoletoMapper mapper) {
        this.calculoBoletoPort = calculoBoletoPort;
        this.mapper = mapper;
    }

    @PostMapping("/calculo")
    public ResponseEntity<CalculoBoletoResponse> calcularBoleto(@Valid @RequestBody CalculoBoletoRequest boleto) {
        var boletoCalculado = calculoBoletoPort.executar(boleto.getCodigo(), boleto.getDataPagamento());
        return ResponseEntity.ok(mapper.toDTO(boletoCalculado));
    }
}
