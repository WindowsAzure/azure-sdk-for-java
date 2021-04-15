// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.hybridcompute.fluent.models.PrivateLinkResourceInner;

/** An immutable client-side representation of PrivateLinkResource. */
public interface PrivateLinkResource {
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
     * Gets the properties property: Resource properties.
     *
     * @return the properties value.
     */
    PrivateLinkResourceProperties properties();

    /**
     * Gets the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the inner com.azure.resourcemanager.hybridcompute.fluent.models.PrivateLinkResourceInner object.
     *
     * @return the inner object.
     */
    PrivateLinkResourceInner innerModel();
}
