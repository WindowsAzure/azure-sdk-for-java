/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2019_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PrivateEndpointServiceConnectionStatus.
 */
public final class PrivateEndpointServiceConnectionStatus extends ExpandableStringEnum<PrivateEndpointServiceConnectionStatus> {
    /** Static value Pending for PrivateEndpointServiceConnectionStatus. */
    public static final PrivateEndpointServiceConnectionStatus PENDING = fromString("Pending");

    /** Static value Approved for PrivateEndpointServiceConnectionStatus. */
    public static final PrivateEndpointServiceConnectionStatus APPROVED = fromString("Approved");

    /** Static value Rejected for PrivateEndpointServiceConnectionStatus. */
    public static final PrivateEndpointServiceConnectionStatus REJECTED = fromString("Rejected");

    /** Static value Disconnected for PrivateEndpointServiceConnectionStatus. */
    public static final PrivateEndpointServiceConnectionStatus DISCONNECTED = fromString("Disconnected");

    /**
     * Creates or finds a PrivateEndpointServiceConnectionStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding PrivateEndpointServiceConnectionStatus
     */
    @JsonCreator
    public static PrivateEndpointServiceConnectionStatus fromString(String name) {
        return fromString(name, PrivateEndpointServiceConnectionStatus.class);
    }

    /**
     * @return known PrivateEndpointServiceConnectionStatus values
     */
    public static Collection<PrivateEndpointServiceConnectionStatus> values() {
        return values(PrivateEndpointServiceConnectionStatus.class);
    }
}
