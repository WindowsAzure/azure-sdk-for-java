/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.datalake.analytics.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics catalog item.
 */
public class CatalogItem {
    /**
     * the name of the Data Lake Analytics account.
     */
    @JsonProperty(value = "computeAccountName")
    private String computeAccountName;

    /**
     * the version of the catalog item.
     */
    @JsonProperty(value = "version")
    private UUID version;

    /**
     * Get the name of the Data Lake Analytics account.
     *
     * @return the computeAccountName value
     */
    public String computeAccountName() {
        return this.computeAccountName;
    }

    /**
     * Set the name of the Data Lake Analytics account.
     *
     * @param computeAccountName the computeAccountName value to set
     * @return the CatalogItem object itself.
     */
    public CatalogItem withComputeAccountName(String computeAccountName) {
        this.computeAccountName = computeAccountName;
        return this;
    }

    /**
     * Get the version of the catalog item.
     *
     * @return the version value
     */
    public UUID version() {
        return this.version;
    }

    /**
     * Set the version of the catalog item.
     *
     * @param version the version value to set
     * @return the CatalogItem object itself.
     */
    public CatalogItem withVersion(UUID version) {
        this.version = version;
        return this;
    }

}
