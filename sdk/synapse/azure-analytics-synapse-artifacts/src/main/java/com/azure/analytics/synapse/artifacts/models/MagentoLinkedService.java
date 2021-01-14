// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Magento server linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Magento")
@JsonFlatten
@Fluent
public class MagentoLinkedService extends LinkedService {
    /*
     * The URL of the Magento instance. (i.e. 192.168.222.110/magento3)
     */
    @JsonProperty(value = "typeProperties.host", required = true)
    private Object host;

    /*
     * The access token from Magento.
     */
    @JsonProperty(value = "typeProperties.accessToken")
    private SecretBase accessToken;

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
     * Get the host property: The URL of the Magento instance. (i.e. 192.168.222.110/magento3).
     *
     * @return the host value.
     */
    public Object getHost() {
        return this.host;
    }

    /**
     * Set the host property: The URL of the Magento instance. (i.e. 192.168.222.110/magento3).
     *
     * @param host the host value to set.
     * @return the MagentoLinkedService object itself.
     */
    public MagentoLinkedService setHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the accessToken property: The access token from Magento.
     *
     * @return the accessToken value.
     */
    public SecretBase getAccessToken() {
        return this.accessToken;
    }

    /**
     * Set the accessToken property: The access token from Magento.
     *
     * @param accessToken the accessToken value to set.
     * @return the MagentoLinkedService object itself.
     */
    public MagentoLinkedService setAccessToken(SecretBase accessToken) {
        this.accessToken = accessToken;
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
     * @return the MagentoLinkedService object itself.
     */
    public MagentoLinkedService setUseEncryptedEndpoints(Object useEncryptedEndpoints) {
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
     * @return the MagentoLinkedService object itself.
     */
    public MagentoLinkedService setUseHostVerification(Object useHostVerification) {
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
     * @return the MagentoLinkedService object itself.
     */
    public MagentoLinkedService setUsePeerVerification(Object usePeerVerification) {
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
     * @return the MagentoLinkedService object itself.
     */
    public MagentoLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}
