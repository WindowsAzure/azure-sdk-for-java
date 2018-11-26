/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Lake Store account properties information.
 */
public class DataLakeStoreAccountInfoProperties {
    /**
     * the optional suffix for the Data Lake Store account.
     */
    @JsonProperty(value = "suffix")
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
     * @return the DataLakeStoreAccountInfoProperties object itself.
     */
    public DataLakeStoreAccountInfoProperties withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

}
