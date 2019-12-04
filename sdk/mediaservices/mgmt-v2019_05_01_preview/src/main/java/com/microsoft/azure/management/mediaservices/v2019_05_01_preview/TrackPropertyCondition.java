/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class to specify one track property condition.
 */
public class TrackPropertyCondition {
    /**
     * Track property type. Possible values include: 'Unknown', 'FourCC'.
     */
    @JsonProperty(value = "property", required = true)
    private TrackPropertyType property;

    /**
     * Track property condition operation. Possible values include: 'Unknown',
     * 'Equal'.
     */
    @JsonProperty(value = "operation", required = true)
    private TrackPropertyCompareOperation operation;

    /**
     * Track property value.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get track property type. Possible values include: 'Unknown', 'FourCC'.
     *
     * @return the property value
     */
    public TrackPropertyType property() {
        return this.property;
    }

    /**
     * Set track property type. Possible values include: 'Unknown', 'FourCC'.
     *
     * @param property the property value to set
     * @return the TrackPropertyCondition object itself.
     */
    public TrackPropertyCondition withProperty(TrackPropertyType property) {
        this.property = property;
        return this;
    }

    /**
     * Get track property condition operation. Possible values include: 'Unknown', 'Equal'.
     *
     * @return the operation value
     */
    public TrackPropertyCompareOperation operation() {
        return this.operation;
    }

    /**
     * Set track property condition operation. Possible values include: 'Unknown', 'Equal'.
     *
     * @param operation the operation value to set
     * @return the TrackPropertyCondition object itself.
     */
    public TrackPropertyCondition withOperation(TrackPropertyCompareOperation operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get track property value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set track property value.
     *
     * @param value the value value to set
     * @return the TrackPropertyCondition object itself.
     */
    public TrackPropertyCondition withValue(String value) {
        this.value = value;
        return this;
    }

}
