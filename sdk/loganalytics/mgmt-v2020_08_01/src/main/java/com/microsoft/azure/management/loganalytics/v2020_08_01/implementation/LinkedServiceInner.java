/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01.implementation;

import com.microsoft.azure.management.loganalytics.v2020_08_01.LinkedServiceEntityStatus;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The top level Linked service resource container.
 */
@JsonFlatten
public class LinkedServiceInner extends ProxyResource {
    /**
     * The resource id of the resource that will be linked to the workspace.
     * This should be used for linking resources which require read access.
     */
    @JsonProperty(value = "properties.resourceId")
    private String resourceId;

    /**
     * The resource id of the resource that will be linked to the workspace.
     * This should be used for linking resources which require write access.
     */
    @JsonProperty(value = "properties.writeAccessResourceId")
    private String writeAccessResourceId;

    /**
     * The provisioning state of the linked service. Possible values include:
     * 'Succeeded', 'Deleting', 'ProvisioningAccount', 'Updating'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private LinkedServiceEntityStatus provisioningState;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the resource id of the resource that will be linked to the workspace. This should be used for linking resources which require read access.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resource id of the resource that will be linked to the workspace. This should be used for linking resources which require read access.
     *
     * @param resourceId the resourceId value to set
     * @return the LinkedServiceInner object itself.
     */
    public LinkedServiceInner withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the resource id of the resource that will be linked to the workspace. This should be used for linking resources which require write access.
     *
     * @return the writeAccessResourceId value
     */
    public String writeAccessResourceId() {
        return this.writeAccessResourceId;
    }

    /**
     * Set the resource id of the resource that will be linked to the workspace. This should be used for linking resources which require write access.
     *
     * @param writeAccessResourceId the writeAccessResourceId value to set
     * @return the LinkedServiceInner object itself.
     */
    public LinkedServiceInner withWriteAccessResourceId(String writeAccessResourceId) {
        this.writeAccessResourceId = writeAccessResourceId;
        return this;
    }

    /**
     * Get the provisioning state of the linked service. Possible values include: 'Succeeded', 'Deleting', 'ProvisioningAccount', 'Updating'.
     *
     * @return the provisioningState value
     */
    public LinkedServiceEntityStatus provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the linked service. Possible values include: 'Succeeded', 'Deleting', 'ProvisioningAccount', 'Updating'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the LinkedServiceInner object itself.
     */
    public LinkedServiceInner withProvisioningState(LinkedServiceEntityStatus provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the LinkedServiceInner object itself.
     */
    public LinkedServiceInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
