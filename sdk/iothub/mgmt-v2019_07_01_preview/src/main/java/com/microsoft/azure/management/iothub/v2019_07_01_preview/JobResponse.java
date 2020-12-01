/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_07_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.iothub.v2019_07_01_preview.implementation.JobResponseInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.iothub.v2019_07_01_preview.implementation.DevicesManager;
import com.microsoft.rest.DateTimeRfc1123;
import org.joda.time.DateTime;

/**
 * Type representing JobResponse.
 */
public interface JobResponse extends HasInner<JobResponseInner>, HasManager<DevicesManager> {
    /**
     * @return the endTimeUtc value.
     */
    DateTime endTimeUtc();

    /**
     * @return the failureReason value.
     */
    String failureReason();

    /**
     * @return the jobId value.
     */
    String jobId();

    /**
     * @return the parentJobId value.
     */
    String parentJobId();

    /**
     * @return the startTimeUtc value.
     */
    DateTime startTimeUtc();

    /**
     * @return the status value.
     */
    JobStatus status();

    /**
     * @return the statusMessage value.
     */
    String statusMessage();

    /**
     * @return the type value.
     */
    JobType type();

}
