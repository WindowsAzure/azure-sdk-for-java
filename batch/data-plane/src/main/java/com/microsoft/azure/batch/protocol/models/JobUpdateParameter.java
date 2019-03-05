// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The set of changes to be made to a job.
 */
public class JobUpdateParameter {
    /**
     * The priority of the job.
     * Priority values can range from -1000 to 1000, with -1000 being the
     * lowest priority and 1000 being the highest priority. If omitted, it is
     * set to the default value 0.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /**
     * The execution constraints for the job.
     * If omitted, the constraints are cleared.
     */
    @JsonProperty(value = "constraints")
    private JobConstraints constraints;

    /**
     * The pool on which the Batch service runs the job's tasks.
     * You may change the pool for a job only when the job is disabled. The
     * Update Job call will fail if you include the poolInfo element and the
     * job is not disabled. If you specify an autoPoolSpecification
     * specification in the poolInfo, only the keepAlive property can be
     * updated, and then only if the auto pool has a poolLifetimeOption of job.
     */
    @JsonProperty(value = "poolInfo", required = true)
    private PoolInformation poolInfo;

    /**
     * A list of name-value pairs associated with the job as metadata.
     * If omitted, it takes the default value of an empty list; in effect, any
     * existing metadata is deleted.
     */
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /**
     * The action the Batch service should take when all tasks in the job are
     * in the completed state.
     * If omitted, the completion behavior is set to noaction. If the current
     * value is terminatejob, this is an error because a job's completion
     * behavior may not be changed from terminatejob to noaction. You may not
     * change the value from terminatejob to noaction - that is, once you have
     * engaged automatic job termination, you cannot turn it off again. If you
     * try to do this, the request fails and Batch returns status code 400 (Bad
     * Request) and an 'invalid property value' error response. If you do not
     * specify this element in a PUT request, it is equivalent to passing
     * noaction. This is an error if the current value is terminatejob.
     * Possible values include: 'noAction', 'terminateJob'.
     */
    @JsonProperty(value = "onAllTasksComplete")
    private OnAllTasksComplete onAllTasksComplete;

    /**
     * Get priority values can range from -1000 to 1000, with -1000 being the lowest priority and 1000 being the highest priority. If omitted, it is set to the default value 0.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set priority values can range from -1000 to 1000, with -1000 being the lowest priority and 1000 being the highest priority. If omitted, it is set to the default value 0.
     *
     * @param priority the priority value to set
     * @return the JobUpdateParameter object itself.
     */
    public JobUpdateParameter withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get if omitted, the constraints are cleared.
     *
     * @return the constraints value
     */
    public JobConstraints constraints() {
        return this.constraints;
    }

    /**
     * Set if omitted, the constraints are cleared.
     *
     * @param constraints the constraints value to set
     * @return the JobUpdateParameter object itself.
     */
    public JobUpdateParameter withConstraints(JobConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Get you may change the pool for a job only when the job is disabled. The Update Job call will fail if you include the poolInfo element and the job is not disabled. If you specify an autoPoolSpecification specification in the poolInfo, only the keepAlive property can be updated, and then only if the auto pool has a poolLifetimeOption of job.
     *
     * @return the poolInfo value
     */
    public PoolInformation poolInfo() {
        return this.poolInfo;
    }

    /**
     * Set you may change the pool for a job only when the job is disabled. The Update Job call will fail if you include the poolInfo element and the job is not disabled. If you specify an autoPoolSpecification specification in the poolInfo, only the keepAlive property can be updated, and then only if the auto pool has a poolLifetimeOption of job.
     *
     * @param poolInfo the poolInfo value to set
     * @return the JobUpdateParameter object itself.
     */
    public JobUpdateParameter withPoolInfo(PoolInformation poolInfo) {
        this.poolInfo = poolInfo;
        return this;
    }

    /**
     * Get if omitted, it takes the default value of an empty list; in effect, any existing metadata is deleted.
     *
     * @return the metadata value
     */
    public List<MetadataItem> metadata() {
        return this.metadata;
    }

    /**
     * Set if omitted, it takes the default value of an empty list; in effect, any existing metadata is deleted.
     *
     * @param metadata the metadata value to set
     * @return the JobUpdateParameter object itself.
     */
    public JobUpdateParameter withMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get if omitted, the completion behavior is set to noaction. If the current value is terminatejob, this is an error because a job's completion behavior may not be changed from terminatejob to noaction. You may not change the value from terminatejob to noaction - that is, once you have engaged automatic job termination, you cannot turn it off again. If you try to do this, the request fails and Batch returns status code 400 (Bad Request) and an 'invalid property value' error response. If you do not specify this element in a PUT request, it is equivalent to passing noaction. This is an error if the current value is terminatejob. Possible values include: 'noAction', 'terminateJob'.
     *
     * @return the onAllTasksComplete value
     */
    public OnAllTasksComplete onAllTasksComplete() {
        return this.onAllTasksComplete;
    }

    /**
     * Set if omitted, the completion behavior is set to noaction. If the current value is terminatejob, this is an error because a job's completion behavior may not be changed from terminatejob to noaction. You may not change the value from terminatejob to noaction - that is, once you have engaged automatic job termination, you cannot turn it off again. If you try to do this, the request fails and Batch returns status code 400 (Bad Request) and an 'invalid property value' error response. If you do not specify this element in a PUT request, it is equivalent to passing noaction. This is an error if the current value is terminatejob. Possible values include: 'noAction', 'terminateJob'.
     *
     * @param onAllTasksComplete the onAllTasksComplete value to set
     * @return the JobUpdateParameter object itself.
     */
    public JobUpdateParameter withOnAllTasksComplete(OnAllTasksComplete onAllTasksComplete) {
        this.onAllTasksComplete = onAllTasksComplete;
        return this;
    }

}
