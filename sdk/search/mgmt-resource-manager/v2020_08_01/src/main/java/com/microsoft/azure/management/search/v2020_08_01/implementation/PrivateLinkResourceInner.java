/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2020_08_01.implementation;

import com.microsoft.azure.management.search.v2020_08_01.PrivateLinkResourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * Describes a supported private link resource for the Azure Cognitive Search
 * service.
 */
public class PrivateLinkResourceInner extends ProxyResource {
    /**
     * Describes the properties of a supported private link resource for the
     * Azure Cognitive Search service.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateLinkResourceProperties properties;

    /**
     * Get describes the properties of a supported private link resource for the Azure Cognitive Search service.
     *
     * @return the properties value
     */
    public PrivateLinkResourceProperties properties() {
        return this.properties;
    }

}
