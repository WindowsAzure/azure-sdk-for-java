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
import java.util.Map;

/** Represents an operation applied against an app registration. */
@Fluent
public final class MicrosoftGraphManagedAppOperation extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphManagedAppOperation.class);

    /*
     * The operation name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The last time the app operation was modified.
     */
    @JsonProperty(value = "lastModifiedDateTime")
    private OffsetDateTime lastModifiedDateTime;

    /*
     * The current state of the operation
     */
    @JsonProperty(value = "state")
    private String state;

    /*
     * Version of the entity.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * Represents an operation applied against an app registration.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the displayName property: The operation name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The operation name.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphManagedAppOperation object itself.
     */
    public MicrosoftGraphManagedAppOperation withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the lastModifiedDateTime property: The last time the app operation was modified.
     *
     * @return the lastModifiedDateTime value.
     */
    public OffsetDateTime lastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Set the lastModifiedDateTime property: The last time the app operation was modified.
     *
     * @param lastModifiedDateTime the lastModifiedDateTime value to set.
     * @return the MicrosoftGraphManagedAppOperation object itself.
     */
    public MicrosoftGraphManagedAppOperation withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
        return this;
    }

    /**
     * Get the state property: The current state of the operation.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: The current state of the operation.
     *
     * @param state the state value to set.
     * @return the MicrosoftGraphManagedAppOperation object itself.
     */
    public MicrosoftGraphManagedAppOperation withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the version property: Version of the entity.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Version of the entity.
     *
     * @param version the version value to set.
     * @return the MicrosoftGraphManagedAppOperation object itself.
     */
    public MicrosoftGraphManagedAppOperation withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the additionalProperties property: Represents an operation applied against an app registration.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Represents an operation applied against an app registration.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphManagedAppOperation object itself.
     */
    public MicrosoftGraphManagedAppOperation withAdditionalProperties(Map<String, Object> additionalProperties) {
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
    public MicrosoftGraphManagedAppOperation withId(String id) {
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
