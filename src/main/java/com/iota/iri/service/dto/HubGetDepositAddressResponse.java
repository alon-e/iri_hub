package com.iota.iri.service.dto;

public class HubGetDepositAddressResponse extends AbstractResponse {

    private int errorCode;
    private String errorMessage;

    private String address;

    public static AbstractResponse create(final int errorCode, final String errorMessage, final String address) {

        final HubGetDepositAddressResponse res = new HubGetDepositAddressResponse();

        res.errorCode = errorCode;
        res.errorMessage = errorMessage;

        res.address = address;

        return res;
    }
}
