// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for RehydratePriority.
 */
public final class RehydratePriority extends ExpandableStringEnum<RehydratePriority> {
    /**
     * Static value High for RehydratePriority.
     */
    public static final RehydratePriority HIGH = fromString("High");

    /**
     * Static value Standard for RehydratePriority.
     */
    public static final RehydratePriority STANDARD = fromString("Standard");

    /**
     * Creates or finds a RehydratePriority from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RehydratePriority.
     */
    @JsonCreator
    public static RehydratePriority fromString(String name) {
        return fromString(name, RehydratePriority.class);
    }

    /**
     * @return known RehydratePriority values.
     */
    public static Collection<RehydratePriority> values() {
        return values(RehydratePriority.class);
    }
}
