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

/** onenoteSection. */
@Fluent
public final class MicrosoftGraphOnenoteSection extends MicrosoftGraphOnenoteEntityHierarchyModel {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphOnenoteSection.class);

    /*
     * Indicates whether this is the user's default section. Read-only.
     */
    @JsonProperty(value = "isDefault")
    private Boolean isDefault;

    /*
     * sectionLinks
     */
    @JsonProperty(value = "links")
    private MicrosoftGraphSectionLinks links;

    /*
     * The pages endpoint where you can get details for all the pages in the
     * section. Read-only.
     */
    @JsonProperty(value = "pagesUrl")
    private String pagesUrl;

    /*
     * The collection of pages in the section.  Read-only. Nullable.
     */
    @JsonProperty(value = "pages")
    private List<MicrosoftGraphOnenotePage> pages;

    /*
     * notebook
     */
    @JsonProperty(value = "parentNotebook")
    private MicrosoftGraphNotebook parentNotebook;

    /*
     * sectionGroup
     */
    @JsonProperty(value = "parentSectionGroup")
    private MicrosoftGraphSectionGroup parentSectionGroup;

    /*
     * onenoteSection
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the isDefault property: Indicates whether this is the user's default section. Read-only.
     *
     * @return the isDefault value.
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set the isDefault property: Indicates whether this is the user's default section. Read-only.
     *
     * @param isDefault the isDefault value to set.
     * @return the MicrosoftGraphOnenoteSection object itself.
     */
    public MicrosoftGraphOnenoteSection withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Get the links property: sectionLinks.
     *
     * @return the links value.
     */
    public MicrosoftGraphSectionLinks links() {
        return this.links;
    }

    /**
     * Set the links property: sectionLinks.
     *
     * @param links the links value to set.
     * @return the MicrosoftGraphOnenoteSection object itself.
     */
    public MicrosoftGraphOnenoteSection withLinks(MicrosoftGraphSectionLinks links) {
        this.links = links;
        return this;
    }

    /**
     * Get the pagesUrl property: The pages endpoint where you can get details for all the pages in the section.
     * Read-only.
     *
     * @return the pagesUrl value.
     */
    public String pagesUrl() {
        return this.pagesUrl;
    }

    /**
     * Set the pagesUrl property: The pages endpoint where you can get details for all the pages in the section.
     * Read-only.
     *
     * @param pagesUrl the pagesUrl value to set.
     * @return the MicrosoftGraphOnenoteSection object itself.
     */
    public MicrosoftGraphOnenoteSection withPagesUrl(String pagesUrl) {
        this.pagesUrl = pagesUrl;
        return this;
    }

    /**
     * Get the pages property: The collection of pages in the section. Read-only. Nullable.
     *
     * @return the pages value.
     */
    public List<MicrosoftGraphOnenotePage> pages() {
        return this.pages;
    }

    /**
     * Set the pages property: The collection of pages in the section. Read-only. Nullable.
     *
     * @param pages the pages value to set.
     * @return the MicrosoftGraphOnenoteSection object itself.
     */
    public MicrosoftGraphOnenoteSection withPages(List<MicrosoftGraphOnenotePage> pages) {
        this.pages = pages;
        return this;
    }

    /**
     * Get the parentNotebook property: notebook.
     *
     * @return the parentNotebook value.
     */
    public MicrosoftGraphNotebook parentNotebook() {
        return this.parentNotebook;
    }

    /**
     * Set the parentNotebook property: notebook.
     *
     * @param parentNotebook the parentNotebook value to set.
     * @return the MicrosoftGraphOnenoteSection object itself.
     */
    public MicrosoftGraphOnenoteSection withParentNotebook(MicrosoftGraphNotebook parentNotebook) {
        this.parentNotebook = parentNotebook;
        return this;
    }

    /**
     * Get the parentSectionGroup property: sectionGroup.
     *
     * @return the parentSectionGroup value.
     */
    public MicrosoftGraphSectionGroup parentSectionGroup() {
        return this.parentSectionGroup;
    }

    /**
     * Set the parentSectionGroup property: sectionGroup.
     *
     * @param parentSectionGroup the parentSectionGroup value to set.
     * @return the MicrosoftGraphOnenoteSection object itself.
     */
    public MicrosoftGraphOnenoteSection withParentSectionGroup(MicrosoftGraphSectionGroup parentSectionGroup) {
        this.parentSectionGroup = parentSectionGroup;
        return this;
    }

    /**
     * Get the additionalProperties property: onenoteSection.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: onenoteSection.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphOnenoteSection object itself.
     */
    public MicrosoftGraphOnenoteSection withAdditionalProperties(Map<String, Object> additionalProperties) {
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
    public MicrosoftGraphOnenoteSection withCreatedBy(MicrosoftGraphIdentitySet createdBy) {
        super.withCreatedBy(createdBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphOnenoteSection withDisplayName(String displayName) {
        super.withDisplayName(displayName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphOnenoteSection withLastModifiedBy(MicrosoftGraphIdentitySet lastModifiedBy) {
        super.withLastModifiedBy(lastModifiedBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphOnenoteSection withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        super.withLastModifiedDateTime(lastModifiedDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphOnenoteSection withCreatedDateTime(OffsetDateTime createdDateTime) {
        super.withCreatedDateTime(createdDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphOnenoteSection withSelf(String self) {
        super.withSelf(self);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphOnenoteSection withId(String id) {
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
        if (links() != null) {
            links().validate();
        }
        if (pages() != null) {
            pages().forEach(e -> e.validate());
        }
        if (parentNotebook() != null) {
            parentNotebook().validate();
        }
        if (parentSectionGroup() != null) {
            parentSectionGroup().validate();
        }
    }
}
