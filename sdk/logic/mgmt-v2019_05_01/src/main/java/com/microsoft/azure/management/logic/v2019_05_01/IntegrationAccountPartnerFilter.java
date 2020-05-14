/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The integration account partner filter for odata query.
 */
public class IntegrationAccountPartnerFilter {
    /**
     * The partner type of integration account partner. Possible values
     * include: 'NotSpecified', 'B2B'.
     */
    @JsonProperty(value = "partnerType", required = true)
    private PartnerType partnerType;

    /**
     * Get the partner type of integration account partner. Possible values include: 'NotSpecified', 'B2B'.
     *
     * @return the partnerType value
     */
    public PartnerType partnerType() {
        return this.partnerType;
    }

    /**
     * Set the partner type of integration account partner. Possible values include: 'NotSpecified', 'B2B'.
     *
     * @param partnerType the partnerType value to set
     * @return the IntegrationAccountPartnerFilter object itself.
     */
    public IntegrationAccountPartnerFilter withPartnerType(PartnerType partnerType) {
        this.partnerType = partnerType;
        return this;
    }

}
