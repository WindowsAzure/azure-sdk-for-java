// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Disk update resource. */
@JsonFlatten
@Fluent
public class DiskUpdate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiskUpdate.class);

    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS,
     * or UltraSSD_LRS.
     */
    @JsonProperty(value = "sku")
    private DiskSku sku;

    /*
     * the Operating System type.
     */
    @JsonProperty(value = "properties.osType")
    private OperatingSystemTypes osType;

    /*
     * If creationData.createOption is Empty, this field is mandatory and it
     * indicates the size of the disk to create. If this field is present for
     * updates or creation with other options, it indicates a resize. Resizes
     * are only allowed if the disk is not attached to a running VM, and can
     * only increase the disk's size.
     */
    @JsonProperty(value = "properties.diskSizeGB")
    private Integer diskSizeGB;

    /*
     * Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     */
    @JsonProperty(value = "properties.encryptionSettingsCollection")
    private EncryptionSettingsCollection encryptionSettingsCollection;

    /*
     * The number of IOPS allowed for this disk; only settable for UltraSSD
     * disks. One operation can transfer between 4k and 256k bytes.
     */
    @JsonProperty(value = "properties.diskIOPSReadWrite")
    private Long diskIopsReadWrite;

    /*
     * The bandwidth allowed for this disk; only settable for UltraSSD disks.
     * MBps means millions of bytes per second - MB here uses the ISO notation,
     * of powers of 10.
     */
    @JsonProperty(value = "properties.diskMBpsReadWrite")
    private Long diskMBpsReadWrite;

    /*
     * The total number of IOPS that will be allowed across all VMs mounting
     * the shared disk as ReadOnly. One operation can transfer between 4k and
     * 256k bytes.
     */
    @JsonProperty(value = "properties.diskIOPSReadOnly")
    private Long diskIopsReadOnly;

    /*
     * The total throughput (MBps) that will be allowed across all VMs mounting
     * the shared disk as ReadOnly. MBps means millions of bytes per second -
     * MB here uses the ISO notation, of powers of 10.
     */
    @JsonProperty(value = "properties.diskMBpsReadOnly")
    private Long diskMBpsReadOnly;

    /*
     * The maximum number of VMs that can attach to the disk at the same time.
     * Value greater than one indicates a disk that can be mounted on multiple
     * VMs at the same time.
     */
    @JsonProperty(value = "properties.maxShares")
    private Integer maxShares;

    /*
     * Encryption property can be used to encrypt data at rest with customer
     * managed keys or platform managed keys.
     */
    @JsonProperty(value = "properties.encryption")
    private Encryption encryption;

    /*
     * Policy for accessing the disk via network.
     */
    @JsonProperty(value = "properties.networkAccessPolicy")
    private NetworkAccessPolicy networkAccessPolicy;

    /*
     * ARM id of the DiskAccess resource for using private endpoints on disks.
     */
    @JsonProperty(value = "properties.diskAccessId")
    private String diskAccessId;

    /*
     * Performance tier of the disk (e.g, P4, S10) as described here:
     * https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does
     * not apply to Ultra disks.
     */
    @JsonProperty(value = "properties.tier")
    private String tier;

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku property: The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS, or UltraSSD_LRS.
     *
     * @return the sku value.
     */
    public DiskSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS, or UltraSSD_LRS.
     *
     * @param sku the sku value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withSku(DiskSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the osType property: the Operating System type.
     *
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType property: the Operating System type.
     *
     * @param osType the osType value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     *
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     *
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the encryptionSettingsCollection property: Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     *
     * @return the encryptionSettingsCollection value.
     */
    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.encryptionSettingsCollection;
    }

    /**
     * Set the encryptionSettingsCollection property: Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     *
     * @param encryptionSettingsCollection the encryptionSettingsCollection value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        this.encryptionSettingsCollection = encryptionSettingsCollection;
        return this;
    }

    /**
     * Get the diskIopsReadWrite property: The number of IOPS allowed for this disk; only settable for UltraSSD disks.
     * One operation can transfer between 4k and 256k bytes.
     *
     * @return the diskIopsReadWrite value.
     */
    public Long diskIopsReadWrite() {
        return this.diskIopsReadWrite;
    }

    /**
     * Set the diskIopsReadWrite property: The number of IOPS allowed for this disk; only settable for UltraSSD disks.
     * One operation can transfer between 4k and 256k bytes.
     *
     * @param diskIopsReadWrite the diskIopsReadWrite value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withDiskIopsReadWrite(Long diskIopsReadWrite) {
        this.diskIopsReadWrite = diskIopsReadWrite;
        return this;
    }

    /**
     * Get the diskMBpsReadWrite property: The bandwidth allowed for this disk; only settable for UltraSSD disks. MBps
     * means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     *
     * @return the diskMBpsReadWrite value.
     */
    public Long diskMBpsReadWrite() {
        return this.diskMBpsReadWrite;
    }

    /**
     * Set the diskMBpsReadWrite property: The bandwidth allowed for this disk; only settable for UltraSSD disks. MBps
     * means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     *
     * @param diskMBpsReadWrite the diskMBpsReadWrite value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withDiskMBpsReadWrite(Long diskMBpsReadWrite) {
        this.diskMBpsReadWrite = diskMBpsReadWrite;
        return this;
    }

    /**
     * Get the diskIopsReadOnly property: The total number of IOPS that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. One operation can transfer between 4k and 256k bytes.
     *
     * @return the diskIopsReadOnly value.
     */
    public Long diskIopsReadOnly() {
        return this.diskIopsReadOnly;
    }

    /**
     * Set the diskIopsReadOnly property: The total number of IOPS that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. One operation can transfer between 4k and 256k bytes.
     *
     * @param diskIopsReadOnly the diskIopsReadOnly value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withDiskIopsReadOnly(Long diskIopsReadOnly) {
        this.diskIopsReadOnly = diskIopsReadOnly;
        return this;
    }

    /**
     * Get the diskMBpsReadOnly property: The total throughput (MBps) that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of
     * 10.
     *
     * @return the diskMBpsReadOnly value.
     */
    public Long diskMBpsReadOnly() {
        return this.diskMBpsReadOnly;
    }

    /**
     * Set the diskMBpsReadOnly property: The total throughput (MBps) that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of
     * 10.
     *
     * @param diskMBpsReadOnly the diskMBpsReadOnly value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withDiskMBpsReadOnly(Long diskMBpsReadOnly) {
        this.diskMBpsReadOnly = diskMBpsReadOnly;
        return this;
    }

    /**
     * Get the maxShares property: The maximum number of VMs that can attach to the disk at the same time. Value greater
     * than one indicates a disk that can be mounted on multiple VMs at the same time.
     *
     * @return the maxShares value.
     */
    public Integer maxShares() {
        return this.maxShares;
    }

    /**
     * Set the maxShares property: The maximum number of VMs that can attach to the disk at the same time. Value greater
     * than one indicates a disk that can be mounted on multiple VMs at the same time.
     *
     * @param maxShares the maxShares value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withMaxShares(Integer maxShares) {
        this.maxShares = maxShares;
        return this;
    }

    /**
     * Get the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @param encryption the encryption value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the networkAccessPolicy property: Policy for accessing the disk via network.
     *
     * @return the networkAccessPolicy value.
     */
    public NetworkAccessPolicy networkAccessPolicy() {
        return this.networkAccessPolicy;
    }

    /**
     * Set the networkAccessPolicy property: Policy for accessing the disk via network.
     *
     * @param networkAccessPolicy the networkAccessPolicy value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withNetworkAccessPolicy(NetworkAccessPolicy networkAccessPolicy) {
        this.networkAccessPolicy = networkAccessPolicy;
        return this;
    }

    /**
     * Get the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @return the diskAccessId value.
     */
    public String diskAccessId() {
        return this.diskAccessId;
    }

    /**
     * Set the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @param diskAccessId the diskAccessId value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withDiskAccessId(String diskAccessId) {
        this.diskAccessId = diskAccessId;
        return this;
    }

    /**
     * Get the tier property: Performance tier of the disk (e.g, P4, S10) as described here:
     * https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does not apply to Ultra disks.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Performance tier of the disk (e.g, P4, S10) as described here:
     * https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does not apply to Ultra disks.
     *
     * @param tier the tier value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (encryptionSettingsCollection() != null) {
            encryptionSettingsCollection().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
    }
}
