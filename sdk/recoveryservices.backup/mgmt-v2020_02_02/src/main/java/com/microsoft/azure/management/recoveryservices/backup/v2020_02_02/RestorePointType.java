/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RestorePointType.
 */
public final class RestorePointType extends ExpandableStringEnum<RestorePointType> {
    /** Static value Invalid for RestorePointType. */
    public static final RestorePointType INVALID = fromString("Invalid");

    /** Static value Full for RestorePointType. */
    public static final RestorePointType FULL = fromString("Full");

    /** Static value Log for RestorePointType. */
    public static final RestorePointType LOG = fromString("Log");

    /** Static value Differential for RestorePointType. */
    public static final RestorePointType DIFFERENTIAL = fromString("Differential");

    /**
     * Creates or finds a RestorePointType from its string representation.
     * @param name a name to look for
     * @return the corresponding RestorePointType
     */
    @JsonCreator
    public static RestorePointType fromString(String name) {
        return fromString(name, RestorePointType.class);
    }

    /**
     * @return known RestorePointType values
     */
    public static Collection<RestorePointType> values() {
        return values(RestorePointType.class);
    }
}
