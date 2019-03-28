/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.v2016_06_01.implementation;

import com.microsoft.azure.management.recoveryservices.v2016_06_01.ResourceNameAvailabilityResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * Response for check name availability API. Resource provider will set
 * availability as true | false.
 */
public class ResourceNameAvailabilityResultResourceInner extends ProxyResource {
    /**
     * ResourceNameAvailabilityResultResource properties.
     */
    @JsonProperty(value = "properties")
    private ResourceNameAvailabilityResult properties;

    /**
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * Get resourceNameAvailabilityResultResource properties.
     *
     * @return the properties value
     */
    public ResourceNameAvailabilityResult properties() {
        return this.properties;
    }

    /**
     * Set resourceNameAvailabilityResultResource properties.
     *
     * @param properties the properties value to set
     * @return the ResourceNameAvailabilityResultResourceInner object itself.
     */
    public ResourceNameAvailabilityResultResourceInner withProperties(ResourceNameAvailabilityResult properties) {
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
     * @return the ResourceNameAvailabilityResultResourceInner object itself.
     */
    public ResourceNameAvailabilityResultResourceInner withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

}
