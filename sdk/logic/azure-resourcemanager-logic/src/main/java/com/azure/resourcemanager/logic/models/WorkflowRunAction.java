// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.resourcemanager.logic.fluent.models.WorkflowRunActionInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of WorkflowRunAction. */
public interface WorkflowRunAction {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Gets the workflow run action name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Gets the workflow run action type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the startTime property: Gets the start time.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: Gets the end time.
     *
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the status property: Gets the status.
     *
     * @return the status value.
     */
    WorkflowStatus status();

    /**
     * Gets the code property: Gets the code.
     *
     * @return the code value.
     */
    String code();

    /**
     * Gets the error property: Gets the error.
     *
     * @return the error value.
     */
    Object error();

    /**
     * Gets the trackingId property: Gets the tracking id.
     *
     * @return the trackingId value.
     */
    String trackingId();

    /**
     * Gets the correlation property: The correlation properties.
     *
     * @return the correlation value.
     */
    RunActionCorrelation correlation();

    /**
     * Gets the inputsLink property: Gets the link to inputs.
     *
     * @return the inputsLink value.
     */
    ContentLink inputsLink();

    /**
     * Gets the outputsLink property: Gets the link to outputs.
     *
     * @return the outputsLink value.
     */
    ContentLink outputsLink();

    /**
     * Gets the trackedProperties property: Gets the tracked properties.
     *
     * @return the trackedProperties value.
     */
    Object trackedProperties();

    /**
     * Gets the retryHistory property: Gets the retry histories.
     *
     * @return the retryHistory value.
     */
    List<RetryHistory> retryHistory();

    /**
     * Gets the inner com.azure.resourcemanager.logic.fluent.models.WorkflowRunActionInner object.
     *
     * @return the inner object.
     */
    WorkflowRunActionInner innerModel();
}
