/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_03_31_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ProjectTargetPlatform.
 */
public final class ProjectTargetPlatform extends ExpandableStringEnum<ProjectTargetPlatform> {
    /** Static value SQLDB for ProjectTargetPlatform. */
    public static final ProjectTargetPlatform SQLDB = fromString("SQLDB");

    /** Static value SQLMI for ProjectTargetPlatform. */
    public static final ProjectTargetPlatform SQLMI = fromString("SQLMI");

    /** Static value Unknown for ProjectTargetPlatform. */
    public static final ProjectTargetPlatform UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a ProjectTargetPlatform from its string representation.
     * @param name a name to look for
     * @return the corresponding ProjectTargetPlatform
     */
    @JsonCreator
    public static ProjectTargetPlatform fromString(String name) {
        return fromString(name, ProjectTargetPlatform.class);
    }

    /**
     * @return known ProjectTargetPlatform values
     */
    public static Collection<ProjectTargetPlatform> values() {
        return values(ProjectTargetPlatform.class);
    }
}
