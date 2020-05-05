/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.v2016_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ResourceIdentityType.
 */
public final class ResourceIdentityType extends ExpandableStringEnum<ResourceIdentityType> {
    /** Static value SystemAssigned for ResourceIdentityType. */
    public static final ResourceIdentityType SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /** Static value None for ResourceIdentityType. */
    public static final ResourceIdentityType NONE = fromString("None");

    /**
     * Creates or finds a ResourceIdentityType from its string representation.
     * @param name a name to look for
     * @return the corresponding ResourceIdentityType
     */
    @JsonCreator
    public static ResourceIdentityType fromString(String name) {
        return fromString(name, ResourceIdentityType.class);
    }

    /**
     * @return known ResourceIdentityType values
     */
    public static Collection<ResourceIdentityType> values() {
        return values(ResourceIdentityType.class);
    }
}
