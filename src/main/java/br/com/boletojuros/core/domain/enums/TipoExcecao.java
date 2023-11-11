package br.com.boletojuros.core.domain.enums;

public enum TipoExcecao {
    BOLETO_INVALIDO {
        @Override
        public String getMensagemErro() {
            return "O boleto informado é inválido";
        }
    },
    TIPO_BOLETO_INVALIDO {
        @Override
        public String getMensagemErro() {
            return "Infelizmente só podemos calcular o juros dos boletos XPTO";
        }
    },
    BOLETO_NAO_VENCIDO {
        @Override
        public String getMensagemErro() {
            return "O boleto informado ainda não está vencido";
        }
    };

    public abstract String getMensagemErro();
}
