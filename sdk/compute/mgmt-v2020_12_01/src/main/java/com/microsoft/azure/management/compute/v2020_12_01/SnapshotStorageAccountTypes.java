/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SnapshotStorageAccountTypes.
 */
public final class SnapshotStorageAccountTypes extends ExpandableStringEnum<SnapshotStorageAccountTypes> {
    /** Static value Standard_LRS for SnapshotStorageAccountTypes. */
    public static final SnapshotStorageAccountTypes STANDARD_LRS = fromString("Standard_LRS");

    /** Static value Premium_LRS for SnapshotStorageAccountTypes. */
    public static final SnapshotStorageAccountTypes PREMIUM_LRS = fromString("Premium_LRS");

    /** Static value Standard_ZRS for SnapshotStorageAccountTypes. */
    public static final SnapshotStorageAccountTypes STANDARD_ZRS = fromString("Standard_ZRS");

    /**
     * Creates or finds a SnapshotStorageAccountTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding SnapshotStorageAccountTypes
     */
    @JsonCreator
    public static SnapshotStorageAccountTypes fromString(String name) {
        return fromString(name, SnapshotStorageAccountTypes.class);
    }

    /**
     * @return known SnapshotStorageAccountTypes values
     */
    public static Collection<SnapshotStorageAccountTypes> values() {
        return values(SnapshotStorageAccountTypes.class);
    }
}
