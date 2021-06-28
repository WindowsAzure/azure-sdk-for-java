// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagesync.models.CloudEndpointChangeEnumerationStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cloud Endpoint object. */
@JsonFlatten
@Fluent
public class CloudEndpointInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CloudEndpointInner.class);

    /*
     * Storage Account Resource Id
     */
    @JsonProperty(value = "properties.storageAccountResourceId")
    private String storageAccountResourceId;

    /*
     * Azure file share name
     */
    @JsonProperty(value = "properties.azureFileShareName")
    private String azureFileShareName;

    /*
     * Storage Account Tenant Id
     */
    @JsonProperty(value = "properties.storageAccountTenantId")
    private String storageAccountTenantId;

    /*
     * Partnership Id
     */
    @JsonProperty(value = "properties.partnershipId")
    private String partnershipId;

    /*
     * Friendly Name
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /*
     * Backup Enabled
     */
    @JsonProperty(value = "properties.backupEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private String backupEnabled;

    /*
     * CloudEndpoint Provisioning State
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /*
     * CloudEndpoint lastWorkflowId
     */
    @JsonProperty(value = "properties.lastWorkflowId")
    private String lastWorkflowId;

    /*
     * Resource Last Operation Name
     */
    @JsonProperty(value = "properties.lastOperationName")
    private String lastOperationName;

    /*
     * Cloud endpoint change enumeration status
     */
    @JsonProperty(value = "properties.changeEnumerationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private CloudEndpointChangeEnumerationStatus changeEnumerationStatus;

    /**
     * Get the storageAccountResourceId property: Storage Account Resource Id.
     *
     * @return the storageAccountResourceId value.
     */
    public String storageAccountResourceId() {
        return this.storageAccountResourceId;
    }

    /**
     * Set the storageAccountResourceId property: Storage Account Resource Id.
     *
     * @param storageAccountResourceId the storageAccountResourceId value to set.
     * @return the CloudEndpointInner object itself.
     */
    public CloudEndpointInner withStorageAccountResourceId(String storageAccountResourceId) {
        this.storageAccountResourceId = storageAccountResourceId;
        return this;
    }

    /**
     * Get the azureFileShareName property: Azure file share name.
     *
     * @return the azureFileShareName value.
     */
    public String azureFileShareName() {
        return this.azureFileShareName;
    }

    /**
     * Set the azureFileShareName property: Azure file share name.
     *
     * @param azureFileShareName the azureFileShareName value to set.
     * @return the CloudEndpointInner object itself.
     */
    public CloudEndpointInner withAzureFileShareName(String azureFileShareName) {
        this.azureFileShareName = azureFileShareName;
        return this;
    }

    /**
     * Get the storageAccountTenantId property: Storage Account Tenant Id.
     *
     * @return the storageAccountTenantId value.
     */
    public String storageAccountTenantId() {
        return this.storageAccountTenantId;
    }

    /**
     * Set the storageAccountTenantId property: Storage Account Tenant Id.
     *
     * @param storageAccountTenantId the storageAccountTenantId value to set.
     * @return the CloudEndpointInner object itself.
     */
    public CloudEndpointInner withStorageAccountTenantId(String storageAccountTenantId) {
        this.storageAccountTenantId = storageAccountTenantId;
        return this;
    }

    /**
     * Get the partnershipId property: Partnership Id.
     *
     * @return the partnershipId value.
     */
    public String partnershipId() {
        return this.partnershipId;
    }

    /**
     * Set the partnershipId property: Partnership Id.
     *
     * @param partnershipId the partnershipId value to set.
     * @return the CloudEndpointInner object itself.
     */
    public CloudEndpointInner withPartnershipId(String partnershipId) {
        this.partnershipId = partnershipId;
        return this;
    }

    /**
     * Get the friendlyName property: Friendly Name.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly Name.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the CloudEndpointInner object itself.
     */
    public CloudEndpointInner withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the backupEnabled property: Backup Enabled.
     *
     * @return the backupEnabled value.
     */
    public String backupEnabled() {
        return this.backupEnabled;
    }

    /**
     * Get the provisioningState property: CloudEndpoint Provisioning State.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: CloudEndpoint Provisioning State.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the CloudEndpointInner object itself.
     */
    public CloudEndpointInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the lastWorkflowId property: CloudEndpoint lastWorkflowId.
     *
     * @return the lastWorkflowId value.
     */
    public String lastWorkflowId() {
        return this.lastWorkflowId;
    }

    /**
     * Set the lastWorkflowId property: CloudEndpoint lastWorkflowId.
     *
     * @param lastWorkflowId the lastWorkflowId value to set.
     * @return the CloudEndpointInner object itself.
     */
    public CloudEndpointInner withLastWorkflowId(String lastWorkflowId) {
        this.lastWorkflowId = lastWorkflowId;
        return this;
    }

    /**
     * Get the lastOperationName property: Resource Last Operation Name.
     *
     * @return the lastOperationName value.
     */
    public String lastOperationName() {
        return this.lastOperationName;
    }

    /**
     * Set the lastOperationName property: Resource Last Operation Name.
     *
     * @param lastOperationName the lastOperationName value to set.
     * @return the CloudEndpointInner object itself.
     */
    public CloudEndpointInner withLastOperationName(String lastOperationName) {
        this.lastOperationName = lastOperationName;
        return this;
    }

    /**
     * Get the changeEnumerationStatus property: Cloud endpoint change enumeration status.
     *
     * @return the changeEnumerationStatus value.
     */
    public CloudEndpointChangeEnumerationStatus changeEnumerationStatus() {
        return this.changeEnumerationStatus;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (changeEnumerationStatus() != null) {
            changeEnumerationStatus().validate();
        }
    }
}
