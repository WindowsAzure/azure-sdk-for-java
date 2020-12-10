// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Properties required to update a profile. */
@Fluent
public final class ProfileUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProfileUpdateParameters.class);

    /*
     * Profile tags
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the tags property: Profile tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Profile tags.
     *
     * @param tags the tags value to set.
     * @return the ProfileUpdateParameters object itself.
     */
    public ProfileUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
