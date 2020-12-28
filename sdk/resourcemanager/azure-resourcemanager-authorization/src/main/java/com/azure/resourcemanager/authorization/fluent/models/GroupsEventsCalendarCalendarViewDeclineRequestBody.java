// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** The GroupsEventsCalendarCalendarViewDeclineRequestBody model. */
@Fluent
public final class GroupsEventsCalendarCalendarViewDeclineRequestBody {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(GroupsEventsCalendarCalendarViewDeclineRequestBody.class);

    /*
     * The Comment property.
     */
    @JsonProperty(value = "Comment")
    private String comment;

    /*
     * The SendResponse property.
     */
    @JsonProperty(value = "SendResponse")
    private Boolean sendResponse;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the comment property: The Comment property.
     *
     * @return the comment value.
     */
    public String comment() {
        return this.comment;
    }

    /**
     * Set the comment property: The Comment property.
     *
     * @param comment the comment value to set.
     * @return the GroupsEventsCalendarCalendarViewDeclineRequestBody object itself.
     */
    public GroupsEventsCalendarCalendarViewDeclineRequestBody withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Get the sendResponse property: The SendResponse property.
     *
     * @return the sendResponse value.
     */
    public Boolean sendResponse() {
        return this.sendResponse;
    }

    /**
     * Set the sendResponse property: The SendResponse property.
     *
     * @param sendResponse the sendResponse value to set.
     * @return the GroupsEventsCalendarCalendarViewDeclineRequestBody object itself.
     */
    public GroupsEventsCalendarCalendarViewDeclineRequestBody withSendResponse(Boolean sendResponse) {
        this.sendResponse = sendResponse;
        return this;
    }

    /**
     * Get the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the GroupsEventsCalendarCalendarViewDeclineRequestBody object itself.
     */
    public GroupsEventsCalendarCalendarViewDeclineRequestBody withAdditionalProperties(
        Map<String, Object> additionalProperties) {
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
    }
}
