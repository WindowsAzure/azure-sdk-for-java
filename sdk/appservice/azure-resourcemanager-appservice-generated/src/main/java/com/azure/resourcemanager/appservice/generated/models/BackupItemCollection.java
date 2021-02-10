// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.fluent.models.BackupItemInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Collection of backup items. */
@Fluent
public final class BackupItemCollection {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupItemCollection.class);

    /*
     * Collection of resources.
     */
    @JsonProperty(value = "value", required = true)
    private List<BackupItemInner> value;

    /*
     * Link to next page of resources.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: Collection of resources.
     *
     * @return the value value.
     */
    public List<BackupItemInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of resources.
     *
     * @param value the value value to set.
     * @return the BackupItemCollection object itself.
     */
    public BackupItemCollection withValue(List<BackupItemInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to next page of resources.
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
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model BackupItemCollection"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
