// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base type for describing any cognitive service resource attached to a skillset. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@odata.type",
        defaultImpl = CognitiveServicesAccount.class)
@JsonTypeName("CognitiveServicesAccount")
@JsonSubTypes({
    @JsonSubTypes.Type(
            name = "#Microsoft.Azure.Search.DefaultCognitiveServices",
            value = DefaultCognitiveServicesAccount.class),
    @JsonSubTypes.Type(
            name = "#Microsoft.Azure.Search.CognitiveServicesByKey",
            value = CognitiveServicesAccountKey.class)
})
@Fluent
public abstract class CognitiveServicesAccount {
    /*
     * Description of the cognitive service resource attached to a skillset.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the description property: Description of the cognitive service resource attached to a skillset.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Description of the cognitive service resource attached to a skillset.
     *
     * @param description the description value to set.
     * @return the CognitiveServicesAccount object itself.
     */
    public CognitiveServicesAccount setDescription(String description) {
        this.description = description;
        return this;
    }
}
