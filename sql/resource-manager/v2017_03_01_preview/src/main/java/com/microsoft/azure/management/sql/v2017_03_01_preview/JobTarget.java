/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A job target, for example a specific database or a container of databases
 * that is evaluated during job execution.
 */
public class JobTarget {
    /**
     * Whether the target is included or excluded from the group. Possible
     * values include: 'Include', 'Exclude'.
     */
    @JsonProperty(value = "membershipType")
    private JobTargetGroupMembershipType membershipType;

    /**
     * The target type. Possible values include: 'TargetGroup', 'SqlDatabase',
     * 'SqlElasticPool', 'SqlShardMap', 'SqlServer'.
     */
    @JsonProperty(value = "type", required = true)
    private JobTargetType type;

    /**
     * The target server name.
     */
    @JsonProperty(value = "serverName")
    private String serverName;

    /**
     * The target database name.
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /**
     * The target elastic pool name.
     */
    @JsonProperty(value = "elasticPoolName")
    private String elasticPoolName;

    /**
     * The target shard map.
     */
    @JsonProperty(value = "shardMapName")
    private String shardMapName;

    /**
     * The resource ID of the credential that is used during job execution to
     * connect to the target and determine the list of databases inside the
     * target.
     */
    @JsonProperty(value = "refreshCredential")
    private String refreshCredential;

    /**
     * Get whether the target is included or excluded from the group. Possible values include: 'Include', 'Exclude'.
     *
     * @return the membershipType value
     */
    public JobTargetGroupMembershipType membershipType() {
        return this.membershipType;
    }

    /**
     * Set whether the target is included or excluded from the group. Possible values include: 'Include', 'Exclude'.
     *
     * @param membershipType the membershipType value to set
     * @return the JobTarget object itself.
     */
    public JobTarget withMembershipType(JobTargetGroupMembershipType membershipType) {
        this.membershipType = membershipType;
        return this;
    }

    /**
     * Get the target type. Possible values include: 'TargetGroup', 'SqlDatabase', 'SqlElasticPool', 'SqlShardMap', 'SqlServer'.
     *
     * @return the type value
     */
    public JobTargetType type() {
        return this.type;
    }

    /**
     * Set the target type. Possible values include: 'TargetGroup', 'SqlDatabase', 'SqlElasticPool', 'SqlShardMap', 'SqlServer'.
     *
     * @param type the type value to set
     * @return the JobTarget object itself.
     */
    public JobTarget withType(JobTargetType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the target server name.
     *
     * @return the serverName value
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Set the target server name.
     *
     * @param serverName the serverName value to set
     * @return the JobTarget object itself.
     */
    public JobTarget withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Get the target database name.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the target database name.
     *
     * @param databaseName the databaseName value to set
     * @return the JobTarget object itself.
     */
    public JobTarget withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the target elastic pool name.
     *
     * @return the elasticPoolName value
     */
    public String elasticPoolName() {
        return this.elasticPoolName;
    }

    /**
     * Set the target elastic pool name.
     *
     * @param elasticPoolName the elasticPoolName value to set
     * @return the JobTarget object itself.
     */
    public JobTarget withElasticPoolName(String elasticPoolName) {
        this.elasticPoolName = elasticPoolName;
        return this;
    }

    /**
     * Get the target shard map.
     *
     * @return the shardMapName value
     */
    public String shardMapName() {
        return this.shardMapName;
    }

    /**
     * Set the target shard map.
     *
     * @param shardMapName the shardMapName value to set
     * @return the JobTarget object itself.
     */
    public JobTarget withShardMapName(String shardMapName) {
        this.shardMapName = shardMapName;
        return this;
    }

    /**
     * Get the resource ID of the credential that is used during job execution to connect to the target and determine the list of databases inside the target.
     *
     * @return the refreshCredential value
     */
    public String refreshCredential() {
        return this.refreshCredential;
    }

    /**
     * Set the resource ID of the credential that is used during job execution to connect to the target and determine the list of databases inside the target.
     *
     * @param refreshCredential the refreshCredential value to set
     * @return the JobTarget object itself.
     */
    public JobTarget withRefreshCredential(String refreshCredential) {
        this.refreshCredential = refreshCredential;
        return this;
    }

}
