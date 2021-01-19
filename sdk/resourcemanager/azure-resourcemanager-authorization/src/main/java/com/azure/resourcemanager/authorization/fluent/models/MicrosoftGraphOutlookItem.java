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

/** outlookItem. */
@Fluent
public class MicrosoftGraphOutlookItem extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphOutlookItem.class);

    /*
     * The categories associated with the item
     */
    @JsonProperty(value = "categories")
    private List<String> categories;

    /*
     * Identifies the version of the item. Every time the item is changed,
     * changeKey changes as well. This allows Exchange to apply changes to the
     * correct version of the object. Read-only.
     */
    @JsonProperty(value = "changeKey")
    private String changeKey;

    /*
     * The Timestamp type represents date and time information using ISO 8601
     * format and is always in UTC time. For example, midnight UTC on Jan 1,
     * 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @JsonProperty(value = "createdDateTime")
    private OffsetDateTime createdDateTime;

    /*
     * The Timestamp type represents date and time information using ISO 8601
     * format and is always in UTC time. For example, midnight UTC on Jan 1,
     * 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @JsonProperty(value = "lastModifiedDateTime")
    private OffsetDateTime lastModifiedDateTime;

    /*
     * outlookItem
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the categories property: The categories associated with the item.
     *
     * @return the categories value.
     */
    public List<String> categories() {
        return this.categories;
    }

    /**
     * Set the categories property: The categories associated with the item.
     *
     * @param categories the categories value to set.
     * @return the MicrosoftGraphOutlookItem object itself.
     */
    public MicrosoftGraphOutlookItem withCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Get the changeKey property: Identifies the version of the item. Every time the item is changed, changeKey changes
     * as well. This allows Exchange to apply changes to the correct version of the object. Read-only.
     *
     * @return the changeKey value.
     */
    public String changeKey() {
        return this.changeKey;
    }

    /**
     * Set the changeKey property: Identifies the version of the item. Every time the item is changed, changeKey changes
     * as well. This allows Exchange to apply changes to the correct version of the object. Read-only.
     *
     * @param changeKey the changeKey value to set.
     * @return the MicrosoftGraphOutlookItem object itself.
     */
    public MicrosoftGraphOutlookItem withChangeKey(String changeKey) {
        this.changeKey = changeKey;
        return this;
    }

    /**
     * Get the createdDateTime property: The Timestamp type represents date and time information using ISO 8601 format
     * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: The Timestamp type represents date and time information using ISO 8601 format
     * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the MicrosoftGraphOutlookItem object itself.
     */
    public MicrosoftGraphOutlookItem withCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the lastModifiedDateTime property: The Timestamp type represents date and time information using ISO 8601
     * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
     * '2014-01-01T00:00:00Z'.
     *
     * @return the lastModifiedDateTime value.
     */
    public OffsetDateTime lastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Set the lastModifiedDateTime property: The Timestamp type represents date and time information using ISO 8601
     * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
     * '2014-01-01T00:00:00Z'.
     *
     * @param lastModifiedDateTime the lastModifiedDateTime value to set.
     * @return the MicrosoftGraphOutlookItem object itself.
     */
    public MicrosoftGraphOutlookItem withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
        return this;
    }

    /**
     * Get the additionalProperties property: outlookItem.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: outlookItem.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphOutlookItem object itself.
     */
    public MicrosoftGraphOutlookItem withAdditionalProperties(Map<String, Object> additionalProperties) {
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
    public MicrosoftGraphOutlookItem withId(String id) {
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
    }
}
