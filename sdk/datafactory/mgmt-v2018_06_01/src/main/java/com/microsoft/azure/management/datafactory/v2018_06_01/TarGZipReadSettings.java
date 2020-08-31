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
 * The TarGZip compression read settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = TarGZipReadSettings.class)
@JsonTypeName("TarGZipReadSettings")
public class TarGZipReadSettings extends CompressionReadSettings {
    /**
     * Preserve the compression file name as folder path. Type: boolean (or
     * Expression with resultType boolean).
     */
    @JsonProperty(value = "preserveCompressionFileNameAsFolder")
    private Object preserveCompressionFileNameAsFolder;

    /**
     * Get preserve the compression file name as folder path. Type: boolean (or Expression with resultType boolean).
     *
     * @return the preserveCompressionFileNameAsFolder value
     */
    public Object preserveCompressionFileNameAsFolder() {
        return this.preserveCompressionFileNameAsFolder;
    }

    /**
     * Set preserve the compression file name as folder path. Type: boolean (or Expression with resultType boolean).
     *
     * @param preserveCompressionFileNameAsFolder the preserveCompressionFileNameAsFolder value to set
     * @return the TarGZipReadSettings object itself.
     */
    public TarGZipReadSettings withPreserveCompressionFileNameAsFolder(Object preserveCompressionFileNameAsFolder) {
        this.preserveCompressionFileNameAsFolder = preserveCompressionFileNameAsFolder;
        return this;
    }

}
