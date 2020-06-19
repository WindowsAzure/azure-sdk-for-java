/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for VirtualWanSecurityProviderType.
 */
public final class VirtualWanSecurityProviderType extends ExpandableStringEnum<VirtualWanSecurityProviderType> {
    /** Static value External for VirtualWanSecurityProviderType. */
    public static final VirtualWanSecurityProviderType EXTERNAL = fromString("External");

    /** Static value Native for VirtualWanSecurityProviderType. */
    public static final VirtualWanSecurityProviderType NATIVE = fromString("Native");

    /**
     * Creates or finds a VirtualWanSecurityProviderType from its string representation.
     * @param name a name to look for
     * @return the corresponding VirtualWanSecurityProviderType
     */
    @JsonCreator
    public static VirtualWanSecurityProviderType fromString(String name) {
        return fromString(name, VirtualWanSecurityProviderType.class);
    }

    /**
     * @return known VirtualWanSecurityProviderType values
     */
    public static Collection<VirtualWanSecurityProviderType> values() {
        return values(VirtualWanSecurityProviderType.class);
    }
}
