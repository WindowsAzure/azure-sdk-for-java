/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The serviceName of an AvailableDelegation indicates a possible delegation
 * for a subnet.
 */
public class AvailableDelegationInner {
    /**
     * The name of the AvailableDelegation resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique identifier of the AvailableDelegation resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Resource type.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The name of the service and resource.
     */
    @JsonProperty(value = "serviceName")
    private String serviceName;

    /**
     * Describes the actions permitted to the service upon delegation.
     */
    @JsonProperty(value = "actions")
    private List<String> actions;

    /**
     * Get the name of the AvailableDelegation resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the AvailableDelegation resource.
     *
     * @param name the name value to set
     * @return the AvailableDelegationInner object itself.
     */
    public AvailableDelegationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique identifier of the AvailableDelegation resource.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set a unique identifier of the AvailableDelegation resource.
     *
     * @param id the id value to set
     * @return the AvailableDelegationInner object itself.
     */
    public AvailableDelegationInner withId(String id) {
        this.id = id;
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
     * Set resource type.
     *
     * @param type the type value to set
     * @return the AvailableDelegationInner object itself.
     */
    public AvailableDelegationInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name of the service and resource.
     *
     * @return the serviceName value
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the name of the service and resource.
     *
     * @param serviceName the serviceName value to set
     * @return the AvailableDelegationInner object itself.
     */
    public AvailableDelegationInner withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get describes the actions permitted to the service upon delegation.
     *
     * @return the actions value
     */
    public List<String> actions() {
        return this.actions;
    }

    /**
     * Set describes the actions permitted to the service upon delegation.
     *
     * @param actions the actions value to set
     * @return the AvailableDelegationInner object itself.
     */
    public AvailableDelegationInner withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

}
