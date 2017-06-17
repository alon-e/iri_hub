package com.iota.iri.service.dto;

public class HubRegisterAccountResponse extends AbstractResponse {

    private int errorCode;
    private String errorMessage;

    private int accountIndex;

    public static AbstractResponse create(final int errorCode, final String errorMessage, final int accountIndex) {

        final HubRegisterAccountResponse res = new HubRegisterAccountResponse();

        res.errorCode = errorCode;
        res.errorMessage = errorMessage;

        res.accountIndex = accountIndex;

        return res;
    }
}
