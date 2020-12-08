// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** A restorable dropped database. */
@JsonFlatten
@Immutable
public class RestorableDroppedDatabaseInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorableDroppedDatabaseInner.class);

    /*
     * The geo-location where the resource lives
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * The name of the database
     */
    @JsonProperty(value = "properties.databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /*
     * The edition of the database
     */
    @JsonProperty(value = "properties.edition", access = JsonProperty.Access.WRITE_ONLY)
    private String edition;

    /*
     * The max size in bytes of the database
     */
    @JsonProperty(value = "properties.maxSizeBytes", access = JsonProperty.Access.WRITE_ONLY)
    private String maxSizeBytes;

    /*
     * The service level objective name of the database
     */
    @JsonProperty(value = "properties.serviceLevelObjective", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceLevelObjective;

    /*
     * The elastic pool name of the database
     */
    @JsonProperty(value = "properties.elasticPoolName", access = JsonProperty.Access.WRITE_ONLY)
    private String elasticPoolName;

    /*
     * The creation date of the database (ISO8601 format)
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationDate;

    /*
     * The deletion date of the database (ISO8601 format)
     */
    @JsonProperty(value = "properties.deletionDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime deletionDate;

    /*
     * The earliest restore date of the database (ISO8601 format)
     */
    @JsonProperty(value = "properties.earliestRestoreDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime earliestRestoreDate;

    /**
     * Get the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the databaseName property: The name of the database.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the edition property: The edition of the database.
     *
     * @return the edition value.
     */
    public String edition() {
        return this.edition;
    }

    /**
     * Get the maxSizeBytes property: The max size in bytes of the database.
     *
     * @return the maxSizeBytes value.
     */
    public String maxSizeBytes() {
        return this.maxSizeBytes;
    }

    /**
     * Get the serviceLevelObjective property: The service level objective name of the database.
     *
     * @return the serviceLevelObjective value.
     */
    public String serviceLevelObjective() {
        return this.serviceLevelObjective;
    }

    /**
     * Get the elasticPoolName property: The elastic pool name of the database.
     *
     * @return the elasticPoolName value.
     */
    public String elasticPoolName() {
        return this.elasticPoolName;
    }

    /**
     * Get the creationDate property: The creation date of the database (ISO8601 format).
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the deletionDate property: The deletion date of the database (ISO8601 format).
     *
     * @return the deletionDate value.
     */
    public OffsetDateTime deletionDate() {
        return this.deletionDate;
    }

    /**
     * Get the earliestRestoreDate property: The earliest restore date of the database (ISO8601 format).
     *
     * @return the earliestRestoreDate value.
     */
    public OffsetDateTime earliestRestoreDate() {
        return this.earliestRestoreDate;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
