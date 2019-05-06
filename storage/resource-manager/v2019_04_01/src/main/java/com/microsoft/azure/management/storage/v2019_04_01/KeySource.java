/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for KeySource.
 */
public final class KeySource extends ExpandableStringEnum<KeySource> {
    /** Static value Microsoft.Storage for KeySource. */
    public static final KeySource MICROSOFT_STORAGE = fromString("Microsoft.Storage");

    /** Static value Microsoft.Keyvault for KeySource. */
    public static final KeySource MICROSOFT_KEYVAULT = fromString("Microsoft.Keyvault");

    /**
     * Creates or finds a KeySource from its string representation.
     * @param name a name to look for
     * @return the corresponding KeySource
     */
    @JsonCreator
    public static KeySource fromString(String name) {
        return fromString(name, KeySource.class);
    }

    /**
     * @return known KeySource values
     */
    public static Collection<KeySource> values() {
        return values(KeySource.class);
    }
}
