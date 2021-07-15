// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.models.IotAlertModelInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of IoT alerts. */
@Immutable
public final class IotAlertListModel {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotAlertListModel.class);

    /*
     * List data
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<IotAlertModelInner> value;

    /*
     * When available, follow the URI to get the next page of data
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List data.
     *
     * @return the value value.
     */
    public List<IotAlertModelInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: When available, follow the URI to get the next page of data.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
