/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for JobType.
 */
public final class JobType extends ExpandableStringEnum<JobType> {
    /** Static value Invalid for JobType. */
    public static final JobType INVALID = fromString("Invalid");

    /** Static value ScanForUpdates for JobType. */
    public static final JobType SCAN_FOR_UPDATES = fromString("ScanForUpdates");

    /** Static value DownloadUpdates for JobType. */
    public static final JobType DOWNLOAD_UPDATES = fromString("DownloadUpdates");

    /** Static value InstallUpdates for JobType. */
    public static final JobType INSTALL_UPDATES = fromString("InstallUpdates");

    /** Static value RefreshShare for JobType. */
    public static final JobType REFRESH_SHARE = fromString("RefreshShare");

    /** Static value RefreshContainer for JobType. */
    public static final JobType REFRESH_CONTAINER = fromString("RefreshContainer");

    /**
     * Creates or finds a JobType from its string representation.
     * @param name a name to look for
     * @return the corresponding JobType
     */
    @JsonCreator
    public static JobType fromString(String name) {
        return fromString(name, JobType.class);
    }

    /**
     * @return known JobType values
     */
    public static Collection<JobType> values() {
        return values(JobType.class);
    }
}
