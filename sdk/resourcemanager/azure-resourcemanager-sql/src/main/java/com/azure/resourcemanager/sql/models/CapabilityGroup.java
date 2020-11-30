// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CapabilityGroup. */
public final class CapabilityGroup extends ExpandableStringEnum<CapabilityGroup> {
    /** Static value supportedEditions for CapabilityGroup. */
    public static final CapabilityGroup SUPPORTED_EDITIONS = fromString("supportedEditions");

    /** Static value supportedElasticPoolEditions for CapabilityGroup. */
    public static final CapabilityGroup SUPPORTED_ELASTIC_POOL_EDITIONS = fromString("supportedElasticPoolEditions");

    /** Static value supportedManagedInstanceVersions for CapabilityGroup. */
    public static final CapabilityGroup SUPPORTED_MANAGED_INSTANCE_VERSIONS =
        fromString("supportedManagedInstanceVersions");

    /** Static value supportedInstancePoolEditions for CapabilityGroup. */
    public static final CapabilityGroup SUPPORTED_INSTANCE_POOL_EDITIONS = fromString("supportedInstancePoolEditions");

    /** Static value supportedManagedInstanceEditions for CapabilityGroup. */
    public static final CapabilityGroup SUPPORTED_MANAGED_INSTANCE_EDITIONS =
        fromString("supportedManagedInstanceEditions");

    /**
     * Creates or finds a CapabilityGroup from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CapabilityGroup.
     */
    @JsonCreator
    public static CapabilityGroup fromString(String name) {
        return fromString(name, CapabilityGroup.class);
    }

    /** @return known CapabilityGroup values. */
    public static Collection<CapabilityGroup> values() {
        return values(CapabilityGroup.class);
    }
}
