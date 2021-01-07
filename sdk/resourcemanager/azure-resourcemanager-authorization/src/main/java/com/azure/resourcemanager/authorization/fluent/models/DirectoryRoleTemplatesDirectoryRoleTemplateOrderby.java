// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DirectoryRoleTemplatesDirectoryRoleTemplateOrderby. */
public final class DirectoryRoleTemplatesDirectoryRoleTemplateOrderby
    extends ExpandableStringEnum<DirectoryRoleTemplatesDirectoryRoleTemplateOrderby> {
    /** Static value id for DirectoryRoleTemplatesDirectoryRoleTemplateOrderby. */
    public static final DirectoryRoleTemplatesDirectoryRoleTemplateOrderby ID = fromString("id");

    /** Static value id desc for DirectoryRoleTemplatesDirectoryRoleTemplateOrderby. */
    public static final DirectoryRoleTemplatesDirectoryRoleTemplateOrderby ID_DESC = fromString("id desc");

    /** Static value deletedDateTime for DirectoryRoleTemplatesDirectoryRoleTemplateOrderby. */
    public static final DirectoryRoleTemplatesDirectoryRoleTemplateOrderby DELETED_DATE_TIME =
        fromString("deletedDateTime");

    /** Static value deletedDateTime desc for DirectoryRoleTemplatesDirectoryRoleTemplateOrderby. */
    public static final DirectoryRoleTemplatesDirectoryRoleTemplateOrderby DELETED_DATE_TIME_DESC =
        fromString("deletedDateTime desc");

    /** Static value description for DirectoryRoleTemplatesDirectoryRoleTemplateOrderby. */
    public static final DirectoryRoleTemplatesDirectoryRoleTemplateOrderby DESCRIPTION = fromString("description");

    /** Static value description desc for DirectoryRoleTemplatesDirectoryRoleTemplateOrderby. */
    public static final DirectoryRoleTemplatesDirectoryRoleTemplateOrderby DESCRIPTION_DESC =
        fromString("description desc");

    /** Static value displayName for DirectoryRoleTemplatesDirectoryRoleTemplateOrderby. */
    public static final DirectoryRoleTemplatesDirectoryRoleTemplateOrderby DISPLAY_NAME = fromString("displayName");

    /** Static value displayName desc for DirectoryRoleTemplatesDirectoryRoleTemplateOrderby. */
    public static final DirectoryRoleTemplatesDirectoryRoleTemplateOrderby DISPLAY_NAME_DESC =
        fromString("displayName desc");

    /**
     * Creates or finds a DirectoryRoleTemplatesDirectoryRoleTemplateOrderby from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DirectoryRoleTemplatesDirectoryRoleTemplateOrderby.
     */
    @JsonCreator
    public static DirectoryRoleTemplatesDirectoryRoleTemplateOrderby fromString(String name) {
        return fromString(name, DirectoryRoleTemplatesDirectoryRoleTemplateOrderby.class);
    }

    /** @return known DirectoryRoleTemplatesDirectoryRoleTemplateOrderby values. */
    public static Collection<DirectoryRoleTemplatesDirectoryRoleTemplateOrderby> values() {
        return values(DirectoryRoleTemplatesDirectoryRoleTemplateOrderby.class);
    }
}
