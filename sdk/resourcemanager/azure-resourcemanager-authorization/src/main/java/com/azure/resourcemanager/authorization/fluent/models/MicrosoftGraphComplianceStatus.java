// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphComplianceStatus. */
public final class MicrosoftGraphComplianceStatus extends ExpandableStringEnum<MicrosoftGraphComplianceStatus> {
    /** Static value unknown for MicrosoftGraphComplianceStatus. */
    public static final MicrosoftGraphComplianceStatus UNKNOWN = fromString("unknown");

    /** Static value notApplicable for MicrosoftGraphComplianceStatus. */
    public static final MicrosoftGraphComplianceStatus NOT_APPLICABLE = fromString("notApplicable");

    /** Static value compliant for MicrosoftGraphComplianceStatus. */
    public static final MicrosoftGraphComplianceStatus COMPLIANT = fromString("compliant");

    /** Static value remediated for MicrosoftGraphComplianceStatus. */
    public static final MicrosoftGraphComplianceStatus REMEDIATED = fromString("remediated");

    /** Static value nonCompliant for MicrosoftGraphComplianceStatus. */
    public static final MicrosoftGraphComplianceStatus NON_COMPLIANT = fromString("nonCompliant");

    /** Static value error for MicrosoftGraphComplianceStatus. */
    public static final MicrosoftGraphComplianceStatus ERROR = fromString("error");

    /** Static value conflict for MicrosoftGraphComplianceStatus. */
    public static final MicrosoftGraphComplianceStatus CONFLICT = fromString("conflict");

    /** Static value notAssigned for MicrosoftGraphComplianceStatus. */
    public static final MicrosoftGraphComplianceStatus NOT_ASSIGNED = fromString("notAssigned");

    /**
     * Creates or finds a MicrosoftGraphComplianceStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphComplianceStatus.
     */
    @JsonCreator
    public static MicrosoftGraphComplianceStatus fromString(String name) {
        return fromString(name, MicrosoftGraphComplianceStatus.class);
    }

    /** @return known MicrosoftGraphComplianceStatus values. */
    public static Collection<MicrosoftGraphComplianceStatus> values() {
        return values(MicrosoftGraphComplianceStatus.class);
    }
}
