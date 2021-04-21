// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devtestlabs.models.PolicyEvaluatorType;
import com.azure.resourcemanager.devtestlabs.models.PolicyFactName;
import com.azure.resourcemanager.devtestlabs.models.PolicyStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** A Policy. */
@JsonFlatten
@Fluent
public class PolicyInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicyInner.class);

    /*
     * The description of the policy.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The status of the policy.
     */
    @JsonProperty(value = "properties.status")
    private PolicyStatus status;

    /*
     * The fact name of the policy (e.g. LabVmCount, LabVmSize,
     * MaxVmsAllowedPerLab, etc.
     */
    @JsonProperty(value = "properties.factName")
    private PolicyFactName factName;

    /*
     * The fact data of the policy.
     */
    @JsonProperty(value = "properties.factData")
    private String factData;

    /*
     * The threshold of the policy (i.e. a number for MaxValuePolicy, and a
     * JSON array of values for AllowedValuesPolicy).
     */
    @JsonProperty(value = "properties.threshold")
    private String threshold;

    /*
     * The evaluator type of the policy (i.e. AllowedValuesPolicy,
     * MaxValuePolicy).
     */
    @JsonProperty(value = "properties.evaluatorType")
    private PolicyEvaluatorType evaluatorType;

    /*
     * The creation date of the policy.
     */
    @JsonProperty(value = "properties.createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDate;

    /*
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueIdentifier;

    /**
     * Get the description property: The description of the policy.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the policy.
     *
     * @param description the description value to set.
     * @return the PolicyInner object itself.
     */
    public PolicyInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the status property: The status of the policy.
     *
     * @return the status value.
     */
    public PolicyStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the policy.
     *
     * @param status the status value to set.
     * @return the PolicyInner object itself.
     */
    public PolicyInner withStatus(PolicyStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the factName property: The fact name of the policy (e.g. LabVmCount, LabVmSize, MaxVmsAllowedPerLab, etc.
     *
     * @return the factName value.
     */
    public PolicyFactName factName() {
        return this.factName;
    }

    /**
     * Set the factName property: The fact name of the policy (e.g. LabVmCount, LabVmSize, MaxVmsAllowedPerLab, etc.
     *
     * @param factName the factName value to set.
     * @return the PolicyInner object itself.
     */
    public PolicyInner withFactName(PolicyFactName factName) {
        this.factName = factName;
        return this;
    }

    /**
     * Get the factData property: The fact data of the policy.
     *
     * @return the factData value.
     */
    public String factData() {
        return this.factData;
    }

    /**
     * Set the factData property: The fact data of the policy.
     *
     * @param factData the factData value to set.
     * @return the PolicyInner object itself.
     */
    public PolicyInner withFactData(String factData) {
        this.factData = factData;
        return this;
    }

    /**
     * Get the threshold property: The threshold of the policy (i.e. a number for MaxValuePolicy, and a JSON array of
     * values for AllowedValuesPolicy).
     *
     * @return the threshold value.
     */
    public String threshold() {
        return this.threshold;
    }

    /**
     * Set the threshold property: The threshold of the policy (i.e. a number for MaxValuePolicy, and a JSON array of
     * values for AllowedValuesPolicy).
     *
     * @param threshold the threshold value to set.
     * @return the PolicyInner object itself.
     */
    public PolicyInner withThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * Get the evaluatorType property: The evaluator type of the policy (i.e. AllowedValuesPolicy, MaxValuePolicy).
     *
     * @return the evaluatorType value.
     */
    public PolicyEvaluatorType evaluatorType() {
        return this.evaluatorType;
    }

    /**
     * Set the evaluatorType property: The evaluator type of the policy (i.e. AllowedValuesPolicy, MaxValuePolicy).
     *
     * @param evaluatorType the evaluatorType value to set.
     * @return the PolicyInner object itself.
     */
    public PolicyInner withEvaluatorType(PolicyEvaluatorType evaluatorType) {
        this.evaluatorType = evaluatorType;
        return this;
    }

    /**
     * Get the createdDate property: The creation date of the policy.
     *
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Get the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /** {@inheritDoc} */
    @Override
    public PolicyInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PolicyInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
