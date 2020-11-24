/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.Sku;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.IdentityProperties;
import org.joda.time.DateTime;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.ProvisioningState;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.Status;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.StorageAccountProperties;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.NetworkRuleSet;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.Policies;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.EncryptionProperty;
import java.util.List;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.PublicNetworkAccess;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.NetworkRuleBypassOptions;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.ZoneRedundancy;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * An object that represents a container registry.
 */
@JsonFlatten
public class RegistryInner extends Resource {
    /**
     * The SKU of the container registry.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /**
     * The identity of the container registry.
     */
    @JsonProperty(value = "identity")
    private IdentityProperties identity;

    /**
     * The URL that can be used to log into the container registry.
     */
    @JsonProperty(value = "properties.loginServer", access = JsonProperty.Access.WRITE_ONLY)
    private String loginServer;

    /**
     * The creation date of the container registry in ISO8601 format.
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationDate;

    /**
     * The provisioning state of the container registry at the time the
     * operation was called. Possible values include: 'Creating', 'Updating',
     * 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The status of the container registry at the time the operation was
     * called.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private Status status;

    /**
     * The value that indicates whether the admin user is enabled.
     */
    @JsonProperty(value = "properties.adminUserEnabled")
    private Boolean adminUserEnabled;

    /**
     * The properties of the storage account for the container registry. Only
     * applicable to Classic SKU.
     */
    @JsonProperty(value = "properties.storageAccount")
    private StorageAccountProperties storageAccount;

    /**
     * The network rule set for a container registry.
     */
    @JsonProperty(value = "properties.networkRuleSet")
    private NetworkRuleSet networkRuleSet;

    /**
     * The policies for a container registry.
     */
    @JsonProperty(value = "properties.policies")
    private Policies policies;

    /**
     * The encryption settings of container registry.
     */
    @JsonProperty(value = "properties.encryption")
    private EncryptionProperty encryption;

    /**
     * Enable a single data endpoint per region for serving data.
     */
    @JsonProperty(value = "properties.dataEndpointEnabled")
    private Boolean dataEndpointEnabled;

