// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.implementation.DatabaseProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a Database. */
@Fluent
public final class DatabaseInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseInner.class);

    /*
     * The properties of a database.
     */
    @JsonProperty(value = "properties")
    private DatabaseProperties properties;

    /**
     * Get the properties property: The properties of a database.
     *
     * @return the properties value.
     */
    private DatabaseProperties properties() {
        return this.properties;
    }

    /**
     * Get the charset property: The charset of the database.
     *
     * @return the charset value.
     */
    public String charset() {
        return this.properties() == null ? null : this.properties().charset();
    }

    /**
     * Set the charset property: The charset of the database.
     *
     * @param charset the charset value to set.
     * @return the DatabaseInner object itself.
     */
    public DatabaseInner withCharset(String charset) {
        if (this.properties() == null) {
            this.properties = new DatabaseProperties();
        }
        this.properties().withCharset(charset);
        return this;
    }

    /**
     * Get the collation property: The collation of the database.
     *
     * @return the collation value.
     */
    public String collation() {
        return this.properties() == null ? null : this.properties().collation();
    }

    /**
     * Set the collation property: The collation of the database.
     *
     * @param collation the collation value to set.
     * @return the DatabaseInner object itself.
     */
    public DatabaseInner withCollation(String collation) {
        if (this.properties() == null) {
            this.properties = new DatabaseProperties();
        }
        this.properties().withCollation(collation);
        return this;
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
