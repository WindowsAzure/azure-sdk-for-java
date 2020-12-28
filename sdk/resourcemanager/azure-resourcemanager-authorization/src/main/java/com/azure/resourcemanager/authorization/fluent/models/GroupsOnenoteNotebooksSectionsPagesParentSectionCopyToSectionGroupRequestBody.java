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

/** The GroupsOnenoteNotebooksSectionsPagesParentSectionCopyToSectionGroupRequestBody model. */
@Fluent
public final class GroupsOnenoteNotebooksSectionsPagesParentSectionCopyToSectionGroupRequestBody {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(GroupsOnenoteNotebooksSectionsPagesParentSectionCopyToSectionGroupRequestBody.class);

    /*
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The groupId property.
     */
    @JsonProperty(value = "groupId")
    private String groupId;

    /*
     * The renameAs property.
     */
    @JsonProperty(value = "renameAs")
    private String renameAs;

    /*
     * The siteCollectionId property.
     */
    @JsonProperty(value = "siteCollectionId")
    private String siteCollectionId;

    /*
     * The siteId property.
     */
    @JsonProperty(value = "siteId")
    private String siteId;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The id property.
     *
     * @param id the id value to set.
     * @return the GroupsOnenoteNotebooksSectionsPagesParentSectionCopyToSectionGroupRequestBody object itself.
     */
    public GroupsOnenoteNotebooksSectionsPagesParentSectionCopyToSectionGroupRequestBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the groupId property: The groupId property.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: The groupId property.
     *
     * @param groupId the groupId value to set.
     * @return the GroupsOnenoteNotebooksSectionsPagesParentSectionCopyToSectionGroupRequestBody object itself.
     */
    public GroupsOnenoteNotebooksSectionsPagesParentSectionCopyToSectionGroupRequestBody withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the renameAs property: The renameAs property.
     *
     * @return the renameAs value.
     */
    public String renameAs() {
        return this.renameAs;
    }

    /**
     * Set the renameAs property: The renameAs property.
     *
     * @param renameAs the renameAs value to set.
     * @return the GroupsOnenoteNotebooksSectionsPagesParentSectionCopyToSectionGroupRequestBody object itself.
     */
    public GroupsOnenoteNotebooksSectionsPagesParentSectionCopyToSectionGroupRequestBody withRenameAs(String renameAs) {
        this.renameAs = renameAs;
        return this;
    }

    /**
     * Get the siteCollectionId property: The siteCollectionId property.
     *
     * @return the siteCollectionId value.
     */
    public String siteCollectionId() {
        return this.siteCollectionId;
    }

    /**
     * Set the siteCollectionId property: The siteCollectionId property.
     *
     * @param siteCollectionId the siteCollectionId value to set.
     * @return the GroupsOnenoteNotebooksSectionsPagesParentSectionCopyToSectionGroupRequestBody object itself.
     */
    public GroupsOnenoteNotebooksSectionsPagesParentSectionCopyToSectionGroupRequestBody withSiteCollectionId(
        String siteCollectionId) {
        this.siteCollectionId = siteCollectionId;
        return this;
    }

    /**
     * Get the siteId property: The siteId property.
     *
     * @return the siteId value.
     */
    public String siteId() {
        return this.siteId;
    }

    /**
     * Set the siteId property: The siteId property.
     *
     * @param siteId the siteId value to set.
     * @return the GroupsOnenoteNotebooksSectionsPagesParentSectionCopyToSectionGroupRequestBody object itself.
     */
    public GroupsOnenoteNotebooksSectionsPagesParentSectionCopyToSectionGroupRequestBody withSiteId(String siteId) {
        this.siteId = siteId;
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
     * @return the GroupsOnenoteNotebooksSectionsPagesParentSectionCopyToSectionGroupRequestBody object itself.
     */
    public GroupsOnenoteNotebooksSectionsPagesParentSectionCopyToSectionGroupRequestBody withAdditionalProperties(
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
