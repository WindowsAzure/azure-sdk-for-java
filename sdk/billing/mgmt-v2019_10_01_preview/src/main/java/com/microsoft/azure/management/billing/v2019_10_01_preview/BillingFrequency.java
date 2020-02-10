/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for BillingFrequency.
 */
public final class BillingFrequency extends ExpandableStringEnum<BillingFrequency> {
    /** Static value OneTime for BillingFrequency. */
    public static final BillingFrequency ONE_TIME = fromString("OneTime");

    /** Static value Monthly for BillingFrequency. */
    public static final BillingFrequency MONTHLY = fromString("Monthly");

    /** Static value UsageBased for BillingFrequency. */
    public static final BillingFrequency USAGE_BASED = fromString("UsageBased");

    /**
     * Creates or finds a BillingFrequency from its string representation.
     * @param name a name to look for
     * @return the corresponding BillingFrequency
     */
    @JsonCreator
    public static BillingFrequency fromString(String name) {
        return fromString(name, BillingFrequency.class);
    }

    /**
     * @return known BillingFrequency values
     */
    public static Collection<BillingFrequency> values() {
        return values(BillingFrequency.class);
    }
}
