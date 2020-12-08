// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for InstanceFailoverGroupReplicationRole. */
public final class InstanceFailoverGroupReplicationRole
    extends ExpandableStringEnum<InstanceFailoverGroupReplicationRole> {
    /** Static value Primary for InstanceFailoverGroupReplicationRole. */
    public static final InstanceFailoverGroupReplicationRole PRIMARY = fromString("Primary");

    /** Static value Secondary for InstanceFailoverGroupReplicationRole. */
    public static final InstanceFailoverGroupReplicationRole SECONDARY = fromString("Secondary");

    /**
     * Creates or finds a InstanceFailoverGroupReplicationRole from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding InstanceFailoverGroupReplicationRole.
     */
    @JsonCreator
    public static InstanceFailoverGroupReplicationRole fromString(String name) {
        return fromString(name, InstanceFailoverGroupReplicationRole.class);
    }

    /** @return known InstanceFailoverGroupReplicationRole values. */
    public static Collection<InstanceFailoverGroupReplicationRole> values() {
        return values(InstanceFailoverGroupReplicationRole.class);
    }
}
