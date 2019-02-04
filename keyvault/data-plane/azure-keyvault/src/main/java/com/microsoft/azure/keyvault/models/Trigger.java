/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.keyvault.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A condition to be satisfied for an action to be executed.
 */
public class Trigger {
    /**
     * Percentage of lifetime at which to trigger. Value should be between 1
     * and 99.
     */
    @JsonProperty(value = "lifetime_percentage")
    private Integer lifetimePercentage;

    /**
     * Days before expiry to attempt renewal. Value should be between 1 and
     * validity_in_months multiplied by 27. If validity_in_months is 36, then
     * value should be between 1 and 972 (36 * 27).
     */
    @JsonProperty(value = "days_before_expiry")
    private Integer daysBeforeExpiry;

    /**
     * Get the lifetimePercentage value.
     *
     * @return the lifetimePercentage value
     */
    public Integer lifetimePercentage() {
        return this.lifetimePercentage;
    }

    /**
     * Set the lifetimePercentage value.
     *
     * @param lifetimePercentage the lifetimePercentage value to set
     * @return the Trigger object itself.
     */
    public Trigger withLifetimePercentage(Integer lifetimePercentage) {
        this.lifetimePercentage = lifetimePercentage;
        return this;
    }

    /**
     * Get the daysBeforeExpiry value.
     *
     * @return the daysBeforeExpiry value
     */
    public Integer daysBeforeExpiry() {
        return this.daysBeforeExpiry;
    }

    /**
     * Set the daysBeforeExpiry value.
     *
     * @param daysBeforeExpiry the daysBeforeExpiry value to set
     * @return the Trigger object itself.
     */
    public Trigger withDaysBeforeExpiry(Integer daysBeforeExpiry) {
        this.daysBeforeExpiry = daysBeforeExpiry;
        return this;
    }

}
