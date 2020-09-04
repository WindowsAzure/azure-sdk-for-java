// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.learn.appconfig.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** The ConfigurationSetting model. */
@Fluent
public final class ConfigurationSetting {
    /*
     * The unique name of the key-value.
     */
    @JsonProperty(value = "key")
    private String key;

    /*
     * The label of the key-value.
     */
    @JsonProperty(value = "label")
    private String label;

    /*
     * The content type of the key-value.
     */
    @JsonProperty(value = "content_type")
    private String contentType;

    /*
     * The value of the key-value.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * The time the key-value was last modified.
     */
    @JsonProperty(value = "last_modified")
    private OffsetDateTime lastModified;

    /*
     * Dictionary of <string>
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Indicates whether or not this key-value is readonly.
     */
    @JsonProperty(value = "locked")
    private Boolean locked;

    /*
     * The entity-tag of the key-value.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the key property: The unique name of the key-value.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: The unique name of the key-value.
     *
     * @param key the key value to set.
     * @return the ConfigurationSetting object itself.
     */
    public ConfigurationSetting setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the label property: The label of the key-value.
     *
     * @return the label value.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Set the label property: The label of the key-value.
     *
     * @param label the label value to set.
     * @return the ConfigurationSetting object itself.
     */
    public ConfigurationSetting setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the contentType property: The content type of the key-value.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The content type of the key-value.
     *
     * @param contentType the contentType value to set.
     * @return the ConfigurationSetting object itself.
     */
    public ConfigurationSetting setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the value property: The value of the key-value.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value of the key-value.
     *
     * @param value the value value to set.
     * @return the ConfigurationSetting object itself.
     */
    public ConfigurationSetting setValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the lastModified property: The time the key-value was last modified.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        return this.lastModified;
    }

    /**
     * Set the lastModified property: The time the key-value was last modified.
     *
     * @param lastModified the lastModified value to set.
     * @return the ConfigurationSetting object itself.
     */
    public ConfigurationSetting setLastModified(OffsetDateTime lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Get the tags property: Dictionary of &lt;string&gt;.
     *
     * @return the tags value.
     */
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: Dictionary of &lt;string&gt;.
     *
     * @param tags the tags value to set.
     * @return the ConfigurationSetting object itself.
     */
    public ConfigurationSetting setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the locked property: Indicates whether or not this key-value is readonly.
     *
     * @return the locked value.
     */
    public Boolean isLocked() {
        return this.locked;
    }

    /**
     * Set the locked property: Indicates whether or not this key-value is readonly.
     *
     * @param locked the locked value to set.
     * @return the ConfigurationSetting object itself.
     */
    public ConfigurationSetting setLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    /**
     * Get the etag property: The entity-tag of the key-value.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag property: The entity-tag of the key-value.
     *
     * @param etag the etag value to set.
     * @return the ConfigurationSetting object itself.
     */
    public ConfigurationSetting setEtag(String etag) {
        this.etag = etag;
        return this;
    }
}
