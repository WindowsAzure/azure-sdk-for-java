/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01.implementation;

import java.util.List;
import com.microsoft.azure.management.frontdoor.v2020_05_01.RulesEngineRule;
import com.microsoft.azure.management.frontdoor.v2020_05_01.FrontDoorResourceState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A rules engine configuration containing a list of rules that will run to
 * modify the runtime behavior of the request and response.
 */
@JsonFlatten
public class RulesEngineInner extends ProxyResource {
    /**
     * A list of rules that define a particular Rules Engine Configuration.
     */
    @JsonProperty(value = "properties.rules")
    private List<RulesEngineRule> rules;

    /**
     * Resource status. Possible values include: 'Creating', 'Enabling',
     * 'Enabled', 'Disabling', 'Disabled', 'Deleting'.
     */
    @JsonProperty(value = "properties.resourceState")
    private FrontDoorResourceState resourceState;

    /**
     * Get a list of rules that define a particular Rules Engine Configuration.
     *
     * @return the rules value
     */
    public List<RulesEngineRule> rules() {
        return this.rules;
    }

    /**
     * Set a list of rules that define a particular Rules Engine Configuration.
     *
     * @param rules the rules value to set
     * @return the RulesEngineInner object itself.
     */
    public RulesEngineInner withRules(List<RulesEngineRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get resource status. Possible values include: 'Creating', 'Enabling', 'Enabled', 'Disabling', 'Disabled', 'Deleting'.
     *
     * @return the resourceState value
     */
    public FrontDoorResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Set resource status. Possible values include: 'Creating', 'Enabling', 'Enabled', 'Disabling', 'Disabled', 'Deleting'.
     *
     * @param resourceState the resourceState value to set
     * @return the RulesEngineInner object itself.
     */
    public RulesEngineInner withResourceState(FrontDoorResourceState resourceState) {
        this.resourceState = resourceState;
        return this;
    }

}
