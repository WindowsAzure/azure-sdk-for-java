// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Eloqua server linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Eloqua")
@JsonFlatten
@Fluent
public class EloquaLinkedService extends LinkedService {
    /*
     * The endpoint of the Eloqua server. (i.e. eloqua.example.com)
     */
    @JsonProperty(value = "typeProperties.endpoint", required = true)
    private Object endpoint;

    /*
     * The site name and user name of your Eloqua account in the form:
     * sitename/username. (i.e. Eloqua/Alice)
     */
    @JsonProperty(value = "typeProperties.username", required = true)
    private Object username;

    /*
     * The password corresponding to the user name.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

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
     * Get the endpoint property: The endpoint of the Eloqua server. (i.e. eloqua.example.com).
     *
     * @return the endpoint value.
     */
    public Object getEndpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: The endpoint of the Eloqua server. (i.e. eloqua.example.com).
     *
     * @param endpoint the endpoint value to set.
     * @return the EloquaLinkedService object itself.
     */
    public EloquaLinkedService setEndpoint(Object endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the username property: The site name and user name of your Eloqua account in the form: sitename/username.
     * (i.e. Eloqua/Alice).
     *
     * @return the username value.
     */
    public Object getUsername() {
        return this.username;
    }

    /**
     * Set the username property: The site name and user name of your Eloqua account in the form: sitename/username.
     * (i.e. Eloqua/Alice).
     *
     * @param username the username value to set.
     * @return the EloquaLinkedService object itself.
     */
    public EloquaLinkedService setUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password corresponding to the user name.
     *
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The password corresponding to the user name.
     *
     * @param password the password value to set.
     * @return the EloquaLinkedService object itself.
     */
    public EloquaLinkedService setPassword(SecretBase password) {
        this.password = password;
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
     * @return the EloquaLinkedService object itself.
     */
    public EloquaLinkedService setUseEncryptedEndpoints(Object useEncryptedEndpoints) {
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
     * @return the EloquaLinkedService object itself.
     */
    public EloquaLinkedService setUseHostVerification(Object useHostVerification) {
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
     * @return the EloquaLinkedService object itself.
     */
    public EloquaLinkedService setUsePeerVerification(Object usePeerVerification) {
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
     * @return the EloquaLinkedService object itself.
     */
    public EloquaLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}
