/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ReplicationStatusTypes.
 */
public final class ReplicationStatusTypes extends ExpandableStringEnum<ReplicationStatusTypes> {
    /** Static value ReplicationStatus for ReplicationStatusTypes. */
    public static final ReplicationStatusTypes REPLICATION_STATUS = fromString("ReplicationStatus");

    /**
     * Creates or finds a ReplicationStatusTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding ReplicationStatusTypes
     */
    @JsonCreator
    public static ReplicationStatusTypes fromString(String name) {
        return fromString(name, ReplicationStatusTypes.class);
    }

    /**
     * @return known ReplicationStatusTypes values
     */
    public static Collection<ReplicationStatusTypes> values() {
        return values(ReplicationStatusTypes.class);
    }
}
