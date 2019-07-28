/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2017_09_01;

import org.joda.time.Period;
import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details about the current or last completed resize operation.
 * Describes either the current operation (if the pool AllocationState is
 * Resizing) or the previously completed operation (if the AllocationState is
 * Steady).
 */
public class ResizeOperationStatus {
    /**
     * The desired number of dedicated compute nodes in the pool.
     */
    @JsonProperty(value = "targetDedicatedNodes")
    private Integer targetDedicatedNodes;

    /**
     * The desired number of low-priority compute nodes in the pool.
     */
    @JsonProperty(value = "targetLowPriorityNodes")
    private Integer targetLowPriorityNodes;

    /**
     * The timeout for allocation of compute nodes to the pool or removal of
     * compute nodes from the pool.
     * The default value is 15 minutes. The minimum value is 5 minutes. If you
     * specify a value less than 5 minutes, the Batch service returns an error;
     * if you are calling the REST API directly, the HTTP status code is 400
     * (Bad Request).
     */
    @JsonProperty(value = "resizeTimeout")
    private Period resizeTimeout;

    /**
     * Determines what to do with a node and its running task(s) if the pool
     * size is decreasing.
     * The default value is requeue. Possible values include: 'Requeue',
     * 'Terminate', 'TaskCompletion', 'RetainedData'.
     */
    @JsonProperty(value = "nodeDeallocationOption")
    private ComputeNodeDeallocationOption nodeDeallocationOption;

    /**
     * The time when this resize operation was started.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * Details of any errors encountered while performing the last resize on
     * the pool.
     * This property is set only if an error occurred during the last pool
     * resize, and only when the pool allocationState is Steady.
     */
    @JsonProperty(value = "errors")
    private List<ResizeError> errors;

    /**
     * Get the targetDedicatedNodes value.
     *
     * @return the targetDedicatedNodes value
     */
    public Integer targetDedicatedNodes() {
        return this.targetDedicatedNodes;
    }

    /**
     * Set the targetDedicatedNodes value.
     *
     * @param targetDedicatedNodes the targetDedicatedNodes value to set
     * @return the ResizeOperationStatus object itself.
     */
    public ResizeOperationStatus withTargetDedicatedNodes(Integer targetDedicatedNodes) {
        this.targetDedicatedNodes = targetDedicatedNodes;
        return this;
    }

    /**
     * Get the targetLowPriorityNodes value.
     *
     * @return the targetLowPriorityNodes value
     */
    public Integer targetLowPriorityNodes() {
        return this.targetLowPriorityNodes;
    }

    /**
     * Set the targetLowPriorityNodes value.
     *
     * @param targetLowPriorityNodes the targetLowPriorityNodes value to set
     * @return the ResizeOperationStatus object itself.
     */
    public ResizeOperationStatus withTargetLowPriorityNodes(Integer targetLowPriorityNodes) {
        this.targetLowPriorityNodes = targetLowPriorityNodes;
        return this;
    }

    /**
     * Get the default value is 15 minutes. The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service returns an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @return the resizeTimeout value
     */
    public Period resizeTimeout() {
        return this.resizeTimeout;
    }

    /**
     * Set the default value is 15 minutes. The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service returns an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @param resizeTimeout the resizeTimeout value to set
     * @return the ResizeOperationStatus object itself.
     */
    public ResizeOperationStatus withResizeTimeout(Period resizeTimeout) {
        this.resizeTimeout = resizeTimeout;
        return this;
    }

    /**
     * Get the default value is requeue. Possible values include: 'Requeue', 'Terminate', 'TaskCompletion', 'RetainedData'.
     *
     * @return the nodeDeallocationOption value
     */
    public ComputeNodeDeallocationOption nodeDeallocationOption() {
        return this.nodeDeallocationOption;
    }

    /**
     * Set the default value is requeue. Possible values include: 'Requeue', 'Terminate', 'TaskCompletion', 'RetainedData'.
     *
     * @param nodeDeallocationOption the nodeDeallocationOption value to set
     * @return the ResizeOperationStatus object itself.
     */
    public ResizeOperationStatus withNodeDeallocationOption(ComputeNodeDeallocationOption nodeDeallocationOption) {
        this.nodeDeallocationOption = nodeDeallocationOption;
        return this;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     * @return the ResizeOperationStatus object itself.
     */
    public ResizeOperationStatus withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get this property is set only if an error occurred during the last pool resize, and only when the pool allocationState is Steady.
     *
     * @return the errors value
     */
    public List<ResizeError> errors() {
        return this.errors;
    }

    /**
     * Set this property is set only if an error occurred during the last pool resize, and only when the pool allocationState is Steady.
     *
     * @param errors the errors value to set
     * @return the ResizeOperationStatus object itself.
     */
    public ResizeOperationStatus withErrors(List<ResizeError> errors) {
        this.errors = errors;
        return this;
    }

}
