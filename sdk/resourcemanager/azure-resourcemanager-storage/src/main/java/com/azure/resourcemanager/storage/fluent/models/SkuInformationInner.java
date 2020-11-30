// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.models.Kind;
import com.azure.resourcemanager.storage.models.Restriction;
import com.azure.resourcemanager.storage.models.SkuCapability;
import com.azure.resourcemanager.storage.models.SkuName;
import com.azure.resourcemanager.storage.models.SkuTier;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Storage SKU and its properties. */
@Fluent
public final class SkuInformationInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SkuInformationInner.class);

    /*
     * The SKU name. Required for account creation; optional for update. Note
     * that in older versions, SKU name was called accountType.
     */
    @JsonProperty(value = "name", required = true)
    private SkuName name;

    /*
     * The SKU tier. This is based on the SKU name.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private SkuTier tier;

    /*
     * The type of the resource, usually it is 'storageAccounts'.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /*
     * Indicates the type of storage account.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private Kind kind;

    /*
     * The set of locations that the SKU is available. This will be supported
     * and registered Azure Geo Regions (e.g. West US, East US, Southeast Asia,
     * etc.).
     */
    @JsonProperty(value = "locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> locations;

    /*
     * The capability information in the specified SKU, including file
     * encryption, network ACLs, change notification, etc.
     */
    @JsonProperty(value = "capabilities", access = JsonProperty.Access.WRITE_ONLY)
    private List<SkuCapability> capabilities;

    /*
     * The restrictions because of which SKU cannot be used. This is empty if
     * there are no restrictions.
     */
    @JsonProperty(value = "restrictions")
    private List<Restriction> restrictions;

    /**
     * Get the name property: The SKU name. Required for account creation; optional for update. Note that in older
     * versions, SKU name was called accountType.
     *
     * @return the name value.
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the name property: The SKU name. Required for account creation; optional for update. Note that in older
     * versions, SKU name was called accountType.
     *
     * @param name the name value to set.
     * @return the SkuInformationInner object itself.
     */
    public SkuInformationInner withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The SKU tier. This is based on the SKU name.
     *
     * @return the tier value.
     */
    public SkuTier tier() {
        return this.tier;
    }

    /**
     * Get the resourceType property: The type of the resource, usually it is 'storageAccounts'.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the kind property: Indicates the type of storage account.
     *
     * @return the kind value.
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Get the locations property: The set of locations that the SKU is available. This will be supported and registered
     * Azure Geo Regions (e.g. West US, East US, Southeast Asia, etc.).
     *
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Get the capabilities property: The capability information in the specified SKU, including file encryption,
     * network ACLs, change notification, etc.
     *
     * @return the capabilities value.
     */
    public List<SkuCapability> capabilities() {
        return this.capabilities;
    }

    /**
     * Get the restrictions property: The restrictions because of which SKU cannot be used. This is empty if there are
     * no restrictions.
     *
     * @return the restrictions value.
     */
    public List<Restriction> restrictions() {
        return this.restrictions;
    }

    /**
     * Set the restrictions property: The restrictions because of which SKU cannot be used. This is empty if there are
     * no restrictions.
     *
     * @param restrictions the restrictions value to set.
     * @return the SkuInformationInner object itself.
     */
    public SkuInformationInner withRestrictions(List<Restriction> restrictions) {
        this.restrictions = restrictions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model SkuInformationInner"));
        }
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
        }
        if (restrictions() != null) {
            restrictions().forEach(e -> e.validate());
        }
    }
}
