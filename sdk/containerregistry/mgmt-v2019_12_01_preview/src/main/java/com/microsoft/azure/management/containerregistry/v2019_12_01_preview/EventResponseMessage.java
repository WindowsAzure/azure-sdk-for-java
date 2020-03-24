/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The event response message received from the service URI.
 */
public class EventResponseMessage {
    /**
     * The content of the event response message.
     */
    @JsonProperty(value = "content")
    private String content;

    /**
     * The headers of the event response message.
     */
    @JsonProperty(value = "headers")
    private Map<String, String> headers;

    /**
     * The reason phrase of the event response message.
     */
    @JsonProperty(value = "reasonPhrase")
    private String reasonPhrase;

    /**
     * The status code of the event response message.
     */
    @JsonProperty(value = "statusCode")
    private String statusCode;

    /**
     * The HTTP message version.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the content of the event response message.
     *
     * @return the content value
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content of the event response message.
     *
     * @param content the content value to set
     * @return the EventResponseMessage object itself.
     */
    public EventResponseMessage withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the headers of the event response message.
     *
     * @return the headers value
     */
    public Map<String, String> headers() {
        return this.headers;
    }

    /**
     * Set the headers of the event response message.
     *
     * @param headers the headers value to set
     * @return the EventResponseMessage object itself.
     */
    public EventResponseMessage withHeaders(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the reason phrase of the event response message.
     *
     * @return the reasonPhrase value
     */
    public String reasonPhrase() {
        return this.reasonPhrase;
    }

    /**
     * Set the reason phrase of the event response message.
     *
     * @param reasonPhrase the reasonPhrase value to set
     * @return the EventResponseMessage object itself.
     */
    public EventResponseMessage withReasonPhrase(String reasonPhrase) {
        this.reasonPhrase = reasonPhrase;
        return this;
    }

    /**
     * Get the status code of the event response message.
     *
     * @return the statusCode value
     */
    public String statusCode() {
        return this.statusCode;
    }

    /**
     * Set the status code of the event response message.
     *
     * @param statusCode the statusCode value to set
     * @return the EventResponseMessage object itself.
     */
    public EventResponseMessage withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get the HTTP message version.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the HTTP message version.
     *
     * @param version the version value to set
     * @return the EventResponseMessage object itself.
     */
    public EventResponseMessage withVersion(String version) {
        this.version = version;
        return this;
    }

}
