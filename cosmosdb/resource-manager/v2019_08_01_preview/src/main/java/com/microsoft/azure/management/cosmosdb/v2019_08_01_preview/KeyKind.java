/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for KeyKind.
 */
public final class KeyKind extends ExpandableStringEnum<KeyKind> {
    /** Static value primary for KeyKind. */
    public static final KeyKind PRIMARY = fromString("primary");

    /** Static value secondary for KeyKind. */
    public static final KeyKind SECONDARY = fromString("secondary");

    /** Static value primaryReadonly for KeyKind. */
    public static final KeyKind PRIMARY_READONLY = fromString("primaryReadonly");

    /** Static value secondaryReadonly for KeyKind. */
    public static final KeyKind SECONDARY_READONLY = fromString("secondaryReadonly");

    /**
     * Creates or finds a KeyKind from its string representation.
     * @param name a name to look for
     * @return the corresponding KeyKind
     */
    @JsonCreator
    public static KeyKind fromString(String name) {
        return fromString(name, KeyKind.class);
    }

    /**
     * @return known KeyKind values
     */
    public static Collection<KeyKind> values() {
        return values(KeyKind.class);
    }
}
