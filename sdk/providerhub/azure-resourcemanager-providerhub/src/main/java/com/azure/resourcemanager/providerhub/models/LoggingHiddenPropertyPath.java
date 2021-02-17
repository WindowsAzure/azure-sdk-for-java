// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The LoggingHiddenPropertyPath model. */
@Fluent
public class LoggingHiddenPropertyPath {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LoggingHiddenPropertyPath.class);

    /*
     * The hiddenPathsOnRequest property.
     */
    @JsonProperty(value = "hiddenPathsOnRequest")
    private List<String> hiddenPathsOnRequest;

    /*
     * The hiddenPathsOnResponse property.
     */
    @JsonProperty(value = "hiddenPathsOnResponse")
    private List<String> hiddenPathsOnResponse;

    /**
     * Get the hiddenPathsOnRequest property: The hiddenPathsOnRequest property.
     *
     * @return the hiddenPathsOnRequest value.
     */
    public List<String> hiddenPathsOnRequest() {
        return this.hiddenPathsOnRequest;
    }

    /**
     * Set the hiddenPathsOnRequest property: The hiddenPathsOnRequest property.
     *
     * @param hiddenPathsOnRequest the hiddenPathsOnRequest value to set.
     * @return the LoggingHiddenPropertyPath object itself.
     */
    public LoggingHiddenPropertyPath withHiddenPathsOnRequest(List<String> hiddenPathsOnRequest) {
        this.hiddenPathsOnRequest = hiddenPathsOnRequest;
        return this;
    }

    /**
     * Get the hiddenPathsOnResponse property: The hiddenPathsOnResponse property.
     *
     * @return the hiddenPathsOnResponse value.
     */
    public List<String> hiddenPathsOnResponse() {
        return this.hiddenPathsOnResponse;
    }

    /**
     * Set the hiddenPathsOnResponse property: The hiddenPathsOnResponse property.
     *
     * @param hiddenPathsOnResponse the hiddenPathsOnResponse value to set.
     * @return the LoggingHiddenPropertyPath object itself.
     */
    public LoggingHiddenPropertyPath withHiddenPathsOnResponse(List<String> hiddenPathsOnResponse) {
        this.hiddenPathsOnResponse = hiddenPathsOnResponse;
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
