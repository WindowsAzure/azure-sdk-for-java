// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.resourcemanager.synapse.fluent.models.CheckNameAvailabilityResponseInner;

/** An immutable client-side representation of CheckNameAvailabilityResponse. */
public interface CheckNameAvailabilityResponse {
    /**
     * Gets the message property: Validation message.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the available property: Whether the workspace name is available.
     *
     * @return the available value.
     */
    Boolean available();

    /**
     * Gets the reason property: Reason the workspace name is or is not available.
     *
     * @return the reason value.
     */
    String reason();

    /**
     * Gets the name property: Workspace name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.CheckNameAvailabilityResponseInner object.
     *
     * @return the inner object.
     */
    CheckNameAvailabilityResponseInner innerModel();
}