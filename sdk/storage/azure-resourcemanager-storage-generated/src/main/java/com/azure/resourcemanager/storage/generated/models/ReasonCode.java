// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ReasonCode. */
public final class ReasonCode extends ExpandableStringEnum<ReasonCode> {
    /** Static value QuotaId for ReasonCode. */
    public static final ReasonCode QUOTA_ID = fromString("QuotaId");

    /** Static value NotAvailableForSubscription for ReasonCode. */
    public static final ReasonCode NOT_AVAILABLE_FOR_SUBSCRIPTION = fromString("NotAvailableForSubscription");

    /**
     * Creates or finds a ReasonCode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReasonCode.
     */
    @JsonCreator
    public static ReasonCode fromString(String name) {
        return fromString(name, ReasonCode.class);
    }

    /** @return known ReasonCode values. */
    public static Collection<ReasonCode> values() {
        return values(ReasonCode.class);
    }
}
