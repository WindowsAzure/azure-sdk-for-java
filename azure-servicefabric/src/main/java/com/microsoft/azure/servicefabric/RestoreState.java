/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RestoreState.
 */
public final class RestoreState extends ExpandableStringEnum<RestoreState> {
    /** Static value Invalid for RestoreState. */
    public static final RestoreState INVALID = fromString("Invalid");

    /** Static value Accepted for RestoreState. */
    public static final RestoreState ACCEPTED = fromString("Accepted");

    /** Static value RestoreInProgress for RestoreState. */
    public static final RestoreState RESTORE_IN_PROGRESS = fromString("RestoreInProgress");

    /** Static value Success for RestoreState. */
    public static final RestoreState SUCCESS = fromString("Success");

    /** Static value Failure for RestoreState. */
    public static final RestoreState FAILURE = fromString("Failure");

    /** Static value Timeout for RestoreState. */
    public static final RestoreState TIMEOUT = fromString("Timeout");

    /**
     * Creates or finds a RestoreState from its string representation.
     * @param name a name to look for
     * @return the corresponding RestoreState
     */
    @JsonCreator
    public static RestoreState fromString(String name) {
        return fromString(name, RestoreState.class);
    }

    /**
     * @return known RestoreState values
     */
    public static Collection<RestoreState> values() {
        return values(RestoreState.class);
    }
}
