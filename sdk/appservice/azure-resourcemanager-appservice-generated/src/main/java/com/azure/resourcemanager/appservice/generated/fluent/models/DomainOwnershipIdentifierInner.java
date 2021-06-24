// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Domain ownership Identifier. */
@JsonFlatten
@Fluent
public class DomainOwnershipIdentifierInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DomainOwnershipIdentifierInner.class);

    /*
     * Ownership Id.
     */
    @JsonProperty(value = "properties.ownershipId")
    private String ownershipId;

    /**
     * Get the ownershipId property: Ownership Id.
     *
     * @return the ownershipId value.
     */
    public String ownershipId() {
        return this.ownershipId;
    }

    /**
     * Set the ownershipId property: Ownership Id.
     *
     * @param ownershipId the ownershipId value to set.
     * @return the DomainOwnershipIdentifierInner object itself.
     */
    public DomainOwnershipIdentifierInner withOwnershipId(String ownershipId) {
        this.ownershipId = ownershipId;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainOwnershipIdentifierInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
