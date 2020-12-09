// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The cluster create parameters. */
@Fluent
public final class ClusterCreateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterCreateProperties.class);

    /*
     * The version of the cluster.
     */
    @JsonProperty(value = "clusterVersion")
    private String clusterVersion;

    /*
     * The type of operating system.
     */
    @JsonProperty(value = "osType")
    private OSType osType;

    /*
     * The cluster tier.
     */
    @JsonProperty(value = "tier")
    private Tier tier;

    /*
     * The cluster definition.
     */
    @JsonProperty(value = "clusterDefinition")
    private ClusterDefinition clusterDefinition;

    /*
     * The cluster kafka rest proxy configuration.
     */
    @JsonProperty(value = "kafkaRestProperties")
    private KafkaRestProperties kafkaRestProperties;

    /*
     * The security profile.
     */
    @JsonProperty(value = "securityProfile")
    private SecurityProfile securityProfile;

    /*
     * The compute profile.
     */
    @JsonProperty(value = "computeProfile")
    private ComputeProfile computeProfile;

    /*
     * The storage profile.
     */
    @JsonProperty(value = "storageProfile")
    private StorageProfile storageProfile;

    /*
     * The disk encryption properties.
     */
    @JsonProperty(value = "diskEncryptionProperties")
    private DiskEncryptionProperties diskEncryptionProperties;

    /*
     * The encryption-in-transit properties.
     */
    @JsonProperty(value = "encryptionInTransitProperties")
    private EncryptionInTransitProperties encryptionInTransitProperties;

    /*
     * The minimal supported tls version.
     */
    @JsonProperty(value = "minSupportedTlsVersion")
    private String minSupportedTlsVersion;

    /*
     * The network properties.
     */
    @JsonProperty(value = "networkProperties")
    private NetworkProperties networkProperties;

    /**
     * Get the clusterVersion property: The version of the cluster.
     *
     * @return the clusterVersion value.
     */
    public String clusterVersion() {
        return this.clusterVersion;
    }

    /**
     * Set the clusterVersion property: The version of the cluster.
     *
     * @param clusterVersion the clusterVersion value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * Get the osType property: The type of operating system.
     *
     * @return the osType value.
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Set the osType property: The type of operating system.
     *
     * @param osType the osType value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withOsType(OSType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the tier property: The cluster tier.
     *
     * @return the tier value.
     */
    public Tier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The cluster tier.
     *
     * @param tier the tier value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withTier(Tier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the clusterDefinition property: The cluster definition.
     *
     * @return the clusterDefinition value.
     */
    public ClusterDefinition clusterDefinition() {
        return this.clusterDefinition;
    }

    /**
     * Set the clusterDefinition property: The cluster definition.
     *
     * @param clusterDefinition the clusterDefinition value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withClusterDefinition(ClusterDefinition clusterDefinition) {
        this.clusterDefinition = clusterDefinition;
        return this;
    }

    /**
     * Get the kafkaRestProperties property: The cluster kafka rest proxy configuration.
     *
     * @return the kafkaRestProperties value.
     */
    public KafkaRestProperties kafkaRestProperties() {
        return this.kafkaRestProperties;
    }

    /**
     * Set the kafkaRestProperties property: The cluster kafka rest proxy configuration.
     *
     * @param kafkaRestProperties the kafkaRestProperties value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withKafkaRestProperties(KafkaRestProperties kafkaRestProperties) {
        this.kafkaRestProperties = kafkaRestProperties;
        return this;
    }

    /**
     * Get the securityProfile property: The security profile.
     *
     * @return the securityProfile value.
     */
    public SecurityProfile securityProfile() {
        return this.securityProfile;
    }

    /**
     * Set the securityProfile property: The security profile.
     *
     * @param securityProfile the securityProfile value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withSecurityProfile(SecurityProfile securityProfile) {
        this.securityProfile = securityProfile;
        return this;
    }

    /**
     * Get the computeProfile property: The compute profile.
     *
     * @return the computeProfile value.
     */
    public ComputeProfile computeProfile() {
        return this.computeProfile;
    }

    /**
     * Set the computeProfile property: The compute profile.
     *
     * @param computeProfile the computeProfile value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withComputeProfile(ComputeProfile computeProfile) {
        this.computeProfile = computeProfile;
        return this;
    }

    /**
     * Get the storageProfile property: The storage profile.
     *
     * @return the storageProfile value.
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: The storage profile.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the diskEncryptionProperties property: The disk encryption properties.
     *
     * @return the diskEncryptionProperties value.
     */
    public DiskEncryptionProperties diskEncryptionProperties() {
        return this.diskEncryptionProperties;
    }

    /**
     * Set the diskEncryptionProperties property: The disk encryption properties.
     *
     * @param diskEncryptionProperties the diskEncryptionProperties value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withDiskEncryptionProperties(DiskEncryptionProperties diskEncryptionProperties) {
        this.diskEncryptionProperties = diskEncryptionProperties;
        return this;
    }

    /**
     * Get the encryptionInTransitProperties property: The encryption-in-transit properties.
     *
     * @return the encryptionInTransitProperties value.
     */
    public EncryptionInTransitProperties encryptionInTransitProperties() {
        return this.encryptionInTransitProperties;
    }

    /**
     * Set the encryptionInTransitProperties property: The encryption-in-transit properties.
     *
     * @param encryptionInTransitProperties the encryptionInTransitProperties value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withEncryptionInTransitProperties(
        EncryptionInTransitProperties encryptionInTransitProperties) {
        this.encryptionInTransitProperties = encryptionInTransitProperties;
        return this;
    }

    /**
     * Get the minSupportedTlsVersion property: The minimal supported tls version.
     *
     * @return the minSupportedTlsVersion value.
     */
    public String minSupportedTlsVersion() {
        return this.minSupportedTlsVersion;
    }

    /**
     * Set the minSupportedTlsVersion property: The minimal supported tls version.
     *
     * @param minSupportedTlsVersion the minSupportedTlsVersion value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withMinSupportedTlsVersion(String minSupportedTlsVersion) {
        this.minSupportedTlsVersion = minSupportedTlsVersion;
        return this;
    }

    /**
     * Get the networkProperties property: The network properties.
     *
     * @return the networkProperties value.
     */
    public NetworkProperties networkProperties() {
        return this.networkProperties;
    }

    /**
     * Set the networkProperties property: The network properties.
     *
     * @param networkProperties the networkProperties value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withNetworkProperties(NetworkProperties networkProperties) {
        this.networkProperties = networkProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clusterDefinition() != null) {
            clusterDefinition().validate();
        }
        if (kafkaRestProperties() != null) {
            kafkaRestProperties().validate();
        }
        if (securityProfile() != null) {
            securityProfile().validate();
        }
        if (computeProfile() != null) {
            computeProfile().validate();
        }
        if (storageProfile() != null) {
            storageProfile().validate();
        }
        if (diskEncryptionProperties() != null) {
            diskEncryptionProperties().validate();
        }
        if (encryptionInTransitProperties() != null) {
            encryptionInTransitProperties().validate();
        }
        if (networkProperties() != null) {
            networkProperties().validate();
        }
    }
}
