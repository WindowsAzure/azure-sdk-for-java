/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcegraph.v2019_04_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A facet whose execution resulted in an error.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("FacetError")
public class FacetError extends Facet {
    /**
     * An array containing detected facet errors with details.
     */
    @JsonProperty(value = "errors", required = true)
    private List<ErrorDetails> errors;

    /**
     * Get an array containing detected facet errors with details.
     *
     * @return the errors value
     */
    public List<ErrorDetails> errors() {
        return this.errors;
    }

    /**
     * Set an array containing detected facet errors with details.
     *
     * @param errors the errors value to set
     * @return the FacetError object itself.
     */
    public FacetError withErrors(List<ErrorDetails> errors) {
        this.errors = errors;
        return this;
    }

}
