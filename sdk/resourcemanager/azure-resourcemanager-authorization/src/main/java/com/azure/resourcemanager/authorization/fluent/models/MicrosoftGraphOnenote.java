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

/** onenote. */
@Fluent
public final class MicrosoftGraphOnenote extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphOnenote.class);

    /*
     * The collection of OneNote notebooks that are owned by the user or group.
     * Read-only. Nullable.
     */
    @JsonProperty(value = "notebooks")
    private List<MicrosoftGraphNotebook> notebooks;

    /*
     * The status of OneNote operations. Getting an operations collection is
     * not supported, but you can get the status of long-running operations if
     * the Operation-Location header is returned in the response. Read-only.
     * Nullable.
     */
    @JsonProperty(value = "operations")
    private List<MicrosoftGraphOnenoteOperationInner> operations;

    /*
     * The pages in all OneNote notebooks that are owned by the user or group.
     * Read-only. Nullable.
     */
    @JsonProperty(value = "pages")
    private List<MicrosoftGraphOnenotePage> pages;

    /*
     * The image and other file resources in OneNote pages. Getting a resources
     * collection is not supported, but you can get the binary content of a
     * specific resource. Read-only. Nullable.
     */
    @JsonProperty(value = "resources")
    private List<MicrosoftGraphOnenoteResource> resources;

    /*
     * The section groups in all OneNote notebooks that are owned by the user
     * or group.  Read-only. Nullable.
     */
    @JsonProperty(value = "sectionGroups")
    private List<MicrosoftGraphSectionGroup> sectionGroups;

    /*
     * The sections in all OneNote notebooks that are owned by the user or
     * group.  Read-only. Nullable.
     */
    @JsonProperty(value = "sections")
    private List<MicrosoftGraphOnenoteSection> sections;

    /*
     * onenote
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the notebooks property: The collection of OneNote notebooks that are owned by the user or group. Read-only.
     * Nullable.
     *
     * @return the notebooks value.
     */
    public List<MicrosoftGraphNotebook> notebooks() {
        return this.notebooks;
    }

    /**
     * Set the notebooks property: The collection of OneNote notebooks that are owned by the user or group. Read-only.
     * Nullable.
     *
     * @param notebooks the notebooks value to set.
     * @return the MicrosoftGraphOnenote object itself.
     */
    public MicrosoftGraphOnenote withNotebooks(List<MicrosoftGraphNotebook> notebooks) {
        this.notebooks = notebooks;
        return this;
    }

    /**
     * Get the operations property: The status of OneNote operations. Getting an operations collection is not supported,
     * but you can get the status of long-running operations if the Operation-Location header is returned in the
     * response. Read-only. Nullable.
     *
     * @return the operations value.
     */
    public List<MicrosoftGraphOnenoteOperationInner> operations() {
        return this.operations;
    }

    /**
     * Set the operations property: The status of OneNote operations. Getting an operations collection is not supported,
     * but you can get the status of long-running operations if the Operation-Location header is returned in the
     * response. Read-only. Nullable.
     *
     * @param operations the operations value to set.
     * @return the MicrosoftGraphOnenote object itself.
     */
    public MicrosoftGraphOnenote withOperations(List<MicrosoftGraphOnenoteOperationInner> operations) {
        this.operations = operations;
        return this;
    }

    /**
     * Get the pages property: The pages in all OneNote notebooks that are owned by the user or group. Read-only.
     * Nullable.
     *
     * @return the pages value.
     */
    public List<MicrosoftGraphOnenotePage> pages() {
        return this.pages;
    }

    /**
     * Set the pages property: The pages in all OneNote notebooks that are owned by the user or group. Read-only.
     * Nullable.
     *
     * @param pages the pages value to set.
     * @return the MicrosoftGraphOnenote object itself.
     */
    public MicrosoftGraphOnenote withPages(List<MicrosoftGraphOnenotePage> pages) {
        this.pages = pages;
        return this;
    }

    /**
     * Get the resources property: The image and other file resources in OneNote pages. Getting a resources collection
     * is not supported, but you can get the binary content of a specific resource. Read-only. Nullable.
     *
     * @return the resources value.
     */
    public List<MicrosoftGraphOnenoteResource> resources() {
        return this.resources;
    }

    /**
     * Set the resources property: The image and other file resources in OneNote pages. Getting a resources collection
     * is not supported, but you can get the binary content of a specific resource. Read-only. Nullable.
     *
     * @param resources the resources value to set.
     * @return the MicrosoftGraphOnenote object itself.
     */
    public MicrosoftGraphOnenote withResources(List<MicrosoftGraphOnenoteResource> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the sectionGroups property: The section groups in all OneNote notebooks that are owned by the user or group.
     * Read-only. Nullable.
     *
     * @return the sectionGroups value.
     */
    public List<MicrosoftGraphSectionGroup> sectionGroups() {
        return this.sectionGroups;
    }

    /**
     * Set the sectionGroups property: The section groups in all OneNote notebooks that are owned by the user or group.
     * Read-only. Nullable.
     *
     * @param sectionGroups the sectionGroups value to set.
     * @return the MicrosoftGraphOnenote object itself.
     */
    public MicrosoftGraphOnenote withSectionGroups(List<MicrosoftGraphSectionGroup> sectionGroups) {
        this.sectionGroups = sectionGroups;
        return this;
    }

    /**
     * Get the sections property: The sections in all OneNote notebooks that are owned by the user or group. Read-only.
     * Nullable.
     *
     * @return the sections value.
     */
    public List<MicrosoftGraphOnenoteSection> sections() {
        return this.sections;
    }

    /**
     * Set the sections property: The sections in all OneNote notebooks that are owned by the user or group. Read-only.
     * Nullable.
     *
     * @param sections the sections value to set.
     * @return the MicrosoftGraphOnenote object itself.
     */
    public MicrosoftGraphOnenote withSections(List<MicrosoftGraphOnenoteSection> sections) {
        this.sections = sections;
        return this;
    }

    /**
     * Get the additionalProperties property: onenote.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: onenote.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphOnenote object itself.
     */
    public MicrosoftGraphOnenote withAdditionalProperties(Map<String, Object> additionalProperties) {
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
    public MicrosoftGraphOnenote withId(String id) {
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
        if (notebooks() != null) {
            notebooks().forEach(e -> e.validate());
        }
        if (operations() != null) {
            operations().forEach(e -> e.validate());
        }
        if (pages() != null) {
            pages().forEach(e -> e.validate());
        }
        if (resources() != null) {
            resources().forEach(e -> e.validate());
        }
        if (sectionGroups() != null) {
            sectionGroups().forEach(e -> e.validate());
        }
        if (sections() != null) {
            sections().forEach(e -> e.validate());
        }
    }
}
