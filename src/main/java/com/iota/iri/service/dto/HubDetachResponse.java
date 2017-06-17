package com.iota.iri.service.dto;

public class HubDetachResponse extends AbstractResponse {

    private int errorCode;
    private String errorMessage;

    private String state;

    public static AbstractResponse create(final int errorCode, final String errorMessage,
                                          final String state) {

        final HubDetachResponse res = new HubDetachResponse();

        res.errorCode = errorCode;
        res.errorMessage = errorMessage;

        res.state = state;

        return res;
    }
}
