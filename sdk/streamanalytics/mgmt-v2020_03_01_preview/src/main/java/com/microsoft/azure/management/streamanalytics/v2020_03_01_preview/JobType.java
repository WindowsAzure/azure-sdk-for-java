/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for JobType.
 */
public final class JobType extends ExpandableStringEnum<JobType> {
    /** Static value Cloud for JobType. */
    public static final JobType CLOUD = fromString("Cloud");

    /** Static value Edge for JobType. */
    public static final JobType EDGE = fromString("Edge");

    /**
     * Creates or finds a JobType from its string representation.
     * @param name a name to look for
     * @return the corresponding JobType
     */
    @JsonCreator
    public static JobType fromString(String name) {
        return fromString(name, JobType.class);
    }

    /**
     * @return known JobType values
     */
    public static Collection<JobType> values() {
        return values(JobType.class);
    }
}
