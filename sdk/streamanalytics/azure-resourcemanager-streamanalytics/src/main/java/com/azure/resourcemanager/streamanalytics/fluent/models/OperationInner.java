// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.streamanalytics.models.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A Stream Analytics REST API operation. */
@Immutable
public final class OperationInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationInner.class);

    /*
     * The name of the operation being performed on this particular object.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Contains the localized display information for this particular operation
     * / action.
     */
    @JsonProperty(value = "display", access = JsonProperty.Access.WRITE_ONLY)
    private OperationDisplay display;

    /**
     * Get the name property: The name of the operation being performed on this particular object.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the display property: Contains the localized display information for this particular operation / action.
     *
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }
}
