/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The unique key policy configuration for specifying uniqueness constraints on
 * documents in the collection in the Azure Cosmos DB service.
 */
public class UniqueKeyPolicy {
    /**
     * List of unique keys on that enforces uniqueness constraint on documents
     * in the collection in the Azure Cosmos DB service.
     */
    @JsonProperty(value = "uniqueKeys")
    private List<UniqueKey> uniqueKeys;

    /**
     * Get list of unique keys on that enforces uniqueness constraint on documents in the collection in the Azure Cosmos DB service.
     *
     * @return the uniqueKeys value
     */
    public List<UniqueKey> uniqueKeys() {
        return this.uniqueKeys;
    }

    /**
     * Set list of unique keys on that enforces uniqueness constraint on documents in the collection in the Azure Cosmos DB service.
     *
     * @param uniqueKeys the uniqueKeys value to set
     * @return the UniqueKeyPolicy object itself.
     */
    public UniqueKeyPolicy withUniqueKeys(List<UniqueKey> uniqueKeys) {
        this.uniqueKeys = uniqueKeys;
        return this;
    }

}
