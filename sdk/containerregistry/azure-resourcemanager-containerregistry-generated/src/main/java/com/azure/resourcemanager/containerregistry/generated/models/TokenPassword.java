// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The password that will be used for authenticating the token of a container registry. */
@Fluent
public final class TokenPassword {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TokenPassword.class);

    /*
     * The creation datetime of the password.
     */
    @JsonProperty(value = "creationTime")
    private OffsetDateTime creationTime;

    /*
     * The expiry datetime of the password.
     */
    @JsonProperty(value = "expiry")
    private OffsetDateTime expiry;

    /*
     * The password name "password1" or "password2"
     */
    @JsonProperty(value = "name")
    private TokenPasswordName name;

    /*
     * The password value.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * Get the creationTime property: The creation datetime of the password.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime property: The creation datetime of the password.
     *
     * @param creationTime the creationTime value to set.
     * @return the TokenPassword object itself.
     */
    public TokenPassword withCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the expiry property: The expiry datetime of the password.
     *
     * @return the expiry value.
     */
    public OffsetDateTime expiry() {
        return this.expiry;
    }

    /**
     * Set the expiry property: The expiry datetime of the password.
     *
     * @param expiry the expiry value to set.
     * @return the TokenPassword object itself.
     */
    public TokenPassword withExpiry(OffsetDateTime expiry) {
        this.expiry = expiry;
        return this;
    }

    /**
     * Get the name property: The password name "password1" or "password2".
     *
     * @return the name value.
     */
    public TokenPasswordName name() {
        return this.name;
    }

    /**
     * Set the name property: The password name "password1" or "password2".
     *
     * @param name the name value to set.
     * @return the TokenPassword object itself.
     */
    public TokenPassword withName(TokenPasswordName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The password value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
