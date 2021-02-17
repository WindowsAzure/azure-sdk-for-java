// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.resourcemanager.providerhub.fluent.models.DefaultRolloutInner;

/** An immutable client-side representation of DefaultRollout. */
public interface DefaultRollout {
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
     * Gets the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the specification property: The specification property.
     *
     * @return the specification value.
     */
    DefaultRolloutSpecification specification();

    /**
     * Gets the status property: The status property.
     *
     * @return the status value.
     */
    DefaultRolloutStatus status();

    /**
     * Gets the inner com.azure.resourcemanager.providerhub.fluent.models.DefaultRolloutInner object.
     *
     * @return the inner object.
     */
    DefaultRolloutInner innerModel();
}
