/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Private Endpoint Connection Response Properties.
 */
@SkipParentValidation
public class PrivateEndpointConnectionResourceInner extends Resource {
    /**
     * PrivateEndpointConnectionResource properties.
     */
    @JsonProperty(value = "properties")
    private PrivateEndpointConnectionInner properties;

    /**
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * Get privateEndpointConnectionResource properties.
     *
     * @return the properties value
     */
    public PrivateEndpointConnectionInner properties() {
        return this.properties;
    }

    /**
     * Set privateEndpointConnectionResource properties.
     *
     * @param properties the properties value to set
     * @return the PrivateEndpointConnectionResourceInner object itself.
     */
    public PrivateEndpointConnectionResourceInner withProperties(PrivateEndpointConnectionInner properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get optional ETag.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set optional ETag.
     *
     * @param eTag the eTag value to set
     * @return the PrivateEndpointConnectionResourceInner object itself.
     */
    public PrivateEndpointConnectionResourceInner withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

}
