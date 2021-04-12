// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.models.AccountEncryption;
import com.azure.resourcemanager.mediaservices.models.MediaServiceIdentity;
import com.azure.resourcemanager.mediaservices.models.StorageAccount;
import com.azure.resourcemanager.mediaservices.models.StorageAuthentication;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/** A Media Services account. */
@JsonFlatten
@Fluent
public class MediaServiceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MediaServiceInner.class);

    /*
     * The Managed Identity for the Media Services account.
     */
    @JsonProperty(value = "identity")
    private MediaServiceIdentity identity;

    /*
     * The system metadata relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The Media Services account ID.
     */
    @JsonProperty(value = "properties.mediaServiceId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID mediaServiceId;

    /*
     * The storage accounts for this resource.
     */
    @JsonProperty(value = "properties.storageAccounts")
    private List<StorageAccount> storageAccounts;

    /*
     * The storageAuthentication property.
     */
    @JsonProperty(value = "properties.storageAuthentication")
    private StorageAuthentication storageAuthentication;

    /*
     * The account encryption properties.
     */
    @JsonProperty(value = "properties.encryption")
    private AccountEncryption encryption;

    /**
     * Get the identity property: The Managed Identity for the Media Services account.
     *
     * @return the identity value.
     */
    public MediaServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The Managed Identity for the Media Services account.
     *
     * @param identity the identity value to set.
     * @return the MediaServiceInner object itself.
     */
    public MediaServiceInner withIdentity(MediaServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the mediaServiceId property: The Media Services account ID.
     *
     * @return the mediaServiceId value.
     */
    public UUID mediaServiceId() {
        return this.mediaServiceId;
    }

    /**
     * Get the storageAccounts property: The storage accounts for this resource.
     *
     * @return the storageAccounts value.
     */
    public List<StorageAccount> storageAccounts() {
        return this.storageAccounts;
    }

    /**
     * Set the storageAccounts property: The storage accounts for this resource.
     *
     * @param storageAccounts the storageAccounts value to set.
     * @return the MediaServiceInner object itself.
     */
    public MediaServiceInner withStorageAccounts(List<StorageAccount> storageAccounts) {
        this.storageAccounts = storageAccounts;
        return this;
    }

    /**
     * Get the storageAuthentication property: The storageAuthentication property.
     *
     * @return the storageAuthentication value.
     */
    public StorageAuthentication storageAuthentication() {
        return this.storageAuthentication;
    }

    /**
     * Set the storageAuthentication property: The storageAuthentication property.
     *
     * @param storageAuthentication the storageAuthentication value to set.
     * @return the MediaServiceInner object itself.
     */
    public MediaServiceInner withStorageAuthentication(StorageAuthentication storageAuthentication) {
        this.storageAuthentication = storageAuthentication;
        return this;
    }

    /**
     * Get the encryption property: The account encryption properties.
     *
     * @return the encryption value.
     */
    public AccountEncryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: The account encryption properties.
     *
     * @param encryption the encryption value to set.
     * @return the MediaServiceInner object itself.
     */
    public MediaServiceInner withEncryption(AccountEncryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MediaServiceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MediaServiceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (storageAccounts() != null) {
            storageAccounts().forEach(e -> e.validate());
        }
        if (encryption() != null) {
            encryption().validate();
        }
    }
}
