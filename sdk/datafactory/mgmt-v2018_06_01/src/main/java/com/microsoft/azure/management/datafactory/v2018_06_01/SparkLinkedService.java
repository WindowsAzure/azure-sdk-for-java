/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.LinkedServiceInner;

/**
 * Spark Server linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = SparkLinkedService.class)
@JsonTypeName("Spark")
@JsonFlatten
public class SparkLinkedService extends LinkedServiceInner {
    /**
     * IP address or host name of the Spark server.
     */
    @JsonProperty(value = "typeProperties.host", required = true)
    private Object host;

    /**
     * The TCP port that the Spark server uses to listen for client
     * connections.
     */
    @JsonProperty(value = "typeProperties.port", required = true)
    private Object port;

    /**
     * The type of Spark server. Possible values include: 'SharkServer',
     * 'SharkServer2', 'SparkThriftServer'.
     */
    @JsonProperty(value = "typeProperties.serverType")
    private SparkServerType serverType;

    /**
     * The transport protocol to use in the Thrift layer. Possible values
     * include: 'Binary', 'SASL', 'HTTP '.
     */
    @JsonProperty(value = "typeProperties.thriftTransportProtocol")
    private SparkThriftTransportProtocol thriftTransportProtocol;

    /**
     * The authentication method used to access the Spark server. Possible
     * values include: 'Anonymous', 'Username', 'UsernameAndPassword',
     * 'WindowsAzureHDInsightService'.
     */
    @JsonProperty(value = "typeProperties.authenticationType", required = true)
    private SparkAuthenticationType authenticationType;

    /**
     * The user name that you use to access Spark Server.
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /**
     * The password corresponding to the user name that you provided in the
     * Username field.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * The partial URL corresponding to the Spark server.
     */
    @JsonProperty(value = "typeProperties.httpPath")
    private Object httpPath;

    /**
     * Specifies whether the connections to the server are encrypted using SSL.
     * The default value is false.
     */
    @JsonProperty(value = "typeProperties.enableSsl")
    private Object enableSsl;

    /**
     * The full path of the .pem file containing trusted CA certificates for
     * verifying the server when connecting over SSL. This property can only be
     * set when using SSL on self-hosted IR. The default value is the
     * cacerts.pem file installed with the IR.
     */
    @JsonProperty(value = "typeProperties.trustedCertPath")
    private Object trustedCertPath;

    /**
     * Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     */
    @JsonProperty(value = "typeProperties.useSystemTrustStore")
    private Object useSystemTrustStore;

    /**
     * Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value
     * is false.
     */
    @JsonProperty(value = "typeProperties.allowHostNameCNMismatch")
    private Object allowHostNameCNMismatch;

    /**
     * Specifies whether to allow self-signed certificates from the server. The
     * default value is false.
     */
    @JsonProperty(value = "typeProperties.allowSelfSignedServerCert")
    private Object allowSelfSignedServerCert;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get iP address or host name of the Spark server.
     *
     * @return the host value
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set iP address or host name of the Spark server.
     *
     * @param host the host value to set
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the TCP port that the Spark server uses to listen for client connections.
     *
     * @return the port value
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the TCP port that the Spark server uses to listen for client connections.
     *
     * @param port the port value to set
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the type of Spark server. Possible values include: 'SharkServer', 'SharkServer2', 'SparkThriftServer'.
     *
     * @return the serverType value
     */
    public SparkServerType serverType() {
        return this.serverType;
    }

    /**
     * Set the type of Spark server. Possible values include: 'SharkServer', 'SharkServer2', 'SparkThriftServer'.
     *
     * @param serverType the serverType value to set
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withServerType(SparkServerType serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * Get the transport protocol to use in the Thrift layer. Possible values include: 'Binary', 'SASL', 'HTTP '.
     *
     * @return the thriftTransportProtocol value
     */
    public SparkThriftTransportProtocol thriftTransportProtocol() {
        return this.thriftTransportProtocol;
    }

    /**
     * Set the transport protocol to use in the Thrift layer. Possible values include: 'Binary', 'SASL', 'HTTP '.
     *
     * @param thriftTransportProtocol the thriftTransportProtocol value to set
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withThriftTransportProtocol(SparkThriftTransportProtocol thriftTransportProtocol) {
        this.thriftTransportProtocol = thriftTransportProtocol;
        return this;
    }

    /**
     * Get the authentication method used to access the Spark server. Possible values include: 'Anonymous', 'Username', 'UsernameAndPassword', 'WindowsAzureHDInsightService'.
     *
     * @return the authenticationType value
     */
    public SparkAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authentication method used to access the Spark server. Possible values include: 'Anonymous', 'Username', 'UsernameAndPassword', 'WindowsAzureHDInsightService'.
     *
     * @param authenticationType the authenticationType value to set
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withAuthenticationType(SparkAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the user name that you use to access Spark Server.
     *
     * @return the username value
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the user name that you use to access Spark Server.
     *
     * @param username the username value to set
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password corresponding to the user name that you provided in the Username field.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password corresponding to the user name that you provided in the Username field.
     *
     * @param password the password value to set
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the partial URL corresponding to the Spark server.
     *
     * @return the httpPath value
     */
    public Object httpPath() {
        return this.httpPath;
    }

    /**
     * Set the partial URL corresponding to the Spark server.
     *
     * @param httpPath the httpPath value to set
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withHttpPath(Object httpPath) {
        this.httpPath = httpPath;
        return this;
    }

    /**
     * Get specifies whether the connections to the server are encrypted using SSL. The default value is false.
     *
     * @return the enableSsl value
     */
    public Object enableSsl() {
        return this.enableSsl;
    }

    /**
     * Set specifies whether the connections to the server are encrypted using SSL. The default value is false.
     *
     * @param enableSsl the enableSsl value to set
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withEnableSsl(Object enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Get the full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     *
     * @return the trustedCertPath value
     */
    public Object trustedCertPath() {
        return this.trustedCertPath;
    }

    /**
     * Set the full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     *
     * @param trustedCertPath the trustedCertPath value to set
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withTrustedCertPath(Object trustedCertPath) {
        this.trustedCertPath = trustedCertPath;
        return this;
    }

    /**
     * Get specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     *
     * @return the useSystemTrustStore value
     */
    public Object useSystemTrustStore() {
        return this.useSystemTrustStore;
    }

    /**
     * Set specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     *
     * @param useSystemTrustStore the useSystemTrustStore value to set
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withUseSystemTrustStore(Object useSystemTrustStore) {
        this.useSystemTrustStore = useSystemTrustStore;
        return this;
    }

    /**
     * Get specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     *
     * @return the allowHostNameCNMismatch value
     */
    public Object allowHostNameCNMismatch() {
        return this.allowHostNameCNMismatch;
    }

    /**
     * Set specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     *
     * @param allowHostNameCNMismatch the allowHostNameCNMismatch value to set
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withAllowHostNameCNMismatch(Object allowHostNameCNMismatch) {
        this.allowHostNameCNMismatch = allowHostNameCNMismatch;
        return this;
    }

    /**
     * Get specifies whether to allow self-signed certificates from the server. The default value is false.
     *
     * @return the allowSelfSignedServerCert value
     */
    public Object allowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert;
    }

    /**
     * Set specifies whether to allow self-signed certificates from the server. The default value is false.
     *
     * @param allowSelfSignedServerCert the allowSelfSignedServerCert value to set
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withAllowSelfSignedServerCert(Object allowSelfSignedServerCert) {
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
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
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
