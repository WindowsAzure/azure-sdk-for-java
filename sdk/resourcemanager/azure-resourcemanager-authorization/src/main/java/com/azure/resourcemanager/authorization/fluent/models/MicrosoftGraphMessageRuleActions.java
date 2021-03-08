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

/** messageRuleActions. */
@Fluent
public final class MicrosoftGraphMessageRuleActions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphMessageRuleActions.class);

    /*
     * A list of categories to be assigned to a message.
     */
    @JsonProperty(value = "assignCategories")
    private List<String> assignCategories;

    /*
     * The ID of a folder that a message is to be copied to.
     */
    @JsonProperty(value = "copyToFolder")
    private String copyToFolder;

    /*
     * Indicates whether a message should be moved to the Deleted Items folder.
     */
    @JsonProperty(value = "delete")
    private Boolean delete;

    /*
     * The email addresses of the recipients to which a message should be
     * forwarded as an attachment.
     */
    @JsonProperty(value = "forwardAsAttachmentTo")
    private List<MicrosoftGraphRecipient> forwardAsAttachmentTo;

    /*
     * The email addresses of the recipients to which a message should be
     * forwarded.
     */
    @JsonProperty(value = "forwardTo")
    private List<MicrosoftGraphRecipient> forwardTo;

    /*
     * Indicates whether a message should be marked as read.
     */
    @JsonProperty(value = "markAsRead")
    private Boolean markAsRead;

    /*
     * The markImportance property.
     */
    @JsonProperty(value = "markImportance")
    private MicrosoftGraphImportance markImportance;

    /*
     * The ID of the folder that a message will be moved to.
     */
    @JsonProperty(value = "moveToFolder")
    private String moveToFolder;

    /*
     * Indicates whether a message should be permanently deleted and not saved
     * to the Deleted Items folder.
     */
    @JsonProperty(value = "permanentDelete")
    private Boolean permanentDelete;

    /*
     * The email addresses to which a message should be redirected.
     */
    @JsonProperty(value = "redirectTo")
    private List<MicrosoftGraphRecipient> redirectTo;

    /*
     * Indicates whether subsequent rules should be evaluated.
     */
    @JsonProperty(value = "stopProcessingRules")
    private Boolean stopProcessingRules;

    /*
     * messageRuleActions
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the assignCategories property: A list of categories to be assigned to a message.
     *
     * @return the assignCategories value.
     */
    public List<String> assignCategories() {
        return this.assignCategories;
    }

    /**
     * Set the assignCategories property: A list of categories to be assigned to a message.
     *
     * @param assignCategories the assignCategories value to set.
     * @return the MicrosoftGraphMessageRuleActions object itself.
     */
    public MicrosoftGraphMessageRuleActions withAssignCategories(List<String> assignCategories) {
        this.assignCategories = assignCategories;
        return this;
    }

    /**
     * Get the copyToFolder property: The ID of a folder that a message is to be copied to.
     *
     * @return the copyToFolder value.
     */
    public String copyToFolder() {
        return this.copyToFolder;
    }

    /**
     * Set the copyToFolder property: The ID of a folder that a message is to be copied to.
     *
     * @param copyToFolder the copyToFolder value to set.
     * @return the MicrosoftGraphMessageRuleActions object itself.
     */
    public MicrosoftGraphMessageRuleActions withCopyToFolder(String copyToFolder) {
        this.copyToFolder = copyToFolder;
        return this;
    }

    /**
     * Get the delete property: Indicates whether a message should be moved to the Deleted Items folder.
     *
     * @return the delete value.
     */
    public Boolean delete() {
        return this.delete;
    }

    /**
     * Set the delete property: Indicates whether a message should be moved to the Deleted Items folder.
     *
     * @param delete the delete value to set.
     * @return the MicrosoftGraphMessageRuleActions object itself.
     */
    public MicrosoftGraphMessageRuleActions withDelete(Boolean delete) {
        this.delete = delete;
        return this;
    }

    /**
     * Get the forwardAsAttachmentTo property: The email addresses of the recipients to which a message should be
     * forwarded as an attachment.
     *
     * @return the forwardAsAttachmentTo value.
     */
    public List<MicrosoftGraphRecipient> forwardAsAttachmentTo() {
        return this.forwardAsAttachmentTo;
    }

    /**
     * Set the forwardAsAttachmentTo property: The email addresses of the recipients to which a message should be
     * forwarded as an attachment.
     *
     * @param forwardAsAttachmentTo the forwardAsAttachmentTo value to set.
     * @return the MicrosoftGraphMessageRuleActions object itself.
     */
    public MicrosoftGraphMessageRuleActions withForwardAsAttachmentTo(
        List<MicrosoftGraphRecipient> forwardAsAttachmentTo) {
        this.forwardAsAttachmentTo = forwardAsAttachmentTo;
        return this;
    }

    /**
     * Get the forwardTo property: The email addresses of the recipients to which a message should be forwarded.
     *
     * @return the forwardTo value.
     */
    public List<MicrosoftGraphRecipient> forwardTo() {
        return this.forwardTo;
    }

    /**
     * Set the forwardTo property: The email addresses of the recipients to which a message should be forwarded.
     *
     * @param forwardTo the forwardTo value to set.
     * @return the MicrosoftGraphMessageRuleActions object itself.
     */
    public MicrosoftGraphMessageRuleActions withForwardTo(List<MicrosoftGraphRecipient> forwardTo) {
        this.forwardTo = forwardTo;
        return this;
    }

    /**
     * Get the markAsRead property: Indicates whether a message should be marked as read.
     *
     * @return the markAsRead value.
     */
    public Boolean markAsRead() {
        return this.markAsRead;
    }

    /**
     * Set the markAsRead property: Indicates whether a message should be marked as read.
     *
     * @param markAsRead the markAsRead value to set.
     * @return the MicrosoftGraphMessageRuleActions object itself.
     */
    public MicrosoftGraphMessageRuleActions withMarkAsRead(Boolean markAsRead) {
        this.markAsRead = markAsRead;
        return this;
    }

    /**
     * Get the markImportance property: The markImportance property.
     *
     * @return the markImportance value.
     */
    public MicrosoftGraphImportance markImportance() {
        return this.markImportance;
    }

    /**
     * Set the markImportance property: The markImportance property.
     *
     * @param markImportance the markImportance value to set.
     * @return the MicrosoftGraphMessageRuleActions object itself.
     */
    public MicrosoftGraphMessageRuleActions withMarkImportance(MicrosoftGraphImportance markImportance) {
        this.markImportance = markImportance;
        return this;
    }

    /**
     * Get the moveToFolder property: The ID of the folder that a message will be moved to.
     *
     * @return the moveToFolder value.
     */
    public String moveToFolder() {
        return this.moveToFolder;
    }

    /**
     * Set the moveToFolder property: The ID of the folder that a message will be moved to.
     *
     * @param moveToFolder the moveToFolder value to set.
     * @return the MicrosoftGraphMessageRuleActions object itself.
     */
    public MicrosoftGraphMessageRuleActions withMoveToFolder(String moveToFolder) {
        this.moveToFolder = moveToFolder;
        return this;
    }

    /**
     * Get the permanentDelete property: Indicates whether a message should be permanently deleted and not saved to the
     * Deleted Items folder.
     *
     * @return the permanentDelete value.
     */
    public Boolean permanentDelete() {
        return this.permanentDelete;
    }

    /**
     * Set the permanentDelete property: Indicates whether a message should be permanently deleted and not saved to the
     * Deleted Items folder.
     *
     * @param permanentDelete the permanentDelete value to set.
     * @return the MicrosoftGraphMessageRuleActions object itself.
     */
    public MicrosoftGraphMessageRuleActions withPermanentDelete(Boolean permanentDelete) {
        this.permanentDelete = permanentDelete;
        return this;
    }

    /**
     * Get the redirectTo property: The email addresses to which a message should be redirected.
     *
     * @return the redirectTo value.
     */
    public List<MicrosoftGraphRecipient> redirectTo() {
        return this.redirectTo;
    }

    /**
     * Set the redirectTo property: The email addresses to which a message should be redirected.
     *
     * @param redirectTo the redirectTo value to set.
     * @return the MicrosoftGraphMessageRuleActions object itself.
     */
    public MicrosoftGraphMessageRuleActions withRedirectTo(List<MicrosoftGraphRecipient> redirectTo) {
        this.redirectTo = redirectTo;
        return this;
    }

    /**
     * Get the stopProcessingRules property: Indicates whether subsequent rules should be evaluated.
     *
     * @return the stopProcessingRules value.
     */
    public Boolean stopProcessingRules() {
        return this.stopProcessingRules;
    }

    /**
     * Set the stopProcessingRules property: Indicates whether subsequent rules should be evaluated.
     *
     * @param stopProcessingRules the stopProcessingRules value to set.
     * @return the MicrosoftGraphMessageRuleActions object itself.
     */
    public MicrosoftGraphMessageRuleActions withStopProcessingRules(Boolean stopProcessingRules) {
        this.stopProcessingRules = stopProcessingRules;
        return this;
    }

    /**
     * Get the additionalProperties property: messageRuleActions.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: messageRuleActions.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphMessageRuleActions object itself.
     */
    public MicrosoftGraphMessageRuleActions withAdditionalProperties(Map<String, Object> additionalProperties) {
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
        if (forwardAsAttachmentTo() != null) {
            forwardAsAttachmentTo().forEach(e -> e.validate());
        }
        if (forwardTo() != null) {
            forwardTo().forEach(e -> e.validate());
        }
        if (redirectTo() != null) {
            redirectTo().forEach(e -> e.validate());
        }
    }
}
