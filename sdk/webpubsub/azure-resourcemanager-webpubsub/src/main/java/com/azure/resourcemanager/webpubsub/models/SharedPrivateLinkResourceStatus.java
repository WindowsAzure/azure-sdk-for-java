// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SharedPrivateLinkResourceStatus. */
public final class SharedPrivateLinkResourceStatus extends ExpandableStringEnum<SharedPrivateLinkResourceStatus> {
    /** Static value Pending for SharedPrivateLinkResourceStatus. */
    public static final SharedPrivateLinkResourceStatus PENDING = fromString("Pending");

    /** Static value Approved for SharedPrivateLinkResourceStatus. */
    public static final SharedPrivateLinkResourceStatus APPROVED = fromString("Approved");

    /** Static value Rejected for SharedPrivateLinkResourceStatus. */
    public static final SharedPrivateLinkResourceStatus REJECTED = fromString("Rejected");

    /** Static value Disconnected for SharedPrivateLinkResourceStatus. */
    public static final SharedPrivateLinkResourceStatus DISCONNECTED = fromString("Disconnected");

    /** Static value Timeout for SharedPrivateLinkResourceStatus. */
    public static final SharedPrivateLinkResourceStatus TIMEOUT = fromString("Timeout");

    /**
     * Creates or finds a SharedPrivateLinkResourceStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SharedPrivateLinkResourceStatus.
     */
    @JsonCreator
    public static SharedPrivateLinkResourceStatus fromString(String name) {
        return fromString(name, SharedPrivateLinkResourceStatus.class);
    }

    /** @return known SharedPrivateLinkResourceStatus values. */
    public static Collection<SharedPrivateLinkResourceStatus> values() {
        return values(SharedPrivateLinkResourceStatus.class);
    }
}
