// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Amazon Marketplace Web Service linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AmazonMWS")
@JsonFlatten
@Fluent
public class AmazonMWSLinkedService extends LinkedService {
    /*
     * The endpoint of the Amazon MWS server, (i.e. mws.amazonservices.com)
     */
    @JsonProperty(value = "typeProperties.endpoint", required = true)
    private Object endpoint;

    /*
     * The Amazon Marketplace ID you want to retrieve data from. To retrieve
     * data from multiple Marketplace IDs, separate them with a comma (,).
     * (i.e. A2EUQ1WTGCTBG2)
     */
    @JsonProperty(value = "typeProperties.marketplaceID", required = true)
    private Object marketplaceID;

    /*
     * The Amazon seller ID.
     */
    @JsonProperty(value = "typeProperties.sellerID", required = true)
    private Object sellerID;

    /*
     * The Amazon MWS authentication token.
     */
    @JsonProperty(value = "typeProperties.mwsAuthToken")
    private SecretBase mwsAuthToken;

    /*
     * The access key id used to access data.
     */
    @JsonProperty(value = "typeProperties.accessKeyId", required = true)
    private Object accessKeyId;

    /*
     * The secret key used to access data.
     */
    @JsonProperty(value = "typeProperties.secretKey")
    private SecretBase secretKey;

    /*
     * Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     */
    @JsonProperty(value = "typeProperties.useEncryptedEndpoints")
    private Object useEncryptedEndpoints;

    /*
     * Specifies whether to require the host name in the server's certificate
     * to match the host name of the server when connecting over SSL. The
     * default value is true.
     */
    @JsonProperty(value = "typeProperties.useHostVerification")
    private Object useHostVerification;

    /*
     * Specifies whether to verify the identity of the server when connecting
     * over SSL. The default value is true.
     */
    @JsonProperty(value = "typeProperties.usePeerVerification")
    private Object usePeerVerification;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the endpoint property: The endpoint of the Amazon MWS server, (i.e. mws.amazonservices.com).
     *
     * @return the endpoint value.
     */
    public Object getEndpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: The endpoint of the Amazon MWS server, (i.e. mws.amazonservices.com).
     *
     * @param endpoint the endpoint value to set.
     * @return the AmazonMWSLinkedService object itself.
     */
    public AmazonMWSLinkedService setEndpoint(Object endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the marketplaceID property: The Amazon Marketplace ID you want to retrieve data from. To retrieve data from
     * multiple Marketplace IDs, separate them with a comma (,). (i.e. A2EUQ1WTGCTBG2).
     *
     * @return the marketplaceID value.
     */
    public Object getMarketplaceID() {
        return this.marketplaceID;
    }

    /**
     * Set the marketplaceID property: The Amazon Marketplace ID you want to retrieve data from. To retrieve data from
     * multiple Marketplace IDs, separate them with a comma (,). (i.e. A2EUQ1WTGCTBG2).
     *
     * @param marketplaceID the marketplaceID value to set.
     * @return the AmazonMWSLinkedService object itself.
     */
    public AmazonMWSLinkedService setMarketplaceID(Object marketplaceID) {
        this.marketplaceID = marketplaceID;
        return this;
    }

    /**
     * Get the sellerID property: The Amazon seller ID.
     *
     * @return the sellerID value.
     */
    public Object getSellerID() {
        return this.sellerID;
    }

    /**
     * Set the sellerID property: The Amazon seller ID.
     *
     * @param sellerID the sellerID value to set.
     * @return the AmazonMWSLinkedService object itself.
     */
    public AmazonMWSLinkedService setSellerID(Object sellerID) {
        this.sellerID = sellerID;
        return this;
    }

    /**
     * Get the mwsAuthToken property: The Amazon MWS authentication token.
     *
     * @return the mwsAuthToken value.
     */
    public SecretBase getMwsAuthToken() {
        return this.mwsAuthToken;
    }

    /**
     * Set the mwsAuthToken property: The Amazon MWS authentication token.
     *
     * @param mwsAuthToken the mwsAuthToken value to set.
     * @return the AmazonMWSLinkedService object itself.
     */
    public AmazonMWSLinkedService setMwsAuthToken(SecretBase mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        return this;
    }

    /**
     * Get the accessKeyId property: The access key id used to access data.
     *
     * @return the accessKeyId value.
     */
    public Object getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * Set the accessKeyId property: The access key id used to access data.
     *
     * @param accessKeyId the accessKeyId value to set.
     * @return the AmazonMWSLinkedService object itself.
     */
    public AmazonMWSLinkedService setAccessKeyId(Object accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * Get the secretKey property: The secret key used to access data.
     *
     * @return the secretKey value.
     */
    public SecretBase getSecretKey() {
        return this.secretKey;
    }

    /**
     * Set the secretKey property: The secret key used to access data.
     *
     * @param secretKey the secretKey value to set.
     * @return the AmazonMWSLinkedService object itself.
     */
    public AmazonMWSLinkedService setSecretKey(SecretBase secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     *
     * @return the useEncryptedEndpoints value.
     */
    public Object getUseEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     *
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the AmazonMWSLinkedService object itself.
     */
    public AmazonMWSLinkedService setUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     *
     * @return the useHostVerification value.
     */
    public Object getUseHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     *
     * @param useHostVerification the useHostVerification value to set.
     * @return the AmazonMWSLinkedService object itself.
     */
    public AmazonMWSLinkedService setUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     *
     * @return the usePeerVerification value.
     */
    public Object getUsePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     *
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the AmazonMWSLinkedService object itself.
     */
    public AmazonMWSLinkedService setUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
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
     * @return the AmazonMWSLinkedService object itself.
     */
    public AmazonMWSLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}
