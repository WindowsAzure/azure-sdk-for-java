// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the properties of a secret object value. */
@Fluent
public final class SecretObject {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecretObject.class);

    /*
     * The value of the secret. The format of this value will be determined
     * based on the type of the secret object. If the type is Opaque, the value
     * will be
     * used as is without any modification.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * The type of the secret object which determines how the value of the
     * secret object has to be
     * interpreted.
     */
    @JsonProperty(value = "type")
    private SecretObjectType type;

    /**
     * Get the value property: The value of the secret. The format of this value will be determined based on the type of
     * the secret object. If the type is Opaque, the value will be used as is without any modification.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value of the secret. The format of this value will be determined based on the type of
     * the secret object. If the type is Opaque, the value will be used as is without any modification.
     *
     * @param value the value value to set.
     * @return the SecretObject object itself.
     */
    public SecretObject withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the type property: The type of the secret object which determines how the value of the secret object has to
     * be interpreted.
     *
     * @return the type value.
     */
    public SecretObjectType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the secret object which determines how the value of the secret object has to
     * be interpreted.
     *
     * @param type the type value to set.
     * @return the SecretObject object itself.
     */
    public SecretObject withType(SecretObjectType type) {
        this.type = type;
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
