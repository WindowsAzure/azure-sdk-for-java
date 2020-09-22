// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.models.CustomDomainResourceState;
import com.azure.resourcemanager.cdn.models.CustomHttpsProvisioningState;
import com.azure.resourcemanager.cdn.models.CustomHttpsProvisioningSubstate;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CustomDomain model. */
@JsonFlatten
@Fluent
public class CustomDomainInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomDomainInner.class);

    /*
     * The host name of the custom domain. Must be a domain name.
     */
    @JsonProperty(value = "properties.hostName")
    private String hostname;

    /*
     * Resource status of the custom domain.
     */
    @JsonProperty(value = "properties.resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private CustomDomainResourceState resourceState;

    /*
     * Provisioning status of Custom Https of the custom domain.
     */
    @JsonProperty(value = "properties.customHttpsProvisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private CustomHttpsProvisioningState customHttpsProvisioningState;

    /*
     * Provisioning substate shows the progress of custom HTTPS
     * enabling/disabling process step by step.
     */
    @JsonProperty(value = "properties.customHttpsProvisioningSubstate", access = JsonProperty.Access.WRITE_ONLY)
    private CustomHttpsProvisioningSubstate customHttpsProvisioningSubstate;

    /*
     * Special validation or data may be required when delivering CDN to some
     * regions due to local compliance reasons. E.g. ICP license number of a
     * custom domain is required to deliver content in China.
     */
    @JsonProperty(value = "properties.validationData")
    private String validationData;

    /*
     * Provisioning status of the custom domain.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the hostname property: The host name of the custom domain. Must be a domain name.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The host name of the custom domain. Must be a domain name.
     *
     * @param hostname the hostname value to set.
     * @return the CustomDomainInner object itself.
     */
    public CustomDomainInner withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the resourceState property: Resource status of the custom domain.
     *
     * @return the resourceState value.
     */
    public CustomDomainResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the customHttpsProvisioningState property: Provisioning status of Custom Https of the custom domain.
     *
     * @return the customHttpsProvisioningState value.
     */
    public CustomHttpsProvisioningState customHttpsProvisioningState() {
        return this.customHttpsProvisioningState;
    }

    /**
     * Get the customHttpsProvisioningSubstate property: Provisioning substate shows the progress of custom HTTPS
     * enabling/disabling process step by step.
     *
     * @return the customHttpsProvisioningSubstate value.
     */
    public CustomHttpsProvisioningSubstate customHttpsProvisioningSubstate() {
        return this.customHttpsProvisioningSubstate;
    }

    /**
     * Get the validationData property: Special validation or data may be required when delivering CDN to some regions
     * due to local compliance reasons. E.g. ICP license number of a custom domain is required to deliver content in
     * China.
     *
     * @return the validationData value.
     */
    public String validationData() {
        return this.validationData;
    }

    /**
     * Set the validationData property: Special validation or data may be required when delivering CDN to some regions
     * due to local compliance reasons. E.g. ICP license number of a custom domain is required to deliver content in
     * China.
     *
     * @param validationData the validationData value to set.
     * @return the CustomDomainInner object itself.
     */
    public CustomDomainInner withValidationData(String validationData) {
        this.validationData = validationData;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning status of the custom domain.
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
    }
}
