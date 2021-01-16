// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphActionState. */
public final class MicrosoftGraphActionState extends ExpandableStringEnum<MicrosoftGraphActionState> {
    /** Static value none for MicrosoftGraphActionState. */
    public static final MicrosoftGraphActionState NONE = fromString("none");

    /** Static value pending for MicrosoftGraphActionState. */
    public static final MicrosoftGraphActionState PENDING = fromString("pending");

    /** Static value canceled for MicrosoftGraphActionState. */
    public static final MicrosoftGraphActionState CANCELED = fromString("canceled");

    /** Static value active for MicrosoftGraphActionState. */
    public static final MicrosoftGraphActionState ACTIVE = fromString("active");

    /** Static value done for MicrosoftGraphActionState. */
    public static final MicrosoftGraphActionState DONE = fromString("done");

    /** Static value failed for MicrosoftGraphActionState. */
    public static final MicrosoftGraphActionState FAILED = fromString("failed");

    /** Static value notSupported for MicrosoftGraphActionState. */
    public static final MicrosoftGraphActionState NOT_SUPPORTED = fromString("notSupported");

    /**
     * Creates or finds a MicrosoftGraphActionState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphActionState.
     */
    @JsonCreator
    public static MicrosoftGraphActionState fromString(String name) {
        return fromString(name, MicrosoftGraphActionState.class);
    }

    /** @return known MicrosoftGraphActionState values. */
    public static Collection<MicrosoftGraphActionState> values() {
        return values(MicrosoftGraphActionState.class);
    }
}
