// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PrivateLinkServiceConnectionStateActionsRequire. */
public final class PrivateLinkServiceConnectionStateActionsRequire
    extends ExpandableStringEnum<PrivateLinkServiceConnectionStateActionsRequire> {
    /** Static value None for PrivateLinkServiceConnectionStateActionsRequire. */
    public static final PrivateLinkServiceConnectionStateActionsRequire NONE = fromString("None");

    /**
     * Creates or finds a PrivateLinkServiceConnectionStateActionsRequire from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PrivateLinkServiceConnectionStateActionsRequire.
     */
    @JsonCreator
    public static PrivateLinkServiceConnectionStateActionsRequire fromString(String name) {
        return fromString(name, PrivateLinkServiceConnectionStateActionsRequire.class);
    }

    /** @return known PrivateLinkServiceConnectionStateActionsRequire values. */
    public static Collection<PrivateLinkServiceConnectionStateActionsRequire> values() {
        return values(PrivateLinkServiceConnectionStateActionsRequire.class);
    }
}
