/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Name.
 */
public final class Name extends ExpandableStringEnum<Name> {
    /** Static value Basic_Exchange_Free for Name. */
    public static final Name BASIC_EXCHANGE_FREE = fromString("Basic_Exchange_Free");

    /** Static value Basic_Direct_Free for Name. */
    public static final Name BASIC_DIRECT_FREE = fromString("Basic_Direct_Free");

    /** Static value Premium_Direct_Free for Name. */
    public static final Name PREMIUM_DIRECT_FREE = fromString("Premium_Direct_Free");

    /** Static value Premium_Exchange_Metered for Name. */
    public static final Name PREMIUM_EXCHANGE_METERED = fromString("Premium_Exchange_Metered");

    /**
     * Creates or finds a Name from its string representation.
     * @param name a name to look for
     * @return the corresponding Name
     */
    @JsonCreator
    public static Name fromString(String name) {
        return fromString(name, Name.class);
    }

    /**
     * @return known Name values
     */
    public static Collection<Name> values() {
        return values(Name.class);
    }
}
