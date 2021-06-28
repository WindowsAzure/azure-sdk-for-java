// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FeatureStatus. */
public final class FeatureStatus extends ExpandableStringEnum<FeatureStatus> {
    /** Static value on for FeatureStatus. */
    public static final FeatureStatus ON = fromString("on");

    /** Static value off for FeatureStatus. */
    public static final FeatureStatus OFF = fromString("off");

    /**
     * Creates or finds a FeatureStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FeatureStatus.
     */
    @JsonCreator
    public static FeatureStatus fromString(String name) {
        return fromString(name, FeatureStatus.class);
    }

    /** @return known FeatureStatus values. */
    public static Collection<FeatureStatus> values() {
        return values(FeatureStatus.class);
    }
}
