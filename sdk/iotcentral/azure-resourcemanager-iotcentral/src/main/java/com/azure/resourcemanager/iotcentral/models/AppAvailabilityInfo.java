// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.models;

import com.azure.resourcemanager.iotcentral.fluent.models.AppAvailabilityInfoInner;

/** An immutable client-side representation of AppAvailabilityInfo. */
public interface AppAvailabilityInfo {
    /**
     * Gets the nameAvailable property: The value which indicates whether the provided name is available.
     *
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * Gets the reason property: The reason for unavailability.
     *
     * @return the reason value.
     */
    String reason();

    /**
     * Gets the message property: The detailed reason message.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.iotcentral.fluent.models.AppAvailabilityInfoInner object.
     *
     * @return the inner object.
     */
    AppAvailabilityInfoInner innerModel();
}
