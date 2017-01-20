package com.pousar.domain;

/**
 * Excecao para validacao nos cadastros
 */
public class ValidacaoException extends RuntimeException {

    private static final long serialVersionUID = 2393574528082068303L;

    public ValidacaoException(String message) {
        super(message);
    }
}
