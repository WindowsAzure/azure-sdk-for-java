// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.models.NetworkRuleSet;
import com.azure.resourcemanager.containerregistry.models.Policies;
import com.azure.resourcemanager.containerregistry.models.ProvisioningState;
import com.azure.resourcemanager.containerregistry.models.Sku;
import com.azure.resourcemanager.containerregistry.models.Status;
import com.azure.resourcemanager.containerregistry.models.StorageAccountProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** An object that represents a container registry. */
@JsonFlatten
@Fluent
public class RegistryInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegistryInner.class);

    /*
     * The SKU of the container registry.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /*
     * The URL that can be used to log into the container registry.
     */
    @JsonProperty(value = "properties.loginServer", access = JsonProperty.Access.WRITE_ONLY)
    private String loginServer;

    /*
     * The creation date of the container registry in ISO8601 format.
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationDate;

    /*
     * The provisioning state of the container registry at the time the
     * operation was called.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The status of the container registry at the time the operation was
     * called.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private Status status;

    /*
     * The value that indicates whether the admin user is enabled.
     */
    @JsonProperty(value = "properties.adminUserEnabled")
    private Boolean adminUserEnabled;

    /*
     * The properties of the storage account for the container registry. Only
     * applicable to Classic SKU.
     */
    @JsonProperty(value = "properties.storageAccount")
    private StorageAccountProperties storageAccount;

    /*
     * The network rule set for a container registry.
     */
    @JsonProperty(value = "properties.networkRuleSet")
    private NetworkRuleSet networkRuleSet;

    /*
     * The policies for a container registry.
     */
    @JsonProperty(value = "properties.policies")
    private Policies policies;

    /**
     * Get the sku property: The SKU of the container registry.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the container registry.
     *
     * @param sku the sku value to set.
     * @return the RegistryInner object itself.
     */
    public RegistryInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the loginServer property: The URL that can be used to log into the container registry.
     *
     * @return the loginServer value.
     */
    public String loginServer() {
        return this.loginServer;
    }

    /**
     * Get the creationDate property: The creation date of the container registry in ISO8601 format.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the provisioningState property: The provisioning state of the container registry at the time the operation
     * was called.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status property: The status of the container registry at the time the operation was called.
     *
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Get the adminUserEnabled property: The value that indicates whether the admin user is enabled.
     *
     * @return the adminUserEnabled value.
     */
    public Boolean adminUserEnabled() {
        return this.adminUserEnabled;
    }

    /**
     * Set the adminUserEnabled property: The value that indicates whether the admin user is enabled.
     *
     * @param adminUserEnabled the adminUserEnabled value to set.
     * @return the RegistryInner object itself.
     */
    public RegistryInner withAdminUserEnabled(Boolean adminUserEnabled) {
        this.adminUserEnabled = adminUserEnabled;
        return this;
    }

    /**
     * Get the storageAccount property: The properties of the storage account for the container registry. Only
     * applicable to Classic SKU.
     *
     * @return the storageAccount value.
     */
    public StorageAccountProperties storageAccount() {
        return this.storageAccount;
    }

    /**
     * Set the storageAccount property: The properties of the storage account for the container registry. Only
     * applicable to Classic SKU.
     *
     * @param storageAccount the storageAccount value to set.
     * @return the RegistryInner object itself.
     */
    public RegistryInner withStorageAccount(StorageAccountProperties storageAccount) {
        this.storageAccount = storageAccount;
        return this;
    }

    /**
     * Get the networkRuleSet property: The network rule set for a container registry.
     *
     * @return the networkRuleSet value.
     */
    public NetworkRuleSet networkRuleSet() {
        return this.networkRuleSet;
    }

    /**
     * Set the networkRuleSet property: The network rule set for a container registry.
     *
     * @param networkRuleSet the networkRuleSet value to set.
     * @return the RegistryInner object itself.
     */
    public RegistryInner withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        this.networkRuleSet = networkRuleSet;
        return this;
    }

    /**
     * Get the policies property: The policies for a container registry.
     *
     * @return the policies value.
     */
    public Policies policies() {
        return this.policies;
    }

    /**
     * Set the policies property: The policies for a container registry.
     *
     * @param policies the policies value to set.
     * @return the RegistryInner object itself.
     */
    public RegistryInner withPolicies(Policies policies) {
        this.policies = policies;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model RegistryInner"));
        } else {
            sku().validate();
        }
        if (status() != null) {
            status().validate();
        }
        if (storageAccount() != null) {
            storageAccount().validate();
        }
        if (networkRuleSet() != null) {
            networkRuleSet().validate();
        }
        if (policies() != null) {
            policies().validate();
        }
    }
}
