// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The X12 schema reference. */
@Fluent
public final class X12SchemaReference {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(X12SchemaReference.class);

    /*
     * The message id.
     */
    @JsonProperty(value = "messageId", required = true)
    private String messageId;

    /*
     * The sender application id.
     */
    @JsonProperty(value = "senderApplicationId")
    private String senderApplicationId;

    /*
     * The schema version.
     */
    @JsonProperty(value = "schemaVersion", required = true)
    private String schemaVersion;

    /*
     * The schema name.
     */
    @JsonProperty(value = "schemaName", required = true)
    private String schemaName;

    /**
     * Get the messageId property: The message id.
     *
     * @return the messageId value.
     */
    public String messageId() {
        return this.messageId;
    }

    /**
     * Set the messageId property: The message id.
     *
     * @param messageId the messageId value to set.
     * @return the X12SchemaReference object itself.
     */
    public X12SchemaReference withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the senderApplicationId property: The sender application id.
     *
     * @return the senderApplicationId value.
     */
    public String senderApplicationId() {
        return this.senderApplicationId;
    }

    /**
     * Set the senderApplicationId property: The sender application id.
     *
     * @param senderApplicationId the senderApplicationId value to set.
     * @return the X12SchemaReference object itself.
     */
    public X12SchemaReference withSenderApplicationId(String senderApplicationId) {
        this.senderApplicationId = senderApplicationId;
        return this;
    }

    /**
     * Get the schemaVersion property: The schema version.
     *
     * @return the schemaVersion value.
     */
    public String schemaVersion() {
        return this.schemaVersion;
    }

    /**
     * Set the schemaVersion property: The schema version.
     *
     * @param schemaVersion the schemaVersion value to set.
     * @return the X12SchemaReference object itself.
     */
    public X12SchemaReference withSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }

    /**
     * Get the schemaName property: The schema name.
     *
     * @return the schemaName value.
     */
    public String schemaName() {
        return this.schemaName;
    }

    /**
     * Set the schemaName property: The schema name.
     *
     * @param schemaName the schemaName value to set.
     * @return the X12SchemaReference object itself.
     */
    public X12SchemaReference withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (messageId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property messageId in model X12SchemaReference"));
        }
        if (schemaVersion() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property schemaVersion in model X12SchemaReference"));
        }
        if (schemaName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property schemaName in model X12SchemaReference"));
        }
    }
}
