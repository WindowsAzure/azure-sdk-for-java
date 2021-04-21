// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Linked service for Amazon S3. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AmazonS3")
@JsonFlatten
@Fluent
public class AmazonS3LinkedService extends LinkedService {
    /*
     * The authentication type of S3. Allowed value: AccessKey (default) or
     * TemporarySecurityCredentials. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private Object authenticationType;

    /*
     * The access key identifier of the Amazon S3 Identity and Access
     * Management (IAM) user. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.accessKeyId")
    private Object accessKeyId;

    /*
     * The secret access key of the Amazon S3 Identity and Access Management
     * (IAM) user.
     */
    @JsonProperty(value = "typeProperties.secretAccessKey")
    private SecretBase secretAccessKey;

    /*
     * This value specifies the endpoint to access with the S3 Connector. This
     * is an optional property; change it only if you want to try a different
     * service endpoint or want to switch between https and http. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.serviceUrl")
    private Object serviceUrl;

    /*
     * The session token for the S3 temporary security credential.
     */
    @JsonProperty(value = "typeProperties.sessionToken")
    private SecretBase sessionToken;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the authenticationType property: The authentication type of S3. Allowed value: AccessKey (default) or
     * TemporarySecurityCredentials. Type: string (or Expression with resultType string).
     *
     * @return the authenticationType value.
     */
    public Object getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type of S3. Allowed value: AccessKey (default) or
     * TemporarySecurityCredentials. Type: string (or Expression with resultType string).
     *
     * @param authenticationType the authenticationType value to set.
     * @return the AmazonS3LinkedService object itself.
     */
    public AmazonS3LinkedService setAuthenticationType(Object authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the accessKeyId property: The access key identifier of the Amazon S3 Identity and Access Management (IAM)
     * user. Type: string (or Expression with resultType string).
     *
     * @return the accessKeyId value.
     */
    public Object getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * Set the accessKeyId property: The access key identifier of the Amazon S3 Identity and Access Management (IAM)
     * user. Type: string (or Expression with resultType string).
     *
     * @param accessKeyId the accessKeyId value to set.
     * @return the AmazonS3LinkedService object itself.
     */
    public AmazonS3LinkedService setAccessKeyId(Object accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * Get the secretAccessKey property: The secret access key of the Amazon S3 Identity and Access Management (IAM)
     * user.
     *
     * @return the secretAccessKey value.
     */
    public SecretBase getSecretAccessKey() {
        return this.secretAccessKey;
    }

    /**
     * Set the secretAccessKey property: The secret access key of the Amazon S3 Identity and Access Management (IAM)
     * user.
     *
     * @param secretAccessKey the secretAccessKey value to set.
     * @return the AmazonS3LinkedService object itself.
     */
    public AmazonS3LinkedService setSecretAccessKey(SecretBase secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }

    /**
     * Get the serviceUrl property: This value specifies the endpoint to access with the S3 Connector. This is an
     * optional property; change it only if you want to try a different service endpoint or want to switch between https
     * and http. Type: string (or Expression with resultType string).
     *
     * @return the serviceUrl value.
     */
    public Object getServiceUrl() {
        return this.serviceUrl;
    }

    /**
     * Set the serviceUrl property: This value specifies the endpoint to access with the S3 Connector. This is an
     * optional property; change it only if you want to try a different service endpoint or want to switch between https
     * and http. Type: string (or Expression with resultType string).
     *
     * @param serviceUrl the serviceUrl value to set.
     * @return the AmazonS3LinkedService object itself.
     */
    public AmazonS3LinkedService setServiceUrl(Object serviceUrl) {
        this.serviceUrl = serviceUrl;
        return this;
    }

    /**
     * Get the sessionToken property: The session token for the S3 temporary security credential.
     *
     * @return the sessionToken value.
     */
    public SecretBase getSessionToken() {
        return this.sessionToken;
    }

    /**
     * Set the sessionToken property: The session token for the S3 temporary security credential.
     *
     * @param sessionToken the sessionToken value to set.
     * @return the AmazonS3LinkedService object itself.
     */
    public AmazonS3LinkedService setSessionToken(SecretBase sessionToken) {
        this.sessionToken = sessionToken;
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
     * @return the AmazonS3LinkedService object itself.
     */
    public AmazonS3LinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}
