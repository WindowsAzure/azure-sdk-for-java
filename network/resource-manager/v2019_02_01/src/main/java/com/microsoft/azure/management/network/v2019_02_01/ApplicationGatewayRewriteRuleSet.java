/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Rewrite rule set of an application gateway.
 */
@JsonFlatten
public class ApplicationGatewayRewriteRuleSet extends SubResource {
    /**
     * Rewrite rules in the rewrite rule set.
     */
    @JsonProperty(value = "properties.rewriteRules")
    private List<ApplicationGatewayRewriteRule> rewriteRules;

    /**
     * Provisioning state of the rewrite rule set resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Name of the rewrite rule set that is unique within an Application
     * Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get rewrite rules in the rewrite rule set.
     *
     * @return the rewriteRules value
     */
    public List<ApplicationGatewayRewriteRule> rewriteRules() {
        return this.rewriteRules;
    }

    /**
     * Set rewrite rules in the rewrite rule set.
     *
     * @param rewriteRules the rewriteRules value to set
     * @return the ApplicationGatewayRewriteRuleSet object itself.
     */
    public ApplicationGatewayRewriteRuleSet withRewriteRules(List<ApplicationGatewayRewriteRule> rewriteRules) {
        this.rewriteRules = rewriteRules;
        return this;
    }

    /**
     * Get provisioning state of the rewrite rule set resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get name of the rewrite rule set that is unique within an Application Gateway.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the rewrite rule set that is unique within an Application Gateway.
     *
     * @param name the name value to set
     * @return the ApplicationGatewayRewriteRuleSet object itself.
     */
    public ApplicationGatewayRewriteRuleSet withName(String name) {
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

}
