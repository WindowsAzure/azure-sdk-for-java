// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.models;

import com.azure.core.implementation.DateTimeRfc1123;
import com.azure.core.implementation.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * Defines headers for Update operation.
 */
@JacksonXmlRootElement(localName = "MessageId-Update-Headers")
@Fluent
public final class MessageIdUpdateHeaders {
    /*
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /*
     * Indicates the version of the Queue service used to execute the request.
     * This header is returned for requests made against version 2009-09-19 and
     * above.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /*
     * UTC date/time value generated by the service that indicates the time at
     * which the response was initiated
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /*
     * The pop receipt of the queue message.
     */
    @JsonProperty(value = "x-ms-popreceipt")
    private String popReceipt;

    /*
     * A UTC date/time value that represents when the message will be visible
     * on the queue.
     */
    @JsonProperty(value = "x-ms-time-next-visible")
    private DateTimeRfc1123 timeNextVisible;

    /*
     * The errorCode property.
     */
    @JsonProperty(value = "x-ms-error-code")
    private String errorCode;

    /**
     * Get the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @param requestId the requestId value to set.
     * @return the MessageIdUpdateHeaders object itself.
     */
    public MessageIdUpdateHeaders setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: Indicates the version of the Queue service
     * used to execute the request. This header is returned for requests made
     * against version 2009-09-19 and above.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: Indicates the version of the Queue service
     * used to execute the request. This header is returned for requests made
     * against version 2009-09-19 and above.
     *
     * @param version the version value to set.
     * @return the MessageIdUpdateHeaders object itself.
     */
    public MessageIdUpdateHeaders setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the dateProperty property: UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the MessageIdUpdateHeaders object itself.
     */
    public MessageIdUpdateHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the popReceipt property: The pop receipt of the queue message.
     *
     * @return the popReceipt value.
     */
    public String getPopReceipt() {
        return this.popReceipt;
    }

    /**
     * Set the popReceipt property: The pop receipt of the queue message.
     *
     * @param popReceipt the popReceipt value to set.
     * @return the MessageIdUpdateHeaders object itself.
     */
    public MessageIdUpdateHeaders setPopReceipt(String popReceipt) {
        this.popReceipt = popReceipt;
        return this;
    }

    /**
     * Get the timeNextVisible property: A UTC date/time value that represents
     * when the message will be visible on the queue.
     *
     * @return the timeNextVisible value.
     */
    public OffsetDateTime getTimeNextVisible() {
        if (this.timeNextVisible == null) {
            return null;
        }
        return this.timeNextVisible.getDateTime();
    }

    /**
     * Set the timeNextVisible property: A UTC date/time value that represents
     * when the message will be visible on the queue.
     *
     * @param timeNextVisible the timeNextVisible value to set.
     * @return the MessageIdUpdateHeaders object itself.
     */
    public MessageIdUpdateHeaders setTimeNextVisible(OffsetDateTime timeNextVisible) {
        if (timeNextVisible == null) {
            this.timeNextVisible = null;
        } else {
            this.timeNextVisible = new DateTimeRfc1123(timeNextVisible);
        }
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the MessageIdUpdateHeaders object itself.
     */
    public MessageIdUpdateHeaders setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
