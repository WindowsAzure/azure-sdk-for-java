// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.models.ComplianceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of Compliance objects response. */
@Fluent
public final class ComplianceList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ComplianceList.class);

    /*
     * List of Compliance objects
     */
    @JsonProperty(value = "value")
    private List<ComplianceInner> value;

    /*
     * The URI to fetch the next page.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of Compliance objects.
     *
     * @return the value value.
     */
    public List<ComplianceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Compliance objects.
     *
     * @param value the value value to set.
     * @return the ComplianceList object itself.
     */
    public ComplianceList withValue(List<ComplianceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page.
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
