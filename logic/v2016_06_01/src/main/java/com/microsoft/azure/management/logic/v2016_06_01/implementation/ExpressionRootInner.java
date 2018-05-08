/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.management.logic.v2016_06_01.Expression;

/**
 * The ExpressionRootInner model.
 */
public class ExpressionRootInner extends Expression {
    /**
     * The path.
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * Get the path value.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path value.
     *
     * @param path the path value to set
     * @return the ExpressionRootInner object itself.
     */
    public ExpressionRootInner withPath(String path) {
        this.path = path;
        return this;
    }

}
