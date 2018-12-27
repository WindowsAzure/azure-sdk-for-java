/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Access.
 */
public final class Access extends ExpandableStringEnum<Access> {
    /** Static value Allow for Access. */
    public static final Access ALLOW = fromString("Allow");

    /** Static value Deny for Access. */
    public static final Access DENY = fromString("Deny");

    /**
     * Creates or finds a Access from its string representation.
     * @param name a name to look for
     * @return the corresponding Access
     */
    @JsonCreator
    public static Access fromString(String name) {
        return fromString(name, Access.class);
    }

    /**
     * @return known Access values
     */
    public static Collection<Access> values() {
        return values(Access.class);
    }
}
