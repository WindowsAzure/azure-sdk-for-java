/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request parameters for adding a owner to an application.
 */
public class AddOwnerParameters {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * A owner object URL, such as
     * "https://graph.windows.net/0b1f9851-1bf0-433f-aec3-cb9272f093dc/directoryObjects/f260bbc4-c254-447b-94cf-293b5ec434dd",
     * where "0b1f9851-1bf0-433f-aec3-cb9272f093dc" is the tenantId and
     * "f260bbc4-c254-447b-94cf-293b5ec434dd" is the objectId of the owner
     * (user, application, servicePrincipal, group) to be added.
     */
    @JsonProperty(value = "url", required = true)
    private String url;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the AddOwnerParameters object itself.
     */
    public AddOwnerParameters withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get a owner object URL, such as "https://graph.windows.net/0b1f9851-1bf0-433f-aec3-cb9272f093dc/directoryObjects/f260bbc4-c254-447b-94cf-293b5ec434dd", where "0b1f9851-1bf0-433f-aec3-cb9272f093dc" is the tenantId and "f260bbc4-c254-447b-94cf-293b5ec434dd" is the objectId of the owner (user, application, servicePrincipal, group) to be added.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set a owner object URL, such as "https://graph.windows.net/0b1f9851-1bf0-433f-aec3-cb9272f093dc/directoryObjects/f260bbc4-c254-447b-94cf-293b5ec434dd", where "0b1f9851-1bf0-433f-aec3-cb9272f093dc" is the tenantId and "f260bbc4-c254-447b-94cf-293b5ec434dd" is the objectId of the owner (user, application, servicePrincipal, group) to be added.
     *
     * @param url the url value to set
     * @return the AddOwnerParameters object itself.
     */
    public AddOwnerParameters withUrl(String url) {
        this.url = url;
        return this;
    }

}
