// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.resourcemanager.hybridnetwork.fluent.models.DeviceRegistrationKeyInner;

/** An immutable client-side representation of DeviceRegistrationKey. */
public interface DeviceRegistrationKey {
    /**
     * Gets the registrationKey property: The registration key for the device.
     *
     * @return the registrationKey value.
     */
    String registrationKey();

    /**
     * Gets the inner com.azure.resourcemanager.hybridnetwork.fluent.models.DeviceRegistrationKeyInner object.
     *
     * @return the inner object.
     */
    DeviceRegistrationKeyInner innerModel();
}
