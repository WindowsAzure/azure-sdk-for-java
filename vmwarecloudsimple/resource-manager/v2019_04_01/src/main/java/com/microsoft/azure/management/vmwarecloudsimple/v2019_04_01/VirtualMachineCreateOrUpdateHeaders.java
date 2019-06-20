/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for CreateOrUpdate operation.
 */
public class VirtualMachineCreateOrUpdateHeaders {
    /**
     * The azureAsyncOperation property.
     */
    @JsonProperty(value = "Azure-AsyncOperation")
    private String azureAsyncOperation;

    /**
     * Get the azureAsyncOperation value.
     *
     * @return the azureAsyncOperation value
     */
    public String azureAsyncOperation() {
        return this.azureAsyncOperation;
    }

    /**
     * Set the azureAsyncOperation value.
     *
     * @param azureAsyncOperation the azureAsyncOperation value to set
     * @return the VirtualMachineCreateOrUpdateHeaders object itself.
     */
    public VirtualMachineCreateOrUpdateHeaders withAzureAsyncOperation(String azureAsyncOperation) {
        this.azureAsyncOperation = azureAsyncOperation;
        return this;
    }

}
