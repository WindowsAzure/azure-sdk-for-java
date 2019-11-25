/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2017_10_01.implementation;

import com.microsoft.azure.management.storage.v2017_10_01.SkuName;
import com.microsoft.azure.management.storage.v2017_10_01.SkuTier;
import com.microsoft.azure.management.storage.v2017_10_01.Kind;
import java.util.List;
import com.microsoft.azure.management.storage.v2017_10_01.SKUCapability;
import com.microsoft.azure.management.storage.v2017_10_01.Restriction;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SKU of the storage account.
 */
public class SkuInner {
    /**
     * Gets or sets the sku name. Required for account creation; optional for
     * update. Note that in older versions, sku name was called accountType.
     * Possible values include: 'Standard_LRS', 'Standard_GRS',
     * 'Standard_RAGRS', 'Standard_ZRS', 'Premium_LRS'.
     */
    @JsonProperty(value = "name", required = true)
    private SkuName name;

    /**
     * Gets the sku tier. This is based on the SKU name. Possible values
     * include: 'Standard', 'Premium'.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private SkuTier tier;

    /**
     * The type of the resource, usually it is 'storageAccounts'.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /**
     * Indicates the type of storage account. Possible values include:
     * 'Storage', 'StorageV2', 'BlobStorage'.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private Kind kind;

    /**
     * The set of locations that the SKU is available. This will be supported
     * and registered Azure Geo Regions (e.g. West US, East US, Southeast Asia,
     * etc.).
     */
    @JsonProperty(value = "locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> locations;

    /**
     * The capability information in the specified sku, including file
     * encryption, network acls, change notification, etc.
     */
    @JsonProperty(value = "capabilities", access = JsonProperty.Access.WRITE_ONLY)
    private List<SKUCapability> capabilities;

    /**
     * The restrictions because of which SKU cannot be used. This is empty if
     * there are no restrictions.
     */
    @JsonProperty(value = "restrictions")
    private List<Restriction> restrictions;

    /**
     * Get gets or sets the sku name. Required for account creation; optional for update. Note that in older versions, sku name was called accountType. Possible values include: 'Standard_LRS', 'Standard_GRS', 'Standard_RAGRS', 'Standard_ZRS', 'Premium_LRS'.
     *
     * @return the name value
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set gets or sets the sku name. Required for account creation; optional for update. Note that in older versions, sku name was called accountType. Possible values include: 'Standard_LRS', 'Standard_GRS', 'Standard_RAGRS', 'Standard_ZRS', 'Premium_LRS'.
     *
     * @param name the name value to set
     * @return the SkuInner object itself.
     */
    public SkuInner withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get gets the sku tier. This is based on the SKU name. Possible values include: 'Standard', 'Premium'.
     *
     * @return the tier value
     */
    public SkuTier tier() {
        return this.tier;
    }

    /**
     * Get the type of the resource, usually it is 'storageAccounts'.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get indicates the type of storage account. Possible values include: 'Storage', 'StorageV2', 'BlobStorage'.
     *
     * @return the kind value
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Get the set of locations that the SKU is available. This will be supported and registered Azure Geo Regions (e.g. West US, East US, Southeast Asia, etc.).
     *
     * @return the locations value
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Get the capability information in the specified sku, including file encryption, network acls, change notification, etc.
     *
     * @return the capabilities value
     */
    public List<SKUCapability> capabilities() {
        return this.capabilities;
    }

    /**
     * Get the restrictions because of which SKU cannot be used. This is empty if there are no restrictions.
     *
     * @return the restrictions value
     */
    public List<Restriction> restrictions() {
        return this.restrictions;
    }

    /**
     * Set the restrictions because of which SKU cannot be used. This is empty if there are no restrictions.
     *
     * @param restrictions the restrictions value to set
     * @return the SkuInner object itself.
     */
    public SkuInner withRestrictions(List<Restriction> restrictions) {
        this.restrictions = restrictions;
        return this;
    }

}
