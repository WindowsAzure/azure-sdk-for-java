// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 * Specifies an OAuth 2.0 permission scope or an app role that an application requires. The resourceAccess property of
 * the RequiredResourceAccess type is a collection of ResourceAccess.
 */
@Fluent
public final class ResourceAccess {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceAccess.class);

    /*
     * The unique identifier for one of the OAuth2Permission or AppRole
     * instances that the resource application exposes.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Specifies whether the id property references an OAuth2Permission or an
     * AppRole. Possible values are "scope" or "role".
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Specifies an OAuth 2.0 permission scope or an app role that an
     * application requires. The resourceAccess property of the
     * RequiredResourceAccess type is a collection of ResourceAccess.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the id property: The unique identifier for one of the OAuth2Permission or AppRole instances that the resource
     * application exposes.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The unique identifier for one of the OAuth2Permission or AppRole instances that the resource
     * application exposes.
     *
     * @param id the id value to set.
     * @return the ResourceAccess object itself.
     */
    public ResourceAccess withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: Specifies whether the id property references an OAuth2Permission or an AppRole. Possible
     * values are "scope" or "role".
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Specifies whether the id property references an OAuth2Permission or an AppRole. Possible
     * values are "scope" or "role".
     *
     * @param type the type value to set.
     * @return the ResourceAccess object itself.
     */
    public ResourceAccess withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the additionalProperties property: Specifies an OAuth 2.0 permission scope or an app role that an application
     * requires. The resourceAccess property of the RequiredResourceAccess type is a collection of ResourceAccess.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Specifies an OAuth 2.0 permission scope or an app role that an application
     * requires. The resourceAccess property of the RequiredResourceAccess type is a collection of ResourceAccess.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ResourceAccess object itself.
     */
    public ResourceAccess withAdditionalProperties(Map<String, Object> additionalProperties) {
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
        if (id() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model ResourceAccess"));
        }
    }
}
