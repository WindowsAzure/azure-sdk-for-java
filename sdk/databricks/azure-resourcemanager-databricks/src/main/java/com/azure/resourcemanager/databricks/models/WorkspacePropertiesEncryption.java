// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Encryption properties for databricks workspace. */
@Fluent
public final class WorkspacePropertiesEncryption {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkspacePropertiesEncryption.class);

    /*
     * Encryption entities definition for the workspace.
     */
    @JsonProperty(value = "entities", required = true)
    private EncryptionEntitiesDefinition entities;

    /**
     * Get the entities property: Encryption entities definition for the workspace.
     *
     * @return the entities value.
     */
    public EncryptionEntitiesDefinition entities() {
        return this.entities;
    }

    /**
     * Set the entities property: Encryption entities definition for the workspace.
     *
     * @param entities the entities value to set.
     * @return the WorkspacePropertiesEncryption object itself.
     */
    public WorkspacePropertiesEncryption withEntities(EncryptionEntitiesDefinition entities) {
        this.entities = entities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (entities() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property entities in model WorkspacePropertiesEncryption"));
        } else {
            entities().validate();
        }
    }
}
