/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2017_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Disk settings which will be used by the data disks associated to
 * Compute Nodes in the pool.
 */
public class DataDisk {
    /**
     * The logical unit number.
     * The lun is used to uniquely identify each data disk. If attaching
     * multiple disks, each should have a distinct lun.
     */
    @JsonProperty(value = "lun", required = true)
    private int lun;

    /**
     * The type of caching to be enabled for the data disks.
     * Values are:
     *
     * none - The caching mode for the disk is not enabled.
     * readOnly - The caching mode for the disk is read only.
     * readWrite - The caching mode for the disk is read and write.
     *
     * The default value for caching is none. For information about the caching
     * options see:
     * https://blogs.msdn.microsoft.com/windowsazurestorage/2012/06/27/exploring-windows-azure-drives-disks-and-images/.
     * Possible values include: 'None', 'ReadOnly', 'ReadWrite'.
     */
    @JsonProperty(value = "caching")
    private CachingType caching;

    /**
     * The initial disk size in GB when creating new data disk.
     */
    @JsonProperty(value = "diskSizeGB", required = true)
    private int diskSizeGB;

    /**
     * The storage account type to be used for the data disk.
     * If omitted, the default is "Standard_LRS". Values are:
     *
     * Standard_LRS - The data disk should use standard locally redundant
     * storage.
     * Premium_LRS - The data disk should use premium locally redundant
     * storage. Possible values include: 'Standard_LRS', 'Premium_LRS'.
     */
    @JsonProperty(value = "storageAccountType")
    private StorageAccountType storageAccountType;

    /**
     * Get the lun is used to uniquely identify each data disk. If attaching multiple disks, each should have a distinct lun.
     *
     * @return the lun value
     */
    public int lun() {
        return this.lun;
    }

    /**
     * Set the lun is used to uniquely identify each data disk. If attaching multiple disks, each should have a distinct lun.
     *
     * @param lun the lun value to set
     * @return the DataDisk object itself.
     */
    public DataDisk withLun(int lun) {
        this.lun = lun;
        return this;
    }

    /**
     * Get values are:
      none - The caching mode for the disk is not enabled.
      readOnly - The caching mode for the disk is read only.
      readWrite - The caching mode for the disk is read and write.
      The default value for caching is none. For information about the caching options see: https://blogs.msdn.microsoft.com/windowsazurestorage/2012/06/27/exploring-windows-azure-drives-disks-and-images/. Possible values include: 'None', 'ReadOnly', 'ReadWrite'.
     *
     * @return the caching value
     */
    public CachingType caching() {
        return this.caching;
    }

    /**
     * Set values are:
      none - The caching mode for the disk is not enabled.
      readOnly - The caching mode for the disk is read only.
      readWrite - The caching mode for the disk is read and write.
      The default value for caching is none. For information about the caching options see: https://blogs.msdn.microsoft.com/windowsazurestorage/2012/06/27/exploring-windows-azure-drives-disks-and-images/. Possible values include: 'None', 'ReadOnly', 'ReadWrite'.
     *
     * @param caching the caching value to set
     * @return the DataDisk object itself.
     */
    public DataDisk withCaching(CachingType caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get the diskSizeGB value.
     *
     * @return the diskSizeGB value
     */
    public int diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB value.
     *
     * @param diskSizeGB the diskSizeGB value to set
     * @return the DataDisk object itself.
     */
    public DataDisk withDiskSizeGB(int diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get if omitted, the default is "Standard_LRS". Values are:
      Standard_LRS - The data disk should use standard locally redundant storage.
      Premium_LRS - The data disk should use premium locally redundant storage. Possible values include: 'Standard_LRS', 'Premium_LRS'.
     *
     * @return the storageAccountType value
     */
    public StorageAccountType storageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Set if omitted, the default is "Standard_LRS". Values are:
      Standard_LRS - The data disk should use standard locally redundant storage.
      Premium_LRS - The data disk should use premium locally redundant storage. Possible values include: 'Standard_LRS', 'Premium_LRS'.
     *
     * @param storageAccountType the storageAccountType value to set
     * @return the DataDisk object itself.
     */
    public DataDisk withStorageAccountType(StorageAccountType storageAccountType) {
        this.storageAccountType = storageAccountType;
        return this;
    }

}
