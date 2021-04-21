// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeAuthKeysInner;

/** An immutable client-side representation of IntegrationRuntimeAuthKeys. */
public interface IntegrationRuntimeAuthKeys {
    /**
     * Gets the authKey1 property: The primary integration runtime authentication key.
     *
     * @return the authKey1 value.
     */
    String authKey1();

    /**
     * Gets the authKey2 property: The secondary integration runtime authentication key.
     *
     * @return the authKey2 value.
     */
    String authKey2();

    /**
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeAuthKeysInner object.
     *
     * @return the inner object.
     */
    IntegrationRuntimeAuthKeysInner innerModel();
}
