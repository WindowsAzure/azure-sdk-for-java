// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A cognitive service resource provisioned with a key that is attached to a skillset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.CognitiveServicesByKey")
@JsonFlatten
@Fluent
public final class CognitiveServicesAccountKey extends CognitiveServicesAccount {
    /*
     * The key used to provision the cognitive service resource attached to a
     * skillset.
     */
    @JsonProperty(value = "key", required = true)
    private String key;

    /**
     * Creates an instance of CognitiveServicesAccountKey class.
     *
     * @param key the key value to set.
     */
    @JsonCreator
    public CognitiveServicesAccountKey(@JsonProperty(value = "key", required = true) String key) {
        this.key = key;
    }

    /**
     * Get the key property: The key used to provision the cognitive service resource attached to a skillset.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: The key used to provision the cognitive service resource attached to a skillset.
     *
     * @param key the key value to set.
     * @return the CognitiveServicesAccountKey object itself.
     */
    public CognitiveServicesAccountKey setKey(String key) {
        this.key = key;
        return this;
    }
}
