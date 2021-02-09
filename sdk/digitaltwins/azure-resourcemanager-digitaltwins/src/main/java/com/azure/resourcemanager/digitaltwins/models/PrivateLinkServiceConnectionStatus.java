// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PrivateLinkServiceConnectionStatus. */
public final class PrivateLinkServiceConnectionStatus extends ExpandableStringEnum<PrivateLinkServiceConnectionStatus> {
    /** Static value Pending for PrivateLinkServiceConnectionStatus. */
    public static final PrivateLinkServiceConnectionStatus PENDING = fromString("Pending");

    /** Static value Approved for PrivateLinkServiceConnectionStatus. */
    public static final PrivateLinkServiceConnectionStatus APPROVED = fromString("Approved");

    /** Static value Rejected for PrivateLinkServiceConnectionStatus. */
    public static final PrivateLinkServiceConnectionStatus REJECTED = fromString("Rejected");

    /** Static value Disconnected for PrivateLinkServiceConnectionStatus. */
    public static final PrivateLinkServiceConnectionStatus DISCONNECTED = fromString("Disconnected");

    /**
     * Creates or finds a PrivateLinkServiceConnectionStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PrivateLinkServiceConnectionStatus.
     */
    @JsonCreator
    public static PrivateLinkServiceConnectionStatus fromString(String name) {
        return fromString(name, PrivateLinkServiceConnectionStatus.class);
    }

    /** @return known PrivateLinkServiceConnectionStatus values. */
    public static Collection<PrivateLinkServiceConnectionStatus> values() {
        return values(PrivateLinkServiceConnectionStatus.class);
    }
}
