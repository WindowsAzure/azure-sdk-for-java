/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ClusterConfiguration.
 */
public final class ClusterConfiguration extends ExpandableStringEnum<ClusterConfiguration> {
    /** Static value Domainful for ClusterConfiguration. */
    public static final ClusterConfiguration DOMAINFUL = fromString("Domainful");

    /**
     * Creates or finds a ClusterConfiguration from its string representation.
     * @param name a name to look for
     * @return the corresponding ClusterConfiguration
     */
    @JsonCreator
    public static ClusterConfiguration fromString(String name) {
        return fromString(name, ClusterConfiguration.class);
    }

    /**
     * @return known ClusterConfiguration values
     */
    public static Collection<ClusterConfiguration> values() {
        return values(ClusterConfiguration.class);
    }
}
