// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ExpressRouteLinkConnectorType. */
public final class ExpressRouteLinkConnectorType extends ExpandableStringEnum<ExpressRouteLinkConnectorType> {
    /** Static value LC for ExpressRouteLinkConnectorType. */
    public static final ExpressRouteLinkConnectorType LC = fromString("LC");

    /** Static value SC for ExpressRouteLinkConnectorType. */
    public static final ExpressRouteLinkConnectorType SC = fromString("SC");

    /**
     * Creates or finds a ExpressRouteLinkConnectorType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExpressRouteLinkConnectorType.
     */
    @JsonCreator
    public static ExpressRouteLinkConnectorType fromString(String name) {
        return fromString(name, ExpressRouteLinkConnectorType.class);
    }

    /** @return known ExpressRouteLinkConnectorType values. */
    public static Collection<ExpressRouteLinkConnectorType> values() {
        return values(ExpressRouteLinkConnectorType.class);
    }
}
