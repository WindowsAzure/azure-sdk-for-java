/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WorkspaceSkuNameEnum.
 */
public final class WorkspaceSkuNameEnum extends ExpandableStringEnum<WorkspaceSkuNameEnum> {
    /** Static value Free for WorkspaceSkuNameEnum. */
    public static final WorkspaceSkuNameEnum FREE = fromString("Free");

    /** Static value Standard for WorkspaceSkuNameEnum. */
    public static final WorkspaceSkuNameEnum STANDARD = fromString("Standard");

    /** Static value Premium for WorkspaceSkuNameEnum. */
    public static final WorkspaceSkuNameEnum PREMIUM = fromString("Premium");

    /** Static value PerNode for WorkspaceSkuNameEnum. */
    public static final WorkspaceSkuNameEnum PER_NODE = fromString("PerNode");

    /** Static value PerGB2018 for WorkspaceSkuNameEnum. */
    public static final WorkspaceSkuNameEnum PER_GB2018 = fromString("PerGB2018");

    /** Static value Standalone for WorkspaceSkuNameEnum. */
    public static final WorkspaceSkuNameEnum STANDALONE = fromString("Standalone");

    /** Static value CapacityReservation for WorkspaceSkuNameEnum. */
    public static final WorkspaceSkuNameEnum CAPACITY_RESERVATION = fromString("CapacityReservation");

    /**
     * Creates or finds a WorkspaceSkuNameEnum from its string representation.
     * @param name a name to look for
     * @return the corresponding WorkspaceSkuNameEnum
     */
    @JsonCreator
    public static WorkspaceSkuNameEnum fromString(String name) {
        return fromString(name, WorkspaceSkuNameEnum.class);
    }

    /**
     * @return known WorkspaceSkuNameEnum values
     */
    public static Collection<WorkspaceSkuNameEnum> values() {
        return values(WorkspaceSkuNameEnum.class);
    }
}
