// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LroStatus. */
public final class LroStatus extends ExpandableStringEnum<LroStatus> {
    /** Static value NotStarted for LroStatus. */
    public static final LroStatus NOT_STARTED = fromString("NotStarted");

    /** Static value Running for LroStatus. */
    public static final LroStatus RUNNING = fromString("Running");

    /** Static value Failed for LroStatus. */
    public static final LroStatus FAILED = fromString("Failed");

    /** Static value Succeeded for LroStatus. */
    public static final LroStatus SUCCEEDED = fromString("Succeeded");

    /**
     * Creates or finds a LroStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LroStatus.
     */
    @JsonCreator
    public static LroStatus fromString(String name) {
        return fromString(name, LroStatus.class);
    }

    /** @return known LroStatus values. */
    public static Collection<LroStatus> values() {
        return values(LroStatus.class);
    }
}
