/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedapplications.v2019_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for JitApprovalMode.
 */
public final class JitApprovalMode extends ExpandableStringEnum<JitApprovalMode> {
    /** Static value NotSpecified for JitApprovalMode. */
    public static final JitApprovalMode NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value AutoApprove for JitApprovalMode. */
    public static final JitApprovalMode AUTO_APPROVE = fromString("AutoApprove");

    /** Static value ManualApprove for JitApprovalMode. */
    public static final JitApprovalMode MANUAL_APPROVE = fromString("ManualApprove");

    /**
     * Creates or finds a JitApprovalMode from its string representation.
     * @param name a name to look for
     * @return the corresponding JitApprovalMode
     */
    @JsonCreator
    public static JitApprovalMode fromString(String name) {
        return fromString(name, JitApprovalMode.class);
    }

    /**
     * @return known JitApprovalMode values
     */
    public static Collection<JitApprovalMode> values() {
        return values(JitApprovalMode.class);
    }
}
