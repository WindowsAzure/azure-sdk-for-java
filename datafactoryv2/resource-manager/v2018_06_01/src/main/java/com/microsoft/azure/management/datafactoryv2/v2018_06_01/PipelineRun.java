/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.PipelineRunInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.DataFactoryManager;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing PipelineRun.
 */
public interface PipelineRun extends HasInner<PipelineRunInner>, HasManager<DataFactoryManager> {
    /**
     * @return the additionalProperties value.
     */
    Map<String, Object> additionalProperties();

    /**
     * @return the durationInMs value.
     */
    Integer durationInMs();

    /**
     * @return the invokedBy value.
     */
    PipelineRunInvokedBy invokedBy();

    /**
     * @return the lastUpdated value.
     */
    DateTime lastUpdated();

    /**
     * @return the message value.
     */
    String message();

    /**
     * @return the parameters value.
     */
    Map<String, String> parameters();

    /**
     * @return the pipelineName value.
     */
    String pipelineName();

    /**
     * @return the runEnd value.
     */
    DateTime runEnd();

    /**
     * @return the runId value.
     */
    String runId();

    /**
     * @return the runStart value.
     */
    DateTime runStart();

    /**
     * @return the status value.
     */
    String status();

}
