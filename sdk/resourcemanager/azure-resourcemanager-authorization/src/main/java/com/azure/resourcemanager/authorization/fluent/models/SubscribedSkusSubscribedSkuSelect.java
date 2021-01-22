// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SubscribedSkusSubscribedSkuSelect. */
public final class SubscribedSkusSubscribedSkuSelect extends ExpandableStringEnum<SubscribedSkusSubscribedSkuSelect> {
    /** Static value id for SubscribedSkusSubscribedSkuSelect. */
    public static final SubscribedSkusSubscribedSkuSelect ID = fromString("id");

    /** Static value appliesTo for SubscribedSkusSubscribedSkuSelect. */
    public static final SubscribedSkusSubscribedSkuSelect APPLIES_TO = fromString("appliesTo");

    /** Static value capabilityStatus for SubscribedSkusSubscribedSkuSelect. */
    public static final SubscribedSkusSubscribedSkuSelect CAPABILITY_STATUS = fromString("capabilityStatus");

    /** Static value consumedUnits for SubscribedSkusSubscribedSkuSelect. */
    public static final SubscribedSkusSubscribedSkuSelect CONSUMED_UNITS = fromString("consumedUnits");

    /** Static value prepaidUnits for SubscribedSkusSubscribedSkuSelect. */
    public static final SubscribedSkusSubscribedSkuSelect PREPAID_UNITS = fromString("prepaidUnits");

    /** Static value servicePlans for SubscribedSkusSubscribedSkuSelect. */
    public static final SubscribedSkusSubscribedSkuSelect SERVICE_PLANS = fromString("servicePlans");

    /** Static value skuId for SubscribedSkusSubscribedSkuSelect. */
    public static final SubscribedSkusSubscribedSkuSelect SKU_ID = fromString("skuId");

    /** Static value skuPartNumber for SubscribedSkusSubscribedSkuSelect. */
    public static final SubscribedSkusSubscribedSkuSelect SKU_PART_NUMBER = fromString("skuPartNumber");

    /**
     * Creates or finds a SubscribedSkusSubscribedSkuSelect from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SubscribedSkusSubscribedSkuSelect.
     */
    @JsonCreator
    public static SubscribedSkusSubscribedSkuSelect fromString(String name) {
        return fromString(name, SubscribedSkusSubscribedSkuSelect.class);
    }

    /** @return known SubscribedSkusSubscribedSkuSelect values. */
    public static Collection<SubscribedSkusSubscribedSkuSelect> values() {
        return values(SubscribedSkusSubscribedSkuSelect.class);
    }
}
