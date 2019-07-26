/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.LinkedServiceInner;

/**
 * ServiceNow server linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ServiceNow")
@JsonFlatten
public class ServiceNowLinkedService extends LinkedServiceInner {
    /**
     * The endpoint of the ServiceNow server. (i.e.
     * &lt;instance&gt;.service-now.com).
     */
    @JsonProperty(value = "typeProperties.endpoint", required = true)
    private Object endpoint;

    /**
     * The authentication type to use. Possible values include: 'Basic',
     * 'OAuth2'.
     */
    @JsonProperty(value = "typeProperties.authenticationType", required = true)
    private ServiceNowAuthenticationType authenticationType;

    /**
     * The user name used to connect to the ServiceNow server for Basic and
     * OAuth2 authentication.
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /**
     * The password corresponding to the user name for Basic and OAuth2
     * authentication.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * The client id for OAuth2 authentication.
     */
    @JsonProperty(value = "typeProperties.clientId")
    private Object clientId;

    /**
     * The client secret for OAuth2 authentication.
     */
    @JsonProperty(value = "typeProperties.clientSecret")
    private SecretBase clientSecret;

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     */
    @JsonProperty(value = "typeProperties.useEncryptedEndpoints")
    private Object useEncryptedEndpoints;

    /**
     * Specifies whether to require the host name in the server's certificate
     * to match the host name of the server when connecting over SSL. The
     * default value is true.
     */
    @JsonProperty(value = "typeProperties.useHostVerification")
    private Object useHostVerification;

    /**
     * Specifies whether to verify the identity of the server when connecting
     * over SSL. The default value is true.
     */
    @JsonProperty(value = "typeProperties.usePeerVerification")
    private Object usePeerVerification;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the endpoint of the ServiceNow server. (i.e. &lt;instance&gt;.service-now.com).
     *
     * @return the endpoint value
     */
    public Object endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint of the ServiceNow server. (i.e. &lt;instance&gt;.service-now.com).
     *
     * @param endpoint the endpoint value to set
     * @return the ServiceNowLinkedService object itself.
     */
    public ServiceNowLinkedService withEndpoint(Object endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the authentication type to use. Possible values include: 'Basic', 'OAuth2'.
     *
     * @return the authenticationType value
     */
    public ServiceNowAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authentication type to use. Possible values include: 'Basic', 'OAuth2'.
     *
     * @param authenticationType the authenticationType value to set
     * @return the ServiceNowLinkedService object itself.
     */
    public ServiceNowLinkedService withAuthenticationType(ServiceNowAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the user name used to connect to the ServiceNow server for Basic and OAuth2 authentication.
     *
     * @return the username value
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the user name used to connect to the ServiceNow server for Basic and OAuth2 authentication.
     *
     * @param username the username value to set
     * @return the ServiceNowLinkedService object itself.
     */
    public ServiceNowLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password corresponding to the user name for Basic and OAuth2 authentication.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password corresponding to the user name for Basic and OAuth2 authentication.
     *
     * @param password the password value to set
     * @return the ServiceNowLinkedService object itself.
     */
    public ServiceNowLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the client id for OAuth2 authentication.
     *
     * @return the clientId value
     */
    public Object clientId() {
        return this.clientId;
    }

    /**
     * Set the client id for OAuth2 authentication.
     *
     * @param clientId the clientId value to set
     * @return the ServiceNowLinkedService object itself.
     */
    public ServiceNowLinkedService withClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the client secret for OAuth2 authentication.
     *
     * @return the clientSecret value
     */
    public SecretBase clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the client secret for OAuth2 authentication.
     *
     * @param clientSecret the clientSecret value to set
     * @return the ServiceNowLinkedService object itself.
     */
    public ServiceNowLinkedService withClientSecret(SecretBase clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     *
     * @return the useEncryptedEndpoints value
     */
    public Object useEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     *
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set
     * @return the ServiceNowLinkedService object itself.
     */
    public ServiceNowLinkedService withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     *
     * @return the useHostVerification value
     */
    public Object useHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     *
     * @param useHostVerification the useHostVerification value to set
     * @return the ServiceNowLinkedService object itself.
     */
    public ServiceNowLinkedService withUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     *
     * @return the usePeerVerification value
     */
    public Object usePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     *
     * @param usePeerVerification the usePeerVerification value to set
     * @return the ServiceNowLinkedService object itself.
     */
    public ServiceNowLinkedService withUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the ServiceNowLinkedService object itself.
     */
    public ServiceNowLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
