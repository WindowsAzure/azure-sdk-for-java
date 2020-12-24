// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DiskEncryptionSetType. */
public final class DiskEncryptionSetType extends ExpandableStringEnum<DiskEncryptionSetType> {
    /** Static value EncryptionAtRestWithCustomerKey for DiskEncryptionSetType. */
    public static final DiskEncryptionSetType ENCRYPTION_AT_REST_WITH_CUSTOMER_KEY =
        fromString("EncryptionAtRestWithCustomerKey");

    /** Static value EncryptionAtRestWithPlatformAndCustomerKeys for DiskEncryptionSetType. */
    public static final DiskEncryptionSetType ENCRYPTION_AT_REST_WITH_PLATFORM_AND_CUSTOMER_KEYS =
        fromString("EncryptionAtRestWithPlatformAndCustomerKeys");

    /**
     * Creates or finds a DiskEncryptionSetType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DiskEncryptionSetType.
     */
    @JsonCreator
    public static DiskEncryptionSetType fromString(String name) {
        return fromString(name, DiskEncryptionSetType.class);
    }

    /** @return known DiskEncryptionSetType values. */
    public static Collection<DiskEncryptionSetType> values() {
        return values(DiskEncryptionSetType.class);
    }
}
