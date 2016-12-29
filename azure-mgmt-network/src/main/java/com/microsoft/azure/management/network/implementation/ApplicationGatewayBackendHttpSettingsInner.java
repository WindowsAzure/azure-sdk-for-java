/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import com.microsoft.azure.management.network.ApplicationGatewayProtocol;
import com.microsoft.azure.management.network.ApplicationGatewayCookieBasedAffinity;
import com.microsoft.azure.SubResource;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Backend address pool settings of an application gateway.
 */
@JsonFlatten
public class ApplicationGatewayBackendHttpSettingsInner extends SubResource {
    /**
     * Port.
     */
    @JsonProperty(value = "properties.port")
    private Integer port;

    /**
     * Protocol. Possible values are: 'Http' and 'Https'. Possible values
     * include: 'Http', 'Https'.
     */
    @JsonProperty(value = "properties.protocol")
    private ApplicationGatewayProtocol protocol;

    /**
     * Cookie based affinity. Possible values are: 'Enabled' and 'Disabled'.
     * Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.cookieBasedAffinity")
    private ApplicationGatewayCookieBasedAffinity cookieBasedAffinity;

    /**
     * Request timeout in seconds. Application Gateway will fail the request if
     * response is not received within RequestTimeout. Acceptable values are
     * from 1 second to 86400 seconds.
     */
    @JsonProperty(value = "properties.requestTimeout")
    private Integer requestTimeout;

    /**
     * Probe resource of an application gateway.
     */
    @JsonProperty(value = "properties.probe")
    private SubResource probe;

    /**
     * Array of references to application gateway authentication certificates.
     */
    @JsonProperty(value = "properties.authenticationCertificates")
    private List<SubResource> authenticationCertificates;

    /**
     * Provisioning state of the backend http settings resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Name of the resource that is unique within a resource group. This name
     * can be used to access the resource.
     */
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Get the port value.
     *
     * @return the port value
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port value.
     *
     * @param port the port value to set
     * @return the ApplicationGatewayBackendHttpSettingsInner object itself.
     */
    public ApplicationGatewayBackendHttpSettingsInner withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the protocol value.
     *
     * @return the protocol value
     */
    public ApplicationGatewayProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol value.
     *
     * @param protocol the protocol value to set
     * @return the ApplicationGatewayBackendHttpSettingsInner object itself.
     */
    public ApplicationGatewayBackendHttpSettingsInner withProtocol(ApplicationGatewayProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the cookieBasedAffinity value.
     *
     * @return the cookieBasedAffinity value
     */
    public ApplicationGatewayCookieBasedAffinity cookieBasedAffinity() {
        return this.cookieBasedAffinity;
    }

    /**
     * Set the cookieBasedAffinity value.
     *
     * @param cookieBasedAffinity the cookieBasedAffinity value to set
     * @return the ApplicationGatewayBackendHttpSettingsInner object itself.
     */
    public ApplicationGatewayBackendHttpSettingsInner withCookieBasedAffinity(ApplicationGatewayCookieBasedAffinity cookieBasedAffinity) {
        this.cookieBasedAffinity = cookieBasedAffinity;
        return this;
    }

    /**
     * Get the requestTimeout value.
     *
     * @return the requestTimeout value
     */
    public Integer requestTimeout() {
        return this.requestTimeout;
    }

    /**
     * Set the requestTimeout value.
     *
     * @param requestTimeout the requestTimeout value to set
     * @return the ApplicationGatewayBackendHttpSettingsInner object itself.
     */
    public ApplicationGatewayBackendHttpSettingsInner withRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }

    /**
     * Get the probe value.
     *
     * @return the probe value
     */
    public SubResource probe() {
        return this.probe;
    }

    /**
     * Set the probe value.
     *
     * @param probe the probe value to set
     * @return the ApplicationGatewayBackendHttpSettingsInner object itself.
     */
    public ApplicationGatewayBackendHttpSettingsInner withProbe(SubResource probe) {
        this.probe = probe;
        return this;
    }

    /**
     * Get the authenticationCertificates value.
     *
     * @return the authenticationCertificates value
     */
    public List<SubResource> authenticationCertificates() {
        return this.authenticationCertificates;
    }

    /**
     * Set the authenticationCertificates value.
     *
     * @param authenticationCertificates the authenticationCertificates value to set
     * @return the ApplicationGatewayBackendHttpSettingsInner object itself.
     */
    public ApplicationGatewayBackendHttpSettingsInner withAuthenticationCertificates(List<SubResource> authenticationCertificates) {
        this.authenticationCertificates = authenticationCertificates;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ApplicationGatewayBackendHttpSettingsInner object itself.
     */
    public ApplicationGatewayBackendHttpSettingsInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ApplicationGatewayBackendHttpSettingsInner object itself.
     */
    public ApplicationGatewayBackendHttpSettingsInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     * @return the ApplicationGatewayBackendHttpSettingsInner object itself.
     */
    public ApplicationGatewayBackendHttpSettingsInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
