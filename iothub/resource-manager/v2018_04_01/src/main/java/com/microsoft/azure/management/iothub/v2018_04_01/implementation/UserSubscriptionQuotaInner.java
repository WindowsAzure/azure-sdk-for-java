/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01.implementation;

import com.microsoft.azure.management.iothub.v2018_04_01.Name;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User subscription quota response.
 */
public class UserSubscriptionQuotaInner {
    /**
     * IotHub type id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Response type.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Unit of IotHub type.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /**
     * Current number of IotHub type.
     */
    @JsonProperty(value = "currentValue")
    private Integer currentValue;

    /**
     * Numerical limit on IotHub type.
     */
    @JsonProperty(value = "limit")
    private Integer limit;

    /**
     * IotHub type.
     */
    @JsonProperty(value = "name")
    private Name name;

    /**
     * Get iotHub type id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set iotHub type id.
     *
     * @param id the id value to set
     * @return the UserSubscriptionQuotaInner object itself.
     */
    public UserSubscriptionQuotaInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get response type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set response type.
     *
     * @param type the type value to set
     * @return the UserSubscriptionQuotaInner object itself.
     */
    public UserSubscriptionQuotaInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get unit of IotHub type.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set unit of IotHub type.
     *
     * @param unit the unit value to set
     * @return the UserSubscriptionQuotaInner object itself.
     */
    public UserSubscriptionQuotaInner withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get current number of IotHub type.
     *
     * @return the currentValue value
     */
    public Integer currentValue() {
        return this.currentValue;
    }

    /**
     * Set current number of IotHub type.
     *
     * @param currentValue the currentValue value to set
     * @return the UserSubscriptionQuotaInner object itself.
     */
    public UserSubscriptionQuotaInner withCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get numerical limit on IotHub type.
     *
     * @return the limit value
     */
    public Integer limit() {
        return this.limit;
    }

    /**
     * Set numerical limit on IotHub type.
     *
     * @param limit the limit value to set
     * @return the UserSubscriptionQuotaInner object itself.
     */
    public UserSubscriptionQuotaInner withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get iotHub type.
     *
     * @return the name value
     */
    public Name name() {
        return this.name;
    }

    /**
     * Set iotHub type.
     *
     * @param name the name value to set
     * @return the UserSubscriptionQuotaInner object itself.
     */
    public UserSubscriptionQuotaInner withName(Name name) {
        this.name = name;
        return this;
    }

}
