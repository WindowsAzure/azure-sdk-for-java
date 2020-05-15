// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ApplicationGatewayUrlPathMap model. */
@JsonFlatten
@Fluent
public class ApplicationGatewayUrlPathMapInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayUrlPathMapInner.class);

    /*
     * Name of the URL path map that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Default backend address pool resource of URL path map.
     */
    @JsonProperty(value = "properties.defaultBackendAddressPool")
    private SubResource defaultBackendAddressPool;

    /*
     * Default backend http settings resource of URL path map.
     */
    @JsonProperty(value = "properties.defaultBackendHttpSettings")
    private SubResource defaultBackendHttpSettings;

    /*
     * Default Rewrite rule set resource of URL path map.
     */
    @JsonProperty(value = "properties.defaultRewriteRuleSet")
    private SubResource defaultRewriteRuleSet;

    /*
     * Default redirect configuration resource of URL path map.
     */
    @JsonProperty(value = "properties.defaultRedirectConfiguration")
    private SubResource defaultRedirectConfiguration;

    /*
     * Path rule of URL path map resource.
     */
    @JsonProperty(value = "properties.pathRules")
    private List<ApplicationGatewayPathRuleInner> pathRules;

    /*
     * Provisioning state of the backend http settings resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the name property: Name of the URL path map that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the URL path map that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayUrlPathMapInner object itself.
     */
    public ApplicationGatewayUrlPathMapInner withName(String name) {
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
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the ApplicationGatewayUrlPathMapInner object itself.
     */
    public ApplicationGatewayUrlPathMapInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the resource.
     *
     * @param type the type value to set.
     * @return the ApplicationGatewayUrlPathMapInner object itself.
     */
    public ApplicationGatewayUrlPathMapInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the defaultBackendAddressPool property: Default backend address pool resource of URL path map.
     *
     * @return the defaultBackendAddressPool value.
     */
    public SubResource defaultBackendAddressPool() {
        return this.defaultBackendAddressPool;
    }

    /**
     * Set the defaultBackendAddressPool property: Default backend address pool resource of URL path map.
     *
     * @param defaultBackendAddressPool the defaultBackendAddressPool value to set.
     * @return the ApplicationGatewayUrlPathMapInner object itself.
     */
    public ApplicationGatewayUrlPathMapInner withDefaultBackendAddressPool(SubResource defaultBackendAddressPool) {
        this.defaultBackendAddressPool = defaultBackendAddressPool;
        return this;
    }

    /**
     * Get the defaultBackendHttpSettings property: Default backend http settings resource of URL path map.
     *
     * @return the defaultBackendHttpSettings value.
     */
    public SubResource defaultBackendHttpSettings() {
        return this.defaultBackendHttpSettings;
    }

    /**
     * Set the defaultBackendHttpSettings property: Default backend http settings resource of URL path map.
     *
     * @param defaultBackendHttpSettings the defaultBackendHttpSettings value to set.
     * @return the ApplicationGatewayUrlPathMapInner object itself.
     */
    public ApplicationGatewayUrlPathMapInner withDefaultBackendHttpSettings(SubResource defaultBackendHttpSettings) {
        this.defaultBackendHttpSettings = defaultBackendHttpSettings;
        return this;
    }

    /**
     * Get the defaultRewriteRuleSet property: Default Rewrite rule set resource of URL path map.
     *
     * @return the defaultRewriteRuleSet value.
     */
    public SubResource defaultRewriteRuleSet() {
        return this.defaultRewriteRuleSet;
    }

    /**
     * Set the defaultRewriteRuleSet property: Default Rewrite rule set resource of URL path map.
     *
     * @param defaultRewriteRuleSet the defaultRewriteRuleSet value to set.
     * @return the ApplicationGatewayUrlPathMapInner object itself.
     */
    public ApplicationGatewayUrlPathMapInner withDefaultRewriteRuleSet(SubResource defaultRewriteRuleSet) {
        this.defaultRewriteRuleSet = defaultRewriteRuleSet;
        return this;
    }

    /**
     * Get the defaultRedirectConfiguration property: Default redirect configuration resource of URL path map.
     *
     * @return the defaultRedirectConfiguration value.
     */
    public SubResource defaultRedirectConfiguration() {
        return this.defaultRedirectConfiguration;
    }

    /**
     * Set the defaultRedirectConfiguration property: Default redirect configuration resource of URL path map.
     *
     * @param defaultRedirectConfiguration the defaultRedirectConfiguration value to set.
     * @return the ApplicationGatewayUrlPathMapInner object itself.
     */
    public ApplicationGatewayUrlPathMapInner withDefaultRedirectConfiguration(
        SubResource defaultRedirectConfiguration) {
        this.defaultRedirectConfiguration = defaultRedirectConfiguration;
        return this;
    }

    /**
     * Get the pathRules property: Path rule of URL path map resource.
     *
     * @return the pathRules value.
     */
    public List<ApplicationGatewayPathRuleInner> pathRules() {
        return this.pathRules;
    }

    /**
     * Set the pathRules property: Path rule of URL path map resource.
     *
     * @param pathRules the pathRules value to set.
     * @return the ApplicationGatewayUrlPathMapInner object itself.
     */
    public ApplicationGatewayUrlPathMapInner withPathRules(List<ApplicationGatewayPathRuleInner> pathRules) {
        this.pathRules = pathRules;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the backend http settings resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the backend http settings resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewayUrlPathMapInner object itself.
     */
    public ApplicationGatewayUrlPathMapInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pathRules() != null) {
            pathRules().forEach(e -> e.validate());
        }
    }
}
