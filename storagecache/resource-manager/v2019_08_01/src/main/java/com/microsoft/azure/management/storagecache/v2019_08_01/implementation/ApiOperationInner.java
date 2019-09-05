/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2019_08_01.implementation;

import com.microsoft.azure.management.storagecache.v2019_08_01.ApiOperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * REST API operation description: see
 * https://github.com/Azure/azure-rest-api-specs/blob/master/documentation/openapi-authoring-automated-guidelines.md#r3023-operationsapiimplementation.
 */
public class ApiOperationInner {
    /**
     * The object that represents the operation.
     */
    @JsonProperty(value = "display")
    private ApiOperationDisplay display;

    /**
     * Operation name: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the object that represents the operation.
     *
     * @return the display value
     */
    public ApiOperationDisplay display() {
        return this.display;
    }

    /**
     * Set the object that represents the operation.
     *
     * @param display the display value to set
     * @return the ApiOperationInner object itself.
     */
    public ApiOperationInner withDisplay(ApiOperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set operation name: {provider}/{resource}/{operation}.
     *
     * @param name the name value to set
     * @return the ApiOperationInner object itself.
     */
    public ApiOperationInner withName(String name) {
        this.name = name;
        return this;
    }

}
