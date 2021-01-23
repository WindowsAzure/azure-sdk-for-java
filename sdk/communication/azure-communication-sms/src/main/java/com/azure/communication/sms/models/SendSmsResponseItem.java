// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.sms.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SendSmsResponseItem model. */
@Fluent
public final class SendSmsResponseItem {
    /*
     * The recipients's phone number in E.164 format.
     */
    @JsonProperty(value = "to", required = true)
    private String to;

    /*
     * The identifier of the outgoing SMS message. Only present if message
     * processed.
     */
    @JsonProperty(value = "messageId")
    private String messageId;

    /*
     * HTTP Status code.
     */
    @JsonProperty(value = "httpStatusCode", required = true)
    private int httpStatusCode;

    /*
     * Optional error message in case of 4xx or 5xx errors.
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /**
     * Get the to property: The recipients's phone number in E.164 format.
     *
     * @return the to value.
     */
    public String getTo() {
        return this.to;
    }

    /**
     * Set the to property: The recipients's phone number in E.164 format.
     *
     * @param to the to value to set.
     * @return the SendSmsResponseItem object itself.
     */
    public SendSmsResponseItem setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Get the messageId property: The identifier of the outgoing SMS message. Only present if message processed.
     *
     * @return the messageId value.
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * Set the messageId property: The identifier of the outgoing SMS message. Only present if message processed.
     *
     * @param messageId the messageId value to set.
     * @return the SendSmsResponseItem object itself.
     */
    public SendSmsResponseItem setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the httpStatusCode property: HTTP Status code.
     *
     * @return the httpStatusCode value.
     */
    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * Set the httpStatusCode property: HTTP Status code.
     *
     * @param httpStatusCode the httpStatusCode value to set.
     * @return the SendSmsResponseItem object itself.
     */
    public SendSmsResponseItem setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }

    /**
     * Get the errorMessage property: Optional error message in case of 4xx or 5xx errors.
     *
     * @return the errorMessage value.
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: Optional error message in case of 4xx or 5xx errors.
     *
     * @param errorMessage the errorMessage value to set.
     * @return the SendSmsResponseItem object itself.
     */
    public SendSmsResponseItem setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
}
