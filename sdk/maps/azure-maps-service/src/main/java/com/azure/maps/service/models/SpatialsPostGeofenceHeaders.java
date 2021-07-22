// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SpatialsPostGeofenceHeaders model. */
@Fluent
public final class SpatialsPostGeofenceHeaders {
    /*
     * The X-Correlation-id property.
     */
    @JsonProperty(value = "X-Correlation-id")
    private String xCorrelationId;

    /**
     * Get the xCorrelationId property: The X-Correlation-id property.
     *
     * @return the xCorrelationId value.
     */
    public String getXCorrelationId() {
        return this.xCorrelationId;
    }

    /**
     * Set the xCorrelationId property: The X-Correlation-id property.
     *
     * @param xCorrelationId the xCorrelationId value to set.
     * @return the SpatialsPostGeofenceHeaders object itself.
     */
    public SpatialsPostGeofenceHeaders setXCorrelationId(String xCorrelationId) {
        this.xCorrelationId = xCorrelationId;
        return this;
    }
}
