/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_07_17_preview.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the localized display information for this operation.
 */
public class OperationDisplay {
    /**
     * Localized friendly form of the resource provider name.
     */
    @JsonProperty(value = "provider", access = JsonProperty.Access.WRITE_ONLY)
    private String provider;

    /**
     * Localized friendly form of the resource type related to this operation.
     */
    @JsonProperty(value = "resource", access = JsonProperty.Access.WRITE_ONLY)
    private String resource;

    /**
     * Localized friendly name for the operation.
     */
    @JsonProperty(value = "operation", access = JsonProperty.Access.WRITE_ONLY)
    private String operation;

    /**
     * Localized friendly description for the operation.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Get localized friendly form of the resource provider name.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Get localized friendly form of the resource type related to this operation.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Get localized friendly name for the operation.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get localized friendly description for the operation.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

}
