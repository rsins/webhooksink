package com.webhook.sink.utils;

import com.webhook.sink.error.WebhookSinkException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class WebhookExceptionMapper implements ExceptionMapper<WebhookSinkException> {

    @Override
    public Response toResponse(WebhookSinkException ex) {
        return Response.status(Response.Status.BAD_GATEWAY).entity(ex.getMessage()).build();
    }

}
