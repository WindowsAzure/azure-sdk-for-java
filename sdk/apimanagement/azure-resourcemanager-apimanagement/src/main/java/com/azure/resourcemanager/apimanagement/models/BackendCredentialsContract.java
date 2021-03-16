// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Details of the Credentials used to connect to Backend. */
@Fluent
public final class BackendCredentialsContract {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackendCredentialsContract.class);

    /*
     * List of Client Certificate Ids.
     */
    @JsonProperty(value = "certificateIds")
    private List<String> certificateIds;

    /*
     * List of Client Certificate Thumbprints. Will be ignored if
     * certificatesIds are provided.
     */
    @JsonProperty(value = "certificate")
    private List<String> certificate;

    /*
     * Query Parameter description.
     */
    @JsonProperty(value = "query")
    private Map<String, List<String>> query;

    /*
     * Header Parameter description.
     */
    @JsonProperty(value = "header")
    private Map<String, List<String>> headerProperty;

    /*
     * Authorization header authentication
     */
    @JsonProperty(value = "authorization")
    private BackendAuthorizationHeaderCredentials authorization;

    /**
     * Get the certificateIds property: List of Client Certificate Ids.
     *
     * @return the certificateIds value.
     */
    public List<String> certificateIds() {
        return this.certificateIds;
    }

    /**
     * Set the certificateIds property: List of Client Certificate Ids.
     *
     * @param certificateIds the certificateIds value to set.
     * @return the BackendCredentialsContract object itself.
     */
    public BackendCredentialsContract withCertificateIds(List<String> certificateIds) {
        this.certificateIds = certificateIds;
        return this;
    }

    /**
     * Get the certificate property: List of Client Certificate Thumbprints. Will be ignored if certificatesIds are
     * provided.
     *
     * @return the certificate value.
     */
    public List<String> certificate() {
        return this.certificate;
    }

    /**
     * Set the certificate property: List of Client Certificate Thumbprints. Will be ignored if certificatesIds are
     * provided.
     *
     * @param certificate the certificate value to set.
     * @return the BackendCredentialsContract object itself.
     */
    public BackendCredentialsContract withCertificate(List<String> certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Get the query property: Query Parameter description.
     *
     * @return the query value.
     */
    public Map<String, List<String>> query() {
        return this.query;
    }

    /**
     * Set the query property: Query Parameter description.
     *
     * @param query the query value to set.
     * @return the BackendCredentialsContract object itself.
     */
    public BackendCredentialsContract withQuery(Map<String, List<String>> query) {
        this.query = query;
        return this;
    }

    /**
     * Get the headerProperty property: Header Parameter description.
     *
     * @return the headerProperty value.
     */
    public Map<String, List<String>> headerProperty() {
        return this.headerProperty;
    }

    /**
     * Set the headerProperty property: Header Parameter description.
     *
     * @param headerProperty the headerProperty value to set.
     * @return the BackendCredentialsContract object itself.
     */
    public BackendCredentialsContract withHeaderProperty(Map<String, List<String>> headerProperty) {
        this.headerProperty = headerProperty;
        return this;
    }

    /**
     * Get the authorization property: Authorization header authentication.
     *
     * @return the authorization value.
     */
    public BackendAuthorizationHeaderCredentials authorization() {
        return this.authorization;
    }

    /**
     * Set the authorization property: Authorization header authentication.
     *
     * @param authorization the authorization value to set.
     * @return the BackendCredentialsContract object itself.
     */
    public BackendCredentialsContract withAuthorization(BackendAuthorizationHeaderCredentials authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (authorization() != null) {
            authorization().validate();
        }
    }
}
