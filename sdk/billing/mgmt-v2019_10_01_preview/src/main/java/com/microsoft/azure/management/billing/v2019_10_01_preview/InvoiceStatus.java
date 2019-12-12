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
 * Defines values for InvoiceStatus.
 */
public final class InvoiceStatus extends ExpandableStringEnum<InvoiceStatus> {
    /** Static value PastDue for InvoiceStatus. */
    public static final InvoiceStatus PAST_DUE = fromString("PastDue");

    /** Static value Due for InvoiceStatus. */
    public static final InvoiceStatus DUE = fromString("Due");

    /** Static value Paid for InvoiceStatus. */
    public static final InvoiceStatus PAID = fromString("Paid");

    /** Static value Void for InvoiceStatus. */
    public static final InvoiceStatus VOID = fromString("Void");

    /**
     * Creates or finds a InvoiceStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding InvoiceStatus
     */
    @JsonCreator
    public static InvoiceStatus fromString(String name) {
        return fromString(name, InvoiceStatus.class);
    }

    /**
     * @return known InvoiceStatus values
     */
    public static Collection<InvoiceStatus> values() {
        return values(InvoiceStatus.class);
    }
}
