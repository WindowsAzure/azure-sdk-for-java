// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ProfileMonitorStatus. */
public final class ProfileMonitorStatus extends ExpandableStringEnum<ProfileMonitorStatus> {
    /** Static value CheckingEndpoints for ProfileMonitorStatus. */
    public static final ProfileMonitorStatus CHECKING_ENDPOINTS = fromString("CheckingEndpoints");

    /** Static value Online for ProfileMonitorStatus. */
    public static final ProfileMonitorStatus ONLINE = fromString("Online");

    /** Static value Degraded for ProfileMonitorStatus. */
    public static final ProfileMonitorStatus DEGRADED = fromString("Degraded");

    /** Static value Disabled for ProfileMonitorStatus. */
    public static final ProfileMonitorStatus DISABLED = fromString("Disabled");

    /** Static value Inactive for ProfileMonitorStatus. */
    public static final ProfileMonitorStatus INACTIVE = fromString("Inactive");

    /**
     * Creates or finds a ProfileMonitorStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProfileMonitorStatus.
     */
    @JsonCreator
    public static ProfileMonitorStatus fromString(String name) {
        return fromString(name, ProfileMonitorStatus.class);
    }

    /** @return known ProfileMonitorStatus values. */
    public static Collection<ProfileMonitorStatus> values() {
        return values(ProfileMonitorStatus.class);
    }
}
