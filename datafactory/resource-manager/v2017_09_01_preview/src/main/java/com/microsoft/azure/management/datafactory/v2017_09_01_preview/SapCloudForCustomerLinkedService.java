/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation.LinkedServiceInner;

/**
 * Linked service for SAP Cloud for Customer.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapCloudForCustomer")
@JsonFlatten
public class SapCloudForCustomerLinkedService extends LinkedServiceInner {
    /**
     * The URL of SAP Cloud for Customer OData API. For example,
     * '[https://[tenantname].crm.ondemand.com/sap/c4c/odata/v1]'. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private Object url;

    /**
     * The username for Basic authentication. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /**
     * The password for Basic authentication.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Either
     * encryptedCredential or username/password must be provided. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the URL of SAP Cloud for Customer OData API. For example, '[https://[tenantname].crm.ondemand.com/sap/c4c/odata/v1]'. Type: string (or Expression with resultType string).
     *
     * @return the url value
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set the URL of SAP Cloud for Customer OData API. For example, '[https://[tenantname].crm.ondemand.com/sap/c4c/odata/v1]'. Type: string (or Expression with resultType string).
     *
     * @param url the url value to set
     * @return the SapCloudForCustomerLinkedService object itself.
     */
    public SapCloudForCustomerLinkedService withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the username for Basic authentication. Type: string (or Expression with resultType string).
     *
     * @return the username value
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username for Basic authentication. Type: string (or Expression with resultType string).
     *
     * @param username the username value to set
     * @return the SapCloudForCustomerLinkedService object itself.
     */
    public SapCloudForCustomerLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password for Basic authentication.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password for Basic authentication.
     *
     * @param password the password value to set
     * @return the SapCloudForCustomerLinkedService object itself.
     */
    public SapCloudForCustomerLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Either encryptedCredential or username/password must be provided. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Either encryptedCredential or username/password must be provided. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the SapCloudForCustomerLinkedService object itself.
     */
    public SapCloudForCustomerLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
