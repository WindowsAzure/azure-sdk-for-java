// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResourceSkuRestrictionsReasonCode. */
public final class ResourceSkuRestrictionsReasonCode extends ExpandableStringEnum<ResourceSkuRestrictionsReasonCode> {
    /** Static value QuotaId for ResourceSkuRestrictionsReasonCode. */
    public static final ResourceSkuRestrictionsReasonCode QUOTA_ID = fromString("QuotaId");

    /** Static value NotAvailableForSubscription for ResourceSkuRestrictionsReasonCode. */
    public static final ResourceSkuRestrictionsReasonCode NOT_AVAILABLE_FOR_SUBSCRIPTION =
        fromString("NotAvailableForSubscription");

    /**
     * Creates or finds a ResourceSkuRestrictionsReasonCode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResourceSkuRestrictionsReasonCode.
     */
    @JsonCreator
    public static ResourceSkuRestrictionsReasonCode fromString(String name) {
        return fromString(name, ResourceSkuRestrictionsReasonCode.class);
    }

    /** @return known ResourceSkuRestrictionsReasonCode values. */
    public static Collection<ResourceSkuRestrictionsReasonCode> values() {
        return values(ResourceSkuRestrictionsReasonCode.class);
    }
}
