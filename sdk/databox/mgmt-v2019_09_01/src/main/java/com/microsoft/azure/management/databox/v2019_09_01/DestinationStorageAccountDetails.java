/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Details for the destination storage account.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "dataDestinationType", defaultImpl = DestinationStorageAccountDetails.class)
@JsonTypeName("StorageAccount")
public class DestinationStorageAccountDetails extends DestinationAccountDetails {
    /**
     * Destination Storage Account Arm Id.
     */
    @JsonProperty(value = "storageAccountId", required = true)
    private String storageAccountId;

    /**
     * Get destination Storage Account Arm Id.
     *
     * @return the storageAccountId value
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Set destination Storage Account Arm Id.
     *
     * @param storageAccountId the storageAccountId value to set
     * @return the DestinationStorageAccountDetails object itself.
     */
    public DestinationStorageAccountDetails withStorageAccountId(String storageAccountId) {
        this.storageAccountId = storageAccountId;
        return this;
    }

}
