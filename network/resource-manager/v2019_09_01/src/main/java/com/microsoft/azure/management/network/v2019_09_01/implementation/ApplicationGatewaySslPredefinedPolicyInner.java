/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2019_09_01.ApplicationGatewaySslCipherSuite;
import com.microsoft.azure.management.network.v2019_09_01.ApplicationGatewaySslProtocol;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * An Ssl predefined policy.
 */
@JsonFlatten
public class ApplicationGatewaySslPredefinedPolicyInner extends SubResource {
    /**
     * Name of the Ssl predefined policy.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Ssl cipher suites to be enabled in the specified order for application
     * gateway.
     */
    @JsonProperty(value = "properties.cipherSuites")
    private List<ApplicationGatewaySslCipherSuite> cipherSuites;

    /**
     * Minimum version of Ssl protocol to be supported on application gateway.
     * Possible values include: 'TLSv1_0', 'TLSv1_1', 'TLSv1_2'.
     */
    @JsonProperty(value = "properties.minProtocolVersion")
    private ApplicationGatewaySslProtocol minProtocolVersion;

    /**
     * Get name of the Ssl predefined policy.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the Ssl predefined policy.
     *
     * @param name the name value to set
     * @return the ApplicationGatewaySslPredefinedPolicyInner object itself.
     */
    public ApplicationGatewaySslPredefinedPolicyInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get ssl cipher suites to be enabled in the specified order for application gateway.
     *
     * @return the cipherSuites value
     */
    public List<ApplicationGatewaySslCipherSuite> cipherSuites() {
        return this.cipherSuites;
    }

    /**
     * Set ssl cipher suites to be enabled in the specified order for application gateway.
     *
     * @param cipherSuites the cipherSuites value to set
     * @return the ApplicationGatewaySslPredefinedPolicyInner object itself.
     */
    public ApplicationGatewaySslPredefinedPolicyInner withCipherSuites(List<ApplicationGatewaySslCipherSuite> cipherSuites) {
        this.cipherSuites = cipherSuites;
        return this;
    }

    /**
     * Get minimum version of Ssl protocol to be supported on application gateway. Possible values include: 'TLSv1_0', 'TLSv1_1', 'TLSv1_2'.
     *
     * @return the minProtocolVersion value
     */
    public ApplicationGatewaySslProtocol minProtocolVersion() {
        return this.minProtocolVersion;
    }

    /**
     * Set minimum version of Ssl protocol to be supported on application gateway. Possible values include: 'TLSv1_0', 'TLSv1_1', 'TLSv1_2'.
     *
     * @param minProtocolVersion the minProtocolVersion value to set
     * @return the ApplicationGatewaySslPredefinedPolicyInner object itself.
     */
    public ApplicationGatewaySslPredefinedPolicyInner withMinProtocolVersion(ApplicationGatewaySslProtocol minProtocolVersion) {
        this.minProtocolVersion = minProtocolVersion;
        return this;
    }

}
