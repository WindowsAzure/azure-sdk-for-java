/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import java.util.List;
import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * SSL profile of an application gateway.
 */
@JsonFlatten
public class ApplicationGatewaySslProfile extends SubResource {
    /**
     * Array of references to application gateway trusted client certificates.
     */
    @JsonProperty(value = "properties.trustedClientCertificates")
    private List<SubResource> trustedClientCertificates;

    /**
     * SSL policy of the application gateway resource.
     */
    @JsonProperty(value = "properties.sslPolicy")
    private ApplicationGatewaySslPolicy sslPolicy;

    /**
     * Client authentication configuration of the application gateway resource.
     */
    @JsonProperty(value = "properties.clientAuthConfiguration")
    private ApplicationGatewayClientAuthConfiguration clientAuthConfiguration;

    /**
     * The provisioning state of the HTTP listener resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Name of the SSL profile that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get array of references to application gateway trusted client certificates.
     *
     * @return the trustedClientCertificates value
     */
    public List<SubResource> trustedClientCertificates() {
        return this.trustedClientCertificates;
    }

    /**
     * Set array of references to application gateway trusted client certificates.
     *
     * @param trustedClientCertificates the trustedClientCertificates value to set
     * @return the ApplicationGatewaySslProfile object itself.
     */
    public ApplicationGatewaySslProfile withTrustedClientCertificates(List<SubResource> trustedClientCertificates) {
        this.trustedClientCertificates = trustedClientCertificates;
        return this;
    }

    /**
     * Get sSL policy of the application gateway resource.
     *
     * @return the sslPolicy value
     */
    public ApplicationGatewaySslPolicy sslPolicy() {
        return this.sslPolicy;
    }

    /**
     * Set sSL policy of the application gateway resource.
     *
     * @param sslPolicy the sslPolicy value to set
     * @return the ApplicationGatewaySslProfile object itself.
     */
    public ApplicationGatewaySslProfile withSslPolicy(ApplicationGatewaySslPolicy sslPolicy) {
        this.sslPolicy = sslPolicy;
        return this;
    }

    /**
     * Get client authentication configuration of the application gateway resource.
     *
     * @return the clientAuthConfiguration value
     */
    public ApplicationGatewayClientAuthConfiguration clientAuthConfiguration() {
        return this.clientAuthConfiguration;
    }

    /**
     * Set client authentication configuration of the application gateway resource.
     *
     * @param clientAuthConfiguration the clientAuthConfiguration value to set
     * @return the ApplicationGatewaySslProfile object itself.
     */
    public ApplicationGatewaySslProfile withClientAuthConfiguration(ApplicationGatewayClientAuthConfiguration clientAuthConfiguration) {
        this.clientAuthConfiguration = clientAuthConfiguration;
        return this;
    }

    /**
     * Get the provisioning state of the HTTP listener resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get name of the SSL profile that is unique within an Application Gateway.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the SSL profile that is unique within an Application Gateway.
     *
     * @param name the name value to set
     * @return the ApplicationGatewaySslProfile object itself.
     */
    public ApplicationGatewaySslProfile withName(String name) {
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
     * Get type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
