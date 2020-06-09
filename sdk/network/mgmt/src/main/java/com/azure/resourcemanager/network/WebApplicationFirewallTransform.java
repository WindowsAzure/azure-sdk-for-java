// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WebApplicationFirewallTransform. */
public final class WebApplicationFirewallTransform extends ExpandableStringEnum<WebApplicationFirewallTransform> {
    /** Static value Lowercase for WebApplicationFirewallTransform. */
    public static final WebApplicationFirewallTransform LOWERCASE = fromString("Lowercase");

    /** Static value Trim for WebApplicationFirewallTransform. */
    public static final WebApplicationFirewallTransform TRIM = fromString("Trim");

    /** Static value UrlDecode for WebApplicationFirewallTransform. */
    public static final WebApplicationFirewallTransform URL_DECODE = fromString("UrlDecode");

    /** Static value UrlEncode for WebApplicationFirewallTransform. */
    public static final WebApplicationFirewallTransform URL_ENCODE = fromString("UrlEncode");

    /** Static value RemoveNulls for WebApplicationFirewallTransform. */
    public static final WebApplicationFirewallTransform REMOVE_NULLS = fromString("RemoveNulls");

    /** Static value HtmlEntityDecode for WebApplicationFirewallTransform. */
    public static final WebApplicationFirewallTransform HTML_ENTITY_DECODE = fromString("HtmlEntityDecode");

    /**
     * Creates or finds a WebApplicationFirewallTransform from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WebApplicationFirewallTransform.
     */
    @JsonCreator
    public static WebApplicationFirewallTransform fromString(String name) {
        return fromString(name, WebApplicationFirewallTransform.class);
    }

    /** @return known WebApplicationFirewallTransform values. */
    public static Collection<WebApplicationFirewallTransform> values() {
        return values(WebApplicationFirewallTransform.class);
    }
}
