/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.implementation;

import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.SqlVmGroupImageSku;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.ScaleType;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.ClusterManagerType;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.ClusterConfiguration;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.WsfcDomainProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A SQL virtual machine group.
 */
@JsonFlatten
public class SqlVirtualMachineGroupInner extends Resource {
    /**
     * Provisioning state to track the async operation status.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * SQL image offer. Examples may include SQL2016-WS2016, SQL2017-WS2016.
     */
    @JsonProperty(value = "properties.sqlImageOffer")
    private String sqlImageOffer;

    /**
     * SQL image sku. Possible values include: 'Developer', 'Enterprise'.
     */
    @JsonProperty(value = "properties.sqlImageSku")
    private SqlVmGroupImageSku sqlImageSku;

    /**
     * Scale type. Possible values include: 'HA'.
     */
    @JsonProperty(value = "properties.scaleType", access = JsonProperty.Access.WRITE_ONLY)
    private ScaleType scaleType;

    /**
     * Type of cluster manager: Windows Server Failover Cluster (WSFC), implied
     * by the scale type of the group and the OS type. Possible values include:
     * 'WSFC'.
     */
    @JsonProperty(value = "properties.clusterManagerType", access = JsonProperty.Access.WRITE_ONLY)
    private ClusterManagerType clusterManagerType;

    /**
     * Cluster type. Possible values include: 'Domainful'.
     */
    @JsonProperty(value = "properties.clusterConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private ClusterConfiguration clusterConfiguration;

    /**
     * Cluster Active Directory domain profile.
     */
    @JsonProperty(value = "properties.wsfcDomainProfile")
    private WsfcDomainProfile wsfcDomainProfile;

    /**
     * Get provisioning state to track the async operation status.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get sQL image offer. Examples may include SQL2016-WS2016, SQL2017-WS2016.
     *
     * @return the sqlImageOffer value
     */
    public String sqlImageOffer() {
        return this.sqlImageOffer;
    }

    /**
     * Set sQL image offer. Examples may include SQL2016-WS2016, SQL2017-WS2016.
     *
     * @param sqlImageOffer the sqlImageOffer value to set
     * @return the SqlVirtualMachineGroupInner object itself.
     */
    public SqlVirtualMachineGroupInner withSqlImageOffer(String sqlImageOffer) {
        this.sqlImageOffer = sqlImageOffer;
        return this;
    }

    /**
     * Get sQL image sku. Possible values include: 'Developer', 'Enterprise'.
     *
     * @return the sqlImageSku value
     */
    public SqlVmGroupImageSku sqlImageSku() {
        return this.sqlImageSku;
    }

    /**
     * Set sQL image sku. Possible values include: 'Developer', 'Enterprise'.
     *
     * @param sqlImageSku the sqlImageSku value to set
     * @return the SqlVirtualMachineGroupInner object itself.
     */
    public SqlVirtualMachineGroupInner withSqlImageSku(SqlVmGroupImageSku sqlImageSku) {
        this.sqlImageSku = sqlImageSku;
        return this;
    }

    /**
     * Get scale type. Possible values include: 'HA'.
     *
     * @return the scaleType value
     */
    public ScaleType scaleType() {
        return this.scaleType;
    }

    /**
     * Get type of cluster manager: Windows Server Failover Cluster (WSFC), implied by the scale type of the group and the OS type. Possible values include: 'WSFC'.
     *
     * @return the clusterManagerType value
     */
    public ClusterManagerType clusterManagerType() {
        return this.clusterManagerType;
    }

    /**
     * Get cluster type. Possible values include: 'Domainful'.
     *
     * @return the clusterConfiguration value
     */
    public ClusterConfiguration clusterConfiguration() {
        return this.clusterConfiguration;
    }

    /**
     * Get cluster Active Directory domain profile.
     *
     * @return the wsfcDomainProfile value
     */
    public WsfcDomainProfile wsfcDomainProfile() {
        return this.wsfcDomainProfile;
    }

    /**
     * Set cluster Active Directory domain profile.
     *
     * @param wsfcDomainProfile the wsfcDomainProfile value to set
     * @return the SqlVirtualMachineGroupInner object itself.
     */
    public SqlVirtualMachineGroupInner withWsfcDomainProfile(WsfcDomainProfile wsfcDomainProfile) {
        this.wsfcDomainProfile = wsfcDomainProfile;
        return this;
    }

}
