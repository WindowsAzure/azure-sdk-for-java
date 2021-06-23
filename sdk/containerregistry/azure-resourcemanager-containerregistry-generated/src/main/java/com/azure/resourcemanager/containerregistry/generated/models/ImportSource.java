// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ImportSource model. */
@Fluent
public final class ImportSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImportSource.class);

    /*
     * The resource identifier of the source Azure Container Registry.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * The address of the source registry (e.g. 'mcr.microsoft.com').
     */
    @JsonProperty(value = "registryUri")
    private String registryUri;

    /*
     * Credentials used when importing from a registry uri.
     */
    @JsonProperty(value = "credentials")
    private ImportSourceCredentials credentials;

    /*
     * Repository name of the source image.
     * Specify an image by repository ('hello-world'). This will use the
     * 'latest' tag.
     * Specify an image by tag ('hello-world:latest').
     * Specify an image by sha256-based manifest digest
     * ('hello-world@sha256:abc123').
     */
    @JsonProperty(value = "sourceImage", required = true)
    private String sourceImage;

    /**
     * Get the resourceId property: The resource identifier of the source Azure Container Registry.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The resource identifier of the source Azure Container Registry.
     *
     * @param resourceId the resourceId value to set.
     * @return the ImportSource object itself.
     */
    public ImportSource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the registryUri property: The address of the source registry (e.g. 'mcr.microsoft.com').
     *
     * @return the registryUri value.
     */
    public String registryUri() {
        return this.registryUri;
    }

    /**
     * Set the registryUri property: The address of the source registry (e.g. 'mcr.microsoft.com').
     *
     * @param registryUri the registryUri value to set.
     * @return the ImportSource object itself.
     */
    public ImportSource withRegistryUri(String registryUri) {
        this.registryUri = registryUri;
        return this;
    }

    /**
     * Get the credentials property: Credentials used when importing from a registry uri.
     *
     * @return the credentials value.
     */
    public ImportSourceCredentials credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: Credentials used when importing from a registry uri.
     *
     * @param credentials the credentials value to set.
     * @return the ImportSource object itself.
     */
    public ImportSource withCredentials(ImportSourceCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get the sourceImage property: Repository name of the source image. Specify an image by repository
     * ('hello-world'). This will use the 'latest' tag. Specify an image by tag ('hello-world:latest'). Specify an image
     * by sha256-based manifest digest ('hello-world@sha256:abc123').
     *
     * @return the sourceImage value.
     */
    public String sourceImage() {
        return this.sourceImage;
    }

    /**
     * Set the sourceImage property: Repository name of the source image. Specify an image by repository
     * ('hello-world'). This will use the 'latest' tag. Specify an image by tag ('hello-world:latest'). Specify an image
     * by sha256-based manifest digest ('hello-world@sha256:abc123').
     *
     * @param sourceImage the sourceImage value to set.
     * @return the ImportSource object itself.
     */
    public ImportSource withSourceImage(String sourceImage) {
        this.sourceImage = sourceImage;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (credentials() != null) {
            credentials().validate();
        }
        if (sourceImage() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sourceImage in model ImportSource"));
        }
    }
}
