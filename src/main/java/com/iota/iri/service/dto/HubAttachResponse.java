package com.iota.iri.service.dto;

public class HubAttachResponse extends AbstractResponse {

    private int errorCode;
    private String errorMessage;

    public static AbstractResponse create(final int errorCode, final String errorMessage) {

        final HubAttachResponse res = new HubAttachResponse();

        res.errorCode = errorCode;
        res.errorMessage = errorMessage;

        return res;
    }
}
