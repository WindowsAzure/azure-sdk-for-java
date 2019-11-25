/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview.implementation;

import java.util.UUID;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.StorageAccount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * A Media Services account.
 */
@JsonFlatten
@SkipParentValidation
public class SubscriptionMediaServiceInner extends Resource {
    /**
     * The Media Services account ID.
     */
    @JsonProperty(value = "properties.mediaServiceId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID mediaServiceId;

    /**
     * The storage accounts for this resource.
     */
    @JsonProperty(value = "properties.storageAccounts")
    private List<StorageAccount> storageAccounts;

    /**
     * Get the Media Services account ID.
     *
     * @return the mediaServiceId value
     */
    public UUID mediaServiceId() {
        return this.mediaServiceId;
    }

    /**
     * Get the storage accounts for this resource.
     *
     * @return the storageAccounts value
     */
    public List<StorageAccount> storageAccounts() {
        return this.storageAccounts;
    }

    /**
     * Set the storage accounts for this resource.
     *
     * @param storageAccounts the storageAccounts value to set
     * @return the SubscriptionMediaServiceInner object itself.
     */
    public SubscriptionMediaServiceInner withStorageAccounts(List<StorageAccount> storageAccounts) {
        this.storageAccounts = storageAccounts;
        return this;
    }

}
