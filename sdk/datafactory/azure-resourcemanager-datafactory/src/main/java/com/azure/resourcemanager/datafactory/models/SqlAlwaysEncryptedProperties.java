// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Sql always encrypted properties. */
@Fluent
public final class SqlAlwaysEncryptedProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlAlwaysEncryptedProperties.class);

    /*
     * Sql always encrypted AKV authentication type. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "alwaysEncryptedAkvAuthType", required = true)
    private SqlAlwaysEncryptedAkvAuthType alwaysEncryptedAkvAuthType;

    /*
     * The client ID of the application in Azure Active Directory used for
     * Azure Key Vault authentication. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * The key of the service principal used to authenticate against Azure Key
     * Vault.
     */
    @JsonProperty(value = "servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /**
     * Get the alwaysEncryptedAkvAuthType property: Sql always encrypted AKV authentication type. Type: string (or
     * Expression with resultType string).
     *
     * @return the alwaysEncryptedAkvAuthType value.
     */
    public SqlAlwaysEncryptedAkvAuthType alwaysEncryptedAkvAuthType() {
        return this.alwaysEncryptedAkvAuthType;
    }

    /**
     * Set the alwaysEncryptedAkvAuthType property: Sql always encrypted AKV authentication type. Type: string (or
     * Expression with resultType string).
     *
     * @param alwaysEncryptedAkvAuthType the alwaysEncryptedAkvAuthType value to set.
     * @return the SqlAlwaysEncryptedProperties object itself.
     */
    public SqlAlwaysEncryptedProperties withAlwaysEncryptedAkvAuthType(
        SqlAlwaysEncryptedAkvAuthType alwaysEncryptedAkvAuthType) {
        this.alwaysEncryptedAkvAuthType = alwaysEncryptedAkvAuthType;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The client ID of the application in Azure Active Directory used for Azure
     * Key Vault authentication. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The client ID of the application in Azure Active Directory used for Azure
     * Key Vault authentication. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the SqlAlwaysEncryptedProperties object itself.
     */
    public SqlAlwaysEncryptedProperties withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The key of the service principal used to authenticate against Azure Key
     * Vault.
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The key of the service principal used to authenticate against Azure Key
     * Vault.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the SqlAlwaysEncryptedProperties object itself.
     */
    public SqlAlwaysEncryptedProperties withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (alwaysEncryptedAkvAuthType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property alwaysEncryptedAkvAuthType in model SqlAlwaysEncryptedProperties"));
        }
        if (servicePrincipalKey() != null) {
            servicePrincipalKey().validate();
        }
    }
}
