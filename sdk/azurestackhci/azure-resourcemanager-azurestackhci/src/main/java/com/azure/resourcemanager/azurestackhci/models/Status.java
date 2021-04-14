// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Status. */
public final class Status extends ExpandableStringEnum<Status> {
    /** Static value NotYetRegistered for Status. */
    public static final Status NOT_YET_REGISTERED = fromString("NotYetRegistered");

    /** Static value ConnectedRecently for Status. */
    public static final Status CONNECTED_RECENTLY = fromString("ConnectedRecently");

    /** Static value NotConnectedRecently for Status. */
    public static final Status NOT_CONNECTED_RECENTLY = fromString("NotConnectedRecently");

    /** Static value Disconnected for Status. */
    public static final Status DISCONNECTED = fromString("Disconnected");

    /** Static value Error for Status. */
    public static final Status ERROR = fromString("Error");

    /**
     * Creates or finds a Status from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Status.
     */
    @JsonCreator
    public static Status fromString(String name) {
        return fromString(name, Status.class);
    }

    /** @return known Status values. */
    public static Collection<Status> values() {
        return values(Status.class);
    }
}
