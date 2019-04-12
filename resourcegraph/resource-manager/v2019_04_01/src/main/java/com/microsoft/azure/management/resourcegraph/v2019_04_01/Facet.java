/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcegraph.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * A facet containing additional statistics on the response of a query. Can be
 * either FacetResult or FacetError.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("Facet")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "FacetResult", value = FacetResult.class),
    @JsonSubTypes.Type(name = "FacetError", value = FacetError.class)
})
public class Facet {
    /**
     * Facet expression, same as in the corresponding facet request.
     */
    @JsonProperty(value = "expression", required = true)
    private String expression;

    /**
     * Get facet expression, same as in the corresponding facet request.
     *
     * @return the expression value
     */
    public String expression() {
        return this.expression;
    }

    /**
     * Set facet expression, same as in the corresponding facet request.
     *
     * @param expression the expression value to set
     * @return the Facet object itself.
     */
    public Facet withExpression(String expression) {
        this.expression = expression;
        return this;
    }

}
