// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DefaultAction. */
public final class DefaultAction extends ExpandableStringEnum<DefaultAction> {
    /** Static value Allow for DefaultAction. */
    public static final DefaultAction ALLOW = fromString("Allow");

    /** Static value Deny for DefaultAction. */
    public static final DefaultAction DENY = fromString("Deny");

    /**
     * Creates or finds a DefaultAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DefaultAction.
     */
    @JsonCreator
    public static DefaultAction fromString(String name) {
        return fromString(name, DefaultAction.class);
    }

    /** @return known DefaultAction values. */
    public static Collection<DefaultAction> values() {
        return values(DefaultAction.class);
    }
}
