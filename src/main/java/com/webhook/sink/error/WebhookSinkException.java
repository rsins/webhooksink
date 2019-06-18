package com.webhook.sink.error;

public class WebhookSinkException extends RuntimeException {

    public WebhookSinkException() {
        super();
    }

    public WebhookSinkException(String msg) {
        super(msg);
    }

    public WebhookSinkException(Exception ex) {
        super(ex);
    }

}
