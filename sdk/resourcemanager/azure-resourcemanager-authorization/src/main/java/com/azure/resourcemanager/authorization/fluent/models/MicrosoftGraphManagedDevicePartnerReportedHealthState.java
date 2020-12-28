// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphManagedDevicePartnerReportedHealthState. */
public final class MicrosoftGraphManagedDevicePartnerReportedHealthState
    extends ExpandableStringEnum<MicrosoftGraphManagedDevicePartnerReportedHealthState> {
    /** Static value unknown for MicrosoftGraphManagedDevicePartnerReportedHealthState. */
    public static final MicrosoftGraphManagedDevicePartnerReportedHealthState UNKNOWN = fromString("unknown");

    /** Static value activated for MicrosoftGraphManagedDevicePartnerReportedHealthState. */
    public static final MicrosoftGraphManagedDevicePartnerReportedHealthState ACTIVATED = fromString("activated");

    /** Static value deactivated for MicrosoftGraphManagedDevicePartnerReportedHealthState. */
    public static final MicrosoftGraphManagedDevicePartnerReportedHealthState DEACTIVATED = fromString("deactivated");

    /** Static value secured for MicrosoftGraphManagedDevicePartnerReportedHealthState. */
    public static final MicrosoftGraphManagedDevicePartnerReportedHealthState SECURED = fromString("secured");

    /** Static value lowSeverity for MicrosoftGraphManagedDevicePartnerReportedHealthState. */
    public static final MicrosoftGraphManagedDevicePartnerReportedHealthState LOW_SEVERITY = fromString("lowSeverity");

    /** Static value mediumSeverity for MicrosoftGraphManagedDevicePartnerReportedHealthState. */
    public static final MicrosoftGraphManagedDevicePartnerReportedHealthState MEDIUM_SEVERITY =
        fromString("mediumSeverity");

    /** Static value highSeverity for MicrosoftGraphManagedDevicePartnerReportedHealthState. */
    public static final MicrosoftGraphManagedDevicePartnerReportedHealthState HIGH_SEVERITY =
        fromString("highSeverity");

    /** Static value unresponsive for MicrosoftGraphManagedDevicePartnerReportedHealthState. */
    public static final MicrosoftGraphManagedDevicePartnerReportedHealthState UNRESPONSIVE = fromString("unresponsive");

    /** Static value compromised for MicrosoftGraphManagedDevicePartnerReportedHealthState. */
    public static final MicrosoftGraphManagedDevicePartnerReportedHealthState COMPROMISED = fromString("compromised");

    /** Static value misconfigured for MicrosoftGraphManagedDevicePartnerReportedHealthState. */
    public static final MicrosoftGraphManagedDevicePartnerReportedHealthState MISCONFIGURED =
        fromString("misconfigured");

    /**
     * Creates or finds a MicrosoftGraphManagedDevicePartnerReportedHealthState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphManagedDevicePartnerReportedHealthState.
     */
    @JsonCreator
    public static MicrosoftGraphManagedDevicePartnerReportedHealthState fromString(String name) {
        return fromString(name, MicrosoftGraphManagedDevicePartnerReportedHealthState.class);
    }

    /** @return known MicrosoftGraphManagedDevicePartnerReportedHealthState values. */
    public static Collection<MicrosoftGraphManagedDevicePartnerReportedHealthState> values() {
        return values(MicrosoftGraphManagedDevicePartnerReportedHealthState.class);
    }
}
