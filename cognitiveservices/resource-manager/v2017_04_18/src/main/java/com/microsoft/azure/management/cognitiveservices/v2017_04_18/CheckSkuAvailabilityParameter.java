/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Check SKU availability parameter.
 */
public class CheckSkuAvailabilityParameter {
    /**
     * The SKU of the resource.
     */
    @JsonProperty(value = "skus", required = true)
    private List<String> skus;

    /**
     * The Kind of the resource.
     */
    @JsonProperty(value = "kind", required = true)
    private String kind;

    /**
     * The Type of the resource.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Get the SKU of the resource.
     *
     * @return the skus value
     */
    public List<String> skus() {
        return this.skus;
    }

    /**
     * Set the SKU of the resource.
     *
     * @param skus the skus value to set
     * @return the CheckSkuAvailabilityParameter object itself.
     */
    public CheckSkuAvailabilityParameter withSkus(List<String> skus) {
        this.skus = skus;
        return this;
    }

    /**
     * Get the Kind of the resource.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the Kind of the resource.
     *
     * @param kind the kind value to set
     * @return the CheckSkuAvailabilityParameter object itself.
     */
    public CheckSkuAvailabilityParameter withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the Type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the Type of the resource.
     *
     * @param type the type value to set
     * @return the CheckSkuAvailabilityParameter object itself.
     */
    public CheckSkuAvailabilityParameter withType(String type) {
        this.type = type;
        return this;
    }

}
