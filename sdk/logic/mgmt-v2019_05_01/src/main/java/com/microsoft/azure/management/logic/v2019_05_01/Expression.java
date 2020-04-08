/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The expression.
 */
public class Expression {
    /**
     * The text.
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * The value property.
     */
    @JsonProperty(value = "value")
    private Object value;

    /**
     * The sub expressions.
     */
    @JsonProperty(value = "subexpressions")
    private List<Expression> subexpressions;

    /**
     * The error property.
     */
    @JsonProperty(value = "error")
    private AzureResourceErrorInfo error;

    /**
     * Get the text.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text.
     *
     * @param text the text value to set
     * @return the Expression object itself.
     */
    public Expression withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the Expression object itself.
     */
    public Expression withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get the sub expressions.
     *
     * @return the subexpressions value
     */
    public List<Expression> subexpressions() {
        return this.subexpressions;
    }

    /**
     * Set the sub expressions.
     *
     * @param subexpressions the subexpressions value to set
     * @return the Expression object itself.
     */
    public Expression withSubexpressions(List<Expression> subexpressions) {
        this.subexpressions = subexpressions;
        return this;
    }

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public AzureResourceErrorInfo error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     * @return the Expression object itself.
     */
    public Expression withError(AzureResourceErrorInfo error) {
        this.error = error;
        return this;
    }

}
