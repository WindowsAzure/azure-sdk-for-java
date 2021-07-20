// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.resourcemanager.security.fluent.models.PricingInner;
import java.time.Duration;

/** An immutable client-side representation of Pricing. */
public interface Pricing {
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
     * Gets the pricingTier property: The pricing tier value. Azure Security Center is provided in two pricing tiers:
     * free and standard, with the standard tier available with a trial period. The standard tier offers advanced
     * security capabilities, while the free tier offers basic security features.
     *
     * @return the pricingTier value.
     */
    PricingTier pricingTier();

    /**
     * Gets the freeTrialRemainingTime property: The duration left for the subscriptions free trial period - in ISO 8601
     * format (e.g. P3Y6M4DT12H30M5S).
     *
     * @return the freeTrialRemainingTime value.
     */
    Duration freeTrialRemainingTime();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.PricingInner object.
     *
     * @return the inner object.
     */
    PricingInner innerModel();
}
