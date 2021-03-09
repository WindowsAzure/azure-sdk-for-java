// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.sms;

import com.azure.communication.sms.implementation.models.SmsSendResponseItem;
import com.azure.core.annotation.Fluent;


/** The SmsSendResult model. */
@Fluent
public final class SmsSendResult {
    private final SmsSendResponseItem result;

    /**
     * Constructor to wrap the smsSendResponseItem
     * @param item the to value to set.
     */
    SmsSendResult(SmsSendResponseItem item) {
        this.result = item;
    }

    /**
     * Get the to property: The recipient's phone number in E.164 format.
     *
     * @return the to value.
     */
    public String getTo() {
        return result.getTo();
    }

    /**
     * Get the messageId property: The identifier of the outgoing Sms message. Only present if message processed.
     *
     * @return the messageId value.
     */
    public String getMessageId() {
        return result.getMessageId();
    }

    /**
     * Get the httpStatusCode property: HTTP Status code.
     *
     * @return the httpStatusCode value.
     */
    public int getHttpStatusCode() {
        return result.getHttpStatusCode();
    }

    /**
     * Get the successful property: Indicates if the message is processed successfully or not.
     *
     * @return the successful value.
     */
    public boolean isSuccessful() {
        return result.isSuccessful();
    }

    /**
     * Get the errorMessage property: Optional error message in case of 4xx/5xx/repeatable errors.
     *
     * @return the errorMessage value.
     */
    public String getErrorMessage() {
        return result.getErrorMessage();
    }

}
