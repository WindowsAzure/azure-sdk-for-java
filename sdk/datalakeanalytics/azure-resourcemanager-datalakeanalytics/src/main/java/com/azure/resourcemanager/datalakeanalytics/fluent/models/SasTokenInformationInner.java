// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SAS token information. */
@Immutable
public final class SasTokenInformationInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SasTokenInformationInner.class);

    /*
     * The access token for the associated Azure Storage Container.
     */
    @JsonProperty(value = "accessToken", access = JsonProperty.Access.WRITE_ONLY)
    private String accessToken;

    /**
     * Get the accessToken property: The access token for the associated Azure Storage Container.
     *
     * @return the accessToken value.
     */
    public String accessToken() {
        return this.accessToken;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
