/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2016_06_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Location information.
 */
public class LocationInner {
    /**
     * The fully qualified ID of the location. For example,
     * /subscriptions/00000000-0000-0000-0000-000000000000/locations/westus.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The subscription ID.
     */
    @JsonProperty(value = "subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /**
     * The location name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The display name of the location.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * The latitude of the location.
     */
    @JsonProperty(value = "latitude", access = JsonProperty.Access.WRITE_ONLY)
    private String latitude;

    /**
     * The longitude of the location.
     */
    @JsonProperty(value = "longitude", access = JsonProperty.Access.WRITE_ONLY)
    private String longitude;

    /**
     * Get the fully qualified ID of the location. For example, /subscriptions/00000000-0000-0000-0000-000000000000/locations/westus.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the subscription ID.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the location name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the display name of the location.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the latitude of the location.
     *
     * @return the latitude value
     */
    public String latitude() {
        return this.latitude;
    }

    /**
     * Get the longitude of the location.
     *
     * @return the longitude value
     */
    public String longitude() {
        return this.longitude;
    }

}
