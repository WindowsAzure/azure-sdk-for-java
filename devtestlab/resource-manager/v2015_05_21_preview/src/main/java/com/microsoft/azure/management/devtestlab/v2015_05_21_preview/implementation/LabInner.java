/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2015_05_21_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.devtestlab.v2015_05_21_preview.LabStorageType;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A lab.
 */
@JsonFlatten
public class LabInner extends Resource {
    /**
     * The lab's default storage account.
     */
    @JsonProperty(value = "properties.defaultStorageAccount")
    private String defaultStorageAccount;

    /**
     * The artifact storage account of the lab.
     */
    @JsonProperty(value = "properties.artifactsStorageAccount")
    private String artifactsStorageAccount;

    /**
     * The storage accounts of the lab.
     */
    @JsonProperty(value = "properties.storageAccounts")
    private List<String> storageAccounts;

    /**
     * The name of the key vault of the lab.
     */
    @JsonProperty(value = "properties.vaultName")
    private String vaultName;

    /**
     * The type of the lab storage. Possible values include: 'Standard',
     * 'Premium'.
     */
    @JsonProperty(value = "properties.labStorageType")
    private LabStorageType labStorageType;

    /**
     * The default virtual network identifier of the lab.
     */
    @JsonProperty(value = "properties.defaultVirtualNetworkId")
    private String defaultVirtualNetworkId;

    /**
     * The creation date of the lab.
     */
    @JsonProperty(value = "properties.createdDate")
    private DateTime createdDate;

    /**
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the lab's default storage account.
     *
     * @return the defaultStorageAccount value
     */
    public String defaultStorageAccount() {
        return this.defaultStorageAccount;
    }

    /**
     * Set the lab's default storage account.
     *
     * @param defaultStorageAccount the defaultStorageAccount value to set
     * @return the LabInner object itself.
     */
    public LabInner withDefaultStorageAccount(String defaultStorageAccount) {
        this.defaultStorageAccount = defaultStorageAccount;
        return this;
    }

    /**
     * Get the artifact storage account of the lab.
     *
     * @return the artifactsStorageAccount value
     */
    public String artifactsStorageAccount() {
        return this.artifactsStorageAccount;
    }

    /**
     * Set the artifact storage account of the lab.
     *
     * @param artifactsStorageAccount the artifactsStorageAccount value to set
     * @return the LabInner object itself.
     */
    public LabInner withArtifactsStorageAccount(String artifactsStorageAccount) {
        this.artifactsStorageAccount = artifactsStorageAccount;
        return this;
    }

    /**
     * Get the storage accounts of the lab.
     *
     * @return the storageAccounts value
     */
    public List<String> storageAccounts() {
        return this.storageAccounts;
    }

    /**
     * Set the storage accounts of the lab.
     *
     * @param storageAccounts the storageAccounts value to set
     * @return the LabInner object itself.
     */
    public LabInner withStorageAccounts(List<String> storageAccounts) {
        this.storageAccounts = storageAccounts;
        return this;
    }

    /**
     * Get the name of the key vault of the lab.
     *
     * @return the vaultName value
     */
    public String vaultName() {
        return this.vaultName;
    }

    /**
     * Set the name of the key vault of the lab.
     *
     * @param vaultName the vaultName value to set
     * @return the LabInner object itself.
     */
    public LabInner withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * Get the type of the lab storage. Possible values include: 'Standard', 'Premium'.
     *
     * @return the labStorageType value
     */
    public LabStorageType labStorageType() {
        return this.labStorageType;
    }

    /**
     * Set the type of the lab storage. Possible values include: 'Standard', 'Premium'.
     *
     * @param labStorageType the labStorageType value to set
     * @return the LabInner object itself.
     */
    public LabInner withLabStorageType(LabStorageType labStorageType) {
        this.labStorageType = labStorageType;
        return this;
    }

    /**
     * Get the default virtual network identifier of the lab.
     *
     * @return the defaultVirtualNetworkId value
     */
    public String defaultVirtualNetworkId() {
        return this.defaultVirtualNetworkId;
    }

    /**
     * Set the default virtual network identifier of the lab.
     *
     * @param defaultVirtualNetworkId the defaultVirtualNetworkId value to set
     * @return the LabInner object itself.
     */
    public LabInner withDefaultVirtualNetworkId(String defaultVirtualNetworkId) {
        this.defaultVirtualNetworkId = defaultVirtualNetworkId;
        return this;
    }

    /**
     * Get the creation date of the lab.
     *
     * @return the createdDate value
     */
    public DateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Set the creation date of the lab.
     *
     * @param createdDate the createdDate value to set
     * @return the LabInner object itself.
     */
    public LabInner withCreatedDate(DateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Get the provisioning status of the resource.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning status of the resource.
     *
     * @param provisioningState the provisioningState value to set
     * @return the LabInner object itself.
     */
    public LabInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

}
