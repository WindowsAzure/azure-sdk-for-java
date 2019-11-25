/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.management.automation.v2015_10_31.AgentRegistrationKeys;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition of the agent registration infomration type.
 */
public class AgentRegistrationInner {
    /**
     * Gets or sets the dsc meta configuration.
     */
    @JsonProperty(value = "dscMetaConfiguration")
    private String dscMetaConfiguration;

    /**
     * Gets or sets the dsc server endpoint.
     */
    @JsonProperty(value = "endpoint")
    private String endpoint;

    /**
     * Gets or sets the agent registration keys.
     */
    @JsonProperty(value = "keys")
    private AgentRegistrationKeys keys;

    /**
     * Gets or sets the id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get gets or sets the dsc meta configuration.
     *
     * @return the dscMetaConfiguration value
     */
    public String dscMetaConfiguration() {
        return this.dscMetaConfiguration;
    }

    /**
     * Set gets or sets the dsc meta configuration.
     *
     * @param dscMetaConfiguration the dscMetaConfiguration value to set
     * @return the AgentRegistrationInner object itself.
     */
    public AgentRegistrationInner withDscMetaConfiguration(String dscMetaConfiguration) {
        this.dscMetaConfiguration = dscMetaConfiguration;
        return this;
    }

    /**
     * Get gets or sets the dsc server endpoint.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set gets or sets the dsc server endpoint.
     *
     * @param endpoint the endpoint value to set
     * @return the AgentRegistrationInner object itself.
     */
    public AgentRegistrationInner withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get gets or sets the agent registration keys.
     *
     * @return the keys value
     */
    public AgentRegistrationKeys keys() {
        return this.keys;
    }

    /**
     * Set gets or sets the agent registration keys.
     *
     * @param keys the keys value to set
     * @return the AgentRegistrationInner object itself.
     */
    public AgentRegistrationInner withKeys(AgentRegistrationKeys keys) {
        this.keys = keys;
        return this;
    }

    /**
     * Get gets or sets the id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set gets or sets the id.
     *
     * @param id the id value to set
     * @return the AgentRegistrationInner object itself.
     */
    public AgentRegistrationInner withId(String id) {
        this.id = id;
        return this;
    }

}
