/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Rest service source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("RestSource")
public class RestSource extends CopySource {
    /**
     * The timeout (TimeSpan) to get an HTTP response. It is the timeout to get
     * a response, not the timeout to read response data. Default value:
     * 00:01:40. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "httpRequestTimeout")
    private Object httpRequestTimeout;

    /**
     * The time to await before sending next page request.
     */
    @JsonProperty(value = "requestInterval")
    private Object requestInterval;

    /**
     * Get the timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the httpRequestTimeout value
     */
    public Object httpRequestTimeout() {
        return this.httpRequestTimeout;
    }

    /**
     * Set the timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param httpRequestTimeout the httpRequestTimeout value to set
     * @return the RestSource object itself.
     */
    public RestSource withHttpRequestTimeout(Object httpRequestTimeout) {
        this.httpRequestTimeout = httpRequestTimeout;
        return this;
    }

    /**
     * Get the time to await before sending next page request.
     *
     * @return the requestInterval value
     */
    public Object requestInterval() {
        return this.requestInterval;
    }

    /**
     * Set the time to await before sending next page request.
     *
     * @param requestInterval the requestInterval value to set
     * @return the RestSource object itself.
     */
    public RestSource withRequestInterval(Object requestInterval) {
        this.requestInterval = requestInterval;
        return this;
    }

}
