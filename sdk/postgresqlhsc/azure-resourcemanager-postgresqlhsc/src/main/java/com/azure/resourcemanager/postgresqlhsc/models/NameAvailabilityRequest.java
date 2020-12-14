// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlhsc.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request from client to check resource name availability. */
@Fluent
public final class NameAvailabilityRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NameAvailabilityRequest.class);

    /*
     * Resource name to verify.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Resource type used for verification.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /** Creates an instance of NameAvailabilityRequest class. */
    public NameAvailabilityRequest() {
        type = "Microsoft.DBforPostgreSQL/serverGroupsv2";
    }

    /**
     * Get the name property: Resource name to verify.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource name to verify.
     *
     * @param name the name value to set.
     * @return the NameAvailabilityRequest object itself.
     */
    public NameAvailabilityRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type used for verification.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Resource type used for verification.
     *
     * @param type the type value to set.
     * @return the NameAvailabilityRequest object itself.
     */
    public NameAvailabilityRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model NameAvailabilityRequest"));
        }
    }
}
