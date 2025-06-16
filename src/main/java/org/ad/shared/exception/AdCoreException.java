package org.ad.shared.exception;
import lombok.Getter;
@Getter
public class AdCoreException extends RuntimeException {
    private final String errorCode;
    private final String service;

    public AdCoreException(String errorCode, String service, String message) {
        super(message);
        this.errorCode = errorCode;
        this.service = service;
    }

    public AdCoreException(String errorCode, String service, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
        this.service = service;
    }
}
