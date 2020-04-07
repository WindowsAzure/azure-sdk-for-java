/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_12_01.BackendProperties;
import com.microsoft.azure.management.apimanagement.v2019_12_01.BackendCredentialsContract;
import com.microsoft.azure.management.apimanagement.v2019_12_01.BackendProxyContract;
import com.microsoft.azure.management.apimanagement.v2019_12_01.BackendTlsProperties;
import com.microsoft.azure.management.apimanagement.v2019_12_01.BackendProtocol;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Backend details.
 */
@JsonFlatten
public class BackendContractInner extends ProxyResource {
    /**
     * Backend Title.
     */
    @JsonProperty(value = "properties.title")
    private String title;

    /**
     * Backend Description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Management Uri of the Resource in External System. This url can be the
     * Arm Resource Id of Logic Apps, Function Apps or Api Apps.
     */
    @JsonProperty(value = "properties.resourceId")
    private String resourceId;

    /**
     * Backend Properties contract.
     */
    @JsonProperty(value = "properties.properties")
    private BackendProperties properties;

    /**
     * Backend Credentials Contract Properties.
     */
    @JsonProperty(value = "properties.credentials")
    private BackendCredentialsContract credentials;

    /**
     * Backend Proxy Contract Properties.
     */
    @JsonProperty(value = "properties.proxy")
    private BackendProxyContract proxy;

    /**
     * Backend TLS Properties.
     */
    @JsonProperty(value = "properties.tls")
    private BackendTlsProperties tls;

    /**
     * Runtime Url of the Backend.
     */
    @JsonProperty(value = "properties.url", required = true)
    private String url;

    /**
     * Backend communication protocol. Possible values include: 'http', 'soap'.
     */
    @JsonProperty(value = "properties.protocol", required = true)
    private BackendProtocol protocol;

    /**
     * Get backend Title.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set backend Title.
     *
     * @param title the title value to set
     * @return the BackendContractInner object itself.
     */
    public BackendContractInner withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get backend Description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set backend Description.
     *
     * @param description the description value to set
     * @return the BackendContractInner object itself.
     */
    public BackendContractInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get management Uri of the Resource in External System. This url can be the Arm Resource Id of Logic Apps, Function Apps or Api Apps.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set management Uri of the Resource in External System. This url can be the Arm Resource Id of Logic Apps, Function Apps or Api Apps.
     *
     * @param resourceId the resourceId value to set
     * @return the BackendContractInner object itself.
     */
    public BackendContractInner withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get backend Properties contract.
     *
     * @return the properties value
     */
    public BackendProperties properties() {
        return this.properties;
    }

    /**
     * Set backend Properties contract.
     *
     * @param properties the properties value to set
     * @return the BackendContractInner object itself.
     */
    public BackendContractInner withProperties(BackendProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get backend Credentials Contract Properties.
     *
     * @return the credentials value
     */
    public BackendCredentialsContract credentials() {
        return this.credentials;
    }

    /**
     * Set backend Credentials Contract Properties.
     *
     * @param credentials the credentials value to set
     * @return the BackendContractInner object itself.
     */
    public BackendContractInner withCredentials(BackendCredentialsContract credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get backend Proxy Contract Properties.
     *
     * @return the proxy value
     */
    public BackendProxyContract proxy() {
        return this.proxy;
    }

    /**
     * Set backend Proxy Contract Properties.
     *
     * @param proxy the proxy value to set
     * @return the BackendContractInner object itself.
     */
    public BackendContractInner withProxy(BackendProxyContract proxy) {
        this.proxy = proxy;
        return this;
    }

    /**
     * Get backend TLS Properties.
     *
     * @return the tls value
     */
    public BackendTlsProperties tls() {
        return this.tls;
    }

    /**
     * Set backend TLS Properties.
     *
     * @param tls the tls value to set
     * @return the BackendContractInner object itself.
     */
    public BackendContractInner withTls(BackendTlsProperties tls) {
        this.tls = tls;
        return this;
    }

    /**
     * Get runtime Url of the Backend.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set runtime Url of the Backend.
     *
     * @param url the url value to set
     * @return the BackendContractInner object itself.
     */
    public BackendContractInner withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get backend communication protocol. Possible values include: 'http', 'soap'.
     *
     * @return the protocol value
     */
    public BackendProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set backend communication protocol. Possible values include: 'http', 'soap'.
     *
     * @param protocol the protocol value to set
     * @return the BackendContractInner object itself.
     */
    public BackendContractInner withProtocol(BackendProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

}
