// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Request parameters for adding a member to a group. */
@Fluent
public final class GroupAddMemberParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GroupAddMemberParameters.class);

    /*
     * A member object URL, such as
     * "https://graph.windows.net/0b1f9851-1bf0-433f-aec3-cb9272f093dc/directoryObjects"
         + "/f260bbc4-c254-447b-94cf-293b5ec434dd",
     * where "0b1f9851-1bf0-433f-aec3-cb9272f093dc" is the tenantId and
     * "f260bbc4-c254-447b-94cf-293b5ec434dd" is the objectId of the member
     * (user, application, servicePrincipal, group) to be added.
     */
    @JsonProperty(value = "url", required = true)
    private String url;

    /*
     * Request parameters for adding a member to a group.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the url property: A member object URL, such as
     * "https://graph.windows.net/0b1f9851-1bf0-433f-aec3-cb9272f093dc/directoryObjects"
         + "/f260bbc4-c254-447b-94cf-293b5ec434dd",
     * where "0b1f9851-1bf0-433f-aec3-cb9272f093dc" is the tenantId and "f260bbc4-c254-447b-94cf-293b5ec434dd" is the
     * objectId of the member (user, application, servicePrincipal, group) to be added.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: A member object URL, such as
     * "https://graph.windows.net/0b1f9851-1bf0-433f-aec3-cb9272f093dc/directoryObjects"
         + "/f260bbc4-c254-447b-94cf-293b5ec434dd",
     * where "0b1f9851-1bf0-433f-aec3-cb9272f093dc" is the tenantId and "f260bbc4-c254-447b-94cf-293b5ec434dd" is the
     * objectId of the member (user, application, servicePrincipal, group) to be added.
     *
     * @param url the url value to set.
     * @return the GroupAddMemberParameters object itself.
     */
    public GroupAddMemberParameters withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the additionalProperties property: Request parameters for adding a member to a group.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Request parameters for adding a member to a group.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the GroupAddMemberParameters object itself.
     */
    public GroupAddMemberParameters withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (url() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property url in model GroupAddMemberParameters"));
        }
    }
}
