/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.costmanagement.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The destination information for the delivery of the export. To allow access
 * to a storage account, you must register the account's subscription with the
 * Microsoft.CostManagementExports resource provider. This is required once per
 * subscription. When creating an export in the Azure portal, it is done
 * automatically, however API users need to register the subscription. For more
 * information see
 * https://docs.microsoft.com/en-us/azure/azure-resource-manager/resource-manager-supported-services
 * .
 */
public class ExportDeliveryDestination {
    /**
     * The resource id of the storage account where exports will be delivered.
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /**
     * The name of the container where exports will be uploaded.
     */
    @JsonProperty(value = "container", required = true)
    private String container;

    /**
     * The name of the directory where exports will be uploaded.
     */
    @JsonProperty(value = "rootFolderPath")
    private String rootFolderPath;

    /**
     * Get the resource id of the storage account where exports will be delivered.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resource id of the storage account where exports will be delivered.
     *
     * @param resourceId the resourceId value to set
     * @return the ExportDeliveryDestination object itself.
     */
    public ExportDeliveryDestination withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the name of the container where exports will be uploaded.
     *
     * @return the container value
     */
    public String container() {
        return this.container;
    }

    /**
     * Set the name of the container where exports will be uploaded.
     *
     * @param container the container value to set
     * @return the ExportDeliveryDestination object itself.
     */
    public ExportDeliveryDestination withContainer(String container) {
        this.container = container;
        return this;
    }

    /**
     * Get the name of the directory where exports will be uploaded.
     *
     * @return the rootFolderPath value
     */
    public String rootFolderPath() {
        return this.rootFolderPath;
    }

    /**
     * Set the name of the directory where exports will be uploaded.
     *
     * @param rootFolderPath the rootFolderPath value to set
     * @return the ExportDeliveryDestination object itself.
     */
    public ExportDeliveryDestination withRootFolderPath(String rootFolderPath) {
        this.rootFolderPath = rootFolderPath;
        return this;
    }

}
