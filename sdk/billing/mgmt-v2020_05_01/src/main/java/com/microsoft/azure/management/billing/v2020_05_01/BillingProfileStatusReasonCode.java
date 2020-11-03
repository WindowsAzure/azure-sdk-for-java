/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for BillingProfileStatusReasonCode.
 */
public final class BillingProfileStatusReasonCode extends ExpandableStringEnum<BillingProfileStatusReasonCode> {
    /** Static value PastDue for BillingProfileStatusReasonCode. */
    public static final BillingProfileStatusReasonCode PAST_DUE = fromString("PastDue");

    /** Static value SpendingLimitReached for BillingProfileStatusReasonCode. */
    public static final BillingProfileStatusReasonCode SPENDING_LIMIT_REACHED = fromString("SpendingLimitReached");

    /** Static value SpendingLimitExpired for BillingProfileStatusReasonCode. */
    public static final BillingProfileStatusReasonCode SPENDING_LIMIT_EXPIRED = fromString("SpendingLimitExpired");

    /**
     * Creates or finds a BillingProfileStatusReasonCode from its string representation.
     * @param name a name to look for
     * @return the corresponding BillingProfileStatusReasonCode
     */
    @JsonCreator
    public static BillingProfileStatusReasonCode fromString(String name) {
        return fromString(name, BillingProfileStatusReasonCode.class);
    }

    /**
     * @return known BillingProfileStatusReasonCode values
     */
    public static Collection<BillingProfileStatusReasonCode> values() {
        return values(BillingProfileStatusReasonCode.class);
    }
}
