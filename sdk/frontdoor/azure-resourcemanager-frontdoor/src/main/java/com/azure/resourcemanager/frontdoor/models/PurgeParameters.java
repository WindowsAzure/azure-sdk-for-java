// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Parameters required for content purge. */
@Fluent
public final class PurgeParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PurgeParameters.class);

    /*
     * The path to the content to be purged. Can describe a file path or a wild
     * card directory.
     */
    @JsonProperty(value = "contentPaths", required = true)
    private List<String> contentPaths;

    /**
     * Get the contentPaths property: The path to the content to be purged. Can describe a file path or a wild card
     * directory.
     *
     * @return the contentPaths value.
     */
    public List<String> contentPaths() {
        return this.contentPaths;
    }

    /**
     * Set the contentPaths property: The path to the content to be purged. Can describe a file path or a wild card
     * directory.
     *
     * @param contentPaths the contentPaths value to set.
     * @return the PurgeParameters object itself.
     */
    public PurgeParameters withContentPaths(List<String> contentPaths) {
        this.contentPaths = contentPaths;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (contentPaths() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property contentPaths in model PurgeParameters"));
        }
    }
}
