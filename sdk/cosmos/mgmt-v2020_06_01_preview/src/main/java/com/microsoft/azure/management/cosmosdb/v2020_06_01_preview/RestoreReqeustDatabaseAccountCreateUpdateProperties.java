/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Properties to restore Azure Cosmos DB database account.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "createMode", defaultImpl = RestoreReqeustDatabaseAccountCreateUpdateProperties.class)
@JsonTypeName("Restore")
public class RestoreReqeustDatabaseAccountCreateUpdateProperties extends DatabaseAccountCreateUpdateProperties {
    /**
     * Parameters to indicate the information about the restore.
     */
    @JsonProperty(value = "restoreParameters")
    private RestoreParameters restoreParameters;

    /**
     * Get parameters to indicate the information about the restore.
     *
     * @return the restoreParameters value
     */
    public RestoreParameters restoreParameters() {
        return this.restoreParameters;
    }

    /**
     * Set parameters to indicate the information about the restore.
     *
     * @param restoreParameters the restoreParameters value to set
     * @return the RestoreReqeustDatabaseAccountCreateUpdateProperties object itself.
     */
    public RestoreReqeustDatabaseAccountCreateUpdateProperties withRestoreParameters(RestoreParameters restoreParameters) {
        this.restoreParameters = restoreParameters;
        return this;
    }

}
