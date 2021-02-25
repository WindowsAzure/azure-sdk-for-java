// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphStatus. */
public final class MicrosoftGraphStatus extends ExpandableStringEnum<MicrosoftGraphStatus> {
    /** Static value active for MicrosoftGraphStatus. */
    public static final MicrosoftGraphStatus ACTIVE = fromString("active");

    /** Static value updated for MicrosoftGraphStatus. */
    public static final MicrosoftGraphStatus UPDATED = fromString("updated");

    /** Static value deleted for MicrosoftGraphStatus. */
    public static final MicrosoftGraphStatus DELETED = fromString("deleted");

    /** Static value ignored for MicrosoftGraphStatus. */
    public static final MicrosoftGraphStatus IGNORED = fromString("ignored");

    /** Static value unknownFutureValue for MicrosoftGraphStatus. */
    public static final MicrosoftGraphStatus UNKNOWN_FUTURE_VALUE = fromString("unknownFutureValue");

    /**
     * Creates or finds a MicrosoftGraphStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphStatus.
     */
    @JsonCreator
    public static MicrosoftGraphStatus fromString(String name) {
        return fromString(name, MicrosoftGraphStatus.class);
    }

    /** @return known MicrosoftGraphStatus values. */
    public static Collection<MicrosoftGraphStatus> values() {
        return values(MicrosoftGraphStatus.class);
    }
}
