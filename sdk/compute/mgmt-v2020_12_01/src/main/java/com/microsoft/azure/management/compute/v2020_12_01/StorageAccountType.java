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
 * Defines values for StorageAccountType.
 */
public final class StorageAccountType extends ExpandableStringEnum<StorageAccountType> {
    /** Static value Standard_LRS for StorageAccountType. */
    public static final StorageAccountType STANDARD_LRS = fromString("Standard_LRS");

    /** Static value Standard_ZRS for StorageAccountType. */
    public static final StorageAccountType STANDARD_ZRS = fromString("Standard_ZRS");

    /** Static value Premium_LRS for StorageAccountType. */
    public static final StorageAccountType PREMIUM_LRS = fromString("Premium_LRS");

    /**
     * Creates or finds a StorageAccountType from its string representation.
     * @param name a name to look for
     * @return the corresponding StorageAccountType
     */
    @JsonCreator
    public static StorageAccountType fromString(String name) {
        return fromString(name, StorageAccountType.class);
    }

    /**
     * @return known StorageAccountType values
     */
    public static Collection<StorageAccountType> values() {
        return values(StorageAccountType.class);
    }
}
