package org.ad.shared.exception;

public class ServiceUnavailableException extends AdCoreException {

    public ServiceUnavailableException(String service, String message) {
        super("SERVICE_UNAVAILABLE", service, message);
    }

    public ServiceUnavailableException(String service, String message, Throwable cause) {
        super("SERVICE_UNAVAILABLE", service, message, cause);
    }
}