/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for JobErrorCategory.
 */
public final class JobErrorCategory extends ExpandableStringEnum<JobErrorCategory> {
    /** Static value Service for JobErrorCategory. */
    public static final JobErrorCategory SERVICE = fromString("Service");

    /** Static value Download for JobErrorCategory. */
    public static final JobErrorCategory DOWNLOAD = fromString("Download");

    /** Static value Upload for JobErrorCategory. */
    public static final JobErrorCategory UPLOAD = fromString("Upload");

    /** Static value Configuration for JobErrorCategory. */
    public static final JobErrorCategory CONFIGURATION = fromString("Configuration");

    /** Static value Content for JobErrorCategory. */
    public static final JobErrorCategory CONTENT = fromString("Content");

    /**
     * Creates or finds a JobErrorCategory from its string representation.
     * @param name a name to look for
     * @return the corresponding JobErrorCategory
     */
    @JsonCreator
    public static JobErrorCategory fromString(String name) {
        return fromString(name, JobErrorCategory.class);
    }

    /**
     * @return known JobErrorCategory values
     */
    public static Collection<JobErrorCategory> values() {
        return values(JobErrorCategory.class);
    }
}
