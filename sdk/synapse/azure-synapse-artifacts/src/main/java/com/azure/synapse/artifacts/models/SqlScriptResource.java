// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Sql Script resource type. */
@Fluent
public final class SqlScriptResource {
    /*
     * Fully qualified resource Id for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The name of the resource
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or
     * Microsoft.Storage/storageAccounts.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Resource Etag.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Properties of sql script.
     */
    @JsonProperty(value = "properties", required = true)
    private SqlScript properties;

    /**
     * Get the id property: Fully qualified resource Id for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource.
     *
     * @param name the name value to set.
     * @return the SqlScriptResource object itself.
     */
    public SqlScriptResource setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of the resource. Ex- Microsoft.Compute/virtualMachines or
     * Microsoft.Storage/storageAccounts.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Get the etag property: Resource Etag.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Get the properties property: Properties of sql script.
     *
     * @return the properties value.
     */
    public SqlScript getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of sql script.
     *
     * @param properties the properties value to set.
     * @return the SqlScriptResource object itself.
     */
    public SqlScriptResource setProperties(SqlScript properties) {
        this.properties = properties;
        return this;
    }
}
