// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PcError. */
public final class PcError extends ExpandableStringEnum<PcError> {
    /** Static value InternalError for PcError. */
    public static final PcError INTERNAL_ERROR = fromString("InternalError");

    /** Static value AgentStopped for PcError. */
    public static final PcError AGENT_STOPPED = fromString("AgentStopped");

    /** Static value CaptureFailed for PcError. */
    public static final PcError CAPTURE_FAILED = fromString("CaptureFailed");

    /** Static value LocalFileFailed for PcError. */
    public static final PcError LOCAL_FILE_FAILED = fromString("LocalFileFailed");

    /** Static value StorageFailed for PcError. */
    public static final PcError STORAGE_FAILED = fromString("StorageFailed");

    /**
     * Creates or finds a PcError from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PcError.
     */
    @JsonCreator
    public static PcError fromString(String name) {
        return fromString(name, PcError.class);
    }

    /** @return known PcError values. */
    public static Collection<PcError> values() {
        return values(PcError.class);
    }
}
