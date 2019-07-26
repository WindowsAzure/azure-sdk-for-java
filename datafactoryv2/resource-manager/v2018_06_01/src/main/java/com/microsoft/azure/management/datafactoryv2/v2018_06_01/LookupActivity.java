/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Lookup activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Lookup")
@JsonFlatten
public class LookupActivity extends ExecutionActivity {
    /**
     * Dataset-specific source properties, same as copy activity source.
     */
    @JsonProperty(value = "typeProperties.source", required = true)
    private CopySource source;

    /**
     * Lookup activity dataset reference.
     */
    @JsonProperty(value = "typeProperties.dataset", required = true)
    private DatasetReference dataset;

    /**
     * Whether to return first row or all rows. Default value is true. Type:
     * boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "typeProperties.firstRowOnly")
    private Object firstRowOnly;

    /**
     * Get dataset-specific source properties, same as copy activity source.
     *
     * @return the source value
     */
    public CopySource source() {
        return this.source;
    }

    /**
     * Set dataset-specific source properties, same as copy activity source.
     *
     * @param source the source value to set
     * @return the LookupActivity object itself.
     */
    public LookupActivity withSource(CopySource source) {
        this.source = source;
        return this;
    }

    /**
     * Get lookup activity dataset reference.
     *
     * @return the dataset value
     */
    public DatasetReference dataset() {
        return this.dataset;
    }

    /**
     * Set lookup activity dataset reference.
     *
     * @param dataset the dataset value to set
     * @return the LookupActivity object itself.
     */
    public LookupActivity withDataset(DatasetReference dataset) {
        this.dataset = dataset;
        return this;
    }

    /**
     * Get whether to return first row or all rows. Default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @return the firstRowOnly value
     */
    public Object firstRowOnly() {
        return this.firstRowOnly;
    }

    /**
     * Set whether to return first row or all rows. Default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @param firstRowOnly the firstRowOnly value to set
     * @return the LookupActivity object itself.
     */
    public LookupActivity withFirstRowOnly(Object firstRowOnly) {
        this.firstRowOnly = firstRowOnly;
        return this;
    }

}
