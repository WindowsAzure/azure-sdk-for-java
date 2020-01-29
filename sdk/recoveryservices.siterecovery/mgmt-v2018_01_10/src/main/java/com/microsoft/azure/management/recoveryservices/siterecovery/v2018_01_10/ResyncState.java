/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ResyncState.
 */
public final class ResyncState extends ExpandableStringEnum<ResyncState> {
    /** Static value None for ResyncState. */
    public static final ResyncState NONE = fromString("None");

    /** Static value PreparedForResynchronization for ResyncState. */
    public static final ResyncState PREPARED_FOR_RESYNCHRONIZATION = fromString("PreparedForResynchronization");

    /** Static value StartedResynchronization for ResyncState. */
    public static final ResyncState STARTED_RESYNCHRONIZATION = fromString("StartedResynchronization");

    /**
     * Creates or finds a ResyncState from its string representation.
     * @param name a name to look for
     * @return the corresponding ResyncState
     */
    @JsonCreator
    public static ResyncState fromString(String name) {
        return fromString(name, ResyncState.class);
    }

    /**
     * @return known ResyncState values
     */
    public static Collection<ResyncState> values() {
        return values(ResyncState.class);
    }
}
