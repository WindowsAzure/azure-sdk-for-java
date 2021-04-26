// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The HiveMetastore model. */
@JsonFlatten
@Immutable
public class HiveMetastore extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HiveMetastore.class);

    /*
     * The serverUri for the Hive MetaStore
     */
    @JsonProperty(value = "properties.serverUri", access = JsonProperty.Access.WRITE_ONLY)
    private String serverUri;

    /*
     * The databaseName for the Hive MetaStore
     */
    @JsonProperty(value = "properties.databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /*
     * The runtimeVersion for the Hive MetaStore
     */
    @JsonProperty(value = "properties.runtimeVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String runtimeVersion;

    /*
     * The userName for the Hive MetaStore
     */
    @JsonProperty(value = "properties.userName", access = JsonProperty.Access.WRITE_ONLY)
    private String username;

    /*
     * The password for the Hive MetaStore
     */
    @JsonProperty(value = "properties.password", access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    /*
     * The current state of the NestedResource
     */
    @JsonProperty(value = "properties.nestedResourceProvisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private NestedResourceProvisioningState nestedResourceProvisioningState;

    /*
     * The resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the serverUri property: The serverUri for the Hive MetaStore.
     *
     * @return the serverUri value.
     */
    public String serverUri() {
        return this.serverUri;
    }

    /**
     * Get the databaseName property: The databaseName for the Hive MetaStore.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the runtimeVersion property: The runtimeVersion for the Hive MetaStore.
     *
     * @return the runtimeVersion value.
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Get the username property: The userName for the Hive MetaStore.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Get the password property: The password for the Hive MetaStore.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Get the nestedResourceProvisioningState property: The current state of the NestedResource.
     *
     * @return the nestedResourceProvisioningState value.
     */
    public NestedResourceProvisioningState nestedResourceProvisioningState() {
        return this.nestedResourceProvisioningState;
    }

    /**
     * Get the name property: The resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public HiveMetastore withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
