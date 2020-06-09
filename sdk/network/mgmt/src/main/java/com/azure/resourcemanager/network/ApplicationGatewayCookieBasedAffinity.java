// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ApplicationGatewayCookieBasedAffinity. */
public final class ApplicationGatewayCookieBasedAffinity
    extends ExpandableStringEnum<ApplicationGatewayCookieBasedAffinity> {
    /** Static value Enabled for ApplicationGatewayCookieBasedAffinity. */
    public static final ApplicationGatewayCookieBasedAffinity ENABLED = fromString("Enabled");

    /** Static value Disabled for ApplicationGatewayCookieBasedAffinity. */
    public static final ApplicationGatewayCookieBasedAffinity DISABLED = fromString("Disabled");

    /**
     * Creates or finds a ApplicationGatewayCookieBasedAffinity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApplicationGatewayCookieBasedAffinity.
     */
    @JsonCreator
    public static ApplicationGatewayCookieBasedAffinity fromString(String name) {
        return fromString(name, ApplicationGatewayCookieBasedAffinity.class);
    }

    /** @return known ApplicationGatewayCookieBasedAffinity values. */
    public static Collection<ApplicationGatewayCookieBasedAffinity> values() {
        return values(ApplicationGatewayCookieBasedAffinity.class);
    }
}
