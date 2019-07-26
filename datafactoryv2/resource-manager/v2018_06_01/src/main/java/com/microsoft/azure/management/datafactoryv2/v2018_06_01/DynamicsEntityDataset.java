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
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.DatasetInner;

/**
 * The Dynamics entity dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DynamicsEntity")
@JsonFlatten
public class DynamicsEntityDataset extends DatasetInner {
    /**
     * The logical name of the entity. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.entityName")
    private Object entityName;

    /**
     * Get the logical name of the entity. Type: string (or Expression with resultType string).
     *
     * @return the entityName value
     */
    public Object entityName() {
        return this.entityName;
    }

    /**
     * Set the logical name of the entity. Type: string (or Expression with resultType string).
     *
     * @param entityName the entityName value to set
     * @return the DynamicsEntityDataset object itself.
     */
    public DynamicsEntityDataset withEntityName(Object entityName) {
        this.entityName = entityName;
        return this;
    }

}
