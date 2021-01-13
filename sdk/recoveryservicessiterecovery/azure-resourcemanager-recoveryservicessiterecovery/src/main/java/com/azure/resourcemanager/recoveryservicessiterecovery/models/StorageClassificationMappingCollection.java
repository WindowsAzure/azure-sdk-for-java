// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.StorageClassificationMappingInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Collection of storage mapping details. */
@Fluent
public final class StorageClassificationMappingCollection {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageClassificationMappingCollection.class);

    /*
     * The storage details.
     */
    @JsonProperty(value = "value")
    private List<StorageClassificationMappingInner> value;

    /*
     * The value of next link.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The storage details.
     *
     * @return the value value.
     */
    public List<StorageClassificationMappingInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The storage details.
     *
     * @param value the value value to set.
     * @return the StorageClassificationMappingCollection object itself.
     */
    public StorageClassificationMappingCollection withValue(List<StorageClassificationMappingInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The value of next link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The value of next link.
     *
     * @param nextLink the nextLink value to set.
     * @return the StorageClassificationMappingCollection object itself.
     */
    public StorageClassificationMappingCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
