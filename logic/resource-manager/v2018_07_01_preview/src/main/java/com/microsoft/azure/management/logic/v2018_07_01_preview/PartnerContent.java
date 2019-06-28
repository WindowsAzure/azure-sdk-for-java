/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The integration account partner content.
 */
public class PartnerContent {
    /**
     * The B2B partner content.
     */
    @JsonProperty(value = "b2b")
    private B2BPartnerContent b2b;

    /**
     * Get the B2B partner content.
     *
     * @return the b2b value
     */
    public B2BPartnerContent b2b() {
        return this.b2b;
    }

    /**
     * Set the B2B partner content.
     *
     * @param b2b the b2b value to set
     * @return the PartnerContent object itself.
     */
    public PartnerContent withB2b(B2BPartnerContent b2b) {
        this.b2b = b2b;
        return this;
    }

}
