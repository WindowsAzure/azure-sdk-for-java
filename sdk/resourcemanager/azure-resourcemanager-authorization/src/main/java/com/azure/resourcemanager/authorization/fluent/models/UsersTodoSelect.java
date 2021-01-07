// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UsersTodoSelect. */
public final class UsersTodoSelect extends ExpandableStringEnum<UsersTodoSelect> {
    /** Static value id for UsersTodoSelect. */
    public static final UsersTodoSelect ID = fromString("id");

    /** Static value displayName for UsersTodoSelect. */
    public static final UsersTodoSelect DISPLAY_NAME = fromString("displayName");

    /** Static value isOwner for UsersTodoSelect. */
    public static final UsersTodoSelect IS_OWNER = fromString("isOwner");

    /** Static value isShared for UsersTodoSelect. */
    public static final UsersTodoSelect IS_SHARED = fromString("isShared");

    /** Static value wellknownListName for UsersTodoSelect. */
    public static final UsersTodoSelect WELLKNOWN_LIST_NAME = fromString("wellknownListName");

    /** Static value extensions for UsersTodoSelect. */
    public static final UsersTodoSelect EXTENSIONS = fromString("extensions");

    /** Static value tasks for UsersTodoSelect. */
    public static final UsersTodoSelect TASKS = fromString("tasks");

    /**
     * Creates or finds a UsersTodoSelect from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UsersTodoSelect.
     */
    @JsonCreator
    public static UsersTodoSelect fromString(String name) {
        return fromString(name, UsersTodoSelect.class);
    }

    /** @return known UsersTodoSelect values. */
    public static Collection<UsersTodoSelect> values() {
        return values(UsersTodoSelect.class);
    }
}
