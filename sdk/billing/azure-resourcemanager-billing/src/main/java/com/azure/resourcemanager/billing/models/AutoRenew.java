// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AutoRenew. */
public final class AutoRenew extends ExpandableStringEnum<AutoRenew> {
    /** Static value Off for AutoRenew. */
    public static final AutoRenew OFF = fromString("Off");

    /** Static value On for AutoRenew. */
    public static final AutoRenew ON = fromString("On");

    /**
     * Creates or finds a AutoRenew from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AutoRenew.
     */
    @JsonCreator
    public static AutoRenew fromString(String name) {
        return fromString(name, AutoRenew.class);
    }

    /** @return known AutoRenew values. */
    public static Collection<AutoRenew> values() {
        return values(AutoRenew.class);
    }
}
