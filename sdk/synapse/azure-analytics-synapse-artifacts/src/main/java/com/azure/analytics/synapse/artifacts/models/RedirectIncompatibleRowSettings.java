// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Redirect incompatible row settings. */
@Fluent
public final class RedirectIncompatibleRowSettings {
    /*
     * Name of the Azure Storage, Storage SAS, or Azure Data Lake Store linked
     * service used for redirecting incompatible row. Must be specified if
     * redirectIncompatibleRowSettings is specified. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "linkedServiceName", required = true)
    private Object linkedServiceName;

    /*
     * The path for storing the redirect incompatible row data. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "path")
    private Object path;

    /*
     * Redirect incompatible row settings
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the linkedServiceName property: Name of the Azure Storage, Storage SAS, or Azure Data Lake Store linked
     * service used for redirecting incompatible row. Must be specified if redirectIncompatibleRowSettings is specified.
     * Type: string (or Expression with resultType string).
     *
     * @return the linkedServiceName value.
     */
    public Object getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set the linkedServiceName property: Name of the Azure Storage, Storage SAS, or Azure Data Lake Store linked
     * service used for redirecting incompatible row. Must be specified if redirectIncompatibleRowSettings is specified.
     * Type: string (or Expression with resultType string).
     *
     * @param linkedServiceName the linkedServiceName value to set.
     * @return the RedirectIncompatibleRowSettings object itself.
     */
    public RedirectIncompatibleRowSettings setLinkedServiceName(Object linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

    /**
     * Get the path property: The path for storing the redirect incompatible row data. Type: string (or Expression with
     * resultType string).
     *
     * @return the path value.
     */
    public Object getPath() {
        return this.path;
    }

    /**
     * Set the path property: The path for storing the redirect incompatible row data. Type: string (or Expression with
     * resultType string).
     *
     * @param path the path value to set.
     * @return the RedirectIncompatibleRowSettings object itself.
     */
    public RedirectIncompatibleRowSettings setPath(Object path) {
        this.path = path;
        return this;
    }

    /**
     * Get the additionalProperties property: Redirect incompatible row settings.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Redirect incompatible row settings.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the RedirectIncompatibleRowSettings object itself.
     */
    public RedirectIncompatibleRowSettings setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
