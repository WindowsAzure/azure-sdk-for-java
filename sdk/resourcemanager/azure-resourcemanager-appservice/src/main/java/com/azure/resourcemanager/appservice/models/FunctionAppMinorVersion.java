// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Function App stack minor version. */
@Immutable
public final class FunctionAppMinorVersion {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FunctionAppMinorVersion.class);

    /*
     * Function App stack (display only).
     */
    @JsonProperty(value = "displayText", access = JsonProperty.Access.WRITE_ONLY)
    private String displayText;

    /*
     * Function App stack name.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /*
     * Settings associated with the minor version.
     */
    @JsonProperty(value = "stackSettings", access = JsonProperty.Access.WRITE_ONLY)
    private FunctionAppRuntimes stackSettings;

    /**
     * Get the displayText property: Function App stack (display only).
     *
     * @return the displayText value.
     */
    public String displayText() {
        return this.displayText;
    }

    /**
     * Get the value property: Function App stack name.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Get the stackSettings property: Settings associated with the minor version.
     *
     * @return the stackSettings value.
     */
    public FunctionAppRuntimes stackSettings() {
        return this.stackSettings;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (stackSettings() != null) {
            stackSettings().validate();
        }
    }
}
