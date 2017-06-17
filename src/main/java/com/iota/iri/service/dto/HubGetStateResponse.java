package com.iota.iri.service.dto;

public class HubGetStateResponse extends AbstractResponse {

    private int errorCode;
    private String errorMessage;

    private String state;

    public static AbstractResponse create(final int errorCode, final String errorMessage,
                                          final String state) {

        final HubGetStateResponse res = new HubGetStateResponse();

        res.errorCode = errorCode;
        res.errorMessage = errorMessage;

        res.state = state;

        return res;
    }
}
