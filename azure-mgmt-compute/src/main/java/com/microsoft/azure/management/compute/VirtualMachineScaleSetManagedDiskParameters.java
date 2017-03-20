/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the parameters of a ScaleSet managed disk.
 */
public class VirtualMachineScaleSetManagedDiskParameters {
    /**
     * The Storage Account type. Possible values include: 'Standard_LRS',
     * 'Premium_LRS'.
     */
    @JsonProperty(value = "storageAccountType")
    private StorageAccountTypes storageAccountType;

    /**
     * Get the storageAccountType value.
     *
     * @return the storageAccountType value
     */
    public StorageAccountTypes storageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Set the storageAccountType value.
     *
     * @param storageAccountType the storageAccountType value to set
     * @return the VirtualMachineScaleSetManagedDiskParameters object itself.
     */
    public VirtualMachineScaleSetManagedDiskParameters withStorageAccountType(StorageAccountTypes storageAccountType) {
        this.storageAccountType = storageAccountType;
        return this;
    }

}
