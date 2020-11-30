// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Office365 linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Office365")
@JsonFlatten
@Fluent
public class Office365LinkedService extends LinkedService {
    /*
     * Azure tenant ID to which the Office 365 account belongs. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.office365TenantId", required = true)
    private Object office365TenantId;

    /*
     * Specify the tenant information under which your Azure AD web application
     * resides. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalTenantId", required = true)
    private Object servicePrincipalTenantId;

    /*
     * Specify the application's client ID. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId", required = true)
    private Object servicePrincipalId;

    /*
     * Specify the application's key.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey", required = true)
    private SecretBase servicePrincipalKey;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the office365TenantId property: Azure tenant ID to which the Office 365 account belongs. Type: string (or
     * Expression with resultType string).
     *
     * @return the office365TenantId value.
     */
    public Object getOffice365TenantId() {
        return this.office365TenantId;
    }

    /**
     * Set the office365TenantId property: Azure tenant ID to which the Office 365 account belongs. Type: string (or
     * Expression with resultType string).
     *
     * @param office365TenantId the office365TenantId value to set.
     * @return the Office365LinkedService object itself.
     */
    public Office365LinkedService setOffice365TenantId(Object office365TenantId) {
        this.office365TenantId = office365TenantId;
        return this;
    }

    /**
     * Get the servicePrincipalTenantId property: Specify the tenant information under which your Azure AD web
     * application resides. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalTenantId value.
     */
    public Object getServicePrincipalTenantId() {
        return this.servicePrincipalTenantId;
    }

    /**
     * Set the servicePrincipalTenantId property: Specify the tenant information under which your Azure AD web
     * application resides. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalTenantId the servicePrincipalTenantId value to set.
     * @return the Office365LinkedService object itself.
     */
    public Office365LinkedService setServicePrincipalTenantId(Object servicePrincipalTenantId) {
        this.servicePrincipalTenantId = servicePrincipalTenantId;
        return this;
    }

    /**
     * Get the servicePrincipalId property: Specify the application's client ID. Type: string (or Expression with
     * resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: Specify the application's client ID. Type: string (or Expression with
     * resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the Office365LinkedService object itself.
     */
    public Office365LinkedService setServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: Specify the application's key.
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase getServicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: Specify the application's key.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the Office365LinkedService object itself.
     */
    public Office365LinkedService setServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
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
     * @return the Office365LinkedService object itself.
     */
    public Office365LinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}
