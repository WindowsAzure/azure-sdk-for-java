// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The entity reference. */
@Fluent
public final class EntityReference {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EntityReference.class);

    /*
     * The type of this referenced entity.
     */
    @JsonProperty(value = "type")
    private IntegrationRuntimeEntityReferenceType type;

    /*
     * The name of this referenced entity.
     */
    @JsonProperty(value = "referenceName")
    private String referenceName;

    /**
     * Get the type property: The type of this referenced entity.
     *
     * @return the type value.
     */
    public IntegrationRuntimeEntityReferenceType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of this referenced entity.
     *
     * @param type the type value to set.
     * @return the EntityReference object itself.
     */
    public EntityReference withType(IntegrationRuntimeEntityReferenceType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the referenceName property: The name of this referenced entity.
     *
     * @return the referenceName value.
     */
    public String referenceName() {
        return this.referenceName;
    }

    /**
     * Set the referenceName property: The name of this referenced entity.
     *
     * @param referenceName the referenceName value to set.
     * @return the EntityReference object itself.
     */
    public EntityReference withReferenceName(String referenceName) {
        this.referenceName = referenceName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
