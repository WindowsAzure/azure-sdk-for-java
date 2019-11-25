/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WebApplicationFirewallAction.
 */
public final class WebApplicationFirewallAction extends ExpandableStringEnum<WebApplicationFirewallAction> {
    /** Static value Allow for WebApplicationFirewallAction. */
    public static final WebApplicationFirewallAction ALLOW = fromString("Allow");

    /** Static value Block for WebApplicationFirewallAction. */
    public static final WebApplicationFirewallAction BLOCK = fromString("Block");

    /** Static value Log for WebApplicationFirewallAction. */
    public static final WebApplicationFirewallAction LOG = fromString("Log");

    /**
     * Creates or finds a WebApplicationFirewallAction from its string representation.
     * @param name a name to look for
     * @return the corresponding WebApplicationFirewallAction
     */
    @JsonCreator
    public static WebApplicationFirewallAction fromString(String name) {
        return fromString(name, WebApplicationFirewallAction.class);
    }

    /**
     * @return known WebApplicationFirewallAction values
     */
    public static Collection<WebApplicationFirewallAction> values() {
        return values(WebApplicationFirewallAction.class);
    }
}
