/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01.implementation;

import com.microsoft.azure.management.compute.v2020_12_01.SnapshotSku;
import com.microsoft.azure.management.compute.v2020_12_01.ExtendedLocation;
import org.joda.time.DateTime;
import com.microsoft.azure.management.compute.v2020_12_01.OperatingSystemTypes;
import com.microsoft.azure.management.compute.v2020_12_01.HyperVGeneration;
import com.microsoft.azure.management.compute.v2020_12_01.PurchasePlan;
import com.microsoft.azure.management.compute.v2020_12_01.CreationData;
import com.microsoft.azure.management.compute.v2020_12_01.DiskState;
import com.microsoft.azure.management.compute.v2020_12_01.EncryptionSettingsCollection;
import com.microsoft.azure.management.compute.v2020_12_01.Encryption;
import com.microsoft.azure.management.compute.v2020_12_01.NetworkAccessPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Snapshot resource.
 */
@JsonFlatten
public class SnapshotInner extends Resource {
    /**
     * Unused. Always Null.
     */
    @JsonProperty(value = "managedBy", access = JsonProperty.Access.WRITE_ONLY)
    private String managedBy;

    /**
     * The sku property.
     */
    @JsonProperty(value = "sku")
    private SnapshotSku sku;

    /**
     * The extended location where the snapshot will be created. Extended
     * location cannot be changed.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /**
     * The time when the snapshot was created.
     */
    @JsonProperty(value = "properties.timeCreated", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime timeCreated;

    /**
     * The Operating System type. Possible values include: 'Windows', 'Linux'.
     */
    @JsonProperty(value = "properties.osType")
    private OperatingSystemTypes osType;

    /**
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks
     * only. Possible values include: 'V1', 'V2'.
     */
    @JsonProperty(value = "properties.hyperVGeneration")
    private HyperVGeneration hyperVGeneration;

    /**
     * Purchase plan information for the image from which the source disk for
     * the snapshot was originally created.
     */
    @JsonProperty(value = "properties.purchasePlan")
    private PurchasePlan purchasePlan;

    /**
     * Disk source information. CreationData information cannot be changed
     * after the disk has been created.
     */
    @JsonProperty(value = "properties.creationData", required = true)
    private CreationData creationData;

    /**
     * If creationData.createOption is Empty, this field is mandatory and it
     * indicates the size of the disk to create. If this field is present for
     * updates or creation with other options, it indicates a resize. Resizes
     * are only allowed if the disk is not attached to a running VM, and can
     * only increase the disk's size.
     */
    @JsonProperty(value = "properties.diskSizeGB")
    private Integer diskSizeGB;

    /**
     * The size of the disk in bytes. This field is read only.
     */
    @JsonProperty(value = "properties.diskSizeBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long diskSizeBytes;

    /**
     * The state of the snapshot. Possible values include: 'Unattached',
     * 'Attached', 'Reserved', 'ActiveSAS', 'ReadyToUpload', 'ActiveUpload'.
     */
    @JsonProperty(value = "properties.diskState")
    private DiskState diskState;

    /**
     * Unique Guid identifying the resource.
     */
    @JsonProperty(value = "properties.uniqueId", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueId;

    /**
     * Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     */
    @JsonProperty(value = "properties.encryptionSettingsCollection")
    private EncryptionSettingsCollection encryptionSettingsCollection;

    /**
     * The disk provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Whether a snapshot is incremental. Incremental snapshots on the same
     * disk occupy less space than full snapshots and can be diffed.
     */
    @JsonProperty(value = "properties.incremental")
    private Boolean incremental;

    /**
     * Encryption property can be used to encrypt data at rest with customer
     * managed keys or platform managed keys.
     */
    @JsonProperty(value = "properties.encryption")
    private Encryption encryption;

    /**
     * Possible values include: 'AllowAll', 'AllowPrivate', 'DenyAll'.
     */
    @JsonProperty(value = "properties.networkAccessPolicy")
    private NetworkAccessPolicy networkAccessPolicy;

    /**
     * ARM id of the DiskAccess resource for using private endpoints on disks.
     */
    @JsonProperty(value = "properties.diskAccessId")
    private String diskAccessId;

    /**
     * Get unused. Always Null.
     *
     * @return the managedBy value
     */
    public String managedBy() {
        return this.managedBy;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public SnapshotSku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withSku(SnapshotSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the extended location where the snapshot will be created. Extended location cannot be changed.
     *
     * @return the extendedLocation value
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extended location where the snapshot will be created. Extended location cannot be changed.
     *
     * @param extendedLocation the extendedLocation value to set
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the time when the snapshot was created.
     *
     * @return the timeCreated value
     */
    public DateTime timeCreated() {
        return this.timeCreated;
    }

    /**
     * Get the Operating System type. Possible values include: 'Windows', 'Linux'.
     *
     * @return the osType value
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the Operating System type. Possible values include: 'Windows', 'Linux'.
     *
     * @param osType the osType value to set
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the hypervisor generation of the Virtual Machine. Applicable to OS disks only. Possible values include: 'V1', 'V2'.
     *
     * @return the hyperVGeneration value
     */
    public HyperVGeneration hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Set the hypervisor generation of the Virtual Machine. Applicable to OS disks only. Possible values include: 'V1', 'V2'.
     *
     * @param hyperVGeneration the hyperVGeneration value to set
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        this.hyperVGeneration = hyperVGeneration;
        return this;
    }

    /**
     * Get purchase plan information for the image from which the source disk for the snapshot was originally created.
     *
     * @return the purchasePlan value
     */
    public PurchasePlan purchasePlan() {
        return this.purchasePlan;
    }

    /**
     * Set purchase plan information for the image from which the source disk for the snapshot was originally created.
     *
     * @param purchasePlan the purchasePlan value to set
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withPurchasePlan(PurchasePlan purchasePlan) {
        this.purchasePlan = purchasePlan;
        return this;
    }

    /**
     * Get disk source information. CreationData information cannot be changed after the disk has been created.
     *
     * @return the creationData value
     */
    public CreationData creationData() {
        return this.creationData;
    }

    /**
     * Set disk source information. CreationData information cannot be changed after the disk has been created.
     *
     * @param creationData the creationData value to set
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withCreationData(CreationData creationData) {
        this.creationData = creationData;
        return this;
    }

    /**
     * Get if creationData.createOption is Empty, this field is mandatory and it indicates the size of the disk to create. If this field is present for updates or creation with other options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's size.
     *
     * @return the diskSizeGB value
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set if creationData.createOption is Empty, this field is mandatory and it indicates the size of the disk to create. If this field is present for updates or creation with other options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's size.
     *
     * @param diskSizeGB the diskSizeGB value to set
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the size of the disk in bytes. This field is read only.
     *
     * @return the diskSizeBytes value
     */
    public Long diskSizeBytes() {
        return this.diskSizeBytes;
    }

    /**
     * Get the state of the snapshot. Possible values include: 'Unattached', 'Attached', 'Reserved', 'ActiveSAS', 'ReadyToUpload', 'ActiveUpload'.
     *
     * @return the diskState value
     */
    public DiskState diskState() {
        return this.diskState;
    }

    /**
     * Set the state of the snapshot. Possible values include: 'Unattached', 'Attached', 'Reserved', 'ActiveSAS', 'ReadyToUpload', 'ActiveUpload'.
     *
     * @param diskState the diskState value to set
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withDiskState(DiskState diskState) {
        this.diskState = diskState;
        return this;
    }

    /**
     * Get unique Guid identifying the resource.
     *
     * @return the uniqueId value
     */
    public String uniqueId() {
        return this.uniqueId;
    }

    /**
     * Get encryption settings collection used be Azure Disk Encryption, can contain multiple encryption settings per disk or snapshot.
     *
     * @return the encryptionSettingsCollection value
     */
    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.encryptionSettingsCollection;
    }

    /**
     * Set encryption settings collection used be Azure Disk Encryption, can contain multiple encryption settings per disk or snapshot.
     *
     * @param encryptionSettingsCollection the encryptionSettingsCollection value to set
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        this.encryptionSettingsCollection = encryptionSettingsCollection;
        return this;
    }

    /**
     * Get the disk provisioning state.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get whether a snapshot is incremental. Incremental snapshots on the same disk occupy less space than full snapshots and can be diffed.
     *
     * @return the incremental value
     */
    public Boolean incremental() {
        return this.incremental;
    }

    /**
     * Set whether a snapshot is incremental. Incremental snapshots on the same disk occupy less space than full snapshots and can be diffed.
     *
     * @param incremental the incremental value to set
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withIncremental(Boolean incremental) {
        this.incremental = incremental;
        return this;
    }

    /**
     * Get encryption property can be used to encrypt data at rest with customer managed keys or platform managed keys.
     *
     * @return the encryption value
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set encryption property can be used to encrypt data at rest with customer managed keys or platform managed keys.
     *
     * @param encryption the encryption value to set
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get possible values include: 'AllowAll', 'AllowPrivate', 'DenyAll'.
     *
     * @return the networkAccessPolicy value
     */
    public NetworkAccessPolicy networkAccessPolicy() {
        return this.networkAccessPolicy;
    }

    /**
     * Set possible values include: 'AllowAll', 'AllowPrivate', 'DenyAll'.
     *
     * @param networkAccessPolicy the networkAccessPolicy value to set
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withNetworkAccessPolicy(NetworkAccessPolicy networkAccessPolicy) {
        this.networkAccessPolicy = networkAccessPolicy;
        return this;
    }

    /**
     * Get aRM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @return the diskAccessId value
     */
    public String diskAccessId() {
        return this.diskAccessId;
    }

    /**
     * Set aRM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @param diskAccessId the diskAccessId value to set
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withDiskAccessId(String diskAccessId) {
        this.diskAccessId = diskAccessId;
        return this;
    }

}
