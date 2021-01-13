// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Resume job params. */
@Fluent
public final class ResumeJobParams {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResumeJobParams.class);

    /*
     * Resume job properties.
     */
    @JsonProperty(value = "properties")
    private ResumeJobParamsProperties properties;

    /**
     * Get the properties property: Resume job properties.
     *
     * @return the properties value.
     */
    public ResumeJobParamsProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Resume job properties.
     *
     * @param properties the properties value to set.
     * @return the ResumeJobParams object itself.
     */
    public ResumeJobParams withProperties(ResumeJobParamsProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
