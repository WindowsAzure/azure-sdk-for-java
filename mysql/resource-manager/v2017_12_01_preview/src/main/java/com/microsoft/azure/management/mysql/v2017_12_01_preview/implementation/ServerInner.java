/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2017_12_01_preview.implementation;

import com.microsoft.azure.management.mysql.v2017_12_01_preview.Sku;
import com.microsoft.azure.management.mysql.v2017_12_01_preview.ServerVersion;
import com.microsoft.azure.management.mysql.v2017_12_01_preview.SslEnforcementEnum;
import com.microsoft.azure.management.mysql.v2017_12_01_preview.ServerState;
import org.joda.time.DateTime;
import com.microsoft.azure.management.mysql.v2017_12_01_preview.StorageProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Represents a server.
 */
@JsonFlatten
public class ServerInner extends Resource {
    /**
     * The SKU (pricing tier) of the server.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * The administrator's login name of a server. Can only be specified when
     * the server is being created (and is required for creation).
     */
    @JsonProperty(value = "properties.administratorLogin")
    private String administratorLogin;

    /**
     * Server version. Possible values include: '5.6', '5.7'.
     */
    @JsonProperty(value = "properties.version")
    private ServerVersion version;

    /**
     * Enable ssl enforcement or not when connect to server. Possible values
     * include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.sslEnforcement")
    private SslEnforcementEnum sslEnforcement;

    /**
     * A state of a server that is visible to user. Possible values include:
     * 'Ready', 'Dropping', 'Disabled'.
     */
    @JsonProperty(value = "properties.userVisibleState")
    private ServerState userVisibleState;

    /**
     * The fully qualified domain name of a server.
     */
    @JsonProperty(value = "properties.fullyQualifiedDomainName")
    private String fullyQualifiedDomainName;

    /**
     * Earliest restore point creation time (ISO8601 format).
     */
    @JsonProperty(value = "properties.earliestRestoreDate")
    private DateTime earliestRestoreDate;

    /**
     * Storage profile of a server.
     */
    @JsonProperty(value = "properties.storageProfile")
    private StorageProfile storageProfile;

    /**
     * The replication role of the server.
     */
    @JsonProperty(value = "properties.replicationRole")
    private String replicationRole;

    /**
     * The master server id of a replica server.
     */
    @JsonProperty(value = "properties.masterServerId")
    private String masterServerId;

    /**
     * The maximum number of replicas that a master server can have.
     */
    @JsonProperty(value = "properties.replicaCapacity")
    private Integer replicaCapacity;

    /**
     * Get the SKU (pricing tier) of the server.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the SKU (pricing tier) of the server.
     *
     * @param sku the sku value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the administrator's login name of a server. Can only be specified when the server is being created (and is required for creation).
     *
     * @return the administratorLogin value
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set the administrator's login name of a server. Can only be specified when the server is being created (and is required for creation).
     *
     * @param administratorLogin the administratorLogin value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get server version. Possible values include: '5.6', '5.7'.
     *
     * @return the version value
     */
    public ServerVersion version() {
        return this.version;
    }

    /**
     * Set server version. Possible values include: '5.6', '5.7'.
     *
     * @param version the version value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withVersion(ServerVersion version) {
        this.version = version;
        return this;
    }

    /**
     * Get enable ssl enforcement or not when connect to server. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the sslEnforcement value
     */
    public SslEnforcementEnum sslEnforcement() {
        return this.sslEnforcement;
    }

    /**
     * Set enable ssl enforcement or not when connect to server. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param sslEnforcement the sslEnforcement value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withSslEnforcement(SslEnforcementEnum sslEnforcement) {
        this.sslEnforcement = sslEnforcement;
        return this;
    }

    /**
     * Get a state of a server that is visible to user. Possible values include: 'Ready', 'Dropping', 'Disabled'.
     *
     * @return the userVisibleState value
     */
    public ServerState userVisibleState() {
        return this.userVisibleState;
    }

    /**
     * Set a state of a server that is visible to user. Possible values include: 'Ready', 'Dropping', 'Disabled'.
     *
     * @param userVisibleState the userVisibleState value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withUserVisibleState(ServerState userVisibleState) {
        this.userVisibleState = userVisibleState;
        return this;
    }

    /**
     * Get the fully qualified domain name of a server.
     *
     * @return the fullyQualifiedDomainName value
     */
    public String fullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }

    /**
     * Set the fully qualified domain name of a server.
     *
     * @param fullyQualifiedDomainName the fullyQualifiedDomainName value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withFullyQualifiedDomainName(String fullyQualifiedDomainName) {
        this.fullyQualifiedDomainName = fullyQualifiedDomainName;
        return this;
    }

    /**
     * Get earliest restore point creation time (ISO8601 format).
     *
     * @return the earliestRestoreDate value
     */
    public DateTime earliestRestoreDate() {
        return this.earliestRestoreDate;
    }

    /**
     * Set earliest restore point creation time (ISO8601 format).
     *
     * @param earliestRestoreDate the earliestRestoreDate value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withEarliestRestoreDate(DateTime earliestRestoreDate) {
        this.earliestRestoreDate = earliestRestoreDate;
        return this;
    }

    /**
     * Get storage profile of a server.
     *
     * @return the storageProfile value
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set storage profile of a server.
     *
     * @param storageProfile the storageProfile value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the replication role of the server.
     *
     * @return the replicationRole value
     */
    public String replicationRole() {
        return this.replicationRole;
    }

    /**
     * Set the replication role of the server.
     *
     * @param replicationRole the replicationRole value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withReplicationRole(String replicationRole) {
        this.replicationRole = replicationRole;
        return this;
    }

    /**
     * Get the master server id of a replica server.
     *
     * @return the masterServerId value
     */
    public String masterServerId() {
        return this.masterServerId;
    }

    /**
     * Set the master server id of a replica server.
     *
     * @param masterServerId the masterServerId value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withMasterServerId(String masterServerId) {
        this.masterServerId = masterServerId;
        return this;
    }

    /**
     * Get the maximum number of replicas that a master server can have.
     *
     * @return the replicaCapacity value
     */
    public Integer replicaCapacity() {
        return this.replicaCapacity;
    }

    /**
     * Set the maximum number of replicas that a master server can have.
     *
     * @param replicaCapacity the replicaCapacity value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withReplicaCapacity(Integer replicaCapacity) {
        this.replicaCapacity = replicaCapacity;
        return this;
    }

}
