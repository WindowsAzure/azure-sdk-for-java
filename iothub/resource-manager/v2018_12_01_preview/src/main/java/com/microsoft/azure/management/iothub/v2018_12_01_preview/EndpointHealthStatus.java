/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_12_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for EndpointHealthStatus.
 */
public final class EndpointHealthStatus extends ExpandableStringEnum<EndpointHealthStatus> {
    /** Static value unknown for EndpointHealthStatus. */
    public static final EndpointHealthStatus UNKNOWN = fromString("unknown");

    /** Static value healthy for EndpointHealthStatus. */
    public static final EndpointHealthStatus HEALTHY = fromString("healthy");

    /** Static value unhealthy for EndpointHealthStatus. */
    public static final EndpointHealthStatus UNHEALTHY = fromString("unhealthy");

    /** Static value dead for EndpointHealthStatus. */
    public static final EndpointHealthStatus DEAD = fromString("dead");

    /**
     * Creates or finds a EndpointHealthStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding EndpointHealthStatus
     */
    @JsonCreator
    public static EndpointHealthStatus fromString(String name) {
        return fromString(name, EndpointHealthStatus.class);
    }

    /**
     * @return known EndpointHealthStatus values
     */
    public static Collection<EndpointHealthStatus> values() {
        return values(EndpointHealthStatus.class);
    }
}
