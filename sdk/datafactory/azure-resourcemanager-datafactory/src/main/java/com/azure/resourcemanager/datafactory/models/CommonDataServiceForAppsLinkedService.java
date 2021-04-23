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

/** Common Data Service for Apps linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CommonDataServiceForApps")
@JsonFlatten
@Fluent
public class CommonDataServiceForAppsLinkedService extends LinkedService {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CommonDataServiceForAppsLinkedService.class);

    /*
     * The deployment type of the Common Data Service for Apps instance.
     * 'Online' for Common Data Service for Apps Online and 'OnPremisesWithIfd'
     * for Common Data Service for Apps on-premises with Ifd. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.deploymentType", required = true)
    private DynamicsDeploymentType deploymentType;

    /*
     * The host name of the on-premises Common Data Service for Apps server.
     * The property is required for on-prem and not allowed for online. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.hostName")
    private Object hostname;

    /*
     * The port of on-premises Common Data Service for Apps server. The
     * property is required for on-prem and not allowed for online. Default is
     * 443. Type: integer (or Expression with resultType integer), minimum: 0.
     */
    @JsonProperty(value = "typeProperties.port")
    private Object port;

    /*
     * The URL to the Microsoft Common Data Service for Apps server. The
     * property is required for on-line and not allowed for on-prem. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.serviceUri")
    private Object serviceUri;

    /*
     * The organization name of the Common Data Service for Apps instance. The
     * property is required for on-prem and required for online when there are
     * more than one Common Data Service for Apps instances associated with the
     * user. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.organizationName")
    private Object organizationName;

    /*
     * The authentication type to connect to Common Data Service for Apps
     * server. 'Office365' for online scenario, 'Ifd' for on-premises with Ifd
     * scenario. 'AADServicePrincipal' for Server-To-Server authentication in
     * online scenario. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.authenticationType", required = true)
    private DynamicsAuthenticationType authenticationType;

    /*
     * User name to access the Common Data Service for Apps instance. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /*
     * Password to access the Common Data Service for Apps instance.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The client ID of the application in Azure Active Directory used for
     * Server-To-Server authentication. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret,
     * 'ServicePrincipalCert' for certificate. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalCredentialType")
    private DynamicsServicePrincipalCredentialType servicePrincipalCredentialType;

    /*
     * The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey',
     * servicePrincipalCredential can be SecureString or
     * AzureKeyVaultSecretReference. If servicePrincipalCredentialType is
     * 'ServicePrincipalCert', servicePrincipalCredential can only be
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalCredential")
    private SecretBase servicePrincipalCredential;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the deploymentType property: The deployment type of the Common Data Service for Apps instance. 'Online' for
     * Common Data Service for Apps Online and 'OnPremisesWithIfd' for Common Data Service for Apps on-premises with
     * Ifd. Type: string (or Expression with resultType string).
     *
     * @return the deploymentType value.
     */
    public DynamicsDeploymentType deploymentType() {
        return this.deploymentType;
    }

    /**
     * Set the deploymentType property: The deployment type of the Common Data Service for Apps instance. 'Online' for
     * Common Data Service for Apps Online and 'OnPremisesWithIfd' for Common Data Service for Apps on-premises with
     * Ifd. Type: string (or Expression with resultType string).
     *
     * @param deploymentType the deploymentType value to set.
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withDeploymentType(DynamicsDeploymentType deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }

    /**
     * Get the hostname property: The host name of the on-premises Common Data Service for Apps server. The property is
     * required for on-prem and not allowed for online. Type: string (or Expression with resultType string).
     *
     * @return the hostname value.
     */
    public Object hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The host name of the on-premises Common Data Service for Apps server. The property is
     * required for on-prem and not allowed for online. Type: string (or Expression with resultType string).
     *
     * @param hostname the hostname value to set.
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withHostname(Object hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the port property: The port of on-premises Common Data Service for Apps server. The property is required for
     * on-prem and not allowed for online. Default is 443. Type: integer (or Expression with resultType integer),
     * minimum: 0.
     *
     * @return the port value.
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port property: The port of on-premises Common Data Service for Apps server. The property is required for
     * on-prem and not allowed for online. Default is 443. Type: integer (or Expression with resultType integer),
     * minimum: 0.
     *
     * @param port the port value to set.
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the serviceUri property: The URL to the Microsoft Common Data Service for Apps server. The property is
     * required for on-line and not allowed for on-prem. Type: string (or Expression with resultType string).
     *
     * @return the serviceUri value.
     */
    public Object serviceUri() {
        return this.serviceUri;
    }

    /**
     * Set the serviceUri property: The URL to the Microsoft Common Data Service for Apps server. The property is
     * required for on-line and not allowed for on-prem. Type: string (or Expression with resultType string).
     *
     * @param serviceUri the serviceUri value to set.
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withServiceUri(Object serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * Get the organizationName property: The organization name of the Common Data Service for Apps instance. The
     * property is required for on-prem and required for online when there are more than one Common Data Service for
     * Apps instances associated with the user. Type: string (or Expression with resultType string).
     *
     * @return the organizationName value.
     */
    public Object organizationName() {
        return this.organizationName;
    }

    /**
     * Set the organizationName property: The organization name of the Common Data Service for Apps instance. The
     * property is required for on-prem and required for online when there are more than one Common Data Service for
     * Apps instances associated with the user. Type: string (or Expression with resultType string).
     *
     * @param organizationName the organizationName value to set.
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withOrganizationName(Object organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to connect to Common Data Service for Apps server.
     * 'Office365' for online scenario, 'Ifd' for on-premises with Ifd scenario. 'AADServicePrincipal' for
     * Server-To-Server authentication in online scenario. Type: string (or Expression with resultType string).
     *
     * @return the authenticationType value.
     */
    public DynamicsAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type to connect to Common Data Service for Apps server.
     * 'Office365' for online scenario, 'Ifd' for on-premises with Ifd scenario. 'AADServicePrincipal' for
     * Server-To-Server authentication in online scenario. Type: string (or Expression with resultType string).
     *
     * @param authenticationType the authenticationType value to set.
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withAuthenticationType(DynamicsAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: User name to access the Common Data Service for Apps instance. Type: string (or
     * Expression with resultType string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: User name to access the Common Data Service for Apps instance. Type: string (or
     * Expression with resultType string).
     *
     * @param username the username value to set.
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password to access the Common Data Service for Apps instance.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: Password to access the Common Data Service for Apps instance.
     *
     * @param password the password value to set.
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The client ID of the application in Azure Active Directory used for
     * Server-To-Server authentication. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The client ID of the application in Azure Active Directory used for
     * Server-To-Server authentication. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     *
     * @return the servicePrincipalCredentialType value.
     */
    public DynamicsServicePrincipalCredentialType servicePrincipalCredentialType() {
        return this.servicePrincipalCredentialType;
    }

    /**
     * Set the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     *
     * @param servicePrincipalCredentialType the servicePrincipalCredentialType value to set.
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withServicePrincipalCredentialType(
        DynamicsServicePrincipalCredentialType servicePrincipalCredentialType) {
        this.servicePrincipalCredentialType = servicePrincipalCredentialType;
        return this;
    }

    /**
     * Get the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     *
     * @return the servicePrincipalCredential value.
     */
    public SecretBase servicePrincipalCredential() {
        return this.servicePrincipalCredential;
    }

    /**
     * Set the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     *
     * @param servicePrincipalCredential the servicePrincipalCredential value to set.
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withServicePrincipalCredential(SecretBase servicePrincipalCredential) {
        this.servicePrincipalCredential = servicePrincipalCredential;
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
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommonDataServiceForAppsLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommonDataServiceForAppsLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommonDataServiceForAppsLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommonDataServiceForAppsLinkedService withAnnotations(List<Object> annotations) {
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
        if (deploymentType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property deploymentType in model CommonDataServiceForAppsLinkedService"));
        }
        if (authenticationType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property authenticationType in model CommonDataServiceForAppsLinkedService"));
        }
        if (password() != null) {
            password().validate();
        }
        if (servicePrincipalCredential() != null) {
            servicePrincipalCredential().validate();
        }
    }
}
