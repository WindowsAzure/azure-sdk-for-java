/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation.DatasetInner;

/**
 * The Open Data Protocol (OData) resource dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = ODataResourceDataset.class)
@JsonTypeName("ODataResource")
@JsonFlatten
public class ODataResourceDataset extends DatasetInner {
    /**
     * The OData resource path. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.path")
    private Object path;

    /**
     * Get the OData resource path. Type: string (or Expression with resultType string).
     *
     * @return the path value
     */
    public Object path() {
        return this.path;
    }

    /**
     * Set the OData resource path. Type: string (or Expression with resultType string).
     *
     * @param path the path value to set
     * @return the ODataResourceDataset object itself.
     */
    public ODataResourceDataset withPath(Object path) {
        this.path = path;
        return this;
    }

}
