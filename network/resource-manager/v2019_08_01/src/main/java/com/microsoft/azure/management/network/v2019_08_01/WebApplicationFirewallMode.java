/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WebApplicationFirewallMode.
 */
public final class WebApplicationFirewallMode extends ExpandableStringEnum<WebApplicationFirewallMode> {
    /** Static value Prevention for WebApplicationFirewallMode. */
    public static final WebApplicationFirewallMode PREVENTION = fromString("Prevention");

    /** Static value Detection for WebApplicationFirewallMode. */
    public static final WebApplicationFirewallMode DETECTION = fromString("Detection");

    /**
     * Creates or finds a WebApplicationFirewallMode from its string representation.
     * @param name a name to look for
     * @return the corresponding WebApplicationFirewallMode
     */
    @JsonCreator
    public static WebApplicationFirewallMode fromString(String name) {
        return fromString(name, WebApplicationFirewallMode.class);
    }

    /**
     * @return known WebApplicationFirewallMode values
     */
    public static Collection<WebApplicationFirewallMode> values() {
        return values(WebApplicationFirewallMode.class);
    }
}
