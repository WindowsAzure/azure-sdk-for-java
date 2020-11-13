/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DiskEncryptionTarget.
 */
public enum DiskEncryptionTarget {
    /** The temporary disk on the compute node is encrypted. On Linux this encryption applies to other partitions (such as those on mounted data disks) when encryption occurs at boot time. */
    OS_DISK("osdisk"),

    /** The temporary disk on the compute node is encrypted. On Linux this encryption applies to other partitions (such as those on mounted data disks) when encryption occurs at boot time. */
    TEMPORARY_DISK("temporarydisk");

    /** The actual serialized value for a DiskEncryptionTarget instance. */
    private String value;

    DiskEncryptionTarget(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DiskEncryptionTarget instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DiskEncryptionTarget object, or null if unable to parse.
     */
    @JsonCreator
    public static DiskEncryptionTarget fromString(String value) {
        DiskEncryptionTarget[] items = DiskEncryptionTarget.values();
        for (DiskEncryptionTarget item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
