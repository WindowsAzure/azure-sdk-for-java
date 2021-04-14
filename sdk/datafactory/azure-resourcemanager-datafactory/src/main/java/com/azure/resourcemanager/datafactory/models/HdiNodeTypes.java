// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HdiNodeTypes. */
public final class HdiNodeTypes extends ExpandableStringEnum<HdiNodeTypes> {
    /** Static value Headnode for HdiNodeTypes. */
    public static final HdiNodeTypes HEADNODE = fromString("Headnode");

    /** Static value Workernode for HdiNodeTypes. */
    public static final HdiNodeTypes WORKERNODE = fromString("Workernode");

    /** Static value Zookeeper for HdiNodeTypes. */
    public static final HdiNodeTypes ZOOKEEPER = fromString("Zookeeper");

    /**
     * Creates or finds a HdiNodeTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HdiNodeTypes.
     */
    @JsonCreator
    public static HdiNodeTypes fromString(String name) {
        return fromString(name, HdiNodeTypes.class);
    }

    /** @return known HdiNodeTypes values. */
    public static Collection<HdiNodeTypes> values() {
        return values(HdiNodeTypes.class);
    }
}
