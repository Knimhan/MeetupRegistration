package com.k15t.pat.exception;

public abstract class AbstractException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    protected ErrorMessage errorMessage;

    public AbstractException(ErrorMessage errorMessage) {
        super();
        this.errorMessage = errorMessage;
    }

    public AbstractException(ErrorMessage errorMessage, Throwable cause) {
        super(cause);
        this.errorMessage = errorMessage;
    }

    public ErrorMessage getErrorMessage() {
        return errorMessage;
    }
}
