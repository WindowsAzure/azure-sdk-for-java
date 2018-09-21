/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metric properties.
 */
public class MetricProperties {
    /**
     * The service specifications.
     */
    @JsonProperty(value = "serviceSpecification", access = JsonProperty.Access.WRITE_ONLY)
    private ServiceSpecification serviceSpecification;

    /**
     * Get the service specifications.
     *
     * @return the serviceSpecification value
     */
    public ServiceSpecification serviceSpecification() {
        return this.serviceSpecification;
    }

}
