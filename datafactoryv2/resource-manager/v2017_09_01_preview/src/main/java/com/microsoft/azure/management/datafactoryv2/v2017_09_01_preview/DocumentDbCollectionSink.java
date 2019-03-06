/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Document Database Collection sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DocumentDbCollectionSink")
public class DocumentDbCollectionSink extends CopySink {
    /**
     * Nested properties separator. Default is . (dot). Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "nestingSeparator")
    private Object nestingSeparator;

    /**
     * Get nested properties separator. Default is . (dot). Type: string (or Expression with resultType string).
     *
     * @return the nestingSeparator value
     */
    public Object nestingSeparator() {
        return this.nestingSeparator;
    }

    /**
     * Set nested properties separator. Default is . (dot). Type: string (or Expression with resultType string).
     *
     * @param nestingSeparator the nestingSeparator value to set
     * @return the DocumentDbCollectionSink object itself.
     */
    public DocumentDbCollectionSink withNestingSeparator(Object nestingSeparator) {
        this.nestingSeparator = nestingSeparator;
        return this;
    }

}
