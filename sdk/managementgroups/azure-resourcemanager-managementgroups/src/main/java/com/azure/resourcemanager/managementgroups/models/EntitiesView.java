// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EntitiesView. */
public final class EntitiesView extends ExpandableStringEnum<EntitiesView> {
    /** Static value FullHierarchy for EntitiesView. */
    public static final EntitiesView FULL_HIERARCHY = fromString("FullHierarchy");

    /** Static value GroupsOnly for EntitiesView. */
    public static final EntitiesView GROUPS_ONLY = fromString("GroupsOnly");

    /** Static value SubscriptionsOnly for EntitiesView. */
    public static final EntitiesView SUBSCRIPTIONS_ONLY = fromString("SubscriptionsOnly");

    /** Static value Audit for EntitiesView. */
    public static final EntitiesView AUDIT = fromString("Audit");

    /**
     * Creates or finds a EntitiesView from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EntitiesView.
     */
    @JsonCreator
    public static EntitiesView fromString(String name) {
        return fromString(name, EntitiesView.class);
    }

    /** @return known EntitiesView values. */
    public static Collection<EntitiesView> values() {
        return values(EntitiesView.class);
    }
}
