// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DirectoryRolesSelect. */
public final class DirectoryRolesSelect extends ExpandableStringEnum<DirectoryRolesSelect> {
    /** Static value id for DirectoryRolesSelect. */
    public static final DirectoryRolesSelect ID = fromString("id");

    /** Static value deletedDateTime for DirectoryRolesSelect. */
    public static final DirectoryRolesSelect DELETED_DATE_TIME = fromString("deletedDateTime");

    /**
     * Creates or finds a DirectoryRolesSelect from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DirectoryRolesSelect.
     */
    @JsonCreator
    public static DirectoryRolesSelect fromString(String name) {
        return fromString(name, DirectoryRolesSelect.class);
    }

    /** @return known DirectoryRolesSelect values. */
    public static Collection<DirectoryRolesSelect> values() {
        return values(DirectoryRolesSelect.class);
    }
}
