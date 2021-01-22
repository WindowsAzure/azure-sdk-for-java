/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for IpAllocationType.
 */
public final class IpAllocationType extends ExpandableStringEnum<IpAllocationType> {
    /** Static value Undefined for IpAllocationType. */
    public static final IpAllocationType UNDEFINED = fromString("Undefined");

    /** Static value Hypernet for IpAllocationType. */
    public static final IpAllocationType HYPERNET = fromString("Hypernet");

    /**
     * Creates or finds a IpAllocationType from its string representation.
     * @param name a name to look for
     * @return the corresponding IpAllocationType
     */
    @JsonCreator
    public static IpAllocationType fromString(String name) {
        return fromString(name, IpAllocationType.class);
    }

    /**
     * @return known IpAllocationType values
     */
    public static Collection<IpAllocationType> values() {
        return values(IpAllocationType.class);
    }
}
