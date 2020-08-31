// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent.inner;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AccessKeys model. */
@Immutable
public final class AccessKeysInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AccessKeysInner.class);

    /*
     * Primary connection string of the created namespace AuthorizationRule.
     */
    @JsonProperty(value = "primaryConnectionString", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryConnectionString;

    /*
     * Secondary connection string of the created namespace AuthorizationRule.
     */
    @JsonProperty(value = "secondaryConnectionString", access = JsonProperty.Access.WRITE_ONLY)
    private String secondaryConnectionString;

    /*
     * Primary connection string of the alias if GEO DR is enabled
     */
    @JsonProperty(value = "aliasPrimaryConnectionString", access = JsonProperty.Access.WRITE_ONLY)
    private String aliasPrimaryConnectionString;

    /*
     * Secondary  connection string of the alias if GEO DR is enabled
     */
    @JsonProperty(value = "aliasSecondaryConnectionString", access = JsonProperty.Access.WRITE_ONLY)
    private String aliasSecondaryConnectionString;

    /*
     * A base64-encoded 256-bit primary key for signing and validating the SAS
     * token.
     */
    @JsonProperty(value = "primaryKey", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryKey;

    /*
     * A base64-encoded 256-bit primary key for signing and validating the SAS
     * token.
     */
    @JsonProperty(value = "secondaryKey", access = JsonProperty.Access.WRITE_ONLY)
    private String secondaryKey;

    /*
     * A string that describes the AuthorizationRule.
     */
    @JsonProperty(value = "keyName", access = JsonProperty.Access.WRITE_ONLY)
    private String keyName;

    /**
     * Get the primaryConnectionString property: Primary connection string of the created namespace AuthorizationRule.
     *
     * @return the primaryConnectionString value.
     */
    public String primaryConnectionString() {
        return this.primaryConnectionString;
    }

    /**
     * Get the secondaryConnectionString property: Secondary connection string of the created namespace
     * AuthorizationRule.
     *
     * @return the secondaryConnectionString value.
     */
    public String secondaryConnectionString() {
        return this.secondaryConnectionString;
    }

    /**
     * Get the aliasPrimaryConnectionString property: Primary connection string of the alias if GEO DR is enabled.
     *
     * @return the aliasPrimaryConnectionString value.
     */
    public String aliasPrimaryConnectionString() {
        return this.aliasPrimaryConnectionString;
    }

    /**
     * Get the aliasSecondaryConnectionString property: Secondary connection string of the alias if GEO DR is enabled.
     *
     * @return the aliasSecondaryConnectionString value.
     */
    public String aliasSecondaryConnectionString() {
        return this.aliasSecondaryConnectionString;
    }

    /**
     * Get the primaryKey property: A base64-encoded 256-bit primary key for signing and validating the SAS token.
     *
     * @return the primaryKey value.
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Get the secondaryKey property: A base64-encoded 256-bit primary key for signing and validating the SAS token.
     *
     * @return the secondaryKey value.
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    /**
     * Get the keyName property: A string that describes the AuthorizationRule.
     *
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
