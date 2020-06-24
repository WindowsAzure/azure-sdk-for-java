/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Used for establishing the purchase context of any 3rd Party artifact through
 * MarketPlace.
 */
public class PurchasePlan {
    /**
     * The publisher ID.
     */
    @JsonProperty(value = "publisher", required = true)
    private String publisher;

    /**
     * The plan ID.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Specifies the product of the image from the marketplace. This is the
     * same value as Offer under the imageReference element.
     */
    @JsonProperty(value = "product", required = true)
    private String product;

    /**
     * Get the publisher value.
     *
     * @return the publisher value
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher value.
     *
     * @param publisher the publisher value to set
     * @return the PurchasePlan object itself.
     */
    public PurchasePlan withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the PurchasePlan object itself.
     */
    public PurchasePlan withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the product value.
     *
     * @return the product value
     */
    public String product() {
        return this.product;
    }

    /**
     * Set the product value.
     *
     * @param product the product value to set
     * @return the PurchasePlan object itself.
     */
    public PurchasePlan withProduct(String product) {
        this.product = product;
        return this;
    }

}
