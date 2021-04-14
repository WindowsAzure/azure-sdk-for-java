// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Base class for all types of DMS command properties. If command is not supported by current client, this object is
 * returned.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "commandType",
    defaultImpl = CommandProperties.class)
@JsonTypeName("CommandProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Migrate.Sync.Complete.Database", value = MigrateSyncCompleteCommandProperties.class),
    @JsonSubTypes.Type(
        name = "Migrate.SqlServer.AzureDbSqlMi.Complete",
        value = MigrateMISyncCompleteCommandProperties.class)
})
@Immutable
public class CommandProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CommandProperties.class);

    /*
     * Array of errors. This is ignored if submitted.
     */
    @JsonProperty(value = "errors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ManagementError> errors;

    /*
     * The state of the command. This is ignored if submitted.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private CommandState state;

    /**
     * Get the errors property: Array of errors. This is ignored if submitted.
     *
     * @return the errors value.
     */
    public List<ManagementError> errors() {
        return this.errors;
    }

    /**
     * Get the state property: The state of the command. This is ignored if submitted.
     *
     * @return the state value.
     */
    public CommandState state() {
        return this.state;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
