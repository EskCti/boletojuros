package br.com.boletojuros.adapter.http.exceptions;

import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ErroResponse {

    private List<String> mensagens = new ArrayList<>();
    private String erro;
    private int codigo;
    private Date timestamp;
    private String path;
}
