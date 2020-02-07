/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Dynamics sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = DynamicsSink.class)
@JsonTypeName("DynamicsSink")
public class DynamicsSink extends CopySink {
    /**
     * The write behavior for the operation.
     */
    @JsonProperty(value = "writeBehavior", required = true)
    private String writeBehavior;

    /**
     * The flag indicating whether ignore null values from input dataset
     * (except key fields) during write operation. Default is false. Type:
     * boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "ignoreNullValues")
    private Object ignoreNullValues;

    /**
     * The logical name of the alternate key which will be used when upserting
     * records. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "alternateKeyName")
    private Object alternateKeyName;

    /**
     * Creates an instance of DynamicsSink class.
     */
    public DynamicsSink() {
        writeBehavior = "Upsert";
    }

    /**
     * Get the write behavior for the operation.
     *
     * @return the writeBehavior value
     */
    public String writeBehavior() {
        return this.writeBehavior;
    }

    /**
     * Set the write behavior for the operation.
     *
     * @param writeBehavior the writeBehavior value to set
     * @return the DynamicsSink object itself.
     */
    public DynamicsSink withWriteBehavior(String writeBehavior) {
        this.writeBehavior = writeBehavior;
        return this;
    }

    /**
     * Get the flag indicating whether ignore null values from input dataset (except key fields) during write operation. Default is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the ignoreNullValues value
     */
    public Object ignoreNullValues() {
        return this.ignoreNullValues;
    }

    /**
     * Set the flag indicating whether ignore null values from input dataset (except key fields) during write operation. Default is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param ignoreNullValues the ignoreNullValues value to set
     * @return the DynamicsSink object itself.
     */
    public DynamicsSink withIgnoreNullValues(Object ignoreNullValues) {
        this.ignoreNullValues = ignoreNullValues;
        return this;
    }

    /**
     * Get the logical name of the alternate key which will be used when upserting records. Type: string (or Expression with resultType string).
     *
     * @return the alternateKeyName value
     */
    public Object alternateKeyName() {
        return this.alternateKeyName;
    }

    /**
     * Set the logical name of the alternate key which will be used when upserting records. Type: string (or Expression with resultType string).
     *
     * @param alternateKeyName the alternateKeyName value to set
     * @return the DynamicsSink object itself.
     */
    public DynamicsSink withAlternateKeyName(Object alternateKeyName) {
        this.alternateKeyName = alternateKeyName;
        return this;
    }

}
