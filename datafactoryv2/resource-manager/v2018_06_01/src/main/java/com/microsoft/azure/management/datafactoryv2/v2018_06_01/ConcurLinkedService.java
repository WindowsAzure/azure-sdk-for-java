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
 * Concur Service linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Concur")
@JsonFlatten
public class ConcurLinkedService extends LinkedServiceInner {
    /**
     * Application client_id supplied by Concur App Management.
     */
    @JsonProperty(value = "typeProperties.clientId", required = true)
    private Object clientId;

    /**
     * The user name that you use to access Concur Service.
     */
    @JsonProperty(value = "typeProperties.username", required = true)
    private Object username;

    /**
     * The password corresponding to the user name that you provided in the
     * username field.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

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
     * Get application client_id supplied by Concur App Management.
     *
     * @return the clientId value
     */
    public Object clientId() {
        return this.clientId;
    }

    /**
     * Set application client_id supplied by Concur App Management.
     *
     * @param clientId the clientId value to set
     * @return the ConcurLinkedService object itself.
     */
    public ConcurLinkedService withClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the user name that you use to access Concur Service.
     *
     * @return the username value
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the user name that you use to access Concur Service.
     *
     * @param username the username value to set
     * @return the ConcurLinkedService object itself.
     */
    public ConcurLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password corresponding to the user name that you provided in the username field.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password corresponding to the user name that you provided in the username field.
     *
     * @param password the password value to set
     * @return the ConcurLinkedService object itself.
     */
    public ConcurLinkedService withPassword(SecretBase password) {
        this.password = password;
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
     * @return the ConcurLinkedService object itself.
     */
    public ConcurLinkedService withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
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
     * @return the ConcurLinkedService object itself.
     */
    public ConcurLinkedService withUseHostVerification(Object useHostVerification) {
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
     * @return the ConcurLinkedService object itself.
     */
    public ConcurLinkedService withUsePeerVerification(Object usePeerVerification) {
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
     * @return the ConcurLinkedService object itself.
     */
    public ConcurLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
