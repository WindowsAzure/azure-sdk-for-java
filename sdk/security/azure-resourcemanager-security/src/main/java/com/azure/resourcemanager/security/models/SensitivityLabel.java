// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The sensitivity label. */
@Fluent
public final class SensitivityLabel {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SensitivityLabel.class);

    /*
     * The name of the sensitivity label.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The description of the sensitivity label.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The rank of the sensitivity label.
     */
    @JsonProperty(value = "rank")
    private Rank rank;

    /*
     * The order of the sensitivity label.
     */
    @JsonProperty(value = "order")
    private Integer order;

    /*
     * Indicates whether the label is enabled or not.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Get the displayName property: The name of the sensitivity label.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The name of the sensitivity label.
     *
     * @param displayName the displayName value to set.
     * @return the SensitivityLabel object itself.
     */
    public SensitivityLabel withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: The description of the sensitivity label.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the sensitivity label.
     *
     * @param description the description value to set.
     * @return the SensitivityLabel object itself.
     */
    public SensitivityLabel withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the rank property: The rank of the sensitivity label.
     *
     * @return the rank value.
     */
    public Rank rank() {
        return this.rank;
    }

    /**
     * Set the rank property: The rank of the sensitivity label.
     *
     * @param rank the rank value to set.
     * @return the SensitivityLabel object itself.
     */
    public SensitivityLabel withRank(Rank rank) {
        this.rank = rank;
        return this;
    }

    /**
     * Get the order property: The order of the sensitivity label.
     *
     * @return the order value.
     */
    public Integer order() {
        return this.order;
    }

    /**
     * Set the order property: The order of the sensitivity label.
     *
     * @param order the order value to set.
     * @return the SensitivityLabel object itself.
     */
    public SensitivityLabel withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * Get the enabled property: Indicates whether the label is enabled or not.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether the label is enabled or not.
     *
     * @param enabled the enabled value to set.
     * @return the SensitivityLabel object itself.
     */
    public SensitivityLabel withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
