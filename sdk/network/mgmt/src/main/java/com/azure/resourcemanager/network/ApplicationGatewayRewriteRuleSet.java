// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ApplicationGatewayRewriteRuleSet model. */
@JsonFlatten
@Fluent
public class ApplicationGatewayRewriteRuleSet extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayRewriteRuleSet.class);

    /*
     * Name of the rewrite rule set that is unique within an Application
     * Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Rewrite rules in the rewrite rule set.
     */
    @JsonProperty(value = "properties.rewriteRules")
    private List<ApplicationGatewayRewriteRule> rewriteRules;

    /*
     * Provisioning state of the rewrite rule set resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the name property: Name of the rewrite rule set that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the rewrite rule set that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayRewriteRuleSet object itself.
     */
    public ApplicationGatewayRewriteRuleSet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the rewriteRules property: Rewrite rules in the rewrite rule set.
     *
     * @return the rewriteRules value.
     */
    public List<ApplicationGatewayRewriteRule> rewriteRules() {
        return this.rewriteRules;
    }

    /**
     * Set the rewriteRules property: Rewrite rules in the rewrite rule set.
     *
     * @param rewriteRules the rewriteRules value to set.
     * @return the ApplicationGatewayRewriteRuleSet object itself.
     */
    public ApplicationGatewayRewriteRuleSet withRewriteRules(List<ApplicationGatewayRewriteRule> rewriteRules) {
        this.rewriteRules = rewriteRules;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the rewrite rule set resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rewriteRules() != null) {
            rewriteRules().forEach(e -> e.validate());
        }
    }
}
