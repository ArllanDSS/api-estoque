package br.com.arllan.estoque.exception;

import java.util.List;

public class ErroResposta {

    private final List<String> erros;

    public ErroResposta(List<String> erros) {
        this.erros = erros;
    }

    public List<String> getErros() {
        return erros;
    }
}