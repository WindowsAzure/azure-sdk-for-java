/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2019_08_01.ProxyOnlyResource;

/**
 * Geographical region.
 */
@JsonFlatten
public class GeoRegionInner extends ProxyOnlyResource {
    /**
     * Region description.
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Display name for region.
     */
    @JsonProperty(value = "properties.displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * Display name for region.
     */
    @JsonProperty(value = "properties.orgDomain", access = JsonProperty.Access.WRITE_ONLY)
    private String orgDomain;

    /**
     * Get region description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Get display name for region.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get display name for region.
     *
     * @return the orgDomain value
     */
    public String orgDomain() {
        return this.orgDomain;
    }

}
