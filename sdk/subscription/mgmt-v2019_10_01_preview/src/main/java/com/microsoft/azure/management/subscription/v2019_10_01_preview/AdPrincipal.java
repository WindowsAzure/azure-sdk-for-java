/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.subscription.v2019_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Active Directory Principal who’ll get owner access on the new subscription.
 */
public class AdPrincipal {
    /**
     * Object id of the Principal.
     */
    @JsonProperty(value = "objectId", required = true)
    private String objectId;

    /**
     * Get object id of the Principal.
     *
     * @return the objectId value
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set object id of the Principal.
     *
     * @param objectId the objectId value to set
     * @return the AdPrincipal object itself.
     */
    public AdPrincipal withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

}
