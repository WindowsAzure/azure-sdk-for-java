/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters that can be used to update an existing Data Lake Analytics
 * account.
 */
@JsonFlatten
public class DataLakeAnalyticsAccountUpdateParameters {
    /**
     * Resource tags.
     */
    private Map<String, String> tags;

    /**
     * the maximum supported degree of parallelism for this account.
     */
    @JsonProperty(value = "properties.maxDegreeOfParallelism")
    private Integer maxDegreeOfParallelism;

    /**
     * the number of days that job metadata is retained.
     */
    @JsonProperty(value = "properties.queryStoreRetention")
    private Integer queryStoreRetention;

    /**
     * the maximum supported jobs running under the account at the same time.
     */
    @JsonProperty(value = "properties.maxJobCount")
    private Integer maxJobCount;

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the DataLakeAnalyticsAccountUpdateParameters object itself.
     */
    public DataLakeAnalyticsAccountUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the maxDegreeOfParallelism value.
     *
     * @return the maxDegreeOfParallelism value
     */
    public Integer maxDegreeOfParallelism() {
        return this.maxDegreeOfParallelism;
    }

    /**
     * Set the maxDegreeOfParallelism value.
     *
     * @param maxDegreeOfParallelism the maxDegreeOfParallelism value to set
     * @return the DataLakeAnalyticsAccountUpdateParameters object itself.
     */
    public DataLakeAnalyticsAccountUpdateParameters withMaxDegreeOfParallelism(Integer maxDegreeOfParallelism) {
        this.maxDegreeOfParallelism = maxDegreeOfParallelism;
        return this;
    }

    /**
     * Get the queryStoreRetention value.
     *
     * @return the queryStoreRetention value
     */
    public Integer queryStoreRetention() {
        return this.queryStoreRetention;
    }

    /**
     * Set the queryStoreRetention value.
     *
     * @param queryStoreRetention the queryStoreRetention value to set
     * @return the DataLakeAnalyticsAccountUpdateParameters object itself.
     */
    public DataLakeAnalyticsAccountUpdateParameters withQueryStoreRetention(Integer queryStoreRetention) {
        this.queryStoreRetention = queryStoreRetention;
        return this;
    }

    /**
     * Get the maxJobCount value.
     *
     * @return the maxJobCount value
     */
    public Integer maxJobCount() {
        return this.maxJobCount;
    }

    /**
     * Set the maxJobCount value.
     *
     * @param maxJobCount the maxJobCount value to set
     * @return the DataLakeAnalyticsAccountUpdateParameters object itself.
     */
    public DataLakeAnalyticsAccountUpdateParameters withMaxJobCount(Integer maxJobCount) {
        this.maxJobCount = maxJobCount;
        return this;
    }

}
