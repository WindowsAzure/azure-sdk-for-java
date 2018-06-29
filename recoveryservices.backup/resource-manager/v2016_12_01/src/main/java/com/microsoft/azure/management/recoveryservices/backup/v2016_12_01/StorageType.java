/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for StorageType.
 */
public final class StorageType extends ExpandableStringEnum<StorageType> {
    /** Static value Invalid for StorageType. */
    public static final StorageType INVALID = fromString("Invalid");

    /** Static value GeoRedundant for StorageType. */
    public static final StorageType GEO_REDUNDANT = fromString("GeoRedundant");

    /** Static value LocallyRedundant for StorageType. */
    public static final StorageType LOCALLY_REDUNDANT = fromString("LocallyRedundant");

    /**
     * Creates or finds a StorageType from its string representation.
     * @param name a name to look for
     * @return the corresponding StorageType
     */
    @JsonCreator
    public static StorageType fromString(String name) {
        return fromString(name, StorageType.class);
    }

    /**
     * @return known StorageType values
     */
    public static Collection<StorageType> values() {
        return values(StorageType.class);
    }
}
