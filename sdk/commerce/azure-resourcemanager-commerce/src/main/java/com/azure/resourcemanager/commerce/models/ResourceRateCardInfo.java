// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.commerce.models;

import com.azure.resourcemanager.commerce.fluent.models.ResourceRateCardInfoInner;
import java.util.List;

/** An immutable client-side representation of ResourceRateCardInfo. */
public interface ResourceRateCardInfo {
    /**
     * Gets the currency property: The currency in which the rates are provided.
     *
     * @return the currency value.
     */
    String currency();

    /**
     * Gets the locale property: The culture in which the resource information is localized.
     *
     * @return the locale value.
     */
    String locale();

    /**
     * Gets the isTaxIncluded property: All rates are pretax, so this will always be returned as 'false'.
     *
     * @return the isTaxIncluded value.
     */
    Boolean isTaxIncluded();

    /**
     * Gets the offerTerms property: A list of offer terms.
     *
     * @return the offerTerms value.
     */
    List<OfferTermInfo> offerTerms();

    /**
     * Gets the meters property: A list of meters.
     *
     * @return the meters value.
     */
    List<MeterInfo> meters();

    /**
     * Gets the inner com.azure.resourcemanager.commerce.fluent.models.ResourceRateCardInfoInner object.
     *
     * @return the inner object.
     */
    ResourceRateCardInfoInner innerModel();
}
