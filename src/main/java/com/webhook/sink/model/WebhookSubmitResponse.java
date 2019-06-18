package com.webhook.sink.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebhookSubmitResponse {

    @JsonProperty("webhook_id")
    private String webhookId;

    @JsonProperty("request_submit_status")
    private String requestSubmitStatus;

    @JsonProperty("request_body")
    private String requestBody;

    public String getWebhookId() {
        return webhookId;
    }

    public void setWebhookId(String webhookId) {
        this.webhookId = webhookId;
    }

    public String getRequestSubmitStatus() {
        return requestSubmitStatus;
    }

    public void setRequestSubmitStatus(String requestSubmitStatus) {
        this.requestSubmitStatus = requestSubmitStatus;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }
}
