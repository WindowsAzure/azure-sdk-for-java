// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cosmos DB SQL database resource object. */
@Immutable
public final class RestorableSqlDatabasePropertiesResourceDatabase extends SqlDatabaseResource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(RestorableSqlDatabasePropertiesResourceDatabase.class);

    /*
     * A system generated property that specified the addressable path of the
     * collections resource.
     */
    @JsonProperty(value = "_colls", access = JsonProperty.Access.WRITE_ONLY)
    private String colls;

    /*
     * A system generated property that specifies the addressable path of the
     * users resource.
     */
    @JsonProperty(value = "_users", access = JsonProperty.Access.WRITE_ONLY)
    private String users;

    /*
     * A system generated property that specifies the addressable path of the
     * database resource.
     */
    @JsonProperty(value = "_self", access = JsonProperty.Access.WRITE_ONLY)
    private String self;

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
     * Get the colls property: A system generated property that specified the addressable path of the collections
     * resource.
     *
     * @return the colls value.
     */
    public String colls() {
        return this.colls;
    }

    /**
     * Get the users property: A system generated property that specifies the addressable path of the users resource.
     *
     * @return the users value.
     */
    public String users() {
        return this.users;
    }

    /**
     * Get the self property: A system generated property that specifies the addressable path of the database resource.
     *
     * @return the self value.
     */
    public String self() {
        return this.self;
    }

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
    public RestorableSqlDatabasePropertiesResourceDatabase withId(String id) {
        super.withId(id);
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
