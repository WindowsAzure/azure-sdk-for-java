/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.LinkedServiceInner;

/**
 * Google BigQuery service linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("GoogleBigQuery")
@JsonFlatten
public class GoogleBigQueryLinkedService extends LinkedServiceInner {
    /**
     * The default BigQuery project to query against.
     */
    @JsonProperty(value = "typeProperties.project", required = true)
    private Object project;

    /**
     * A comma-separated list of public BigQuery projects to access.
     */
    @JsonProperty(value = "typeProperties.additionalProjects")
    private Object additionalProjects;

    /**
     * Whether to request access to Google Drive. Allowing Google Drive access
     * enables support for federated tables that combine BigQuery data with
     * data from Google Drive. The default value is false.
     */
    @JsonProperty(value = "typeProperties.requestGoogleDriveScope")
    private Object requestGoogleDriveScope;

    /**
     * The OAuth 2.0 authentication mechanism used for authentication.
     * ServiceAuthentication can only be used on self-hosted IR. Possible
     * values include: 'ServiceAuthentication', 'UserAuthentication'.
     */
    @JsonProperty(value = "typeProperties.authenticationType", required = true)
    private GoogleBigQueryAuthenticationType authenticationType;

    /**
     * The refresh token obtained from Google for authorizing access to
     * BigQuery for UserAuthentication.
     */
    @JsonProperty(value = "typeProperties.refreshToken")
    private SecretBase refreshToken;

    /**
     * The client id of the google application used to acquire the refresh
     * token.
     */
    @JsonProperty(value = "typeProperties.clientId")
    private SecretBase clientId;

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
     * Get the default BigQuery project to query against.
     *
     * @return the project value
     */
    public Object project() {
        return this.project;
    }

    /**
     * Set the default BigQuery project to query against.
     *
     * @param project the project value to set
     * @return the GoogleBigQueryLinkedService object itself.
     */
    public GoogleBigQueryLinkedService withProject(Object project) {
        this.project = project;
        return this;
    }

    /**
     * Get a comma-separated list of public BigQuery projects to access.
     *
     * @return the additionalProjects value
     */
    public Object additionalProjects() {
        return this.additionalProjects;
    }

    /**
     * Set a comma-separated list of public BigQuery projects to access.
     *
     * @param additionalProjects the additionalProjects value to set
     * @return the GoogleBigQueryLinkedService object itself.
     */
    public GoogleBigQueryLinkedService withAdditionalProjects(Object additionalProjects) {
        this.additionalProjects = additionalProjects;
        return this;
    }

    /**
     * Get whether to request access to Google Drive. Allowing Google Drive access enables support for federated tables that combine BigQuery data with data from Google Drive. The default value is false.
     *
     * @return the requestGoogleDriveScope value
     */
    public Object requestGoogleDriveScope() {
        return this.requestGoogleDriveScope;
    }

    /**
     * Set whether to request access to Google Drive. Allowing Google Drive access enables support for federated tables that combine BigQuery data with data from Google Drive. The default value is false.
     *
     * @param requestGoogleDriveScope the requestGoogleDriveScope value to set
     * @return the GoogleBigQueryLinkedService object itself.
     */
    public GoogleBigQueryLinkedService withRequestGoogleDriveScope(Object requestGoogleDriveScope) {
        this.requestGoogleDriveScope = requestGoogleDriveScope;
        return this;
    }

    /**
     * Get the OAuth 2.0 authentication mechanism used for authentication. ServiceAuthentication can only be used on self-hosted IR. Possible values include: 'ServiceAuthentication', 'UserAuthentication'.
     *
     * @return the authenticationType value
     */
    public GoogleBigQueryAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the OAuth 2.0 authentication mechanism used for authentication. ServiceAuthentication can only be used on self-hosted IR. Possible values include: 'ServiceAuthentication', 'UserAuthentication'.
     *
     * @param authenticationType the authenticationType value to set
     * @return the GoogleBigQueryLinkedService object itself.
     */
    public GoogleBigQueryLinkedService withAuthenticationType(GoogleBigQueryAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the refresh token obtained from Google for authorizing access to BigQuery for UserAuthentication.
     *
     * @return the refreshToken value
     */
    public SecretBase refreshToken() {
        return this.refreshToken;
    }

    /**
     * Set the refresh token obtained from Google for authorizing access to BigQuery for UserAuthentication.
     *
     * @param refreshToken the refreshToken value to set
     * @return the GoogleBigQueryLinkedService object itself.
     */
    public GoogleBigQueryLinkedService withRefreshToken(SecretBase refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Get the client id of the google application used to acquire the refresh token.
     *
     * @return the clientId value
     */
    public SecretBase clientId() {
        return this.clientId;
    }

    /**
     * Set the client id of the google application used to acquire the refresh token.
     *
     * @param clientId the clientId value to set
     * @return the GoogleBigQueryLinkedService object itself.
     */
    public GoogleBigQueryLinkedService withClientId(SecretBase clientId) {
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
     * @return the GoogleBigQueryLinkedService object itself.
     */
    public GoogleBigQueryLinkedService withClientSecret(SecretBase clientSecret) {
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
     * @return the GoogleBigQueryLinkedService object itself.
     */
    public GoogleBigQueryLinkedService withEmail(Object email) {
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
     * @return the GoogleBigQueryLinkedService object itself.
     */
    public GoogleBigQueryLinkedService withKeyFilePath(Object keyFilePath) {
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
     * @return the GoogleBigQueryLinkedService object itself.
     */
    public GoogleBigQueryLinkedService withTrustedCertPath(Object trustedCertPath) {
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
     * @return the GoogleBigQueryLinkedService object itself.
     */
    public GoogleBigQueryLinkedService withUseSystemTrustStore(Object useSystemTrustStore) {
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
     * @return the GoogleBigQueryLinkedService object itself.
     */
    public GoogleBigQueryLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
