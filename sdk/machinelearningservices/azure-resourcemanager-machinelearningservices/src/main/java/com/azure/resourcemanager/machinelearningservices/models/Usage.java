// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.resourcemanager.machinelearningservices.fluent.models.UsageInner;

/** An immutable client-side representation of Usage. */
public interface Usage {
    /**
     * Gets the id property: Specifies the resource ID.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the amlWorkspaceLocation property: Region of the AML workspace in the id.
     *
     * @return the amlWorkspaceLocation value.
     */
    String amlWorkspaceLocation();

    /**
     * Gets the type property: Specifies the resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the unit property: An enum describing the unit of usage measurement.
     *
     * @return the unit value.
     */
    UsageUnit unit();

    /**
     * Gets the currentValue property: The current usage of the resource.
     *
     * @return the currentValue value.
     */
    Long currentValue();

    /**
     * Gets the limit property: The maximum permitted usage of the resource.
     *
     * @return the limit value.
     */
    Long limit();

    /**
     * Gets the name property: The name of the type of usage.
     *
     * @return the name value.
     */
    UsageName name();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearningservices.fluent.models.UsageInner object.
     *
     * @return the inner object.
     */
    UsageInner innerModel();
}
