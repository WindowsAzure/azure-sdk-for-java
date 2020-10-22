/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies information about the marketplace image used to create the virtual
 * machine. This element is only used for marketplace images. Before you can
 * use a marketplace image from an API, you must enable the image for
 * programmatic use.  In the Azure portal, find the marketplace image that you
 * want to use and then click **Want to deploy programmatically, Get Started
 * -&gt;**. Enter any required information and then click **Save**.
 */
public class Plan {
    /**
     * The plan ID.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The publisher ID.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /**
     * Specifies the product of the image from the marketplace. This is the
     * same value as Offer under the imageReference element.
     */
    @JsonProperty(value = "product")
    private String product;

    /**
     * The promotion code.
     */
    @JsonProperty(value = "promotionCode")
    private String promotionCode;

    /**
     * Get the plan ID.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the plan ID.
     *
     * @param name the name value to set
     * @return the Plan object itself.
     */
    public Plan withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the publisher ID.
     *
     * @return the publisher value
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher ID.
     *
     * @param publisher the publisher value to set
     * @return the Plan object itself.
     */
    public Plan withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get specifies the product of the image from the marketplace. This is the same value as Offer under the imageReference element.
     *
     * @return the product value
     */
    public String product() {
        return this.product;
    }

    /**
     * Set specifies the product of the image from the marketplace. This is the same value as Offer under the imageReference element.
     *
     * @param product the product value to set
     * @return the Plan object itself.
     */
    public Plan withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Get the promotion code.
     *
     * @return the promotionCode value
     */
    public String promotionCode() {
        return this.promotionCode;
    }

    /**
     * Set the promotion code.
     *
     * @param promotionCode the promotionCode value to set
     * @return the Plan object itself.
     */
    public Plan withPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }

}
