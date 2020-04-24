// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.appservice.ComputeModeOptions;
import com.azure.management.appservice.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The Usage model. */
@JsonFlatten
@Immutable
public class UsageInner extends ProxyOnlyResource {
    /*
     * Friendly name shown in the UI.
     */
    @JsonProperty(value = "properties.displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * Name of the quota resource.
     */
    @JsonProperty(value = "properties.resourceName", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceName;

    /*
     * Units of measurement for the quota resource.
     */
    @JsonProperty(value = "properties.unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /*
     * The current value of the resource counter.
     */
    @JsonProperty(value = "properties.currentValue", access = JsonProperty.Access.WRITE_ONLY)
    private Long currentValue;

    /*
     * The resource limit.
     */
    @JsonProperty(value = "properties.limit", access = JsonProperty.Access.WRITE_ONLY)
    private Long limit;

    /*
     * Next reset time for the resource counter.
     */
    @JsonProperty(value = "properties.nextResetTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime nextResetTime;

    /*
     * Compute mode used for this usage.
     */
    @JsonProperty(value = "properties.computeMode", access = JsonProperty.Access.WRITE_ONLY)
    private ComputeModeOptions computeMode;

    /*
     * Site mode used for this usage.
     */
    @JsonProperty(value = "properties.siteMode", access = JsonProperty.Access.WRITE_ONLY)
    private String siteMode;

    /**
     * Get the displayName property: Friendly name shown in the UI.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the resourceName property: Name of the quota resource.
     *
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Get the unit property: Units of measurement for the quota resource.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the currentValue property: The current value of the resource counter.
     *
     * @return the currentValue value.
     */
    public Long currentValue() {
        return this.currentValue;
    }

    /**
     * Get the limit property: The resource limit.
     *
     * @return the limit value.
     */
    public Long limit() {
        return this.limit;
    }

    /**
     * Get the nextResetTime property: Next reset time for the resource counter.
     *
     * @return the nextResetTime value.
     */
    public OffsetDateTime nextResetTime() {
        return this.nextResetTime;
    }

    /**
     * Get the computeMode property: Compute mode used for this usage.
     *
     * @return the computeMode value.
     */
    public ComputeModeOptions computeMode() {
        return this.computeMode;
    }

    /**
     * Get the siteMode property: Site mode used for this usage.
     *
     * @return the siteMode value.
     */
    public String siteMode() {
        return this.siteMode;
    }
}
