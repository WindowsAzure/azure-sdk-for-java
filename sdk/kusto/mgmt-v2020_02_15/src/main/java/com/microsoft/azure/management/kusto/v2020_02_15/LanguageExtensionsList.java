/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_02_15;

import java.util.List;
import com.microsoft.azure.management.kusto.v2020_02_15.implementation.LanguageExtensionInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list of language extension objects.
 */
public class LanguageExtensionsList {
    /**
     * The list of language extensions.
     */
    @JsonProperty(value = "value")
    private List<LanguageExtensionInner> value;

    /**
     * Get the list of language extensions.
     *
     * @return the value value
     */
    public List<LanguageExtensionInner> value() {
        return this.value;
    }

    /**
     * Set the list of language extensions.
     *
     * @param value the value value to set
     * @return the LanguageExtensionsList object itself.
     */
    public LanguageExtensionsList withValue(List<LanguageExtensionInner> value) {
        this.value = value;
        return this;
    }

}
