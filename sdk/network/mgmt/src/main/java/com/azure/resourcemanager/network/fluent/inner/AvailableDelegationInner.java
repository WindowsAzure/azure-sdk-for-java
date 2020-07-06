// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AvailableDelegation model. */
@Fluent
public final class AvailableDelegationInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailableDelegationInner.class);

    /*
     * The name of the AvailableDelegation resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique identifier of the AvailableDelegation resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The name of the service and resource.
     */
    @JsonProperty(value = "serviceName")
    private String serviceName;

    /*
     * The actions permitted to the service upon delegation.
     */
    @JsonProperty(value = "actions")
    private List<String> actions;

    /**
     * Get the name property: The name of the AvailableDelegation resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the AvailableDelegation resource.
     *
     * @param name the name value to set.
     * @return the AvailableDelegationInner object itself.
     */
    public AvailableDelegationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: A unique identifier of the AvailableDelegation resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: A unique identifier of the AvailableDelegation resource.
     *
     * @param id the id value to set.
     * @return the AvailableDelegationInner object itself.
     */
    public AvailableDelegationInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Resource type.
     *
     * @param type the type value to set.
     * @return the AvailableDelegationInner object itself.
     */
    public AvailableDelegationInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the serviceName property: The name of the service and resource.
     *
     * @return the serviceName value.
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: The name of the service and resource.
     *
     * @param serviceName the serviceName value to set.
     * @return the AvailableDelegationInner object itself.
     */
    public AvailableDelegationInner withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the actions property: The actions permitted to the service upon delegation.
     *
     * @return the actions value.
     */
    public List<String> actions() {
        return this.actions;
    }

    /**
     * Set the actions property: The actions permitted to the service upon delegation.
     *
     * @param actions the actions value to set.
     * @return the AvailableDelegationInner object itself.
     */
    public AvailableDelegationInner withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
