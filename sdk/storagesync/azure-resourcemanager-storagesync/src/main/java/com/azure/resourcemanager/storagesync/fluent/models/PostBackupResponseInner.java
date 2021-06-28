// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Post Backup Response. */
@JsonFlatten
@Immutable
public class PostBackupResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PostBackupResponseInner.class);

    /*
     * cloud endpoint Name.
     */
    @JsonProperty(value = "backupMetadata.cloudEndpointName", access = JsonProperty.Access.WRITE_ONLY)
    private String cloudEndpointName;

    /**
     * Get the cloudEndpointName property: cloud endpoint Name.
     *
     * @return the cloudEndpointName value.
     */
    public String cloudEndpointName() {
        return this.cloudEndpointName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
