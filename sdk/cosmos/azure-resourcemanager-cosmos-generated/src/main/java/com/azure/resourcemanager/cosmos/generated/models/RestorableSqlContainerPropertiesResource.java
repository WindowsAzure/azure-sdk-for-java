// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The resource of an Azure Cosmos DB SQL container event. */
@Fluent
public final class RestorableSqlContainerPropertiesResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorableSqlContainerPropertiesResource.class);

    /*
     * A system generated property. A unique identifier.
     */
    @JsonProperty(value = "_rid", access = JsonProperty.Access.WRITE_ONLY)
    private String rid;

    /*
     * The operation type of this container event.
     */
    @JsonProperty(value = "operationType", access = JsonProperty.Access.WRITE_ONLY)
    private OperationType operationType;

    /*
     * The when this container event happened.
     */
    @JsonProperty(value = "eventTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String eventTimestamp;

    /*
     * The name of this SQL container.
     */
    @JsonProperty(value = "ownerId", access = JsonProperty.Access.WRITE_ONLY)
    private String ownerId;

    /*
     * The resource ID of this SQL container.
     */
    @JsonProperty(value = "ownerResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String ownerResourceId;

    /*
     * Cosmos DB SQL container resource object
     */
    @JsonProperty(value = "container")
    private RestorableSqlContainerPropertiesResourceContainer container;

    /**
     * Get the rid property: A system generated property. A unique identifier.
     *
     * @return the rid value.
     */
    public String rid() {
        return this.rid;
    }

    /**
     * Get the operationType property: The operation type of this container event.
     *
     * @return the operationType value.
     */
    public OperationType operationType() {
        return this.operationType;
    }

    /**
     * Get the eventTimestamp property: The when this container event happened.
     *
     * @return the eventTimestamp value.
     */
    public String eventTimestamp() {
        return this.eventTimestamp;
    }

    /**
     * Get the ownerId property: The name of this SQL container.
     *
     * @return the ownerId value.
     */
    public String ownerId() {
        return this.ownerId;
    }

    /**
     * Get the ownerResourceId property: The resource ID of this SQL container.
     *
     * @return the ownerResourceId value.
     */
    public String ownerResourceId() {
        return this.ownerResourceId;
    }

    /**
     * Get the container property: Cosmos DB SQL container resource object.
     *
     * @return the container value.
     */
    public RestorableSqlContainerPropertiesResourceContainer container() {
        return this.container;
    }

    /**
     * Set the container property: Cosmos DB SQL container resource object.
     *
     * @param container the container value to set.
     * @return the RestorableSqlContainerPropertiesResource object itself.
     */
    public RestorableSqlContainerPropertiesResource withContainer(
        RestorableSqlContainerPropertiesResourceContainer container) {
        this.container = container;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (container() != null) {
            container().validate();
        }
    }
}
