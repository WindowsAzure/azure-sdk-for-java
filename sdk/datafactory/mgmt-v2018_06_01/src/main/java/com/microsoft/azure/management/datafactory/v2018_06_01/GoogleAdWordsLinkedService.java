/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.LinkedServiceInner;

/**
 * Google AdWords service linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = GoogleAdWordsLinkedService.class)
@JsonTypeName("GoogleAdWords")
@JsonFlatten
public class GoogleAdWordsLinkedService extends LinkedServiceInner {
    /**
     * The Client customer ID of the AdWords account that you want to fetch
     * report data for.
     */
    @JsonProperty(value = "typeProperties.clientCustomerID", required = true)
    private Object clientCustomerID;

    /**
     * The developer token associated with the manager account that you use to
     * grant access to the AdWords API.
     */
    @JsonProperty(value = "typeProperties.developerToken", required = true)
    private SecretBase developerToken;

    /**
     * The OAuth 2.0 authentication mechanism used for authentication.
     * ServiceAuthentication can only be used on self-hosted IR. Possible
     * values include: 'ServiceAuthentication', 'UserAuthentication'.
     */
    @JsonProperty(value = "typeProperties.authenticationType", required = true)
    private GoogleAdWordsAuthenticationType authenticationType;

    /**
     * The refresh token obtained from Google for authorizing access to AdWords
     * for UserAuthentication.
     */
    @JsonProperty(value = "typeProperties.refreshToken")
    private SecretBase refreshToken;

    /**
     * The client id of the google application used to acquire the refresh
     * token. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.clientId")
    private Object clientId;

    /**
     * The client secret of the google application used to acquire the refresh
     * token.
     */
    @JsonProperty(value = "typeProperties.clientSecret")
    private SecretBase clientSecret;

    /**
     * The service account email ID that is used for ServiceAuthentication and
     * can only be used on self-hosted IR.
     */
    @JsonProperty(value = "typeProperties.email")
    private Object email;

    /**
     * The full path to the .p12 key file that is used to authenticate the
     * service account email address and can only be used on self-hosted IR.
     */
    @JsonProperty(value = "typeProperties.keyFilePath")
    private Object keyFilePath;

    /**
     * The full path of the .pem file containing trusted CA certificates for
     * verifying the server when connecting over SSL. This property can only be
     * set when using SSL on self-hosted IR. The default value is the
     * cacerts.pem file installed with the IR.
     */
    @JsonProperty(value = "typeProperties.trustedCertPath")
    private Object trustedCertPath;

    /**
     * Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     */
    @JsonProperty(value = "typeProperties.useSystemTrustStore")
    private Object useSystemTrustStore;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the Client customer ID of the AdWords account that you want to fetch report data for.
     *
     * @return the clientCustomerID value
     */
    public Object clientCustomerID() {
        return this.clientCustomerID;
    }

    /**
     * Set the Client customer ID of the AdWords account that you want to fetch report data for.
     *
     * @param clientCustomerID the clientCustomerID value to set
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService withClientCustomerID(Object clientCustomerID) {
        this.clientCustomerID = clientCustomerID;
        return this;
    }

    /**
     * Get the developer token associated with the manager account that you use to grant access to the AdWords API.
     *
     * @return the developerToken value
     */
    public SecretBase developerToken() {
        return this.developerToken;
    }

    /**
     * Set the developer token associated with the manager account that you use to grant access to the AdWords API.
     *
     * @param developerToken the developerToken value to set
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService withDeveloperToken(SecretBase developerToken) {
        this.developerToken = developerToken;
        return this;
    }

    /**
     * Get the OAuth 2.0 authentication mechanism used for authentication. ServiceAuthentication can only be used on self-hosted IR. Possible values include: 'ServiceAuthentication', 'UserAuthentication'.
     *
     * @return the authenticationType value
     */
    public GoogleAdWordsAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the OAuth 2.0 authentication mechanism used for authentication. ServiceAuthentication can only be used on self-hosted IR. Possible values include: 'ServiceAuthentication', 'UserAuthentication'.
     *
     * @param authenticationType the authenticationType value to set
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService withAuthenticationType(GoogleAdWordsAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the refresh token obtained from Google for authorizing access to AdWords for UserAuthentication.
     *
     * @return the refreshToken value
     */
    public SecretBase refreshToken() {
        return this.refreshToken;
    }

    /**
     * Set the refresh token obtained from Google for authorizing access to AdWords for UserAuthentication.
     *
     * @param refreshToken the refreshToken value to set
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService withRefreshToken(SecretBase refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Get the client id of the google application used to acquire the refresh token. Type: string (or Expression with resultType string).
     *
     * @return the clientId value
     */
    public Object clientId() {
        return this.clientId;
    }

    /**
     * Set the client id of the google application used to acquire the refresh token. Type: string (or Expression with resultType string).
     *
     * @param clientId the clientId value to set
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService withClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the client secret of the google application used to acquire the refresh token.
     *
     * @return the clientSecret value
     */
    public SecretBase clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the client secret of the google application used to acquire the refresh token.
     *
     * @param clientSecret the clientSecret value to set
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService withClientSecret(SecretBase clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the service account email ID that is used for ServiceAuthentication and can only be used on self-hosted IR.
     *
     * @return the email value
     */
    public Object email() {
        return this.email;
    }

    /**
     * Set the service account email ID that is used for ServiceAuthentication and can only be used on self-hosted IR.
     *
     * @param email the email value to set
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService withEmail(Object email) {
        this.email = email;
        return this;
    }

    /**
     * Get the full path to the .p12 key file that is used to authenticate the service account email address and can only be used on self-hosted IR.
     *
     * @return the keyFilePath value
     */
    public Object keyFilePath() {
        return this.keyFilePath;
    }

    /**
     * Set the full path to the .p12 key file that is used to authenticate the service account email address and can only be used on self-hosted IR.
     *
     * @param keyFilePath the keyFilePath value to set
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService withKeyFilePath(Object keyFilePath) {
        this.keyFilePath = keyFilePath;
        return this;
    }

    /**
     * Get the full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     *
     * @return the trustedCertPath value
     */
    public Object trustedCertPath() {
        return this.trustedCertPath;
    }

    /**
     * Set the full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     *
     * @param trustedCertPath the trustedCertPath value to set
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService withTrustedCertPath(Object trustedCertPath) {
        this.trustedCertPath = trustedCertPath;
        return this;
    }

    /**
     * Get specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     *
     * @return the useSystemTrustStore value
     */
    public Object useSystemTrustStore() {
        return this.useSystemTrustStore;
    }

    /**
     * Set specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     *
     * @param useSystemTrustStore the useSystemTrustStore value to set
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService withUseSystemTrustStore(Object useSystemTrustStore) {
        this.useSystemTrustStore = useSystemTrustStore;
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
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
