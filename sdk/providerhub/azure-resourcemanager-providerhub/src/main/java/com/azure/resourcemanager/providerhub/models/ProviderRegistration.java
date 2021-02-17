// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.resourcemanager.providerhub.fluent.models.ProviderRegistrationInner;

/** An immutable client-side representation of ProviderRegistration. */
public interface ProviderRegistration {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: The properties property.
     *
     * @return the properties value.
     */
    ProviderRegistrationProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.providerhub.fluent.models.ProviderRegistrationInner object.
     *
     * @return the inner object.
     */
    ProviderRegistrationInner innerModel();
}
