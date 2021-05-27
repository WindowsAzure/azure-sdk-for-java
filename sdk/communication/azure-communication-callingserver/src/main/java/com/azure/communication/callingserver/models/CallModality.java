// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Collection;

/** Defines values for CallModality. */
public final class CallModality extends ExpandableStringEnum<CallModality> {
    /** Static value audio for CallModality. */
    public static final CallModality AUDIO = fromString("audio");

    /** Static value video for CallModality. */
    public static final CallModality VIDEO = fromString("video");

    /**
     * Creates or finds a CallModality from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CallModality.
     */
    @JsonCreator
    public static CallModality fromString(String name) {
        return fromString(name, CallModality.class);
    }

    /** @return known CallModality values. */
    public static Collection<CallModality> values() {
        return values(CallModality.class);
    }
}
