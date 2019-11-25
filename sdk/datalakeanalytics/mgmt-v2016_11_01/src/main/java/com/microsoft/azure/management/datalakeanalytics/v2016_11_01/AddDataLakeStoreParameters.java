/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2016_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters used to add a new Data Lake Store account.
 */
@JsonFlatten
public class AddDataLakeStoreParameters {
    /**
     * The optional suffix for the Data Lake Store account.
     */
    @JsonProperty(value = "properties.suffix")
    private String suffix;

    /**
     * Get the optional suffix for the Data Lake Store account.
     *
     * @return the suffix value
     */
    public String suffix() {
        return this.suffix;
    }

    /**
     * Set the optional suffix for the Data Lake Store account.
     *
     * @param suffix the suffix value to set
     * @return the AddDataLakeStoreParameters object itself.
     */
    public AddDataLakeStoreParameters withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

}
