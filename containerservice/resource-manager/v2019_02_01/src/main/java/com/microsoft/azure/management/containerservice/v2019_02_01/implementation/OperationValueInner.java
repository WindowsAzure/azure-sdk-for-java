/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_02_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes the properties of a Compute Operation value.
 */
@JsonFlatten
public class OperationValueInner {
    /**
     * The origin of the compute operation.
     */
    @JsonProperty(value = "origin", access = JsonProperty.Access.WRITE_ONLY)
    private String origin;

    /**
     * The name of the compute operation.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The display name of the compute operation.
     */
    @JsonProperty(value = "display.operation", access = JsonProperty.Access.WRITE_ONLY)
    private String operation;

    /**
     * The display name of the resource the operation applies to.
     */
    @JsonProperty(value = "display.resource", access = JsonProperty.Access.WRITE_ONLY)
    private String resource;

    /**
     * The description of the operation.
     */
    @JsonProperty(value = "display.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * The resource provider for the operation.
     */
    @JsonProperty(value = "display.provider", access = JsonProperty.Access.WRITE_ONLY)
    private String provider;

    /**
     * Get the origin of the compute operation.
     *
     * @return the origin value
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Get the name of the compute operation.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the display name of the compute operation.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get the display name of the resource the operation applies to.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Get the description of the operation.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the resource provider for the operation.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

}
