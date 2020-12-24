// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SalesforceSinkWriteBehavior. */
public final class SalesforceSinkWriteBehavior extends ExpandableStringEnum<SalesforceSinkWriteBehavior> {
    /** Static value Insert for SalesforceSinkWriteBehavior. */
    public static final SalesforceSinkWriteBehavior INSERT = fromString("Insert");

    /** Static value Upsert for SalesforceSinkWriteBehavior. */
    public static final SalesforceSinkWriteBehavior UPSERT = fromString("Upsert");

    /**
     * Creates or finds a SalesforceSinkWriteBehavior from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SalesforceSinkWriteBehavior.
     */
    @JsonCreator
    public static SalesforceSinkWriteBehavior fromString(String name) {
        return fromString(name, SalesforceSinkWriteBehavior.class);
    }

    /** @return known SalesforceSinkWriteBehavior values. */
    public static Collection<SalesforceSinkWriteBehavior> values() {
        return values(SalesforceSinkWriteBehavior.class);
    }
}
