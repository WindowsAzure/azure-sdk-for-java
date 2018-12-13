/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Display metadata associated with the operation.
 */
public class OperationDisplay {
    /**
     * The localized friendly form of the resource provider name.
     */
    @JsonProperty(value = "provider", access = JsonProperty.Access.WRITE_ONLY)
    private String provider;

    /**
     * The localized friendly form of the resource type related to this
     * action/operation.
     */
    @JsonProperty(value = "resource", access = JsonProperty.Access.WRITE_ONLY)
    private String resource;

    /**
     * The localized friendly name for the operation.
     */
    @JsonProperty(value = "operation", access = JsonProperty.Access.WRITE_ONLY)
    private String operation;

    /**
     * The localized friendly description for the operation.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Get the localized friendly form of the resource provider name.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Get the localized friendly form of the resource type related to this action/operation.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Get the localized friendly name for the operation.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get the localized friendly description for the operation.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

}
