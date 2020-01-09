/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The attributes for the health check step.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = HealthCheckStepAttributes.class)
@JsonTypeName("HealthCheckStepAttributes")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "REST", value = RestHealthCheckStepAttributes.class)
})
public class HealthCheckStepAttributes {
    /**
     * The duration in ISO 8601 format for which health check waits idly
     * without any checks.
     */
    @JsonProperty(value = "waitDuration")
    private String waitDuration;

    /**
     * The duration in ISO 8601 format for which the health check waits for the
     * resource to become healthy. Health check fails if it doesn't. Health
     * check starts to enforce healthyStateDuration once resource becomes
     * healthy.
     */
    @JsonProperty(value = "maxElasticDuration")
    private String maxElasticDuration;

    /**
     * The duration in ISO 8601 format for which the resource is expected to be
     * continuously healthy. If maxElasticDuration is specified, healthy state
     * duration is enforced after the detection of first healthy signal.
     */
    @JsonProperty(value = "healthyStateDuration", required = true)
    private String healthyStateDuration;

    /**
     * Get the duration in ISO 8601 format for which health check waits idly without any checks.
     *
     * @return the waitDuration value
     */
    public String waitDuration() {
        return this.waitDuration;
    }

    /**
     * Set the duration in ISO 8601 format for which health check waits idly without any checks.
     *
     * @param waitDuration the waitDuration value to set
     * @return the HealthCheckStepAttributes object itself.
     */
    public HealthCheckStepAttributes withWaitDuration(String waitDuration) {
        this.waitDuration = waitDuration;
        return this;
    }

    /**
     * Get the duration in ISO 8601 format for which the health check waits for the resource to become healthy. Health check fails if it doesn't. Health check starts to enforce healthyStateDuration once resource becomes healthy.
     *
     * @return the maxElasticDuration value
     */
    public String maxElasticDuration() {
        return this.maxElasticDuration;
    }

    /**
     * Set the duration in ISO 8601 format for which the health check waits for the resource to become healthy. Health check fails if it doesn't. Health check starts to enforce healthyStateDuration once resource becomes healthy.
     *
     * @param maxElasticDuration the maxElasticDuration value to set
     * @return the HealthCheckStepAttributes object itself.
     */
    public HealthCheckStepAttributes withMaxElasticDuration(String maxElasticDuration) {
        this.maxElasticDuration = maxElasticDuration;
        return this;
    }

    /**
     * Get the duration in ISO 8601 format for which the resource is expected to be continuously healthy. If maxElasticDuration is specified, healthy state duration is enforced after the detection of first healthy signal.
     *
     * @return the healthyStateDuration value
     */
    public String healthyStateDuration() {
        return this.healthyStateDuration;
    }

    /**
     * Set the duration in ISO 8601 format for which the resource is expected to be continuously healthy. If maxElasticDuration is specified, healthy state duration is enforced after the detection of first healthy signal.
     *
     * @param healthyStateDuration the healthyStateDuration value to set
     * @return the HealthCheckStepAttributes object itself.
     */
    public HealthCheckStepAttributes withHealthyStateDuration(String healthyStateDuration) {
        this.healthyStateDuration = healthyStateDuration;
        return this;
    }

}
