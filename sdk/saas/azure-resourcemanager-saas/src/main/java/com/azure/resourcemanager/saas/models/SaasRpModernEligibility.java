// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.saas.models;

import com.azure.resourcemanager.saas.fluent.models.SaasRpModernEligibilityInner;

/** An immutable client-side representation of SaasRpModernEligibility. */
public interface SaasRpModernEligibility {
    /**
     * Gets the id property: the azure subscription id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the isModern property: whether the azure subscription has been converted to modern.
     *
     * @return the isModern value.
     */
    Boolean isModern();

    /**
     * Gets the inner com.azure.resourcemanager.saas.fluent.models.SaasRpModernEligibilityInner object.
     *
     * @return the inner object.
     */
    SaasRpModernEligibilityInner innerModel();
}
