/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview.implementation;

import java.util.Map;
import com.microsoft.azure.management.sql.v2015_05_01_preview.FailoverGroupReadWriteEndpoint;
import com.microsoft.azure.management.sql.v2015_05_01_preview.FailoverGroupReadOnlyEndpoint;
import com.microsoft.azure.management.sql.v2015_05_01_preview.FailoverGroupReplicationRole;
import java.util.List;
import com.microsoft.azure.management.sql.v2015_05_01_preview.PartnerInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A failover group.
 */
@JsonFlatten
public class FailoverGroupInner extends ProxyResource {
    /**
     * Resource location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Read-write endpoint of the failover group instance.
     */
    @JsonProperty(value = "properties.readWriteEndpoint", required = true)
    private FailoverGroupReadWriteEndpoint readWriteEndpoint;

    /**
     * Read-only endpoint of the failover group instance.
     */
    @JsonProperty(value = "properties.readOnlyEndpoint")
    private FailoverGroupReadOnlyEndpoint readOnlyEndpoint;

    /**
     * Local replication role of the failover group instance. Possible values
     * include: 'Primary', 'Secondary'.
     */
    @JsonProperty(value = "properties.replicationRole", access = JsonProperty.Access.WRITE_ONLY)
    private FailoverGroupReplicationRole replicationRole;

    /**
     * Replication state of the failover group instance.
     */
    @JsonProperty(value = "properties.replicationState", access = JsonProperty.Access.WRITE_ONLY)
    private String replicationState;

    /**
     * List of partner server information for the failover group.
     */
    @JsonProperty(value = "properties.partnerServers", required = true)
    private List<PartnerInfo> partnerServers;

    /**
     * List of databases in the failover group.
     */
    @JsonProperty(value = "properties.databases")
    private List<String> databases;

    /**
     * Get resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the FailoverGroupInner object itself.
     */
    public FailoverGroupInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get read-write endpoint of the failover group instance.
     *
     * @return the readWriteEndpoint value
     */
    public FailoverGroupReadWriteEndpoint readWriteEndpoint() {
        return this.readWriteEndpoint;
    }

    /**
     * Set read-write endpoint of the failover group instance.
     *
     * @param readWriteEndpoint the readWriteEndpoint value to set
     * @return the FailoverGroupInner object itself.
     */
    public FailoverGroupInner withReadWriteEndpoint(FailoverGroupReadWriteEndpoint readWriteEndpoint) {
        this.readWriteEndpoint = readWriteEndpoint;
        return this;
    }

    /**
     * Get read-only endpoint of the failover group instance.
     *
     * @return the readOnlyEndpoint value
     */
    public FailoverGroupReadOnlyEndpoint readOnlyEndpoint() {
        return this.readOnlyEndpoint;
    }

    /**
     * Set read-only endpoint of the failover group instance.
     *
     * @param readOnlyEndpoint the readOnlyEndpoint value to set
     * @return the FailoverGroupInner object itself.
     */
    public FailoverGroupInner withReadOnlyEndpoint(FailoverGroupReadOnlyEndpoint readOnlyEndpoint) {
        this.readOnlyEndpoint = readOnlyEndpoint;
        return this;
    }

    /**
     * Get local replication role of the failover group instance. Possible values include: 'Primary', 'Secondary'.
     *
     * @return the replicationRole value
     */
    public FailoverGroupReplicationRole replicationRole() {
        return this.replicationRole;
    }

    /**
     * Get replication state of the failover group instance.
     *
     * @return the replicationState value
     */
    public String replicationState() {
        return this.replicationState;
    }

    /**
     * Get list of partner server information for the failover group.
     *
     * @return the partnerServers value
     */
    public List<PartnerInfo> partnerServers() {
        return this.partnerServers;
    }

    /**
     * Set list of partner server information for the failover group.
     *
     * @param partnerServers the partnerServers value to set
     * @return the FailoverGroupInner object itself.
     */
    public FailoverGroupInner withPartnerServers(List<PartnerInfo> partnerServers) {
        this.partnerServers = partnerServers;
        return this;
    }

    /**
     * Get list of databases in the failover group.
     *
     * @return the databases value
     */
    public List<String> databases() {
        return this.databases;
    }

    /**
     * Set list of databases in the failover group.
     *
     * @param databases the databases value to set
     * @return the FailoverGroupInner object itself.
     */
    public FailoverGroupInner withDatabases(List<String> databases) {
        this.databases = databases;
        return this;
    }

}
