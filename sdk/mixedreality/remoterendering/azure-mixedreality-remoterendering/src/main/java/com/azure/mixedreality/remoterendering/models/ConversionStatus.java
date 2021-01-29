package com.azure.mixedreality.remoterendering.models;

import com.azure.core.util.ExpandableStringEnum;

import java.util.Collection;

public class ConversionStatus extends ExpandableStringEnum<ConversionStatus> {
    /** Static value NotStarted for ConversionStatus. */
    public static final ConversionStatus NOT_STARTED = fromString("NotStarted");

    /** Static value Running for ConversionStatus. */
    public static final ConversionStatus RUNNING = fromString("Running");

    /** Static value Cancelled for ConversionStatus. */
    public static final ConversionStatus CANCELLED = fromString("Cancelled");

    /** Static value Failed for ConversionStatus. */
    public static final ConversionStatus FAILED = fromString("Failed");

    /** Static value Succeeded for ConversionStatus. */
    public static final ConversionStatus SUCCEEDED = fromString("Succeeded");

    /**
     * Creates or finds a ConversionStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConversionStatus.
     */
    public static ConversionStatus fromString(String name) {
        return fromString(name, ConversionStatus.class);
    }

    /** @return known ConversionStatus values. */
    public static Collection<ConversionStatus> values() {
        return values(ConversionStatus.class);
    }
}
