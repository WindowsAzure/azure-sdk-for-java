// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BaseImageTriggerType. */
public final class BaseImageTriggerType extends ExpandableStringEnum<BaseImageTriggerType> {
    /** Static value All for BaseImageTriggerType. */
    public static final BaseImageTriggerType ALL = fromString("All");

    /** Static value Runtime for BaseImageTriggerType. */
    public static final BaseImageTriggerType RUNTIME = fromString("Runtime");

    /**
     * Creates or finds a BaseImageTriggerType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BaseImageTriggerType.
     */
    @JsonCreator
    public static BaseImageTriggerType fromString(String name) {
        return fromString(name, BaseImageTriggerType.class);
    }

    /** @return known BaseImageTriggerType values. */
    public static Collection<BaseImageTriggerType> values() {
        return values(BaseImageTriggerType.class);
    }
}
