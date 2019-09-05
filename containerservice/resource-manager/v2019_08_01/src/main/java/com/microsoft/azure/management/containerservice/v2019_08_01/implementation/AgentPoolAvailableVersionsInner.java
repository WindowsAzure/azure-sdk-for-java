/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_08_01.implementation;

import java.util.List;
import com.microsoft.azure.management.containerservice.v2019_08_01.AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The list of available versions for an agent pool.
 */
@JsonFlatten
public class AgentPoolAvailableVersionsInner {
    /**
     * Id of the agent pool available versions.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Name of the agent pool available versions.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Type of the agent pool  available versions.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * List of versions available for agent pool.
     */
    @JsonProperty(value = "properties.agentPoolVersions")
    private List<AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem> agentPoolVersions;

    /**
     * Get id of the agent pool available versions.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get name of the agent pool available versions.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get type of the agent pool  available versions.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get list of versions available for agent pool.
     *
     * @return the agentPoolVersions value
     */
    public List<AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem> agentPoolVersions() {
        return this.agentPoolVersions;
    }

    /**
     * Set list of versions available for agent pool.
     *
     * @param agentPoolVersions the agentPoolVersions value to set
     * @return the AgentPoolAvailableVersionsInner object itself.
     */
    public AgentPoolAvailableVersionsInner withAgentPoolVersions(List<AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem> agentPoolVersions) {
        this.agentPoolVersions = agentPoolVersions;
        return this;
    }

}
