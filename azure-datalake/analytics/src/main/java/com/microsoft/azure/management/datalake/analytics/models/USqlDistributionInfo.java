/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics catalog U-SQL distribution information object.
 */
public class USqlDistributionInfo {
    /**
     * the type of this distribution.
     */
    @JsonProperty(value = "type")
    private Integer type;

    /**
     * the list of directed columns in the distribution.
     */
    @JsonProperty(value = "keys")
    private List<USqlDirectedColumn> keys;

    /**
     * the count of indices using this distribution.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /**
     * the dynamic count of indices using this distribution.
     */
    @JsonProperty(value = "dynamicCount")
    private Integer dynamicCount;

    /**
     * Get the type of this distribution.
     *
     * @return the type value
     */
    public Integer type() {
        return this.type;
    }

    /**
     * Set the type of this distribution.
     *
     * @param type the type value to set
     * @return the USqlDistributionInfo object itself.
     */
    public USqlDistributionInfo withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * Get the list of directed columns in the distribution.
     *
     * @return the keys value
     */
    public List<USqlDirectedColumn> keys() {
        return this.keys;
    }

    /**
     * Set the list of directed columns in the distribution.
     *
     * @param keys the keys value to set
     * @return the USqlDistributionInfo object itself.
     */
    public USqlDistributionInfo withKeys(List<USqlDirectedColumn> keys) {
        this.keys = keys;
        return this;
    }

    /**
     * Get the count of indices using this distribution.
     *
     * @return the count value
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count of indices using this distribution.
     *
     * @param count the count value to set
     * @return the USqlDistributionInfo object itself.
     */
    public USqlDistributionInfo withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the dynamic count of indices using this distribution.
     *
     * @return the dynamicCount value
     */
    public Integer dynamicCount() {
        return this.dynamicCount;
    }

    /**
     * Set the dynamic count of indices using this distribution.
     *
     * @param dynamicCount the dynamicCount value to set
     * @return the USqlDistributionInfo object itself.
     */
    public USqlDistributionInfo withDynamicCount(Integer dynamicCount) {
        this.dynamicCount = dynamicCount;
        return this;
    }

}
