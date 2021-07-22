// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DestinationType. */
public final class DestinationType extends ExpandableStringEnum<DestinationType> {
    /** Static value position for DestinationType. */
    public static final DestinationType POSITION = fromString("position");

    /** Static value stopId for DestinationType. */
    public static final DestinationType STOP_ID = fromString("stopId");

    /** Static value stopKey for DestinationType. */
    public static final DestinationType STOP_KEY = fromString("stopKey");

    /**
     * Creates or finds a DestinationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DestinationType.
     */
    @JsonCreator
    public static DestinationType fromString(String name) {
        return fromString(name, DestinationType.class);
    }

    /** @return known DestinationType values. */
    public static Collection<DestinationType> values() {
        return values(DestinationType.class);
    }
}
