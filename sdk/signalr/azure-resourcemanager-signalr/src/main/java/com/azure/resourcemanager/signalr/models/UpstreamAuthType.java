// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UpstreamAuthType. */
public final class UpstreamAuthType extends ExpandableStringEnum<UpstreamAuthType> {
    /** Static value None for UpstreamAuthType. */
    public static final UpstreamAuthType NONE = fromString("None");

    /** Static value ManagedIdentity for UpstreamAuthType. */
    public static final UpstreamAuthType MANAGED_IDENTITY = fromString("ManagedIdentity");

    /**
     * Creates or finds a UpstreamAuthType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UpstreamAuthType.
     */
    @JsonCreator
    public static UpstreamAuthType fromString(String name) {
        return fromString(name, UpstreamAuthType.class);
    }

    /** @return known UpstreamAuthType values. */
    public static Collection<UpstreamAuthType> values() {
        return values(UpstreamAuthType.class);
    }
}
