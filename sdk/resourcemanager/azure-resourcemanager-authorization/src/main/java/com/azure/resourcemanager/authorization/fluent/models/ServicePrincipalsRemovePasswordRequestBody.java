// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/** The ServicePrincipalsRemovePasswordRequestBody model. */
@Fluent
public final class ServicePrincipalsRemovePasswordRequestBody {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServicePrincipalsRemovePasswordRequestBody.class);

    /*
     * The keyId property.
     */
    @JsonProperty(value = "keyId")
    private UUID keyId;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the keyId property: The keyId property.
     *
     * @return the keyId value.
     */
    public UUID keyId() {
        return this.keyId;
    }

    /**
     * Set the keyId property: The keyId property.
     *
     * @param keyId the keyId value to set.
     * @return the ServicePrincipalsRemovePasswordRequestBody object itself.
     */
    public ServicePrincipalsRemovePasswordRequestBody withKeyId(UUID keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Get the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ServicePrincipalsRemovePasswordRequestBody object itself.
     */
    public ServicePrincipalsRemovePasswordRequestBody withAdditionalProperties(
        Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
