// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.network.ServiceTagInformation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ServiceTagsListResult model. */
@Immutable
public final class ServiceTagsListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceTagsListResultInner.class);

    /*
     * The name of the cloud.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The ID of the cloud.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The azure resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The iteration number.
     */
    @JsonProperty(value = "changeNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String changeNumber;

    /*
     * The name of the cloud.
     */
    @JsonProperty(value = "cloud", access = JsonProperty.Access.WRITE_ONLY)
    private String cloud;

    /*
     * The list of service tag information resources.
     */
    @JsonProperty(value = "values", access = JsonProperty.Access.WRITE_ONLY)
    private List<ServiceTagInformation> values;

    /**
     * Get the name property: The name of the cloud.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: The ID of the cloud.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the type property: The azure resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the changeNumber property: The iteration number.
     *
     * @return the changeNumber value.
     */
    public String changeNumber() {
        return this.changeNumber;
    }

    /**
     * Get the cloud property: The name of the cloud.
     *
     * @return the cloud value.
     */
    public String cloud() {
        return this.cloud;
    }

    /**
     * Get the values property: The list of service tag information resources.
     *
     * @return the values value.
     */
    public List<ServiceTagInformation> values() {
        return this.values;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (values() != null) {
            values().forEach(e -> e.validate());
        }
    }
}
