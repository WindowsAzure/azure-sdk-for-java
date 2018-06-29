/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for InquiryStatus.
 */
public final class InquiryStatus extends ExpandableStringEnum<InquiryStatus> {
    /** Static value Invalid for InquiryStatus. */
    public static final InquiryStatus INVALID = fromString("Invalid");

    /** Static value Success for InquiryStatus. */
    public static final InquiryStatus SUCCESS = fromString("Success");

    /** Static value Failed for InquiryStatus. */
    public static final InquiryStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a InquiryStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding InquiryStatus
     */
    @JsonCreator
    public static InquiryStatus fromString(String name) {
        return fromString(name, InquiryStatus.class);
    }

    /**
     * @return known InquiryStatus values
     */
    public static Collection<InquiryStatus> values() {
        return values(InquiryStatus.class);
    }
}
