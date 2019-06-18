package com.webhook.sink.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebhookSubmitResponse {

    @JsonProperty("webhook_id")
    private String webhookId;

    @JsonProperty("request_status")
    private String requestStatus;

    public String getWebhookId() {
        return webhookId;
    }

    public void setWebhookId(String webhookId) {
        this.webhookId = webhookId;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }
}
