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
 * The location of http server.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = HttpServerLocation.class)
@JsonTypeName("HttpServerLocation")
public class HttpServerLocation extends DatasetLocation {
    /**
     * Specify the relativeUrl of http server. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "relativeUrl")
    private Object relativeUrl;

    /**
     * Get specify the relativeUrl of http server. Type: string (or Expression with resultType string).
     *
     * @return the relativeUrl value
     */
    public Object relativeUrl() {
        return this.relativeUrl;
    }

    /**
     * Set specify the relativeUrl of http server. Type: string (or Expression with resultType string).
     *
     * @param relativeUrl the relativeUrl value to set
     * @return the HttpServerLocation object itself.
     */
    public HttpServerLocation withRelativeUrl(Object relativeUrl) {
        this.relativeUrl = relativeUrl;
        return this;
    }

}
