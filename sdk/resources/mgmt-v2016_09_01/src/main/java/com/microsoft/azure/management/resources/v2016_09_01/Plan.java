/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2016_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Plan for the resource.
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
     * The offer ID.
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
     * Get the offer ID.
     *
     * @return the product value
     */
    public String product() {
        return this.product;
    }

    /**
     * Set the offer ID.
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
