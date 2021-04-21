// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.resourcemanager.automation.fluent.models.UsageInner;

/** An immutable client-side representation of Usage. */
public interface Usage {
    /**
     * Gets the id property: Gets or sets the id of the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Gets or sets the usage counter name.
     *
     * @return the name value.
     */
    UsageCounterName name();

    /**
     * Gets the unit property: Gets or sets the usage unit name.
     *
     * @return the unit value.
     */
    String unit();

    /**
     * Gets the currentValue property: Gets or sets the current usage value.
     *
     * @return the currentValue value.
     */
    Double currentValue();

    /**
     * Gets the limit property: Gets or sets max limit. -1 for unlimited.
     *
     * @return the limit value.
     */
    Long limit();

    /**
     * Gets the throttleStatus property: Gets or sets the throttle status.
     *
     * @return the throttleStatus value.
     */
    String throttleStatus();

    /**
     * Gets the inner com.azure.resourcemanager.automation.fluent.models.UsageInner object.
     *
     * @return the inner object.
     */
    UsageInner innerModel();
}
