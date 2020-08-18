// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for NamespaceType. */
public final class NamespaceType extends ExpandableStringEnum<NamespaceType> {
    /** Static value Messaging for NamespaceType. */
    public static final NamespaceType MESSAGING = fromString("Messaging");

    /** Static value NotificationHub for NamespaceType. */
    public static final NamespaceType NOTIFICATION_HUB = fromString("NotificationHub");

    /** Static value Mixed for NamespaceType. */
    public static final NamespaceType MIXED = fromString("Mixed");

    /** Static value EventHub for NamespaceType. */
    public static final NamespaceType EVENT_HUB = fromString("EventHub");

    /** Static value Relay for NamespaceType. */
    public static final NamespaceType RELAY = fromString("Relay");

    /**
     * Creates or finds a NamespaceType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NamespaceType.
     */
    @JsonCreator
    public static NamespaceType fromString(String name) {
        return fromString(name, NamespaceType.class);
    }

    /** @return known NamespaceType values. */
    public static Collection<NamespaceType> values() {
        return values(NamespaceType.class);
    }
}
