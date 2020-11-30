// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** The content of the SQL script. */
@Fluent
public final class SqlScriptContent {
    /*
     * SQL query to execute.
     */
    @JsonProperty(value = "query", required = true)
    private String query;

    /*
     * The connection used to execute the SQL script.
     */
    @JsonProperty(value = "currentConnection", required = true)
    private SqlConnection currentConnection;

    /*
     * The metadata of the SQL script.
     */
    @JsonProperty(value = "metadata")
    private SqlScriptMetadata metadata;

    /*
     * The content of the SQL script.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the query property: SQL query to execute.
     *
     * @return the query value.
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Set the query property: SQL query to execute.
     *
     * @param query the query value to set.
     * @return the SqlScriptContent object itself.
     */
    public SqlScriptContent setQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the currentConnection property: The connection used to execute the SQL script.
     *
     * @return the currentConnection value.
     */
    public SqlConnection getCurrentConnection() {
        return this.currentConnection;
    }

    /**
     * Set the currentConnection property: The connection used to execute the SQL script.
     *
     * @param currentConnection the currentConnection value to set.
     * @return the SqlScriptContent object itself.
     */
    public SqlScriptContent setCurrentConnection(SqlConnection currentConnection) {
        this.currentConnection = currentConnection;
        return this;
    }

    /**
     * Get the metadata property: The metadata of the SQL script.
     *
     * @return the metadata value.
     */
    public SqlScriptMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata of the SQL script.
     *
     * @param metadata the metadata value to set.
     * @return the SqlScriptContent object itself.
     */
    public SqlScriptContent setMetadata(SqlScriptMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the additionalProperties property: The content of the SQL script.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The content of the SQL script.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the SqlScriptContent object itself.
     */
    public SqlScriptContent setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
