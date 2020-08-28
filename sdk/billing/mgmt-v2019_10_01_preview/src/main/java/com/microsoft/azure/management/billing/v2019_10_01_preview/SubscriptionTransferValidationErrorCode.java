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
 * Defines values for SubscriptionTransferValidationErrorCode.
 */
public final class SubscriptionTransferValidationErrorCode extends ExpandableStringEnum<SubscriptionTransferValidationErrorCode> {
    /** Static value InvalidSource for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode INVALID_SOURCE = fromString("InvalidSource");

    /** Static value SubscriptionNotActive for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode SUBSCRIPTION_NOT_ACTIVE = fromString("SubscriptionNotActive");

    /** Static value InsufficientPermissionOnSource for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode INSUFFICIENT_PERMISSION_ON_SOURCE = fromString("InsufficientPermissionOnSource");

    /** Static value InsufficientPermissionOnDestination for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode INSUFFICIENT_PERMISSION_ON_DESTINATION = fromString("InsufficientPermissionOnDestination");

    /** Static value DestinationBillingProfilePastDue for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode DESTINATION_BILLING_PROFILE_PAST_DUE = fromString("DestinationBillingProfilePastDue");

    /** Static value SubscriptionTypeNotSupported for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode SUBSCRIPTION_TYPE_NOT_SUPPORTED = fromString("SubscriptionTypeNotSupported");

    /** Static value CrossBillingAccountNotAllowed for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode CROSS_BILLING_ACCOUNT_NOT_ALLOWED = fromString("CrossBillingAccountNotAllowed");

    /** Static value NotAvailableForDestinationMarket for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode NOT_AVAILABLE_FOR_DESTINATION_MARKET = fromString("NotAvailableForDestinationMarket");

    /**
     * Creates or finds a SubscriptionTransferValidationErrorCode from its string representation.
     * @param name a name to look for
     * @return the corresponding SubscriptionTransferValidationErrorCode
     */
    @JsonCreator
    public static SubscriptionTransferValidationErrorCode fromString(String name) {
        return fromString(name, SubscriptionTransferValidationErrorCode.class);
    }

    /**
     * @return known SubscriptionTransferValidationErrorCode values
     */
    public static Collection<SubscriptionTransferValidationErrorCode> values() {
        return values(SubscriptionTransferValidationErrorCode.class);
    }
}
