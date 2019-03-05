/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for NetworkAdapterDHCPStatus.
 */
public final class NetworkAdapterDHCPStatus extends ExpandableStringEnum<NetworkAdapterDHCPStatus> {
    /** Static value Disabled for NetworkAdapterDHCPStatus. */
    public static final NetworkAdapterDHCPStatus DISABLED = fromString("Disabled");

    /** Static value Enabled for NetworkAdapterDHCPStatus. */
    public static final NetworkAdapterDHCPStatus ENABLED = fromString("Enabled");

    /**
     * Creates or finds a NetworkAdapterDHCPStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding NetworkAdapterDHCPStatus
     */
    @JsonCreator
    public static NetworkAdapterDHCPStatus fromString(String name) {
        return fromString(name, NetworkAdapterDHCPStatus.class);
    }

    /**
     * @return known NetworkAdapterDHCPStatus values
     */
    public static Collection<NetworkAdapterDHCPStatus> values() {
        return values(NetworkAdapterDHCPStatus.class);
    }
}
