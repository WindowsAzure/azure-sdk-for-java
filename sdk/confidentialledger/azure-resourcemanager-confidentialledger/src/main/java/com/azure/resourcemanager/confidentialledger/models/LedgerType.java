// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LedgerType. */
public final class LedgerType extends ExpandableStringEnum<LedgerType> {
    /** Static value Unknown for LedgerType. */
    public static final LedgerType UNKNOWN = fromString("Unknown");

    /** Static value Public for LedgerType. */
    public static final LedgerType PUBLIC = fromString("Public");

    /** Static value Private for LedgerType. */
    public static final LedgerType PRIVATE = fromString("Private");

    /**
     * Creates or finds a LedgerType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LedgerType.
     */
    @JsonCreator
    public static LedgerType fromString(String name) {
        return fromString(name, LedgerType.class);
    }

    /** @return known LedgerType values. */
    public static Collection<LedgerType> values() {
        return values(LedgerType.class);
    }
}
