/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.azure.messaging.eventgrid.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for StampKind.
 */
public final class StampKind extends ExpandableStringEnum<StampKind> {
    /** Static value Public for StampKind. */
    public static final StampKind PUBLIC = fromString("Public");

    /** Static value AseV1 for StampKind. */
    public static final StampKind ASE_V1 = fromString("AseV1");

    /** Static value AseV2 for StampKind. */
    public static final StampKind ASE_V2 = fromString("AseV2");

    /**
     * Creates or finds a StampKind from its string representation.
     * @param name a name to look for
     * @return the corresponding StampKind
     */
    @JsonCreator
    public static StampKind fromString(String name) {
        return fromString(name, StampKind.class);
    }

    /**
     * @return known StampKind values
     */
    public static Collection<StampKind> values() {
        return values(StampKind.class);
    }
}
