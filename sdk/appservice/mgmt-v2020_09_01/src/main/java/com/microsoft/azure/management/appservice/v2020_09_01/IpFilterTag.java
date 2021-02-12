/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for IpFilterTag.
 */
public final class IpFilterTag extends ExpandableStringEnum<IpFilterTag> {
    /** Static value Default for IpFilterTag. */
    public static final IpFilterTag DEFAULT = fromString("Default");

    /** Static value XffProxy for IpFilterTag. */
    public static final IpFilterTag XFF_PROXY = fromString("XffProxy");

    /** Static value ServiceTag for IpFilterTag. */
    public static final IpFilterTag SERVICE_TAG = fromString("ServiceTag");

    /**
     * Creates or finds a IpFilterTag from its string representation.
     * @param name a name to look for
     * @return the corresponding IpFilterTag
     */
    @JsonCreator
    public static IpFilterTag fromString(String name) {
        return fromString(name, IpFilterTag.class);
    }

    /**
     * @return known IpFilterTag values
     */
    public static Collection<IpFilterTag> values() {
        return values(IpFilterTag.class);
    }
}
