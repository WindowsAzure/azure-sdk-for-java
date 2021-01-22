/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WebApplicationFirewallPolicyResourceState.
 */
public final class WebApplicationFirewallPolicyResourceState extends ExpandableStringEnum<WebApplicationFirewallPolicyResourceState> {
    /** Static value Creating for WebApplicationFirewallPolicyResourceState. */
    public static final WebApplicationFirewallPolicyResourceState CREATING = fromString("Creating");

    /** Static value Enabling for WebApplicationFirewallPolicyResourceState. */
    public static final WebApplicationFirewallPolicyResourceState ENABLING = fromString("Enabling");

    /** Static value Enabled for WebApplicationFirewallPolicyResourceState. */
    public static final WebApplicationFirewallPolicyResourceState ENABLED = fromString("Enabled");

    /** Static value Disabling for WebApplicationFirewallPolicyResourceState. */
    public static final WebApplicationFirewallPolicyResourceState DISABLING = fromString("Disabling");

    /** Static value Disabled for WebApplicationFirewallPolicyResourceState. */
    public static final WebApplicationFirewallPolicyResourceState DISABLED = fromString("Disabled");

    /** Static value Deleting for WebApplicationFirewallPolicyResourceState. */
    public static final WebApplicationFirewallPolicyResourceState DELETING = fromString("Deleting");

    /**
     * Creates or finds a WebApplicationFirewallPolicyResourceState from its string representation.
     * @param name a name to look for
     * @return the corresponding WebApplicationFirewallPolicyResourceState
     */
    @JsonCreator
    public static WebApplicationFirewallPolicyResourceState fromString(String name) {
        return fromString(name, WebApplicationFirewallPolicyResourceState.class);
    }

    /**
     * @return known WebApplicationFirewallPolicyResourceState values
     */
    public static Collection<WebApplicationFirewallPolicyResourceState> values() {
        return values(WebApplicationFirewallPolicyResourceState.class);
    }
}
