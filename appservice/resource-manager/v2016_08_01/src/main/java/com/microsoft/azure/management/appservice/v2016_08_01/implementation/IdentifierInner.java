/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2016_08_01.ProxyOnlyResource;

/**
 * A domain specific resource identifier.
 */
@JsonFlatten
public class IdentifierInner extends ProxyOnlyResource {
    /**
     * String representation of the identity.
     */
    @JsonProperty(value = "properties.id")
    private String identifierId;

    /**
     * Get string representation of the identity.
     *
     * @return the identifierId value
     */
    public String identifierId() {
        return this.identifierId;
    }

    /**
     * Set string representation of the identity.
     *
     * @param identifierId the identifierId value to set
     * @return the IdentifierInner object itself.
     */
    public IdentifierInner withIdentifierId(String identifierId) {
        this.identifierId = identifierId;
        return this;
    }

}
