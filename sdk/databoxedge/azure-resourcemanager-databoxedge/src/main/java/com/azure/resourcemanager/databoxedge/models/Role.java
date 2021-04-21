// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.resourcemanager.databoxedge.fluent.models.RoleInner;

/** An immutable client-side representation of Role. */
public interface Role {
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
     * Gets the inner com.azure.resourcemanager.databoxedge.fluent.models.RoleInner object.
     *
     * @return the inner object.
     */
    RoleInner innerModel();
}
