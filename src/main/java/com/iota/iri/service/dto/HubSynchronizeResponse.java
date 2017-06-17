package com.iota.iri.service.dto;

public class HubSynchronizeResponse extends AbstractResponse {

    private int errorCode;
    private String errorMessage;

    private int latestSynchronizationMilestone;

    public static AbstractResponse create(final int errorCode, final String errorMessage, final int latestSynchronizationMilestone) {

        final HubSynchronizeResponse res = new HubSynchronizeResponse();

        res.errorCode = errorCode;
        res.errorMessage = errorMessage;

        res.latestSynchronizationMilestone = latestSynchronizationMilestone;

        return res;
    }
}
