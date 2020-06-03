// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The EventResponseMessage model. */
@Fluent
public final class EventResponseMessage {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventResponseMessage.class);

    /*
     * The content of the event response message.
     */
    @JsonProperty(value = "content")
    private String content;

    /*
     * The headers of the event response message.
     */
    @JsonProperty(value = "headers")
    private Map<String, String> headers;

    /*
     * The reason phrase of the event response message.
     */
    @JsonProperty(value = "reasonPhrase")
    private String reasonPhrase;

    /*
     * The status code of the event response message.
     */
    @JsonProperty(value = "statusCode")
    private String statusCode;

    /*
     * The HTTP message version.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the content property: The content of the event response message.
     *
     * @return the content value.
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content property: The content of the event response message.
     *
     * @param content the content value to set.
     * @return the EventResponseMessage object itself.
     */
    public EventResponseMessage withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the headers property: The headers of the event response message.
     *
     * @return the headers value.
     */
    public Map<String, String> headers() {
        return this.headers;
    }

    /**
     * Set the headers property: The headers of the event response message.
     *
     * @param headers the headers value to set.
     * @return the EventResponseMessage object itself.
     */
    public EventResponseMessage withHeaders(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the reasonPhrase property: The reason phrase of the event response message.
     *
     * @return the reasonPhrase value.
     */
    public String reasonPhrase() {
        return this.reasonPhrase;
    }

    /**
     * Set the reasonPhrase property: The reason phrase of the event response message.
     *
     * @param reasonPhrase the reasonPhrase value to set.
     * @return the EventResponseMessage object itself.
     */
    public EventResponseMessage withReasonPhrase(String reasonPhrase) {
        this.reasonPhrase = reasonPhrase;
        return this;
    }

    /**
     * Get the statusCode property: The status code of the event response message.
     *
     * @return the statusCode value.
     */
    public String statusCode() {
        return this.statusCode;
    }

    /**
     * Set the statusCode property: The status code of the event response message.
     *
     * @param statusCode the statusCode value to set.
     * @return the EventResponseMessage object itself.
     */
    public EventResponseMessage withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get the version property: The HTTP message version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The HTTP message version.
     *
     * @param version the version value to set.
     * @return the EventResponseMessage object itself.
     */
    public EventResponseMessage withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
