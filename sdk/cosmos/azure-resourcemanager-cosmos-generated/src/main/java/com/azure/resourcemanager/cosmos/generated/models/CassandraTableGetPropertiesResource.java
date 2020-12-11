// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CassandraTableGetPropertiesResource model. */
@Immutable
public final class CassandraTableGetPropertiesResource extends CassandraTableResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CassandraTableGetPropertiesResource.class);

    /*
     * A system generated property. A unique identifier.
     */
    @JsonProperty(value = "_rid", access = JsonProperty.Access.WRITE_ONLY)
    private String rid;

    /*
     * A system generated property that denotes the last updated timestamp of
     * the resource.
     */
    @JsonProperty(value = "_ts", access = JsonProperty.Access.WRITE_ONLY)
    private Float ts;

    /*
     * A system generated property representing the resource etag required for
     * optimistic concurrency control.
     */
    @JsonProperty(value = "_etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the rid property: A system generated property. A unique identifier.
     *
     * @return the rid value.
     */
    public String rid() {
        return this.rid;
    }

    /**
     * Get the ts property: A system generated property that denotes the last updated timestamp of the resource.
     *
     * @return the ts value.
     */
    public Float ts() {
        return this.ts;
    }

    /**
     * Get the etag property: A system generated property representing the resource etag required for optimistic
     * concurrency control.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraTableGetPropertiesResource withId(String id) {
        super.withId(id);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraTableGetPropertiesResource withDefaultTtl(Integer defaultTtl) {
        super.withDefaultTtl(defaultTtl);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraTableGetPropertiesResource withSchema(CassandraSchema schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraTableGetPropertiesResource withAnalyticalStorageTtl(Integer analyticalStorageTtl) {
        super.withAnalyticalStorageTtl(analyticalStorageTtl);
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
