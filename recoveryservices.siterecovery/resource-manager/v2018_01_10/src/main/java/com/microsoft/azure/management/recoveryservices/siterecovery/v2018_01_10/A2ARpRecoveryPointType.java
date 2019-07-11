/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for A2ARpRecoveryPointType.
 */
public final class A2ARpRecoveryPointType extends ExpandableStringEnum<A2ARpRecoveryPointType> {
    /** Static value Latest for A2ARpRecoveryPointType. */
    public static final A2ARpRecoveryPointType LATEST = fromString("Latest");

    /** Static value LatestApplicationConsistent for A2ARpRecoveryPointType. */
    public static final A2ARpRecoveryPointType LATEST_APPLICATION_CONSISTENT = fromString("LatestApplicationConsistent");

    /** Static value LatestCrashConsistent for A2ARpRecoveryPointType. */
    public static final A2ARpRecoveryPointType LATEST_CRASH_CONSISTENT = fromString("LatestCrashConsistent");

    /** Static value LatestProcessed for A2ARpRecoveryPointType. */
    public static final A2ARpRecoveryPointType LATEST_PROCESSED = fromString("LatestProcessed");

    /**
     * Creates or finds a A2ARpRecoveryPointType from its string representation.
     * @param name a name to look for
     * @return the corresponding A2ARpRecoveryPointType
     */
    @JsonCreator
    public static A2ARpRecoveryPointType fromString(String name) {
        return fromString(name, A2ARpRecoveryPointType.class);
    }

    /**
     * @return known A2ARpRecoveryPointType values
     */
    public static Collection<A2ARpRecoveryPointType> values() {
        return values(A2ARpRecoveryPointType.class);
    }
}
