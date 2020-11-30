/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OnErrorType.
 */
public final class OnErrorType extends ExpandableStringEnum<OnErrorType> {
    /** Static value StopProcessingJob for OnErrorType. */
    public static final OnErrorType STOP_PROCESSING_JOB = fromString("StopProcessingJob");

    /** Static value ContinueJob for OnErrorType. */
    public static final OnErrorType CONTINUE_JOB = fromString("ContinueJob");

    /**
     * Creates or finds a OnErrorType from its string representation.
     * @param name a name to look for
     * @return the corresponding OnErrorType
     */
    @JsonCreator
    public static OnErrorType fromString(String name) {
        return fromString(name, OnErrorType.class);
    }

    /**
     * @return known OnErrorType values
     */
    public static Collection<OnErrorType> values() {
        return values(OnErrorType.class);
    }
}
