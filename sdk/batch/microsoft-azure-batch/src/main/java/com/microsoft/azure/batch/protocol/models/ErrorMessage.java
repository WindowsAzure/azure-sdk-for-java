/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An error message received in an Azure Batch error response.
 */
public class ErrorMessage {
    /**
     * The language code of the error message.
     */
    @JsonProperty(value = "lang")
    private String lang;

    /**
     * The text of the message.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the language code of the error message.
     *
     * @return the lang value
     */
    public String lang() {
        return this.lang;
    }

    /**
     * Set the language code of the error message.
     *
     * @param lang the lang value to set
     * @return the ErrorMessage object itself.
     */
    public ErrorMessage withLang(String lang) {
        this.lang = lang;
        return this;
    }

    /**
     * Get the text of the message.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the text of the message.
     *
     * @param value the value value to set
     * @return the ErrorMessage object itself.
     */
    public ErrorMessage withValue(String value) {
        this.value = value;
        return this;
    }

}
