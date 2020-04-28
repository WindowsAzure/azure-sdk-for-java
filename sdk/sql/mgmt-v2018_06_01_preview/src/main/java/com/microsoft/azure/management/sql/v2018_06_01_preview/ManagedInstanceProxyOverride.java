/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2018_06_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ManagedInstanceProxyOverride.
 */
public final class ManagedInstanceProxyOverride extends ExpandableStringEnum<ManagedInstanceProxyOverride> {
    /** Static value Proxy for ManagedInstanceProxyOverride. */
    public static final ManagedInstanceProxyOverride PROXY = fromString("Proxy");

    /** Static value Redirect for ManagedInstanceProxyOverride. */
    public static final ManagedInstanceProxyOverride REDIRECT = fromString("Redirect");

    /** Static value Default for ManagedInstanceProxyOverride. */
    public static final ManagedInstanceProxyOverride DEFAULT = fromString("Default");

    /**
     * Creates or finds a ManagedInstanceProxyOverride from its string representation.
     * @param name a name to look for
     * @return the corresponding ManagedInstanceProxyOverride
     */
    @JsonCreator
    public static ManagedInstanceProxyOverride fromString(String name) {
        return fromString(name, ManagedInstanceProxyOverride.class);
    }

    /**
     * @return known ManagedInstanceProxyOverride values
     */
    public static Collection<ManagedInstanceProxyOverride> values() {
        return values(ManagedInstanceProxyOverride.class);
    }
}
