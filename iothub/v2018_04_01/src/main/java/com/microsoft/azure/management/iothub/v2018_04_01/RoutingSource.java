/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RoutingSource.
 */
public final class RoutingSource extends ExpandableStringEnum<RoutingSource> {
    /** Static value DeviceMessages for RoutingSource. */
    public static final RoutingSource DEVICE_MESSAGES = fromString("DeviceMessages");

    /** Static value TwinChangeEvents for RoutingSource. */
    public static final RoutingSource TWIN_CHANGE_EVENTS = fromString("TwinChangeEvents");

    /** Static value DeviceLifecycleEvents for RoutingSource. */
    public static final RoutingSource DEVICE_LIFECYCLE_EVENTS = fromString("DeviceLifecycleEvents");

    /** Static value DeviceJobLifecycleEvents for RoutingSource. */
    public static final RoutingSource DEVICE_JOB_LIFECYCLE_EVENTS = fromString("DeviceJobLifecycleEvents");

    /**
     * Creates or finds a RoutingSource from its string representation.
     * @param name a name to look for
     * @return the corresponding RoutingSource
     */
    @JsonCreator
    public static RoutingSource fromString(String name) {
        return fromString(name, RoutingSource.class);
    }

    /**
     * @return known RoutingSource values
     */
    public static Collection<RoutingSource> values() {
        return values(RoutingSource.class);
    }
}
