/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_06_01.implementation;

import java.util.List;
import com.microsoft.azure.management.containerservice.v2020_06_01.OrchestratorVersionProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The list of versions for supported orchestrators.
 */
@JsonFlatten
public class OrchestratorVersionProfileListResultInner {
    /**
     * Id of the orchestrator version profile list result.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Name of the orchestrator version profile list result.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Type of the orchestrator version profile list result.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * List of orchestrator version profiles.
     */
    @JsonProperty(value = "properties.orchestrators", required = true)
    private List<OrchestratorVersionProfile> orchestrators;

    /**
     * Get id of the orchestrator version profile list result.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get name of the orchestrator version profile list result.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get type of the orchestrator version profile list result.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get list of orchestrator version profiles.
     *
     * @return the orchestrators value
     */
    public List<OrchestratorVersionProfile> orchestrators() {
        return this.orchestrators;
    }

    /**
     * Set list of orchestrator version profiles.
     *
     * @param orchestrators the orchestrators value to set
     * @return the OrchestratorVersionProfileListResultInner object itself.
     */
    public OrchestratorVersionProfileListResultInner withOrchestrators(List<OrchestratorVersionProfile> orchestrators) {
        this.orchestrators = orchestrators;
        return this;
    }

}
