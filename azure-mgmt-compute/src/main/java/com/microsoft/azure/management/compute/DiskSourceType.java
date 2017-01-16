/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute;

/**
 * The source type of managed disk.
 */
public enum DiskSourceType {
    /**
     * Indicates that disk is created from Os disk image of a virtual machine platform
     * or virtual machine user image.
     */
    FROM_OS_DISK_IMAGE,
    /**
     * Indicates that disk is created from data disk image of a virtual machine platform
     * or virtual machine user image.
     */
    FROM_DATA_DISK_IMAGE,
    /**
     * Indicates that disk is created by importing a blob in a storage account.
     */
    IMPORTED_FROM_VHD,
    /**
     * Indicates that disk is created by copying a snapshot.
     */
    COPIED_FROM_SNAPSHOT,
    /**
     * Indicates that disk is created by copying another managed disk.
     */
    COPIED_FROM_DISK,
    /**
     * Indicates that disk is created as empty disk.
     */
    EMPTY,
    /**
     * Unknown source.
     */
    UNKNOWN
}
