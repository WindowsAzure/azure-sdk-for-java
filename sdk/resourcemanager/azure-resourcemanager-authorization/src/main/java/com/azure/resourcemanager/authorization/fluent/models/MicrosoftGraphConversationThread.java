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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** conversationThread. */
@Fluent
public final class MicrosoftGraphConversationThread extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphConversationThread.class);

    /*
     * The Cc: recipients for the thread.
     */
    @JsonProperty(value = "ccRecipients")
    private List<MicrosoftGraphRecipient> ccRecipients;

    /*
     * Indicates whether any of the posts within this thread has at least one
     * attachment.
     */
    @JsonProperty(value = "hasAttachments")
    private Boolean hasAttachments;

    /*
     * Indicates if the thread is locked.
     */
    @JsonProperty(value = "isLocked")
    private Boolean isLocked;

    /*
     * The Timestamp type represents date and time information using ISO 8601
     * format and is always in UTC time. For example, midnight UTC on Jan 1,
     * 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @JsonProperty(value = "lastDeliveredDateTime")
    private OffsetDateTime lastDeliveredDateTime;

    /*
     * A short summary from the body of the latest post in this conversation.
     */
    @JsonProperty(value = "preview")
    private String preview;

    /*
     * The topic of the conversation. This property can be set when the
     * conversation is created, but it cannot be updated.
     */
    @JsonProperty(value = "topic")
    private String topic;

    /*
     * The To: recipients for the thread.
     */
    @JsonProperty(value = "toRecipients")
    private List<MicrosoftGraphRecipient> toRecipients;

    /*
     * All the users that sent a message to this thread.
     */
    @JsonProperty(value = "uniqueSenders")
    private List<String> uniqueSenders;

    /*
     * Read-only. Nullable.
     */
    @JsonProperty(value = "posts")
    private List<MicrosoftGraphPost> posts;

    /*
     * conversationThread
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the ccRecipients property: The Cc: recipients for the thread.
     *
     * @return the ccRecipients value.
     */
    public List<MicrosoftGraphRecipient> ccRecipients() {
        return this.ccRecipients;
    }

    /**
     * Set the ccRecipients property: The Cc: recipients for the thread.
     *
     * @param ccRecipients the ccRecipients value to set.
     * @return the MicrosoftGraphConversationThread object itself.
     */
    public MicrosoftGraphConversationThread withCcRecipients(List<MicrosoftGraphRecipient> ccRecipients) {
        this.ccRecipients = ccRecipients;
        return this;
    }

    /**
     * Get the hasAttachments property: Indicates whether any of the posts within this thread has at least one
     * attachment.
     *
     * @return the hasAttachments value.
     */
    public Boolean hasAttachments() {
        return this.hasAttachments;
    }

    /**
     * Set the hasAttachments property: Indicates whether any of the posts within this thread has at least one
     * attachment.
     *
     * @param hasAttachments the hasAttachments value to set.
     * @return the MicrosoftGraphConversationThread object itself.
     */
    public MicrosoftGraphConversationThread withHasAttachments(Boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
        return this;
    }

    /**
     * Get the isLocked property: Indicates if the thread is locked.
     *
     * @return the isLocked value.
     */
    public Boolean isLocked() {
        return this.isLocked;
    }

    /**
     * Set the isLocked property: Indicates if the thread is locked.
     *
     * @param isLocked the isLocked value to set.
     * @return the MicrosoftGraphConversationThread object itself.
     */
    public MicrosoftGraphConversationThread withIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
        return this;
    }

    /**
     * Get the lastDeliveredDateTime property: The Timestamp type represents date and time information using ISO 8601
     * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
     * '2014-01-01T00:00:00Z'.
     *
     * @return the lastDeliveredDateTime value.
     */
    public OffsetDateTime lastDeliveredDateTime() {
        return this.lastDeliveredDateTime;
    }

    /**
     * Set the lastDeliveredDateTime property: The Timestamp type represents date and time information using ISO 8601
     * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
     * '2014-01-01T00:00:00Z'.
     *
     * @param lastDeliveredDateTime the lastDeliveredDateTime value to set.
     * @return the MicrosoftGraphConversationThread object itself.
     */
    public MicrosoftGraphConversationThread withLastDeliveredDateTime(OffsetDateTime lastDeliveredDateTime) {
        this.lastDeliveredDateTime = lastDeliveredDateTime;
        return this;
    }

    /**
     * Get the preview property: A short summary from the body of the latest post in this conversation.
     *
     * @return the preview value.
     */
    public String preview() {
        return this.preview;
    }

    /**
     * Set the preview property: A short summary from the body of the latest post in this conversation.
     *
     * @param preview the preview value to set.
     * @return the MicrosoftGraphConversationThread object itself.
     */
    public MicrosoftGraphConversationThread withPreview(String preview) {
        this.preview = preview;
        return this;
    }

    /**
     * Get the topic property: The topic of the conversation. This property can be set when the conversation is created,
     * but it cannot be updated.
     *
     * @return the topic value.
     */
    public String topic() {
        return this.topic;
    }

    /**
     * Set the topic property: The topic of the conversation. This property can be set when the conversation is created,
     * but it cannot be updated.
     *
     * @param topic the topic value to set.
     * @return the MicrosoftGraphConversationThread object itself.
     */
    public MicrosoftGraphConversationThread withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * Get the toRecipients property: The To: recipients for the thread.
     *
     * @return the toRecipients value.
     */
    public List<MicrosoftGraphRecipient> toRecipients() {
        return this.toRecipients;
    }

    /**
     * Set the toRecipients property: The To: recipients for the thread.
     *
     * @param toRecipients the toRecipients value to set.
     * @return the MicrosoftGraphConversationThread object itself.
     */
    public MicrosoftGraphConversationThread withToRecipients(List<MicrosoftGraphRecipient> toRecipients) {
        this.toRecipients = toRecipients;
        return this;
    }

    /**
     * Get the uniqueSenders property: All the users that sent a message to this thread.
     *
     * @return the uniqueSenders value.
     */
    public List<String> uniqueSenders() {
        return this.uniqueSenders;
    }

    /**
     * Set the uniqueSenders property: All the users that sent a message to this thread.
     *
     * @param uniqueSenders the uniqueSenders value to set.
     * @return the MicrosoftGraphConversationThread object itself.
     */
    public MicrosoftGraphConversationThread withUniqueSenders(List<String> uniqueSenders) {
        this.uniqueSenders = uniqueSenders;
        return this;
    }

    /**
     * Get the posts property: Read-only. Nullable.
     *
     * @return the posts value.
     */
    public List<MicrosoftGraphPost> posts() {
        return this.posts;
    }

    /**
     * Set the posts property: Read-only. Nullable.
     *
     * @param posts the posts value to set.
     * @return the MicrosoftGraphConversationThread object itself.
     */
    public MicrosoftGraphConversationThread withPosts(List<MicrosoftGraphPost> posts) {
        this.posts = posts;
        return this;
    }

    /**
     * Get the additionalProperties property: conversationThread.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: conversationThread.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphConversationThread object itself.
     */
    public MicrosoftGraphConversationThread withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphConversationThread withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (ccRecipients() != null) {
            ccRecipients().forEach(e -> e.validate());
        }
        if (toRecipients() != null) {
            toRecipients().forEach(e -> e.validate());
        }
        if (posts() != null) {
            posts().forEach(e -> e.validate());
        }
    }
}
