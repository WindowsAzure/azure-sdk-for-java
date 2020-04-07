// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for KeyType.
 */
public final class KeyType extends ExpandableStringEnum<KeyType> {
    /**
     * Static value Service for KeyType.
     */
    public static final KeyType SERVICE = fromString("Service");

    /**
     * Static value Account for KeyType.
     */
    public static final KeyType ACCOUNT = fromString("Account");

    /**
     * Creates or finds a KeyType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding KeyType.
     */
    @JsonCreator
    public static KeyType fromString(String name) {
        return fromString(name, KeyType.class);
    }

    /**
     * @return known KeyType values.
     */
    public static Collection<KeyType> values() {
        return values(KeyType.class);
    }
}
