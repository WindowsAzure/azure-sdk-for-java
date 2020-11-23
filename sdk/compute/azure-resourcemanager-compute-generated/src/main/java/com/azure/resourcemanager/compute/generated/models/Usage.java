// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.compute.generated.fluent.models.UsageInner;

/** An immutable client-side representation of Usage. */
@Immutable
public interface Usage {
    /**
     * Gets the unit property: An enum describing the unit of usage measurement.
     *
     * @return the unit value.
     */
    String unit();

    /**
     * Gets the currentValue property: The current usage of the resource.
     *
     * @return the currentValue value.
     */
    int currentValue();

    /**
     * Gets the limit property: The maximum permitted usage of the resource.
     *
     * @return the limit value.
     */
    long limit();

    /**
     * Gets the name property: The name of the type of usage.
     *
     * @return the name value.
     */
    UsageName name();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.UsageInner object.
     *
     * @return the inner object.
     */
    UsageInner innerModel();
}
