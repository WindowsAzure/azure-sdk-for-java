/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2019_09_16;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ManagedServiceIdentityType.
 */
public final class ManagedServiceIdentityType extends ExpandableStringEnum<ManagedServiceIdentityType> {
    /** Static value SystemAssigned for ManagedServiceIdentityType. */
    public static final ManagedServiceIdentityType SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /** Static value None for ManagedServiceIdentityType. */
    public static final ManagedServiceIdentityType NONE = fromString("None");

    /**
     * Creates or finds a ManagedServiceIdentityType from its string representation.
     * @param name a name to look for
     * @return the corresponding ManagedServiceIdentityType
     */
    @JsonCreator
    public static ManagedServiceIdentityType fromString(String name) {
        return fromString(name, ManagedServiceIdentityType.class);
    }

    /**
     * @return known ManagedServiceIdentityType values
     */
    public static Collection<ManagedServiceIdentityType> values() {
        return values(ManagedServiceIdentityType.class);
    }
}
