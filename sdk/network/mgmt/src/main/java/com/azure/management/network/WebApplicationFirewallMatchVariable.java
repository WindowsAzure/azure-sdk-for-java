// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for WebApplicationFirewallMatchVariable.
 */
public final class WebApplicationFirewallMatchVariable extends ExpandableStringEnum<WebApplicationFirewallMatchVariable> {
    /**
     * Static value RemoteAddr for WebApplicationFirewallMatchVariable.
     */
    public static final WebApplicationFirewallMatchVariable REMOTE_ADDR = fromString("RemoteAddr");

    /**
     * Static value RequestMethod for WebApplicationFirewallMatchVariable.
     */
    public static final WebApplicationFirewallMatchVariable REQUEST_METHOD = fromString("RequestMethod");

    /**
     * Static value QueryString for WebApplicationFirewallMatchVariable.
     */
    public static final WebApplicationFirewallMatchVariable QUERY_STRING = fromString("QueryString");

    /**
     * Static value PostArgs for WebApplicationFirewallMatchVariable.
     */
    public static final WebApplicationFirewallMatchVariable POST_ARGS = fromString("PostArgs");

    /**
     * Static value RequestUri for WebApplicationFirewallMatchVariable.
     */
    public static final WebApplicationFirewallMatchVariable REQUEST_URI = fromString("RequestUri");

    /**
     * Static value RequestHeaders for WebApplicationFirewallMatchVariable.
     */
    public static final WebApplicationFirewallMatchVariable REQUEST_HEADERS = fromString("RequestHeaders");

    /**
     * Static value RequestBody for WebApplicationFirewallMatchVariable.
     */
    public static final WebApplicationFirewallMatchVariable REQUEST_BODY = fromString("RequestBody");

    /**
     * Static value RequestCookies for WebApplicationFirewallMatchVariable.
     */
    public static final WebApplicationFirewallMatchVariable REQUEST_COOKIES = fromString("RequestCookies");

    /**
     * Creates or finds a WebApplicationFirewallMatchVariable from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding WebApplicationFirewallMatchVariable.
     */
    @JsonCreator
    public static WebApplicationFirewallMatchVariable fromString(String name) {
        return fromString(name, WebApplicationFirewallMatchVariable.class);
    }

    /**
     * @return known WebApplicationFirewallMatchVariable values.
     */
    public static Collection<WebApplicationFirewallMatchVariable> values() {
        return values(WebApplicationFirewallMatchVariable.class);
    }
}
