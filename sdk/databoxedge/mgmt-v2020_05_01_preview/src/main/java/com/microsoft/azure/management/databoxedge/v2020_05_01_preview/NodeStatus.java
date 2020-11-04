/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for NodeStatus.
 */
public final class NodeStatus extends ExpandableStringEnum<NodeStatus> {
    /** Static value Unknown for NodeStatus. */
    public static final NodeStatus UNKNOWN = fromString("Unknown");

    /** Static value Up for NodeStatus. */
    public static final NodeStatus UP = fromString("Up");

    /** Static value Down for NodeStatus. */
    public static final NodeStatus DOWN = fromString("Down");

    /** Static value Rebooting for NodeStatus. */
    public static final NodeStatus REBOOTING = fromString("Rebooting");

    /** Static value ShuttingDown for NodeStatus. */
    public static final NodeStatus SHUTTING_DOWN = fromString("ShuttingDown");

    /**
     * Creates or finds a NodeStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding NodeStatus
     */
    @JsonCreator
    public static NodeStatus fromString(String name) {
        return fromString(name, NodeStatus.class);
    }

    /**
     * @return known NodeStatus values
     */
    public static Collection<NodeStatus> values() {
        return values(NodeStatus.class);
    }
}
