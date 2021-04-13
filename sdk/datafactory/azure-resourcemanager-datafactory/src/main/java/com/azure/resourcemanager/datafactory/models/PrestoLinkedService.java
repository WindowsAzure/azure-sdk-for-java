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

/** Presto server linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Presto")
@JsonFlatten
@Fluent
public class PrestoLinkedService extends LinkedService {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrestoLinkedService.class);

    /*
     * The IP address or host name of the Presto server. (i.e. 192.168.222.160)
     */
    @JsonProperty(value = "typeProperties.host", required = true)
    private Object host;

    /*
     * The version of the Presto server. (i.e. 0.148-t)
     */
    @JsonProperty(value = "typeProperties.serverVersion", required = true)
    private Object serverVersion;

    /*
     * The catalog context for all request against the server.
     */
    @JsonProperty(value = "typeProperties.catalog", required = true)
    private Object catalog;

    /*
     * The TCP port that the Presto server uses to listen for client
     * connections. The default value is 8080.
     */
    @JsonProperty(value = "typeProperties.port")
    private Object port;

    /*
     * The authentication mechanism used to connect to the Presto server.
     */
    @JsonProperty(value = "typeProperties.authenticationType", required = true)
    private PrestoAuthenticationType authenticationType;

    /*
     * The user name used to connect to the Presto server.
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /*
     * The password corresponding to the user name.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * Specifies whether the connections to the server are encrypted using SSL.
     * The default value is false.
     */
    @JsonProperty(value = "typeProperties.enableSsl")
    private Object enableSsl;

    /*
     * The full path of the .pem file containing trusted CA certificates for
     * verifying the server when connecting over SSL. This property can only be
     * set when using SSL on self-hosted IR. The default value is the
     * cacerts.pem file installed with the IR.
     */
    @JsonProperty(value = "typeProperties.trustedCertPath")
    private Object trustedCertPath;

    /*
     * Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     */
    @JsonProperty(value = "typeProperties.useSystemTrustStore")
    private Object useSystemTrustStore;

    /*
     * Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value
     * is false.
     */
    @JsonProperty(value = "typeProperties.allowHostNameCNMismatch")
    private Object allowHostnameCNMismatch;

    /*
     * Specifies whether to allow self-signed certificates from the server. The
     * default value is false.
     */
    @JsonProperty(value = "typeProperties.allowSelfSignedServerCert")
    private Object allowSelfSignedServerCert;

    /*
     * The local time zone used by the connection. Valid values for this option
     * are specified in the IANA Time Zone Database. The default value is the
     * system time zone.
     */
    @JsonProperty(value = "typeProperties.timeZoneID")
    private Object timeZoneId;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the host property: The IP address or host name of the Presto server. (i.e. 192.168.222.160).
     *
     * @return the host value.
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the host property: The IP address or host name of the Presto server. (i.e. 192.168.222.160).
     *
     * @param host the host value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the serverVersion property: The version of the Presto server. (i.e. 0.148-t).
     *
     * @return the serverVersion value.
     */
    public Object serverVersion() {
        return this.serverVersion;
    }

    /**
     * Set the serverVersion property: The version of the Presto server. (i.e. 0.148-t).
     *
     * @param serverVersion the serverVersion value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService withServerVersion(Object serverVersion) {
        this.serverVersion = serverVersion;
        return this;
    }

    /**
     * Get the catalog property: The catalog context for all request against the server.
     *
     * @return the catalog value.
     */
    public Object catalog() {
        return this.catalog;
    }

    /**
     * Set the catalog property: The catalog context for all request against the server.
     *
     * @param catalog the catalog value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService withCatalog(Object catalog) {
        this.catalog = catalog;
        return this;
    }

    /**
     * Get the port property: The TCP port that the Presto server uses to listen for client connections. The default
     * value is 8080.
     *
     * @return the port value.
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port that the Presto server uses to listen for client connections. The default
     * value is 8080.
     *
     * @param port the port value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication mechanism used to connect to the Presto server.
     *
     * @return the authenticationType value.
     */
    public PrestoAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication mechanism used to connect to the Presto server.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService withAuthenticationType(PrestoAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: The user name used to connect to the Presto server.
     *
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: The user name used to connect to the Presto server.
     *
     * @param username the username value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password corresponding to the user name.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: The password corresponding to the user name.
     *
     * @param password the password value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false.
     *
     * @return the enableSsl value.
     */
    public Object enableSsl() {
        return this.enableSsl;
    }

    /**
     * Set the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false.
     *
     * @param enableSsl the enableSsl value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService withEnableSsl(Object enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Get the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR.
     *
     * @return the trustedCertPath value.
     */
    public Object trustedCertPath() {
        return this.trustedCertPath;
    }

    /**
     * Set the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR.
     *
     * @param trustedCertPath the trustedCertPath value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService withTrustedCertPath(Object trustedCertPath) {
        this.trustedCertPath = trustedCertPath;
        return this;
    }

    /**
     * Get the useSystemTrustStore property: Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     *
     * @return the useSystemTrustStore value.
     */
    public Object useSystemTrustStore() {
        return this.useSystemTrustStore;
    }

    /**
     * Set the useSystemTrustStore property: Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     *
     * @param useSystemTrustStore the useSystemTrustStore value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService withUseSystemTrustStore(Object useSystemTrustStore) {
        this.useSystemTrustStore = useSystemTrustStore;
        return this;
    }

    /**
     * Get the allowHostnameCNMismatch property: Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value is false.
     *
     * @return the allowHostnameCNMismatch value.
     */
    public Object allowHostnameCNMismatch() {
        return this.allowHostnameCNMismatch;
    }

    /**
     * Set the allowHostnameCNMismatch property: Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value is false.
     *
     * @param allowHostnameCNMismatch the allowHostnameCNMismatch value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService withAllowHostnameCNMismatch(Object allowHostnameCNMismatch) {
        this.allowHostnameCNMismatch = allowHostnameCNMismatch;
        return this;
    }

    /**
     * Get the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false.
     *
     * @return the allowSelfSignedServerCert value.
     */
    public Object allowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert;
    }

    /**
     * Set the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false.
     *
     * @param allowSelfSignedServerCert the allowSelfSignedServerCert value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService withAllowSelfSignedServerCert(Object allowSelfSignedServerCert) {
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        return this;
    }

    /**
     * Get the timeZoneId property: The local time zone used by the connection. Valid values for this option are
     * specified in the IANA Time Zone Database. The default value is the system time zone.
     *
     * @return the timeZoneId value.
     */
    public Object timeZoneId() {
        return this.timeZoneId;
    }

    /**
     * Set the timeZoneId property: The local time zone used by the connection. Valid values for this option are
     * specified in the IANA Time Zone Database. The default value is the system time zone.
     *
     * @param timeZoneId the timeZoneId value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService withTimeZoneId(Object timeZoneId) {
        this.timeZoneId = timeZoneId;
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
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PrestoLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PrestoLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PrestoLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PrestoLinkedService withAnnotations(List<Object> annotations) {
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
        if (host() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property host in model PrestoLinkedService"));
        }
        if (serverVersion() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property serverVersion in model PrestoLinkedService"));
        }
        if (catalog() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property catalog in model PrestoLinkedService"));
        }
        if (authenticationType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property authenticationType in model PrestoLinkedService"));
        }
        if (password() != null) {
            password().validate();
        }
    }
}
