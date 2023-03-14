package com.kz.remontservice.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class RemontException extends RuntimeException {
    private final String message;
    private final HttpStatus status;
    private final String code;
    private final boolean shouldSendAlert;

    public RemontException(String message, HttpStatus status, String code) {
        super(message);
        this.message = message;
        this.status = status;
        this.code = code;
        this.shouldSendAlert = false;
    }

    public RemontException(String message) {
        super(message);
        this.message = message;
        this.status = HttpStatus.INTERNAL_SERVER_ERROR;
        this.code = status.name();
        this.shouldSendAlert = false;
    }

    public RemontException(String message, boolean shouldSendAlert) {
        super(message);
        this.message = message;
        this.status = HttpStatus.INTERNAL_SERVER_ERROR;
        this.code = status.name();
        this.shouldSendAlert = shouldSendAlert;
    }

    public RemontException(Throwable cause, String message, HttpStatus status, String code, boolean shouldSendAlert) {
        super(cause);
        this.message = message;
        this.status = status;
        this.code = code;
        this.shouldSendAlert = shouldSendAlert;
    }
}
