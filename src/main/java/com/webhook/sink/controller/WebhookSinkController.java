package com.webhook.sink.controller;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.webhook.sink.error.WebhookSinkException;
import com.webhook.sink.model.WebhookSubmitResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.UUID;

@RestController
public class WebhookSinkController {

    @RequestMapping(name = "accept_webhook",
            method = RequestMethod.POST,
            path = "/webhook",
            consumes = "application/json",
            produces = "application/json"
    )
    public WebhookSubmitResponse acceptWebhook(@RequestBody String requestJsonBody) {
        try {
            new ObjectMapper().readTree(requestJsonBody);
        }
        catch (IOException ex) {
            throw new WebhookSinkException("Invalid request body.");
        }

        WebhookSubmitResponse response = new WebhookSubmitResponse();
        response.setRequestStatus("SUCCESS");
        response.setWebhookId(UUID.randomUUID().toString());
        return response;
    }
}
