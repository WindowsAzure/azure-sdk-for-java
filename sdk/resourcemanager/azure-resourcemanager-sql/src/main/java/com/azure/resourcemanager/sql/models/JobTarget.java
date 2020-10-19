// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A job target, for example a specific database or a container of databases that is evaluated during job execution. */
@Fluent
public final class JobTarget {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobTarget.class);

    /*
     * Whether the target is included or excluded from the group.
     */
    @JsonProperty(value = "membershipType")
    private JobTargetGroupMembershipType membershipType;

    /*
     * The target type.
     */
    @JsonProperty(value = "type", required = true)
    private JobTargetType type;

    /*
     * The target server name.
     */
    @JsonProperty(value = "serverName")
    private String serverName;

    /*
     * The target database name.
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /*
     * The target elastic pool name.
     */
    @JsonProperty(value = "elasticPoolName")
    private String elasticPoolName;

    /*
     * The target shard map.
     */
    @JsonProperty(value = "shardMapName")
    private String shardMapName;

    /*
     * The resource ID of the credential that is used during job execution to
     * connect to the target and determine the list of databases inside the
     * target.
     */
    @JsonProperty(value = "refreshCredential")
    private String refreshCredential;

    /**
     * Get the membershipType property: Whether the target is included or excluded from the group.
     *
     * @return the membershipType value.
     */
    public JobTargetGroupMembershipType membershipType() {
        return this.membershipType;
    }

    /**
     * Set the membershipType property: Whether the target is included or excluded from the group.
     *
     * @param membershipType the membershipType value to set.
     * @return the JobTarget object itself.
     */
    public JobTarget withMembershipType(JobTargetGroupMembershipType membershipType) {
        this.membershipType = membershipType;
        return this;
    }

    /**
     * Get the type property: The target type.
     *
     * @return the type value.
     */
    public JobTargetType type() {
        return this.type;
    }

    /**
     * Set the type property: The target type.
     *
     * @param type the type value to set.
     * @return the JobTarget object itself.
     */
    public JobTarget withType(JobTargetType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the serverName property: The target server name.
     *
     * @return the serverName value.
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Set the serverName property: The target server name.
     *
     * @param serverName the serverName value to set.
     * @return the JobTarget object itself.
     */
    public JobTarget withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Get the databaseName property: The target database name.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: The target database name.
     *
     * @param databaseName the databaseName value to set.
     * @return the JobTarget object itself.
     */
    public JobTarget withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the elasticPoolName property: The target elastic pool name.
     *
     * @return the elasticPoolName value.
     */
    public String elasticPoolName() {
        return this.elasticPoolName;
    }

    /**
     * Set the elasticPoolName property: The target elastic pool name.
     *
     * @param elasticPoolName the elasticPoolName value to set.
     * @return the JobTarget object itself.
     */
    public JobTarget withElasticPoolName(String elasticPoolName) {
        this.elasticPoolName = elasticPoolName;
        return this;
    }

    /**
     * Get the shardMapName property: The target shard map.
     *
     * @return the shardMapName value.
     */
    public String shardMapName() {
        return this.shardMapName;
    }

    /**
     * Set the shardMapName property: The target shard map.
     *
     * @param shardMapName the shardMapName value to set.
     * @return the JobTarget object itself.
     */
    public JobTarget withShardMapName(String shardMapName) {
        this.shardMapName = shardMapName;
        return this;
    }

    /**
     * Get the refreshCredential property: The resource ID of the credential that is used during job execution to
     * connect to the target and determine the list of databases inside the target.
     *
     * @return the refreshCredential value.
     */
    public String refreshCredential() {
        return this.refreshCredential;
    }

    /**
     * Set the refreshCredential property: The resource ID of the credential that is used during job execution to
     * connect to the target and determine the list of databases inside the target.
     *
     * @param refreshCredential the refreshCredential value to set.
     * @return the JobTarget object itself.
     */
    public JobTarget withRefreshCredential(String refreshCredential) {
        this.refreshCredential = refreshCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property type in model JobTarget"));
        }
    }
}
