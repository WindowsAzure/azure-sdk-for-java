/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The cluster create parameters.
 */
public class ClusterCreateProperties {
    /**
     * The version of the cluster.
     */
    @JsonProperty(value = "clusterVersion")
    private String clusterVersion;

    /**
     * The type of operating system. Possible values include: 'Windows',
     * 'Linux'.
     */
    @JsonProperty(value = "osType")
    private OSType osType;

    /**
     * The cluster tier. Possible values include: 'Standard', 'Premium'.
     */
    @JsonProperty(value = "tier")
    private Tier tier;

    /**
     * The cluster definition.
     */
    @JsonProperty(value = "clusterDefinition")
    private ClusterDefinition clusterDefinition;

    /**
     * The security profile.
     */
    @JsonProperty(value = "securityProfile")
    private SecurityProfile securityProfile;

    /**
     * The compute profile.
     */
    @JsonProperty(value = "computeProfile")
    private ComputeProfile computeProfile;

    /**
     * The storage profile.
     */
    @JsonProperty(value = "storageProfile")
    private StorageProfile storageProfile;

    /**
     * The disk encryption properties.
     */
    @JsonProperty(value = "diskEncryptionProperties")
    private DiskEncryptionProperties diskEncryptionProperties;

    /**
     * Get the version of the cluster.
     *
     * @return the clusterVersion value
     */
    public String clusterVersion() {
        return this.clusterVersion;
    }

    /**
     * Set the version of the cluster.
     *
     * @param clusterVersion the clusterVersion value to set
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * Get the type of operating system. Possible values include: 'Windows', 'Linux'.
     *
     * @return the osType value
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Set the type of operating system. Possible values include: 'Windows', 'Linux'.
     *
     * @param osType the osType value to set
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withOsType(OSType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the cluster tier. Possible values include: 'Standard', 'Premium'.
     *
     * @return the tier value
     */
    public Tier tier() {
        return this.tier;
    }

    /**
     * Set the cluster tier. Possible values include: 'Standard', 'Premium'.
     *
     * @param tier the tier value to set
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withTier(Tier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the cluster definition.
     *
     * @return the clusterDefinition value
     */
    public ClusterDefinition clusterDefinition() {
        return this.clusterDefinition;
    }

    /**
     * Set the cluster definition.
     *
     * @param clusterDefinition the clusterDefinition value to set
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withClusterDefinition(ClusterDefinition clusterDefinition) {
        this.clusterDefinition = clusterDefinition;
        return this;
    }

    /**
     * Get the security profile.
     *
     * @return the securityProfile value
     */
    public SecurityProfile securityProfile() {
        return this.securityProfile;
    }

    /**
     * Set the security profile.
     *
     * @param securityProfile the securityProfile value to set
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withSecurityProfile(SecurityProfile securityProfile) {
        this.securityProfile = securityProfile;
        return this;
    }

    /**
     * Get the compute profile.
     *
     * @return the computeProfile value
     */
    public ComputeProfile computeProfile() {
        return this.computeProfile;
    }

    /**
     * Set the compute profile.
     *
     * @param computeProfile the computeProfile value to set
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withComputeProfile(ComputeProfile computeProfile) {
        this.computeProfile = computeProfile;
        return this;
    }

    /**
     * Get the storage profile.
     *
     * @return the storageProfile value
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storage profile.
     *
     * @param storageProfile the storageProfile value to set
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the disk encryption properties.
     *
     * @return the diskEncryptionProperties value
     */
    public DiskEncryptionProperties diskEncryptionProperties() {
        return this.diskEncryptionProperties;
    }

    /**
     * Set the disk encryption properties.
     *
     * @param diskEncryptionProperties the diskEncryptionProperties value to set
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withDiskEncryptionProperties(DiskEncryptionProperties diskEncryptionProperties) {
        this.diskEncryptionProperties = diskEncryptionProperties;
        return this;
    }

}
