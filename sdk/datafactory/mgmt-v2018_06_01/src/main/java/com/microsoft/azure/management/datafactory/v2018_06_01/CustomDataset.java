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
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.DatasetInner;

/**
 * The custom dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = CustomDataset.class)
@JsonTypeName("CustomDataset")
public class CustomDataset extends DatasetInner {
    /**
     * Custom dataset properties.
     */
    @JsonProperty(value = "typeProperties")
    private Object typeProperties;

    /**
     * Get custom dataset properties.
     *
     * @return the typeProperties value
     */
    public Object typeProperties() {
        return this.typeProperties;
    }

    /**
     * Set custom dataset properties.
     *
     * @param typeProperties the typeProperties value to set
     * @return the CustomDataset object itself.
     */
    public CustomDataset withTypeProperties(Object typeProperties) {
        this.typeProperties = typeProperties;
        return this;
    }

}
