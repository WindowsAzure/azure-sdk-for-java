/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for VpnLinkConnectionMode.
 */
public final class VpnLinkConnectionMode extends ExpandableStringEnum<VpnLinkConnectionMode> {
    /** Static value Default for VpnLinkConnectionMode. */
    public static final VpnLinkConnectionMode DEFAULT = fromString("Default");

    /** Static value ResponderOnly for VpnLinkConnectionMode. */
    public static final VpnLinkConnectionMode RESPONDER_ONLY = fromString("ResponderOnly");

    /** Static value InitiatorOnly for VpnLinkConnectionMode. */
    public static final VpnLinkConnectionMode INITIATOR_ONLY = fromString("InitiatorOnly");

    /**
     * Creates or finds a VpnLinkConnectionMode from its string representation.
     * @param name a name to look for
     * @return the corresponding VpnLinkConnectionMode
     */
    @JsonCreator
    public static VpnLinkConnectionMode fromString(String name) {
        return fromString(name, VpnLinkConnectionMode.class);
    }

    /**
     * @return known VpnLinkConnectionMode values
     */
    public static Collection<VpnLinkConnectionMode> values() {
        return values(VpnLinkConnectionMode.class);
    }
}