    /**
     * List of host names that will serve data when dataEndpointEnabled is
     * true.
     */
    @JsonProperty(value = "properties.dataEndpointHostNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> dataEndpointHostNames;

    /**
     * List of private endpoint connections for a container registry.
     */
    @JsonProperty(value = "properties.privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /**
     * Whether or not public network access is allowed for the container
     * registry. Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /**
     * Whether to allow trusted Azure services to access a network restricted
     * registry. Possible values include: 'AzureServices', 'None'.
     */
    @JsonProperty(value = "properties.networkRuleBypassOptions")
    private NetworkRuleBypassOptions networkRuleBypassOptions;

    /**
     * Whether or not zone redundancy is enabled for this container registry.
     * Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.zoneRedundancy")
    private ZoneRedundancy zoneRedundancy;

    /**
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the SKU of the container registry.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the SKU of the container registry.
     *
     * @param sku the sku value to set
     * @return the RegistryInner object itself.
     */
    public RegistryInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the identity of the container registry.
     *
     * @return the identity value
     */
    public IdentityProperties identity() {
        return this.identity;
    }

    /**
     * Set the identity of the container registry.
     *
     * @param identity the identity value to set
     * @return the RegistryInner object itself.
     */
    public RegistryInner withIdentity(IdentityProperties identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the URL that can be used to log into the container registry.
     *
     * @return the loginServer value
     */
    public String loginServer() {
        return this.loginServer;
    }

    /**
     * Get the creation date of the container registry in ISO8601 format.
     *
     * @return the creationDate value
     */
    public DateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the provisioning state of the container registry at the time the operation was called. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status of the container registry at the time the operation was called.
     *
     * @return the status value
     */
    public Status status() {
        return this.status;
    }

    /**
     * Get the value that indicates whether the admin user is enabled.
     *
     * @return the adminUserEnabled value
     */
    public Boolean adminUserEnabled() {
        return this.adminUserEnabled;
    }

    /**
     * Set the value that indicates whether the admin user is enabled.
     *
     * @param adminUserEnabled the adminUserEnabled value to set
     * @return the RegistryInner object itself.
     */
    public RegistryInner withAdminUserEnabled(Boolean adminUserEnabled) {
        this.adminUserEnabled = adminUserEnabled;
        return this;
    }

    /**
     * Get the properties of the storage account for the container registry. Only applicable to Classic SKU.
     *
     * @return the storageAccount value
     */
    public StorageAccountProperties storageAccount() {
        return this.storageAccount;
    }

    /**
     * Set the properties of the storage account for the container registry. Only applicable to Classic SKU.
     *
     * @param storageAccount the storageAccount value to set
     * @return the RegistryInner object itself.
     */
    public RegistryInner withStorageAccount(StorageAccountProperties storageAccount) {
        this.storageAccount = storageAccount;
        return this;
    }

    /**
     * Get the network rule set for a container registry.
     *
     * @return the networkRuleSet value
     */
    public NetworkRuleSet networkRuleSet() {
        return this.networkRuleSet;
    }

    /**
     * Set the network rule set for a container registry.
     *
     * @param networkRuleSet the networkRuleSet value to set
     * @return the RegistryInner object itself.
     */
    public RegistryInner withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        this.networkRuleSet = networkRuleSet;
        return this;
    }

    /**
     * Get the policies for a container registry.
     *
     * @return the policies value
     */
    public Policies policies() {
        return this.policies;
    }

    /**
     * Set the policies for a container registry.
     *
     * @param policies the policies value to set
     * @return the RegistryInner object itself.
     */
    public RegistryInner withPolicies(Policies policies) {
        this.policies = policies;
        return this;
    }

    /**
     * Get the encryption settings of container registry.
     *
     * @return the encryption value
     */
    public EncryptionProperty encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption settings of container registry.
     *
     * @param encryption the encryption value to set
     * @return the RegistryInner object itself.
     */
    public RegistryInner withEncryption(EncryptionProperty encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get enable a single data endpoint per region for serving data.
     *
     * @return the dataEndpointEnabled value
     */
    public Boolean dataEndpointEnabled() {
        return this.dataEndpointEnabled;
    }

    /**
     * Set enable a single data endpoint per region for serving data.
     *
     * @param dataEndpointEnabled the dataEndpointEnabled value to set
     * @return the RegistryInner object itself.
     */
    public RegistryInner withDataEndpointEnabled(Boolean dataEndpointEnabled) {
        this.dataEndpointEnabled = dataEndpointEnabled;
        return this;
    }

    /**
     * Get list of host names that will serve data when dataEndpointEnabled is true.
     *
     * @return the dataEndpointHostNames value
     */
    public List<String> dataEndpointHostNames() {
        return this.dataEndpointHostNames;
    }

    /**
     * Get list of private endpoint connections for a container registry.
     *
     * @return the privateEndpointConnections value
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get whether or not public network access is allowed for the container registry. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the publicNetworkAccess value
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set whether or not public network access is allowed for the container registry. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set
     * @return the RegistryInner object itself.
     */
    public RegistryInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get whether to allow trusted Azure services to access a network restricted registry. Possible values include: 'AzureServices', 'None'.
     *
     * @return the networkRuleBypassOptions value
     */
    public NetworkRuleBypassOptions networkRuleBypassOptions() {
        return this.networkRuleBypassOptions;
    }

    /**
     * Set whether to allow trusted Azure services to access a network restricted registry. Possible values include: 'AzureServices', 'None'.
     *
     * @param networkRuleBypassOptions the networkRuleBypassOptions value to set
     * @return the RegistryInner object itself.
     */
    public RegistryInner withNetworkRuleBypassOptions(NetworkRuleBypassOptions networkRuleBypassOptions) {
        this.networkRuleBypassOptions = networkRuleBypassOptions;
        return this;
    }

    /**
     * Get whether or not zone redundancy is enabled for this container registry. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the zoneRedundancy value
     */
    public ZoneRedundancy zoneRedundancy() {
        return this.zoneRedundancy;
    }

    /**
     * Set whether or not zone redundancy is enabled for this container registry. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param zoneRedundancy the zoneRedundancy value to set
     * @return the RegistryInner object itself.
     */
    public RegistryInner withZoneRedundancy(ZoneRedundancy zoneRedundancy) {
        this.zoneRedundancy = zoneRedundancy;
        return this;
    }

    /**
     * Get metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value
     */
    public SystemData systemData() {
        return this.systemData;
    }

}
