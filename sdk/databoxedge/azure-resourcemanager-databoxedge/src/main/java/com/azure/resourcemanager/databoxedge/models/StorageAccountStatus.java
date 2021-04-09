// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for StorageAccountStatus. */
public final class StorageAccountStatus extends ExpandableStringEnum<StorageAccountStatus> {
    /** Static value OK for StorageAccountStatus. */
    public static final StorageAccountStatus OK = fromString("OK");

    /** Static value Offline for StorageAccountStatus. */
    public static final StorageAccountStatus OFFLINE = fromString("Offline");

    /** Static value Unknown for StorageAccountStatus. */
    public static final StorageAccountStatus UNKNOWN = fromString("Unknown");

    /** Static value Updating for StorageAccountStatus. */
    public static final StorageAccountStatus UPDATING = fromString("Updating");

    /** Static value NeedsAttention for StorageAccountStatus. */
    public static final StorageAccountStatus NEEDS_ATTENTION = fromString("NeedsAttention");

    /**
     * Creates or finds a StorageAccountStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StorageAccountStatus.
     */
    @JsonCreator
    public static StorageAccountStatus fromString(String name) {
        return fromString(name, StorageAccountStatus.class);
    }

    /** @return known StorageAccountStatus values. */
    public static Collection<StorageAccountStatus> values() {
        return values(StorageAccountStatus.class);
    }
}
