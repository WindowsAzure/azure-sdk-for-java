/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for HostType.
 */
public final class HostType extends ExpandableStringEnum<HostType> {
    /** Static value Invalid for HostType. */
    public static final HostType INVALID = fromString("Invalid");

    /** Static value ExeHost for HostType. */
    public static final HostType EXE_HOST = fromString("ExeHost");

    /** Static value ContainerHost for HostType. */
    public static final HostType CONTAINER_HOST = fromString("ContainerHost");

    /**
     * Creates or finds a HostType from its string representation.
     * @param name a name to look for
     * @return the corresponding HostType
     */
    @JsonCreator
    public static HostType fromString(String name) {
        return fromString(name, HostType.class);
    }

    /**
     * @return known HostType values
     */
    public static Collection<HostType> values() {
        return values(HostType.class);
    }
}
