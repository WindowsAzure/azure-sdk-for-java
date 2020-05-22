// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The UserArtifactSource model. */
@Fluent
public final class UserArtifactSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserArtifactSource.class);

    /*
     * Required. The fileName of the artifact.
     */
    @JsonProperty(value = "fileName", required = true)
    private String fileName;

    /*
     * Required. The mediaLink of the artifact, must be a readable storage
     * blob.
     */
    @JsonProperty(value = "mediaLink", required = true)
    private String mediaLink;

    /**
     * Get the fileName property: Required. The fileName of the artifact.
     *
     * @return the fileName value.
     */
    public String fileName() {
        return this.fileName;
    }

    /**
     * Set the fileName property: Required. The fileName of the artifact.
     *
     * @param fileName the fileName value to set.
     * @return the UserArtifactSource object itself.
     */
    public UserArtifactSource withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the mediaLink property: Required. The mediaLink of the artifact, must be a readable storage blob.
     *
     * @return the mediaLink value.
     */
    public String mediaLink() {
        return this.mediaLink;
    }

    /**
     * Set the mediaLink property: Required. The mediaLink of the artifact, must be a readable storage blob.
     *
     * @param mediaLink the mediaLink value to set.
     * @return the UserArtifactSource object itself.
     */
    public UserArtifactSource withMediaLink(String mediaLink) {
        this.mediaLink = mediaLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (fileName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property fileName in model UserArtifactSource"));
        }
        if (mediaLink() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property mediaLink in model UserArtifactSource"));
        }
    }
}
