/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ShareStatus.
 */
public final class ShareStatus extends ExpandableStringEnum<ShareStatus> {
    /** Static value Offline for ShareStatus. */
    public static final ShareStatus OFFLINE = fromString("Offline");

    /** Static value Unknown for ShareStatus. */
    public static final ShareStatus UNKNOWN = fromString("Unknown");

    /** Static value OK for ShareStatus. */
    public static final ShareStatus OK = fromString("OK");

    /** Static value Updating for ShareStatus. */
    public static final ShareStatus UPDATING = fromString("Updating");

    /** Static value NeedsAttention for ShareStatus. */
    public static final ShareStatus NEEDS_ATTENTION = fromString("NeedsAttention");

    /**
     * Creates or finds a ShareStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding ShareStatus
     */
    @JsonCreator
    public static ShareStatus fromString(String name) {
        return fromString(name, ShareStatus.class);
    }

    /**
     * @return known ShareStatus values
     */
    public static Collection<ShareStatus> values() {
        return values(ShareStatus.class);
    }
}
