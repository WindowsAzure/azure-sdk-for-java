/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2020_07_01.InboundSecurityRules;
import com.microsoft.azure.management.network.v2020_07_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * NVA Inbound Security Rule resource.
 */
@JsonFlatten
public class InboundSecurityRuleInner extends SubResource {
    /**
     * List of allowed rules.
     */
    @JsonProperty(value = "properties.rules")
    private List<InboundSecurityRules> rules;

    /**
     * The provisioning state of the resource. Possible values include:
     * 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Name of security rule collection.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * NVA inbound security rule type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get list of allowed rules.
     *
     * @return the rules value
     */
    public List<InboundSecurityRules> rules() {
        return this.rules;
    }

    /**
     * Set list of allowed rules.
     *
     * @param rules the rules value to set
     * @return the InboundSecurityRuleInner object itself.
     */
    public InboundSecurityRuleInner withRules(List<InboundSecurityRules> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get the provisioning state of the resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get name of security rule collection.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of security rule collection.
     *
     * @param name the name value to set
     * @return the InboundSecurityRuleInner object itself.
     */
    public InboundSecurityRuleInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get nVA inbound security rule type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
