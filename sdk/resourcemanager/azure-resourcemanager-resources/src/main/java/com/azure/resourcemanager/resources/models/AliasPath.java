// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AliasPath model. */
@Fluent
public final class AliasPath {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AliasPath.class);

    /*
     * The path of an alias.
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * The API versions.
     */
    @JsonProperty(value = "apiVersions")
    private List<String> apiVersions;

    /*
     * The pattern for an alias path.
     */
    @JsonProperty(value = "pattern")
    private AliasPattern pattern;

    /**
     * Get the path property: The path of an alias.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path of an alias.
     *
     * @param path the path value to set.
     * @return the AliasPath object itself.
     */
    public AliasPath withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the apiVersions property: The API versions.
     *
     * @return the apiVersions value.
     */
    public List<String> apiVersions() {
        return this.apiVersions;
    }

    /**
     * Set the apiVersions property: The API versions.
     *
     * @param apiVersions the apiVersions value to set.
     * @return the AliasPath object itself.
     */
    public AliasPath withApiVersions(List<String> apiVersions) {
        this.apiVersions = apiVersions;
        return this;
    }

    /**
     * Get the pattern property: The pattern for an alias path.
     *
     * @return the pattern value.
     */
    public AliasPattern pattern() {
        return this.pattern;
    }

    /**
     * Set the pattern property: The pattern for an alias path.
     *
     * @param pattern the pattern value to set.
     * @return the AliasPath object itself.
     */
    public AliasPath withPattern(AliasPattern pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pattern() != null) {
            pattern().validate();
        }
    }
}
