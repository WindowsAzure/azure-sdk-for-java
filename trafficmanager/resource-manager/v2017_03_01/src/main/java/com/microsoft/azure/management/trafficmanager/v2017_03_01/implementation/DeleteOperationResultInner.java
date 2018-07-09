/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager.v2017_03_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The result of the request or operation.
 */
public class DeleteOperationResultInner {
    /**
     * The result of the operation or request.
     */
    @JsonProperty(value = "boolean", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean operationResult;

    /**
     * Get the result of the operation or request.
     *
     * @return the operationResult value
     */
    public Boolean operationResult() {
        return this.operationResult;
    }

}
