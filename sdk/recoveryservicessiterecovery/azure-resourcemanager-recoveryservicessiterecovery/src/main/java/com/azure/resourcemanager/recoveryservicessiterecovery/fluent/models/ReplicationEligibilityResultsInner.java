// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationEligibilityResultsProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Replication eligibility results response model. */
@Immutable
public final class ReplicationEligibilityResultsInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReplicationEligibilityResultsInner.class);

    /*
     * Gets the name of this object.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Gets the object type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Gets Unique ARM identifier for this object.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Gets properties model for replication eligibility results API.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicationEligibilityResultsProperties properties;

    /**
     * Get the name property: Gets the name of this object.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Gets the object type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the id property: Gets Unique ARM identifier for this object.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the properties property: Gets properties model for replication eligibility results API.
     *
     * @return the properties value.
     */
    public ReplicationEligibilityResultsProperties properties() {
        return this.properties;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
