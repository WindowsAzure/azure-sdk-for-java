/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for HostPlatformType.
 */
public final class HostPlatformType extends ExpandableStringEnum<HostPlatformType> {
    /** Static value KubernetesCluster for HostPlatformType. */
    public static final HostPlatformType KUBERNETES_CLUSTER = fromString("KubernetesCluster");

    /** Static value LinuxVM for HostPlatformType. */
    public static final HostPlatformType LINUX_VM = fromString("LinuxVM");

    /**
     * Creates or finds a HostPlatformType from its string representation.
     * @param name a name to look for
     * @return the corresponding HostPlatformType
     */
    @JsonCreator
    public static HostPlatformType fromString(String name) {
        return fromString(name, HostPlatformType.class);
    }

    /**
     * @return known HostPlatformType values
     */
    public static Collection<HostPlatformType> values() {
        return values(HostPlatformType.class);
    }
}
