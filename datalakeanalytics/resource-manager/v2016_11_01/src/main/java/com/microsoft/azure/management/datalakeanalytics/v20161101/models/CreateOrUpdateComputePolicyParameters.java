/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2016_11_01.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters used to create a new compute policy.
 */
@JsonFlatten
public class CreateOrUpdateComputePolicyParameters {
    /**
     * The AAD object identifier for the entity to create a policy for.
     */
    @JsonProperty(value = "properties.objectId", required = true)
    private UUID objectId;

    /**
     * The type of AAD object the object identifier refers to. Possible values
     * include: 'User', 'Group', 'ServicePrincipal'.
     */
    @JsonProperty(value = "properties.objectType", required = true)
    private AADObjectType objectType;

    /**
     * The maximum degree of parallelism per job this user can use to submit
     * jobs. This property, the min priority per job property, or both must be
     * passed.
     */
    @JsonProperty(value = "properties.maxDegreeOfParallelismPerJob")
    private Integer maxDegreeOfParallelismPerJob;

    /**
     * The minimum priority per job this user can use to submit jobs. This
     * property, the max degree of parallelism per job property, or both must
     * be passed.
     */
    @JsonProperty(value = "properties.minPriorityPerJob")
    private Integer minPriorityPerJob;

    /**
     * Get the AAD object identifier for the entity to create a policy for.
     *
     * @return the objectId value
     */
    public UUID objectId() {
        return this.objectId;
    }

    /**
     * Set the AAD object identifier for the entity to create a policy for.
     *
     * @param objectId the objectId value to set
     * @return the CreateOrUpdateComputePolicyParameters object itself.
     */
    public CreateOrUpdateComputePolicyParameters withObjectId(UUID objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get the type of AAD object the object identifier refers to. Possible values include: 'User', 'Group', 'ServicePrincipal'.
     *
     * @return the objectType value
     */
    public AADObjectType objectType() {
        return this.objectType;
    }

    /**
     * Set the type of AAD object the object identifier refers to. Possible values include: 'User', 'Group', 'ServicePrincipal'.
     *
     * @param objectType the objectType value to set
     * @return the CreateOrUpdateComputePolicyParameters object itself.
     */
    public CreateOrUpdateComputePolicyParameters withObjectType(AADObjectType objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get the maximum degree of parallelism per job this user can use to submit jobs. This property, the min priority per job property, or both must be passed.
     *
     * @return the maxDegreeOfParallelismPerJob value
     */
    public Integer maxDegreeOfParallelismPerJob() {
        return this.maxDegreeOfParallelismPerJob;
    }

    /**
     * Set the maximum degree of parallelism per job this user can use to submit jobs. This property, the min priority per job property, or both must be passed.
     *
     * @param maxDegreeOfParallelismPerJob the maxDegreeOfParallelismPerJob value to set
     * @return the CreateOrUpdateComputePolicyParameters object itself.
     */
    public CreateOrUpdateComputePolicyParameters withMaxDegreeOfParallelismPerJob(Integer maxDegreeOfParallelismPerJob) {
        this.maxDegreeOfParallelismPerJob = maxDegreeOfParallelismPerJob;
        return this;
    }

    /**
     * Get the minimum priority per job this user can use to submit jobs. This property, the max degree of parallelism per job property, or both must be passed.
     *
     * @return the minPriorityPerJob value
     */
    public Integer minPriorityPerJob() {
        return this.minPriorityPerJob;
    }

    /**
     * Set the minimum priority per job this user can use to submit jobs. This property, the max degree of parallelism per job property, or both must be passed.
     *
     * @param minPriorityPerJob the minPriorityPerJob value to set
     * @return the CreateOrUpdateComputePolicyParameters object itself.
     */
    public CreateOrUpdateComputePolicyParameters withMinPriorityPerJob(Integer minPriorityPerJob) {
        this.minPriorityPerJob = minPriorityPerJob;
        return this;
    }

}
