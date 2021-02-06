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

/** incompleteData. */
@Fluent
public final class MicrosoftGraphIncompleteData {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphIncompleteData.class);

    /*
     * The service does not have source data before the specified time.
     */
    @JsonProperty(value = "missingDataBeforeDateTime")
    private OffsetDateTime missingDataBeforeDateTime;

    /*
     * Some data was not recorded due to excessive activity.
     */
    @JsonProperty(value = "wasThrottled")
    private Boolean wasThrottled;

    /*
     * incompleteData
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the missingDataBeforeDateTime property: The service does not have source data before the specified time.
     *
     * @return the missingDataBeforeDateTime value.
     */
    public OffsetDateTime missingDataBeforeDateTime() {
        return this.missingDataBeforeDateTime;
    }

    /**
     * Set the missingDataBeforeDateTime property: The service does not have source data before the specified time.
     *
     * @param missingDataBeforeDateTime the missingDataBeforeDateTime value to set.
     * @return the MicrosoftGraphIncompleteData object itself.
     */
    public MicrosoftGraphIncompleteData withMissingDataBeforeDateTime(OffsetDateTime missingDataBeforeDateTime) {
        this.missingDataBeforeDateTime = missingDataBeforeDateTime;
        return this;
    }

    /**
     * Get the wasThrottled property: Some data was not recorded due to excessive activity.
     *
     * @return the wasThrottled value.
     */
    public Boolean wasThrottled() {
        return this.wasThrottled;
    }

    /**
     * Set the wasThrottled property: Some data was not recorded due to excessive activity.
     *
     * @param wasThrottled the wasThrottled value to set.
     * @return the MicrosoftGraphIncompleteData object itself.
     */
    public MicrosoftGraphIncompleteData withWasThrottled(Boolean wasThrottled) {
        this.wasThrottled = wasThrottled;
        return this;
    }

    /**
     * Get the additionalProperties property: incompleteData.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: incompleteData.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphIncompleteData object itself.
     */
    public MicrosoftGraphIncompleteData withAdditionalProperties(Map<String, Object> additionalProperties) {
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
