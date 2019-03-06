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
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.LinkedServiceInner;

/**
 * Custom linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CustomDataSource")
public class CustomDataSourceLinkedService extends LinkedServiceInner {
    /**
     * Custom linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private Object typeProperties;

    /**
     * Get custom linked service properties.
     *
     * @return the typeProperties value
     */
    public Object typeProperties() {
        return this.typeProperties;
    }

    /**
     * Set custom linked service properties.
     *
     * @param typeProperties the typeProperties value to set
     * @return the CustomDataSourceLinkedService object itself.
     */
    public CustomDataSourceLinkedService withTypeProperties(Object typeProperties) {
        this.typeProperties = typeProperties;
        return this;
    }

}
