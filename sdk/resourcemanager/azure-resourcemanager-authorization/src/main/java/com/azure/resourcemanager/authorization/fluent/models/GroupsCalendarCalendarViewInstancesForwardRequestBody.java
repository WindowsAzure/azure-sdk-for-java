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
import java.util.List;
import java.util.Map;

/** The GroupsCalendarCalendarViewInstancesForwardRequestBody model. */
@Fluent
public final class GroupsCalendarCalendarViewInstancesForwardRequestBody {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(GroupsCalendarCalendarViewInstancesForwardRequestBody.class);

    /*
     * The ToRecipients property.
     */
    @JsonProperty(value = "ToRecipients")
    private List<MicrosoftGraphRecipient> toRecipients;

    /*
     * The Comment property.
     */
    @JsonProperty(value = "Comment")
    private String comment;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the toRecipients property: The ToRecipients property.
     *
     * @return the toRecipients value.
     */
    public List<MicrosoftGraphRecipient> toRecipients() {
        return this.toRecipients;
    }

    /**
     * Set the toRecipients property: The ToRecipients property.
     *
     * @param toRecipients the toRecipients value to set.
     * @return the GroupsCalendarCalendarViewInstancesForwardRequestBody object itself.
     */
    public GroupsCalendarCalendarViewInstancesForwardRequestBody withToRecipients(
        List<MicrosoftGraphRecipient> toRecipients) {
        this.toRecipients = toRecipients;
        return this;
    }

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
     * @return the GroupsCalendarCalendarViewInstancesForwardRequestBody object itself.
     */
    public GroupsCalendarCalendarViewInstancesForwardRequestBody withComment(String comment) {
        this.comment = comment;
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
     * @return the GroupsCalendarCalendarViewInstancesForwardRequestBody object itself.
     */
    public GroupsCalendarCalendarViewInstancesForwardRequestBody withAdditionalProperties(
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
        if (toRecipients() != null) {
            toRecipients().forEach(e -> e.validate());
        }
    }
}
