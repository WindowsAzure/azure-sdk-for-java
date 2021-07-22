// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ConformanceResponse model. */
@Fluent
public final class ConformanceResponse {
    /*
     * List of requirements classes that the server conforms to.
     */
    @JsonProperty(value = "conformsTo", required = true)
    private List<String> conformsTo;

    /**
     * Get the conformsTo property: List of requirements classes that the server conforms to.
     *
     * @return the conformsTo value.
     */
    public List<String> getConformsTo() {
        return this.conformsTo;
    }

    /**
     * Set the conformsTo property: List of requirements classes that the server conforms to.
     *
     * @param conformsTo the conformsTo value to set.
     * @return the ConformanceResponse object itself.
     */
    public ConformanceResponse setConformsTo(List<String> conformsTo) {
        this.conformsTo = conformsTo;
        return this;
    }
}
