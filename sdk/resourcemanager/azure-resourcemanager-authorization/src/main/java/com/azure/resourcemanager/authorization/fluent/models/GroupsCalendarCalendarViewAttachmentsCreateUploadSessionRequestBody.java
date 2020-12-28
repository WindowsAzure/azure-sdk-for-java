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

/** The GroupsCalendarCalendarViewAttachmentsCreateUploadSessionRequestBody model. */
@Fluent
public final class GroupsCalendarCalendarViewAttachmentsCreateUploadSessionRequestBody {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(GroupsCalendarCalendarViewAttachmentsCreateUploadSessionRequestBody.class);

    /*
     * attachmentItem
     */
    @JsonProperty(value = "AttachmentItem")
    private MicrosoftGraphAttachmentItem attachmentItem;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the attachmentItem property: attachmentItem.
     *
     * @return the attachmentItem value.
     */
    public MicrosoftGraphAttachmentItem attachmentItem() {
        return this.attachmentItem;
    }

    /**
     * Set the attachmentItem property: attachmentItem.
     *
     * @param attachmentItem the attachmentItem value to set.
     * @return the GroupsCalendarCalendarViewAttachmentsCreateUploadSessionRequestBody object itself.
     */
    public GroupsCalendarCalendarViewAttachmentsCreateUploadSessionRequestBody withAttachmentItem(
        MicrosoftGraphAttachmentItem attachmentItem) {
        this.attachmentItem = attachmentItem;
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
     * @return the GroupsCalendarCalendarViewAttachmentsCreateUploadSessionRequestBody object itself.
     */
    public GroupsCalendarCalendarViewAttachmentsCreateUploadSessionRequestBody withAdditionalProperties(
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
        if (attachmentItem() != null) {
            attachmentItem().validate();
        }
    }
}
