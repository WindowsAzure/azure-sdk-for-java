/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for JobRetry.
 */
public final class JobRetry extends ExpandableStringEnum<JobRetry> {
    /** Static value DoNotRetry for JobRetry. */
    public static final JobRetry DO_NOT_RETRY = fromString("DoNotRetry");

    /** Static value MayRetry for JobRetry. */
    public static final JobRetry MAY_RETRY = fromString("MayRetry");

    /**
     * Creates or finds a JobRetry from its string representation.
     * @param name a name to look for
     * @return the corresponding JobRetry
     */
    @JsonCreator
    public static JobRetry fromString(String name) {
        return fromString(name, JobRetry.class);
    }

    /**
     * @return known JobRetry values
     */
    public static Collection<JobRetry> values() {
        return values(JobRetry.class);
    }
}
