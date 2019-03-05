/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.edgegateway.implementation.JobInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.edgegateway.implementation.DataBoxEdgeManager;
import org.joda.time.DateTime;

/**
 * Type representing DataBoxEdgeDeviceJob.
 */
public interface DataBoxEdgeDeviceJob extends HasInner<JobInner>, Indexable, Refreshable<DataBoxEdgeDeviceJob>, HasManager<DataBoxEdgeManager> {
    /**
     * @return the currentStage value.
     */
    UpdateOperationStage currentStage();

    /**
     * @return the downloadProgress value.
     */
    UpdateDownloadProgress downloadProgress();

    /**
     * @return the endTime value.
     */
    DateTime endTime();

    /**
     * @return the error value.
     */
    JobErrorDetails error();

    /**
     * @return the errorManifestFile value.
     */
    String errorManifestFile();

    /**
     * @return the folder value.
     */
    String folder();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the installProgress value.
     */
    UpdateInstallProgress installProgress();

    /**
     * @return the jobType value.
     */
    JobType jobType();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the percentComplete value.
     */
    Integer percentComplete();

    /**
     * @return the shareId value.
     */
    String shareId();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the status value.
     */
    JobStatus status();

    /**
     * @return the totalRefreshErrors value.
     */
    Integer totalRefreshErrors();

    /**
     * @return the type value.
     */
    String type();

}
