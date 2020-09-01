/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybridcompute.v2020_08_02;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Managed Identity.
 */
public class Identity {
    /**
     * The identity type.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The identity's principal id.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /**
     * The identity's tenant id.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * Get the identity type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the identity type.
     *
     * @param type the type value to set
     * @return the Identity object itself.
     */
    public Identity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the identity's principal id.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the identity's tenant id.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

}
