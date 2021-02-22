// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.models.AccountEncryption;
import com.azure.resourcemanager.netapp.models.ActiveDirectory;
import com.azure.resourcemanager.netapp.models.SystemData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** NetApp account resource. */
@JsonFlatten
@Fluent
public class NetAppAccountInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetAppAccountInner.class);

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Azure lifecycle management
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Active Directories
     */
    @JsonProperty(value = "properties.activeDirectories")
    private List<ActiveDirectory> activeDirectories;

    /*
     * Encryption settings
     */
    @JsonProperty(value = "properties.encryption")
    private AccountEncryption encryption;

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the activeDirectories property: Active Directories.
     *
     * @return the activeDirectories value.
     */
    public List<ActiveDirectory> activeDirectories() {
        return this.activeDirectories;
    }

    /**
     * Set the activeDirectories property: Active Directories.
     *
     * @param activeDirectories the activeDirectories value to set.
     * @return the NetAppAccountInner object itself.
     */
    public NetAppAccountInner withActiveDirectories(List<ActiveDirectory> activeDirectories) {
        this.activeDirectories = activeDirectories;
        return this;
    }

    /**
     * Get the encryption property: Encryption settings.
     *
     * @return the encryption value.
     */
    public AccountEncryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Encryption settings.
     *
     * @param encryption the encryption value to set.
     * @return the NetAppAccountInner object itself.
     */
    public NetAppAccountInner withEncryption(AccountEncryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetAppAccountInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetAppAccountInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (systemData() != null) {
            systemData().validate();
        }
        if (activeDirectories() != null) {
            activeDirectories().forEach(e -> e.validate());
        }
        if (encryption() != null) {
            encryption().validate();
        }
    }
}
