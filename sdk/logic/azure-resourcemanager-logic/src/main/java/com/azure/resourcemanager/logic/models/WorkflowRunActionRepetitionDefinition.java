// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.resourcemanager.logic.fluent.models.WorkflowRunActionRepetitionDefinitionInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of WorkflowRunActionRepetitionDefinition. */
public interface WorkflowRunActionRepetitionDefinition {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the startTime property: The start time of the workflow scope repetition.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: The end time of the workflow scope repetition.
     *
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the correlation property: The correlation properties.
     *
     * @return the correlation value.
     */
    RunActionCorrelation correlation();

    /**
     * Gets the status property: The status of the workflow scope repetition.
     *
     * @return the status value.
     */
    WorkflowStatus status();

    /**
     * Gets the code property: The workflow scope repetition code.
     *
     * @return the code value.
     */
    String code();

    /**
     * Gets the error property: Any object.
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
     * Gets the inputs property: Gets the inputs.
     *
     * @return the inputs value.
     */
    Object inputs();

    /**
     * Gets the inputsLink property: Gets the link to inputs.
     *
     * @return the inputsLink value.
     */
    ContentLink inputsLink();

    /**
     * Gets the outputs property: Gets the outputs.
     *
     * @return the outputs value.
     */
    Object outputs();

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
     * Gets the iterationCount property: The iterationCount property.
     *
     * @return the iterationCount value.
     */
    Integer iterationCount();

    /**
     * Gets the repetitionIndexes property: The repetition indexes.
     *
     * @return the repetitionIndexes value.
     */
    List<RepetitionIndex> repetitionIndexes();

    /**
     * Gets the inner com.azure.resourcemanager.logic.fluent.models.WorkflowRunActionRepetitionDefinitionInner object.
     *
     * @return the inner object.
     */
    WorkflowRunActionRepetitionDefinitionInner innerModel();
}
