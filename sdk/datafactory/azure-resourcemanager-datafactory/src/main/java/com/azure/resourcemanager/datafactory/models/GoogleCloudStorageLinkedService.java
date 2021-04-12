// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Linked service for Google Cloud Storage. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("GoogleCloudStorage")
@JsonFlatten
@Fluent
public class GoogleCloudStorageLinkedService extends LinkedService {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GoogleCloudStorageLinkedService.class);

    /*
     * The access key identifier of the Google Cloud Storage Identity and
     * Access Management (IAM) user. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.accessKeyId")
    private Object accessKeyId;

    /*
     * The secret access key of the Google Cloud Storage Identity and Access
     * Management (IAM) user.
     */
    @JsonProperty(value = "typeProperties.secretAccessKey")
    private SecretBase secretAccessKey;

    /*
     * This value specifies the endpoint to access with the Google Cloud
     * Storage Connector. This is an optional property; change it only if you
     * want to try a different service endpoint or want to switch between https
     * and http. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.serviceUrl")
    private Object serviceUrl;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the accessKeyId property: The access key identifier of the Google Cloud Storage Identity and Access
     * Management (IAM) user. Type: string (or Expression with resultType string).
     *
     * @return the accessKeyId value.
     */
    public Object accessKeyId() {
        return this.accessKeyId;
    }

    /**
     * Set the accessKeyId property: The access key identifier of the Google Cloud Storage Identity and Access
     * Management (IAM) user. Type: string (or Expression with resultType string).
     *
     * @param accessKeyId the accessKeyId value to set.
     * @return the GoogleCloudStorageLinkedService object itself.
     */
    public GoogleCloudStorageLinkedService withAccessKeyId(Object accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * Get the secretAccessKey property: The secret access key of the Google Cloud Storage Identity and Access
     * Management (IAM) user.
     *
     * @return the secretAccessKey value.
     */
    public SecretBase secretAccessKey() {
        return this.secretAccessKey;
    }

    /**
     * Set the secretAccessKey property: The secret access key of the Google Cloud Storage Identity and Access
     * Management (IAM) user.
     *
     * @param secretAccessKey the secretAccessKey value to set.
     * @return the GoogleCloudStorageLinkedService object itself.
     */
    public GoogleCloudStorageLinkedService withSecretAccessKey(SecretBase secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }

    /**
     * Get the serviceUrl property: This value specifies the endpoint to access with the Google Cloud Storage Connector.
     * This is an optional property; change it only if you want to try a different service endpoint or want to switch
     * between https and http. Type: string (or Expression with resultType string).
     *
     * @return the serviceUrl value.
     */
    public Object serviceUrl() {
        return this.serviceUrl;
    }

    /**
     * Set the serviceUrl property: This value specifies the endpoint to access with the Google Cloud Storage Connector.
     * This is an optional property; change it only if you want to try a different service endpoint or want to switch
     * between https and http. Type: string (or Expression with resultType string).
     *
     * @param serviceUrl the serviceUrl value to set.
     * @return the GoogleCloudStorageLinkedService object itself.
     */
    public GoogleCloudStorageLinkedService withServiceUrl(Object serviceUrl) {
        this.serviceUrl = serviceUrl;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the GoogleCloudStorageLinkedService object itself.
     */
    public GoogleCloudStorageLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GoogleCloudStorageLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GoogleCloudStorageLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GoogleCloudStorageLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GoogleCloudStorageLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (secretAccessKey() != null) {
            secretAccessKey().validate();
        }
    }
}
