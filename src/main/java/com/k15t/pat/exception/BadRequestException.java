package com.k15t.pat.exception;

public class BadRequestException extends AbstractException {
    private static final long serialVersionUID = 1L;

    public BadRequestException(ErrorMessage errorMessage) {
        super(errorMessage);
    }
}
