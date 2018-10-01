/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The parameters used when creating a storage sync service.
 */
@JsonFlatten
public class CloudEndpointCreateParameters extends ProxyResource {
    /**
     * Storage Account Resource Id.
     */
    @JsonProperty(value = "properties.storageAccountResourceId")
    private String storageAccountResourceId;

    /**
     * Storage Account Share name.
     */
    @JsonProperty(value = "properties.storageAccountShareName")
    private String storageAccountShareName;

    /**
     * Storage Account Tenant Id.
     */
    @JsonProperty(value = "properties.storageAccountTenantId")
    private String storageAccountTenantId;

    /**
     * Get storage Account Resource Id.
     *
     * @return the storageAccountResourceId value
     */
    public String storageAccountResourceId() {
        return this.storageAccountResourceId;
    }

    /**
     * Set storage Account Resource Id.
     *
     * @param storageAccountResourceId the storageAccountResourceId value to set
     * @return the CloudEndpointCreateParameters object itself.
     */
    public CloudEndpointCreateParameters withStorageAccountResourceId(String storageAccountResourceId) {
        this.storageAccountResourceId = storageAccountResourceId;
        return this;
    }

    /**
     * Get storage Account Share name.
     *
     * @return the storageAccountShareName value
     */
    public String storageAccountShareName() {
        return this.storageAccountShareName;
    }

    /**
     * Set storage Account Share name.
     *
     * @param storageAccountShareName the storageAccountShareName value to set
     * @return the CloudEndpointCreateParameters object itself.
     */
    public CloudEndpointCreateParameters withStorageAccountShareName(String storageAccountShareName) {
        this.storageAccountShareName = storageAccountShareName;
        return this;
    }

    /**
     * Get storage Account Tenant Id.
     *
     * @return the storageAccountTenantId value
     */
    public String storageAccountTenantId() {
        return this.storageAccountTenantId;
    }

    /**
     * Set storage Account Tenant Id.
     *
     * @param storageAccountTenantId the storageAccountTenantId value to set
     * @return the CloudEndpointCreateParameters object itself.
     */
    public CloudEndpointCreateParameters withStorageAccountTenantId(String storageAccountTenantId) {
        this.storageAccountTenantId = storageAccountTenantId;
        return this;
    }

}
