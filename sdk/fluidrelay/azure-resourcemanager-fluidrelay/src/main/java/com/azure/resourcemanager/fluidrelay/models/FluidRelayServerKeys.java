// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.fluidrelay.models;

import com.azure.resourcemanager.fluidrelay.fluent.models.FluidRelayServerKeysInner;

/** An immutable client-side representation of FluidRelayServerKeys. */
public interface FluidRelayServerKeys {
    /**
     * Gets the key1 property: The primary key for this server.
     *
     * @return the key1 value.
     */
    String key1();

    /**
     * Gets the key2 property: The secondary key for this server.
     *
     * @return the key2 value.
     */
    String key2();

    /**
     * Gets the inner com.azure.resourcemanager.fluidrelay.fluent.models.FluidRelayServerKeysInner object.
     *
     * @return the inner object.
     */
    FluidRelayServerKeysInner innerModel();
}
