/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2018_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A single usage result.
 */
public class Usage {
    /**
     * Unit of the usage result.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /**
     * The current usage of the resource.
     */
    @JsonProperty(value = "currentValue", access = JsonProperty.Access.WRITE_ONLY)
    private Integer currentValue;

    /**
     * The maximum permitted usage of the resource.
     */
    @JsonProperty(value = "limit", access = JsonProperty.Access.WRITE_ONLY)
    private Integer limit;

    /**
     * The name object of the resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private UsageName name;

    /**
     * Get unit of the usage result.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the current usage of the resource.
     *
     * @return the currentValue value
     */
    public Integer currentValue() {
        return this.currentValue;
    }

    /**
     * Get the maximum permitted usage of the resource.
     *
     * @return the limit value
     */
    public Integer limit() {
        return this.limit;
    }

    /**
     * Get the name object of the resource.
     *
     * @return the name value
     */
    public UsageName name() {
        return this.name;
    }

}
