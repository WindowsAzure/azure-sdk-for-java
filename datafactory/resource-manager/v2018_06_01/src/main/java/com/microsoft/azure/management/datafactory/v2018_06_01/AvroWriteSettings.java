/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Avro write settings.
 */
public class AvroWriteSettings extends FormatWriteSettings {
    /**
     * Top level record name in write result, which is required in AVRO spec.
     */
    @JsonProperty(value = "recordName")
    private String recordName;

    /**
     * Record namespace in the write result.
     */
    @JsonProperty(value = "recordNamespace")
    private String recordNamespace;

    /**
     * Get top level record name in write result, which is required in AVRO spec.
     *
     * @return the recordName value
     */
    public String recordName() {
        return this.recordName;
    }

    /**
     * Set top level record name in write result, which is required in AVRO spec.
     *
     * @param recordName the recordName value to set
     * @return the AvroWriteSettings object itself.
     */
    public AvroWriteSettings withRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }

    /**
     * Get record namespace in the write result.
     *
     * @return the recordNamespace value
     */
    public String recordNamespace() {
        return this.recordNamespace;
    }

    /**
     * Set record namespace in the write result.
     *
     * @param recordNamespace the recordNamespace value to set
     * @return the AvroWriteSettings object itself.
     */
    public AvroWriteSettings withRecordNamespace(String recordNamespace) {
        this.recordNamespace = recordNamespace;
        return this;
    }

}
