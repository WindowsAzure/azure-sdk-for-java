// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** SQL stored procedure activity type. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SqlServerStoredProcedure")
@JsonFlatten
@Fluent
public class SqlServerStoredProcedureActivity extends ExecutionActivity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlServerStoredProcedureActivity.class);

    /*
     * Stored procedure name. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.storedProcedureName", required = true)
    private Object storedProcedureName;

    /*
     * Value and type setting for stored procedure parameters. Example:
     * "{Parameter1: {value: "1", type: "int"}}".
     */
    @JsonProperty(value = "typeProperties.storedProcedureParameters")
    private Map<String, StoredProcedureParameter> storedProcedureParameters;

    /**
     * Get the storedProcedureName property: Stored procedure name. Type: string (or Expression with resultType string).
     *
     * @return the storedProcedureName value.
     */
    public Object storedProcedureName() {
        return this.storedProcedureName;
    }

    /**
     * Set the storedProcedureName property: Stored procedure name. Type: string (or Expression with resultType string).
     *
     * @param storedProcedureName the storedProcedureName value to set.
     * @return the SqlServerStoredProcedureActivity object itself.
     */
    public SqlServerStoredProcedureActivity withStoredProcedureName(Object storedProcedureName) {
        this.storedProcedureName = storedProcedureName;
        return this;
    }

    /**
     * Get the storedProcedureParameters property: Value and type setting for stored procedure parameters. Example:
     * "{Parameter1: {value: "1", type: "int"}}".
     *
     * @return the storedProcedureParameters value.
     */
    public Map<String, StoredProcedureParameter> storedProcedureParameters() {
        return this.storedProcedureParameters;
    }

    /**
     * Set the storedProcedureParameters property: Value and type setting for stored procedure parameters. Example:
     * "{Parameter1: {value: "1", type: "int"}}".
     *
     * @param storedProcedureParameters the storedProcedureParameters value to set.
     * @return the SqlServerStoredProcedureActivity object itself.
     */
    public SqlServerStoredProcedureActivity withStoredProcedureParameters(
        Map<String, StoredProcedureParameter> storedProcedureParameters) {
        this.storedProcedureParameters = storedProcedureParameters;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerStoredProcedureActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerStoredProcedureActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerStoredProcedureActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerStoredProcedureActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerStoredProcedureActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerStoredProcedureActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
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
        if (storedProcedureName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property storedProcedureName in model SqlServerStoredProcedureActivity"));
        }
        if (storedProcedureParameters() != null) {
            storedProcedureParameters()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}