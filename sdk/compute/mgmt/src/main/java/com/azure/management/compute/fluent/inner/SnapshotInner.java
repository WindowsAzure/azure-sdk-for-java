// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.compute.models.CreationData;
import com.azure.management.compute.models.Encryption;
import com.azure.management.compute.models.EncryptionSettingsCollection;
import com.azure.management.compute.models.HyperVGeneration;
import com.azure.management.compute.models.OperatingSystemTypes;
import com.azure.management.compute.models.SnapshotSku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The Snapshot model. */
@JsonFlatten
@Fluent
public class SnapshotInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SnapshotInner.class);

    /*
     * Unused. Always Null.
     */
    @JsonProperty(value = "managedBy", access = JsonProperty.Access.WRITE_ONLY)
    private String managedBy;

    /*
     * The snapshots sku name. Can be Standard_LRS, Premium_LRS, or
     * Standard_ZRS.
     */
    @JsonProperty(value = "sku")
    private SnapshotSku sku;

    /*
     * The time when the disk was created.
     */
    @JsonProperty(value = "properties.timeCreated", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timeCreated;

    /*
     * The Operating System type.
     */
    @JsonProperty(value = "properties.osType")
    private OperatingSystemTypes osType;

    /*
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks
     * only.
     */
    @JsonProperty(value = "properties.hyperVGeneration")
    private HyperVGeneration hyperVGeneration;

    /*
     * Disk source information. CreationData information cannot be changed
     * after the disk has been created.
     */
    @JsonProperty(value = "properties.creationData")
    private CreationData creationData;

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
     * The size of the disk in bytes. This field is read only.
     */
    @JsonProperty(value = "properties.diskSizeBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long diskSizeBytes;

    /*
     * Unique Guid identifying the resource.
     */
    @JsonProperty(value = "properties.uniqueId", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueId;

    /*
     * Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     */
    @JsonProperty(value = "properties.encryptionSettingsCollection")
    private EncryptionSettingsCollection encryptionSettingsCollection;

    /*
     * The disk provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Whether a snapshot is incremental. Incremental snapshots on the same
     * disk occupy less space than full snapshots and can be diffed.
     */
    @JsonProperty(value = "properties.incremental")
    private Boolean incremental;

    /*
     * Encryption property can be used to encrypt data at rest with customer
     * managed keys or platform managed keys.
     */
    @JsonProperty(value = "properties.encryption")
    private Encryption encryption;

    /**
     * Get the managedBy property: Unused. Always Null.
     *
     * @return the managedBy value.
     */
    public String managedBy() {
        return this.managedBy;
    }

    /**
     * Get the sku property: The snapshots sku name. Can be Standard_LRS, Premium_LRS, or Standard_ZRS.
     *
     * @return the sku value.
     */
    public SnapshotSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The snapshots sku name. Can be Standard_LRS, Premium_LRS, or Standard_ZRS.
     *
     * @param sku the sku value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withSku(SnapshotSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the timeCreated property: The time when the disk was created.
     *
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.timeCreated;
    }

    /**
     * Get the osType property: The Operating System type.
     *
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType property: The Operating System type.
     *
     * @param osType the osType value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     *
     * @return the hyperVGeneration value.
     */
    public HyperVGeneration hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Set the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     *
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        this.hyperVGeneration = hyperVGeneration;
        return this;
    }

    /**
     * Get the creationData property: Disk source information. CreationData information cannot be changed after the disk
     * has been created.
     *
     * @return the creationData value.
     */
    public CreationData creationData() {
        return this.creationData;
    }

    /**
     * Set the creationData property: Disk source information. CreationData information cannot be changed after the disk
     * has been created.
     *
     * @param creationData the creationData value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withCreationData(CreationData creationData) {
        this.creationData = creationData;
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
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the diskSizeBytes property: The size of the disk in bytes. This field is read only.
     *
     * @return the diskSizeBytes value.
     */
    public Long diskSizeBytes() {
        return this.diskSizeBytes;
    }

    /**
     * Get the uniqueId property: Unique Guid identifying the resource.
     *
     * @return the uniqueId value.
     */
    public String uniqueId() {
        return this.uniqueId;
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
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        this.encryptionSettingsCollection = encryptionSettingsCollection;
        return this;
    }

    /**
     * Get the provisioningState property: The disk provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the incremental property: Whether a snapshot is incremental. Incremental snapshots on the same disk occupy
     * less space than full snapshots and can be diffed.
     *
     * @return the incremental value.
     */
    public Boolean incremental() {
        return this.incremental;
    }

    /**
     * Set the incremental property: Whether a snapshot is incremental. Incremental snapshots on the same disk occupy
     * less space than full snapshots and can be diffed.
     *
     * @param incremental the incremental value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withIncremental(Boolean incremental) {
        this.incremental = incremental;
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
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withEncryption(Encryption encryption) {
        this.encryption = encryption;
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
        if (creationData() != null) {
            creationData().validate();
        }
        if (encryptionSettingsCollection() != null) {
            encryptionSettingsCollection().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
    }
}
