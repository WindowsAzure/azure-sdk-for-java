/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2020_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The object that describes the operation.
 */
public class OperationDisplay {
    /**
     * The friendly name of the resource provider.
     */
    @JsonProperty(value = "provider", access = JsonProperty.Access.WRITE_ONLY)
    private String provider;

    /**
     * The operation type: read, write, delete, listKeys/action, etc.
     */
    @JsonProperty(value = "operation", access = JsonProperty.Access.WRITE_ONLY)
    private String operation;

    /**
     * The resource type on which the operation is performed.
     */
    @JsonProperty(value = "resource", access = JsonProperty.Access.WRITE_ONLY)
    private String resource;

    /**
     * The friendly name of the operation.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Get the friendly name of the resource provider.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Get the operation type: read, write, delete, listKeys/action, etc.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get the resource type on which the operation is performed.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Get the friendly name of the operation.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

}
