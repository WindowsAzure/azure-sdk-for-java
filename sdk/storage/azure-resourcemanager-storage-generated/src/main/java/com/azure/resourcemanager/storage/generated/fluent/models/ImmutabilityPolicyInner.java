// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.generated.models.AzureEntityResource;
import com.azure.resourcemanager.storage.generated.models.ImmutabilityPolicyState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag. */
@JsonFlatten
@Fluent
public class ImmutabilityPolicyInner extends AzureEntityResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImmutabilityPolicyInner.class);

    /*
     * The immutability period for the blobs in the container since the policy
     * creation, in days.
     */
    @JsonProperty(value = "properties.immutabilityPeriodSinceCreationInDays")
    private Integer immutabilityPeriodSinceCreationInDays;

    /*
     * The ImmutabilityPolicy state of a blob container, possible values
     * include: Locked and Unlocked.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private ImmutabilityPolicyState state;

    /*
     * This property can only be changed for unlocked time-based retention
     * policies. When enabled, new blocks can be written to an append blob
     * while maintaining immutability protection and compliance. Only new
     * blocks can be added and any existing blocks cannot be modified or
     * deleted. This property cannot be changed with ExtendImmutabilityPolicy
     * API
     */
    @JsonProperty(value = "properties.allowProtectedAppendWrites")
    private Boolean allowProtectedAppendWrites;

    /**
     * Get the immutabilityPeriodSinceCreationInDays property: The immutability period for the blobs in the container
     * since the policy creation, in days.
     *
     * @return the immutabilityPeriodSinceCreationInDays value.
     */
    public Integer immutabilityPeriodSinceCreationInDays() {
        return this.immutabilityPeriodSinceCreationInDays;
    }

    /**
     * Set the immutabilityPeriodSinceCreationInDays property: The immutability period for the blobs in the container
     * since the policy creation, in days.
     *
     * @param immutabilityPeriodSinceCreationInDays the immutabilityPeriodSinceCreationInDays value to set.
     * @return the ImmutabilityPolicyInner object itself.
     */
    public ImmutabilityPolicyInner withImmutabilityPeriodSinceCreationInDays(
        Integer immutabilityPeriodSinceCreationInDays) {
        this.immutabilityPeriodSinceCreationInDays = immutabilityPeriodSinceCreationInDays;
        return this;
    }

    /**
     * Get the state property: The ImmutabilityPolicy state of a blob container, possible values include: Locked and
     * Unlocked.
     *
     * @return the state value.
     */
    public ImmutabilityPolicyState state() {
        return this.state;
    }

    /**
     * Get the allowProtectedAppendWrites property: This property can only be changed for unlocked time-based retention
     * policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and
     * compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property
     * cannot be changed with ExtendImmutabilityPolicy API.
     *
     * @return the allowProtectedAppendWrites value.
     */
    public Boolean allowProtectedAppendWrites() {
        return this.allowProtectedAppendWrites;
    }

    /**
     * Set the allowProtectedAppendWrites property: This property can only be changed for unlocked time-based retention
     * policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and
     * compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property
     * cannot be changed with ExtendImmutabilityPolicy API.
     *
     * @param allowProtectedAppendWrites the allowProtectedAppendWrites value to set.
     * @return the ImmutabilityPolicyInner object itself.
     */
    public ImmutabilityPolicyInner withAllowProtectedAppendWrites(Boolean allowProtectedAppendWrites) {
        this.allowProtectedAppendWrites = allowProtectedAppendWrites;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
