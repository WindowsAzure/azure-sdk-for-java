/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The B2B partner content.
 */
public class B2BPartnerContent {
    /**
     * The list of partner business identities.
     */
    @JsonProperty(value = "businessIdentities")
    private List<BusinessIdentity> businessIdentities;

    /**
     * Get the list of partner business identities.
     *
     * @return the businessIdentities value
     */
    public List<BusinessIdentity> businessIdentities() {
        return this.businessIdentities;
    }

    /**
     * Set the list of partner business identities.
     *
     * @param businessIdentities the businessIdentities value to set
     * @return the B2BPartnerContent object itself.
     */
    public B2BPartnerContent withBusinessIdentities(List<BusinessIdentity> businessIdentities) {
        this.businessIdentities = businessIdentities;
        return this;
    }

}
