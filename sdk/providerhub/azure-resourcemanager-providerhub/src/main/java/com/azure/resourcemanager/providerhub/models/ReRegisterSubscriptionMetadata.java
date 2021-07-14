// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ReRegisterSubscriptionMetadata model. */
@Fluent
public class ReRegisterSubscriptionMetadata {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReRegisterSubscriptionMetadata.class);

    /*
     * The enabled property.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * The concurrencyLimit property.
     */
    @JsonProperty(value = "concurrencyLimit")
    private Integer concurrencyLimit;

    /**
     * Get the enabled property: The enabled property.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: The enabled property.
     *
     * @param enabled the enabled value to set.
     * @return the ReRegisterSubscriptionMetadata object itself.
     */
    public ReRegisterSubscriptionMetadata withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the concurrencyLimit property: The concurrencyLimit property.
     *
     * @return the concurrencyLimit value.
     */
    public Integer concurrencyLimit() {
        return this.concurrencyLimit;
    }

    /**
     * Set the concurrencyLimit property: The concurrencyLimit property.
     *
     * @param concurrencyLimit the concurrencyLimit value to set.
     * @return the ReRegisterSubscriptionMetadata object itself.
     */
    public ReRegisterSubscriptionMetadata withConcurrencyLimit(Integer concurrencyLimit) {
        this.concurrencyLimit = concurrencyLimit;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
