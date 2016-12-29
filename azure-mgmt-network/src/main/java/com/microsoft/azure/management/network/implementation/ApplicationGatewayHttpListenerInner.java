/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.ApplicationGatewayProtocol;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Http listener of an application gateway.
 */
@JsonFlatten
public class ApplicationGatewayHttpListenerInner extends SubResource {
    /**
     * Frontend IP configuration resource of an application gateway.
     */
    @JsonProperty(value = "properties.frontendIPConfiguration")
    private SubResource frontendIPConfiguration;

    /**
     * Frontend port resource of an application gateway.
     */
    @JsonProperty(value = "properties.frontendPort")
    private SubResource frontendPort;

    /**
     * Protocol. Possible values are: 'Http' and 'Https'. Possible values
     * include: 'Http', 'Https'.
     */
    @JsonProperty(value = "properties.protocol")
    private ApplicationGatewayProtocol protocol;

    /**
     * Host name of HTTP listener.
     */
    @JsonProperty(value = "properties.hostName")
    private String hostName;

    /**
     * SSL certificate resource of an application gateway.
     */
    @JsonProperty(value = "properties.sslCertificate")
    private SubResource sslCertificate;

    /**
     * Applicable only if protocol is https. Enables SNI for multi-hosting.
     */
    @JsonProperty(value = "properties.requireServerNameIndication")
    private Boolean requireServerNameIndication;

    /**
     * Provisioning state of the HTTP listener resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
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
     * Get the frontendIPConfiguration value.
     *
     * @return the frontendIPConfiguration value
     */
    public SubResource frontendIPConfiguration() {
        return this.frontendIPConfiguration;
    }

    /**
     * Set the frontendIPConfiguration value.
     *
     * @param frontendIPConfiguration the frontendIPConfiguration value to set
     * @return the ApplicationGatewayHttpListenerInner object itself.
     */
    public ApplicationGatewayHttpListenerInner withFrontendIPConfiguration(SubResource frontendIPConfiguration) {
        this.frontendIPConfiguration = frontendIPConfiguration;
        return this;
    }

    /**
     * Get the frontendPort value.
     *
     * @return the frontendPort value
     */
    public SubResource frontendPort() {
        return this.frontendPort;
    }

    /**
     * Set the frontendPort value.
     *
     * @param frontendPort the frontendPort value to set
     * @return the ApplicationGatewayHttpListenerInner object itself.
     */
    public ApplicationGatewayHttpListenerInner withFrontendPort(SubResource frontendPort) {
        this.frontendPort = frontendPort;
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
     * @return the ApplicationGatewayHttpListenerInner object itself.
     */
    public ApplicationGatewayHttpListenerInner withProtocol(ApplicationGatewayProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the hostName value.
     *
     * @return the hostName value
     */
    public String hostName() {
        return this.hostName;
    }

    /**
     * Set the hostName value.
     *
     * @param hostName the hostName value to set
     * @return the ApplicationGatewayHttpListenerInner object itself.
     */
    public ApplicationGatewayHttpListenerInner withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * Get the sslCertificate value.
     *
     * @return the sslCertificate value
     */
    public SubResource sslCertificate() {
        return this.sslCertificate;
    }

    /**
     * Set the sslCertificate value.
     *
     * @param sslCertificate the sslCertificate value to set
     * @return the ApplicationGatewayHttpListenerInner object itself.
     */
    public ApplicationGatewayHttpListenerInner withSslCertificate(SubResource sslCertificate) {
        this.sslCertificate = sslCertificate;
        return this;
    }

    /**
     * Get the requireServerNameIndication value.
     *
     * @return the requireServerNameIndication value
     */
    public Boolean requireServerNameIndication() {
        return this.requireServerNameIndication;
    }

    /**
     * Set the requireServerNameIndication value.
     *
     * @param requireServerNameIndication the requireServerNameIndication value to set
     * @return the ApplicationGatewayHttpListenerInner object itself.
     */
    public ApplicationGatewayHttpListenerInner withRequireServerNameIndication(Boolean requireServerNameIndication) {
        this.requireServerNameIndication = requireServerNameIndication;
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
     * @return the ApplicationGatewayHttpListenerInner object itself.
     */
    public ApplicationGatewayHttpListenerInner withProvisioningState(String provisioningState) {
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
     * @return the ApplicationGatewayHttpListenerInner object itself.
     */
    public ApplicationGatewayHttpListenerInner withName(String name) {
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
     * @return the ApplicationGatewayHttpListenerInner object itself.
     */
    public ApplicationGatewayHttpListenerInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
