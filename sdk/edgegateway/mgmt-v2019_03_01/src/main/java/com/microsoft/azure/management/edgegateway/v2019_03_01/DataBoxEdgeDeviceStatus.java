/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.v2019_03_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DataBoxEdgeDeviceStatus.
 */
public final class DataBoxEdgeDeviceStatus extends ExpandableStringEnum<DataBoxEdgeDeviceStatus> {
    /** Static value ReadyToSetup for DataBoxEdgeDeviceStatus. */
    public static final DataBoxEdgeDeviceStatus READY_TO_SETUP = fromString("ReadyToSetup");

    /** Static value Online for DataBoxEdgeDeviceStatus. */
    public static final DataBoxEdgeDeviceStatus ONLINE = fromString("Online");

    /** Static value Offline for DataBoxEdgeDeviceStatus. */
    public static final DataBoxEdgeDeviceStatus OFFLINE = fromString("Offline");

    /** Static value NeedsAttention for DataBoxEdgeDeviceStatus. */
    public static final DataBoxEdgeDeviceStatus NEEDS_ATTENTION = fromString("NeedsAttention");

    /** Static value Disconnected for DataBoxEdgeDeviceStatus. */
    public static final DataBoxEdgeDeviceStatus DISCONNECTED = fromString("Disconnected");

    /** Static value PartiallyDisconnected for DataBoxEdgeDeviceStatus. */
    public static final DataBoxEdgeDeviceStatus PARTIALLY_DISCONNECTED = fromString("PartiallyDisconnected");

    /**
     * Creates or finds a DataBoxEdgeDeviceStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding DataBoxEdgeDeviceStatus
     */
    @JsonCreator
    public static DataBoxEdgeDeviceStatus fromString(String name) {
        return fromString(name, DataBoxEdgeDeviceStatus.class);
    }

    /**
     * @return known DataBoxEdgeDeviceStatus values
     */
    public static Collection<DataBoxEdgeDeviceStatus> values() {
        return values(DataBoxEdgeDeviceStatus.class);
    }
}
