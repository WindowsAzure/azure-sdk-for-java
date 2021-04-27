// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about docker image for the job. */
@Fluent
public final class ImageSourceRegistry {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImageSourceRegistry.class);

    /*
     * URL for image repository.
     */
    @JsonProperty(value = "serverUrl")
    private String serverUrl;

    /*
     * The name of the image in the image repository.
     */
    @JsonProperty(value = "image", required = true)
    private String image;

    /*
     * Credentials to access the private docker repository.
     */
    @JsonProperty(value = "credentials")
    private PrivateRegistryCredentials credentials;

    /**
     * Get the serverUrl property: URL for image repository.
     *
     * @return the serverUrl value.
     */
    public String serverUrl() {
        return this.serverUrl;
    }

    /**
     * Set the serverUrl property: URL for image repository.
     *
     * @param serverUrl the serverUrl value to set.
     * @return the ImageSourceRegistry object itself.
     */
    public ImageSourceRegistry withServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }

    /**
     * Get the image property: The name of the image in the image repository.
     *
     * @return the image value.
     */
    public String image() {
        return this.image;
    }

    /**
     * Set the image property: The name of the image in the image repository.
     *
     * @param image the image value to set.
     * @return the ImageSourceRegistry object itself.
     */
    public ImageSourceRegistry withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * Get the credentials property: Credentials to access the private docker repository.
     *
     * @return the credentials value.
     */
    public PrivateRegistryCredentials credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: Credentials to access the private docker repository.
     *
     * @param credentials the credentials value to set.
     * @return the ImageSourceRegistry object itself.
     */
    public ImageSourceRegistry withCredentials(PrivateRegistryCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (image() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property image in model ImageSourceRegistry"));
        }
        if (credentials() != null) {
            credentials().validate();
        }
    }
}
