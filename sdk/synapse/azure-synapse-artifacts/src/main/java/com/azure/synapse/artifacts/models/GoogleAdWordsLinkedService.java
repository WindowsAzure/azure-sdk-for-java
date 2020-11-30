// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Google AdWords service linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("GoogleAdWords")
@JsonFlatten
@Fluent
public class GoogleAdWordsLinkedService extends LinkedService {
    /*
     * The Client customer ID of the AdWords account that you want to fetch
     * report data for.
     */
    @JsonProperty(value = "typeProperties.clientCustomerID", required = true)
    private Object clientCustomerID;

    /*
     * The developer token associated with the manager account that you use to
     * grant access to the AdWords API.
     */
    @JsonProperty(value = "typeProperties.developerToken", required = true)
    private SecretBase developerToken;

    /*
     * The OAuth 2.0 authentication mechanism used for authentication.
     * ServiceAuthentication can only be used on self-hosted IR.
     */
    @JsonProperty(value = "typeProperties.authenticationType", required = true)
    private GoogleAdWordsAuthenticationType authenticationType;

    /*
     * The refresh token obtained from Google for authorizing access to AdWords
     * for UserAuthentication.
     */
    @JsonProperty(value = "typeProperties.refreshToken")
    private SecretBase refreshToken;

    /*
     * The client id of the google application used to acquire the refresh
     * token. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.clientId")
    private Object clientId;

    /*
     * The client secret of the google application used to acquire the refresh
     * token.
     */
    @JsonProperty(value = "typeProperties.clientSecret")
    private SecretBase clientSecret;

    /*
     * The service account email ID that is used for ServiceAuthentication and
     * can only be used on self-hosted IR.
     */
    @JsonProperty(value = "typeProperties.email")
    private Object email;

    /*
     * The full path to the .p12 key file that is used to authenticate the
     * service account email address and can only be used on self-hosted IR.
     */
    @JsonProperty(value = "typeProperties.keyFilePath")
    private Object keyFilePath;

    /*
     * The full path of the .pem file containing trusted CA certificates for
     * verifying the server when connecting over SSL. This property can only be
     * set when using SSL on self-hosted IR. The default value is the
     * cacerts.pem file installed with the IR.
     */
    @JsonProperty(value = "typeProperties.trustedCertPath")
    private Object trustedCertPath;

    /*
     * Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     */
    @JsonProperty(value = "typeProperties.useSystemTrustStore")
    private Object useSystemTrustStore;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the clientCustomerID property: The Client customer ID of the AdWords account that you want to fetch report
     * data for.
     *
     * @return the clientCustomerID value.
     */
    public Object getClientCustomerID() {
        return this.clientCustomerID;
    }

    /**
     * Set the clientCustomerID property: The Client customer ID of the AdWords account that you want to fetch report
     * data for.
     *
     * @param clientCustomerID the clientCustomerID value to set.
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService setClientCustomerID(Object clientCustomerID) {
        this.clientCustomerID = clientCustomerID;
        return this;
    }

    /**
     * Get the developerToken property: The developer token associated with the manager account that you use to grant
     * access to the AdWords API.
     *
     * @return the developerToken value.
     */
    public SecretBase getDeveloperToken() {
        return this.developerToken;
    }

    /**
     * Set the developerToken property: The developer token associated with the manager account that you use to grant
     * access to the AdWords API.
     *
     * @param developerToken the developerToken value to set.
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService setDeveloperToken(SecretBase developerToken) {
        this.developerToken = developerToken;
        return this;
    }

    /**
     * Get the authenticationType property: The OAuth 2.0 authentication mechanism used for authentication.
     * ServiceAuthentication can only be used on self-hosted IR.
     *
     * @return the authenticationType value.
     */
    public GoogleAdWordsAuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The OAuth 2.0 authentication mechanism used for authentication.
     * ServiceAuthentication can only be used on self-hosted IR.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService setAuthenticationType(GoogleAdWordsAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the refreshToken property: The refresh token obtained from Google for authorizing access to AdWords for
     * UserAuthentication.
     *
     * @return the refreshToken value.
     */
    public SecretBase getRefreshToken() {
        return this.refreshToken;
    }

    /**
     * Set the refreshToken property: The refresh token obtained from Google for authorizing access to AdWords for
     * UserAuthentication.
     *
     * @param refreshToken the refreshToken value to set.
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService setRefreshToken(SecretBase refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Get the clientId property: The client id of the google application used to acquire the refresh token. Type:
     * string (or Expression with resultType string).
     *
     * @return the clientId value.
     */
    public Object getClientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The client id of the google application used to acquire the refresh token. Type:
     * string (or Expression with resultType string).
     *
     * @param clientId the clientId value to set.
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService setClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: The client secret of the google application used to acquire the refresh token.
     *
     * @return the clientSecret value.
     */
    public SecretBase getClientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: The client secret of the google application used to acquire the refresh token.
     *
     * @param clientSecret the clientSecret value to set.
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService setClientSecret(SecretBase clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the email property: The service account email ID that is used for ServiceAuthentication and can only be used
     * on self-hosted IR.
     *
     * @return the email value.
     */
    public Object getEmail() {
        return this.email;
    }

    /**
     * Set the email property: The service account email ID that is used for ServiceAuthentication and can only be used
     * on self-hosted IR.
     *
     * @param email the email value to set.
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService setEmail(Object email) {
        this.email = email;
        return this;
    }

    /**
     * Get the keyFilePath property: The full path to the .p12 key file that is used to authenticate the service account
     * email address and can only be used on self-hosted IR.
     *
     * @return the keyFilePath value.
     */
    public Object getKeyFilePath() {
        return this.keyFilePath;
    }

    /**
     * Set the keyFilePath property: The full path to the .p12 key file that is used to authenticate the service account
     * email address and can only be used on self-hosted IR.
     *
     * @param keyFilePath the keyFilePath value to set.
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService setKeyFilePath(Object keyFilePath) {
        this.keyFilePath = keyFilePath;
        return this;
    }

    /**
     * Get the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR.
     *
     * @return the trustedCertPath value.
     */
    public Object getTrustedCertPath() {
        return this.trustedCertPath;
    }

    /**
     * Set the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR.
     *
     * @param trustedCertPath the trustedCertPath value to set.
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService setTrustedCertPath(Object trustedCertPath) {
        this.trustedCertPath = trustedCertPath;
        return this;
    }

    /**
     * Get the useSystemTrustStore property: Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     *
     * @return the useSystemTrustStore value.
     */
    public Object getUseSystemTrustStore() {
        return this.useSystemTrustStore;
    }

    /**
     * Set the useSystemTrustStore property: Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     *
     * @param useSystemTrustStore the useSystemTrustStore value to set.
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService setUseSystemTrustStore(Object useSystemTrustStore) {
        this.useSystemTrustStore = useSystemTrustStore;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the GoogleAdWordsLinkedService object itself.
     */
    public GoogleAdWordsLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}
