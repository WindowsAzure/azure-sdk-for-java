/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2016_03_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters supplied to the Check Name Availability for Namespace and
 * NotificationHubs.
 */
public class CheckAvailabilityParameters {
    /**
     * Resource Id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Resource name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Resource location.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The sku of the created namespace.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * True if the name is available and can be used to create new
     * Namespace/NotificationHub. Otherwise false.
     */
    @JsonProperty(value = "isAvailiable")
    private Boolean isAvailiable;

    /**
     * Get resource Id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get resource name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set resource name.
     *
     * @param name the name value to set
     * @return the CheckAvailabilityParameters object itself.
     */
    public CheckAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set resource location.
     *
     * @param location the location value to set
     * @return the CheckAvailabilityParameters object itself.
     */
    public CheckAvailabilityParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the CheckAvailabilityParameters object itself.
     */
    public CheckAvailabilityParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku of the created namespace.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku of the created namespace.
     *
     * @param sku the sku value to set
     * @return the CheckAvailabilityParameters object itself.
     */
    public CheckAvailabilityParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get true if the name is available and can be used to create new Namespace/NotificationHub. Otherwise false.
     *
     * @return the isAvailiable value
     */
    public Boolean isAvailiable() {
        return this.isAvailiable;
    }

    /**
     * Set true if the name is available and can be used to create new Namespace/NotificationHub. Otherwise false.
     *
     * @param isAvailiable the isAvailiable value to set
     * @return the CheckAvailabilityParameters object itself.
     */
    public CheckAvailabilityParameters withIsAvailiable(Boolean isAvailiable) {
        this.isAvailiable = isAvailiable;
        return this;
    }

}
