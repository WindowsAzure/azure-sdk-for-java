/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about docker image for the job.
 */
public class ImageSourceRegistry {
    /**
     * Server URL.
     * URL for image repository.
     */
    @JsonProperty(value = "serverUrl")
    private String serverUrl;

    /**
     * Image.
     * The name of the image in the image repository.
     */
    @JsonProperty(value = "image", required = true)
    private String image;

    /**
     * Credentials.
     * Credentials to access the private docker repository.
     */
    @JsonProperty(value = "credentials")
    private PrivateRegistryCredentials credentials;

    /**
     * Get uRL for image repository.
     *
     * @return the serverUrl value
     */
    public String serverUrl() {
        return this.serverUrl;
    }

    /**
     * Set uRL for image repository.
     *
     * @param serverUrl the serverUrl value to set
     * @return the ImageSourceRegistry object itself.
     */
    public ImageSourceRegistry withServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }

    /**
     * Get the name of the image in the image repository.
     *
     * @return the image value
     */
    public String image() {
        return this.image;
    }

    /**
     * Set the name of the image in the image repository.
     *
     * @param image the image value to set
     * @return the ImageSourceRegistry object itself.
     */
    public ImageSourceRegistry withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * Get credentials to access the private docker repository.
     *
     * @return the credentials value
     */
    public PrivateRegistryCredentials credentials() {
        return this.credentials;
    }

    /**
     * Set credentials to access the private docker repository.
     *
     * @param credentials the credentials value to set
     * @return the ImageSourceRegistry object itself.
     */
    public ImageSourceRegistry withCredentials(PrivateRegistryCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

}
