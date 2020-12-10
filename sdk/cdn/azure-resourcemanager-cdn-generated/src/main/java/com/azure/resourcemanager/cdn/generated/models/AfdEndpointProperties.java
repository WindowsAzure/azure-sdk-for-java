// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JSON object that contains the properties required to create an endpoint. */
@Immutable
public final class AfdEndpointProperties extends AfdEndpointPropertiesUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AfdEndpointProperties.class);

    /*
     * The host name of the endpoint structured as {endpointName}.{DNSZone},
     * e.g. contoso.azureedge.net
     */
    @JsonProperty(value = "hostName", access = JsonProperty.Access.WRITE_ONLY)
    private String hostname;

    /*
     * Provisioning status
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private AfdProvisioningState provisioningState;

    /*
     * The deploymentStatus property.
     */
    @JsonProperty(value = "deploymentStatus", access = JsonProperty.Access.WRITE_ONLY)
    private DeploymentStatus deploymentStatus;

    /**
     * Get the hostname property: The host name of the endpoint structured as {endpointName}.{DNSZone}, e.g.
     * contoso.azureedge.net.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Get the provisioningState property: Provisioning status.
     *
     * @return the provisioningState value.
     */
    public AfdProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     *
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.deploymentStatus;
    }

    /** {@inheritDoc} */
    @Override
    public AfdEndpointProperties withOriginResponseTimeoutSeconds(Integer originResponseTimeoutSeconds) {
        super.withOriginResponseTimeoutSeconds(originResponseTimeoutSeconds);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AfdEndpointProperties withEnabledState(EnabledState enabledState) {
        super.withEnabledState(enabledState);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
