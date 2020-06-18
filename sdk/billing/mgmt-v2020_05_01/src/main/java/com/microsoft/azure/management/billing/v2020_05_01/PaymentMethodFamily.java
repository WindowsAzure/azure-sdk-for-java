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
 * Defines values for PaymentMethodFamily.
 */
public final class PaymentMethodFamily extends ExpandableStringEnum<PaymentMethodFamily> {
    /** Static value Credits for PaymentMethodFamily. */
    public static final PaymentMethodFamily CREDITS = fromString("Credits");

    /** Static value CheckWire for PaymentMethodFamily. */
    public static final PaymentMethodFamily CHECK_WIRE = fromString("CheckWire");

    /** Static value CreditCard for PaymentMethodFamily. */
    public static final PaymentMethodFamily CREDIT_CARD = fromString("CreditCard");

    /** Static value None for PaymentMethodFamily. */
    public static final PaymentMethodFamily NONE = fromString("None");

    /**
     * Creates or finds a PaymentMethodFamily from its string representation.
     * @param name a name to look for
     * @return the corresponding PaymentMethodFamily
     */
    @JsonCreator
    public static PaymentMethodFamily fromString(String name) {
        return fromString(name, PaymentMethodFamily.class);
    }

    /**
     * @return known PaymentMethodFamily values
     */
    public static Collection<PaymentMethodFamily> values() {
        return values(PaymentMethodFamily.class);
    }
}
