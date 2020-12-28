// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphTeamsAsyncOperationType. */
public final class MicrosoftGraphTeamsAsyncOperationType
    extends ExpandableStringEnum<MicrosoftGraphTeamsAsyncOperationType> {
    /** Static value invalid for MicrosoftGraphTeamsAsyncOperationType. */
    public static final MicrosoftGraphTeamsAsyncOperationType INVALID = fromString("invalid");

    /** Static value cloneTeam for MicrosoftGraphTeamsAsyncOperationType. */
    public static final MicrosoftGraphTeamsAsyncOperationType CLONE_TEAM = fromString("cloneTeam");

    /** Static value archiveTeam for MicrosoftGraphTeamsAsyncOperationType. */
    public static final MicrosoftGraphTeamsAsyncOperationType ARCHIVE_TEAM = fromString("archiveTeam");

    /** Static value unarchiveTeam for MicrosoftGraphTeamsAsyncOperationType. */
    public static final MicrosoftGraphTeamsAsyncOperationType UNARCHIVE_TEAM = fromString("unarchiveTeam");

    /** Static value createTeam for MicrosoftGraphTeamsAsyncOperationType. */
    public static final MicrosoftGraphTeamsAsyncOperationType CREATE_TEAM = fromString("createTeam");

    /** Static value unknownFutureValue for MicrosoftGraphTeamsAsyncOperationType. */
    public static final MicrosoftGraphTeamsAsyncOperationType UNKNOWN_FUTURE_VALUE = fromString("unknownFutureValue");

    /**
     * Creates or finds a MicrosoftGraphTeamsAsyncOperationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphTeamsAsyncOperationType.
     */
    @JsonCreator
    public static MicrosoftGraphTeamsAsyncOperationType fromString(String name) {
        return fromString(name, MicrosoftGraphTeamsAsyncOperationType.class);
    }

    /** @return known MicrosoftGraphTeamsAsyncOperationType values. */
    public static Collection<MicrosoftGraphTeamsAsyncOperationType> values() {
        return values(MicrosoftGraphTeamsAsyncOperationType.class);
    }
}
