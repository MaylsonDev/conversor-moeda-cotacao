package com.maylson.conversormoeda;

public class ErrorCotacaoMoeda extends RuntimeException {
    private String mensagem;

    public ErrorCotacaoMoeda(String message) {
        this.mensagem = message;
    }
}
