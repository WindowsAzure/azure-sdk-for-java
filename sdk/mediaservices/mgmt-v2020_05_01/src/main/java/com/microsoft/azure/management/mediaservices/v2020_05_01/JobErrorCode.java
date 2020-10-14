/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for JobErrorCode.
 */
public final class JobErrorCode extends ExpandableStringEnum<JobErrorCode> {
    /** Static value ServiceError for JobErrorCode. */
    public static final JobErrorCode SERVICE_ERROR = fromString("ServiceError");

    /** Static value ServiceTransientError for JobErrorCode. */
    public static final JobErrorCode SERVICE_TRANSIENT_ERROR = fromString("ServiceTransientError");

    /** Static value DownloadNotAccessible for JobErrorCode. */
    public static final JobErrorCode DOWNLOAD_NOT_ACCESSIBLE = fromString("DownloadNotAccessible");

    /** Static value DownloadTransientError for JobErrorCode. */
    public static final JobErrorCode DOWNLOAD_TRANSIENT_ERROR = fromString("DownloadTransientError");

    /** Static value UploadNotAccessible for JobErrorCode. */
    public static final JobErrorCode UPLOAD_NOT_ACCESSIBLE = fromString("UploadNotAccessible");

    /** Static value UploadTransientError for JobErrorCode. */
    public static final JobErrorCode UPLOAD_TRANSIENT_ERROR = fromString("UploadTransientError");

    /** Static value ConfigurationUnsupported for JobErrorCode. */
    public static final JobErrorCode CONFIGURATION_UNSUPPORTED = fromString("ConfigurationUnsupported");

    /** Static value ContentMalformed for JobErrorCode. */
    public static final JobErrorCode CONTENT_MALFORMED = fromString("ContentMalformed");

    /** Static value ContentUnsupported for JobErrorCode. */
    public static final JobErrorCode CONTENT_UNSUPPORTED = fromString("ContentUnsupported");

    /**
     * Creates or finds a JobErrorCode from its string representation.
     * @param name a name to look for
     * @return the corresponding JobErrorCode
     */
    @JsonCreator
    public static JobErrorCode fromString(String name) {
        return fromString(name, JobErrorCode.class);
    }

    /**
     * @return known JobErrorCode values
     */
    public static Collection<JobErrorCode> values() {
        return values(JobErrorCode.class);
    }
}
