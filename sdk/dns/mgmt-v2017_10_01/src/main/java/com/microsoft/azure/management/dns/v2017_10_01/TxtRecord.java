/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.dns.v2017_10_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A TXT record.
 */
public class TxtRecord {
    /**
     * The text value of this TXT record.
     */
    @JsonProperty(value = "value")
    private List<String> value;

    /**
     * Get the text value of this TXT record.
     *
     * @return the value value
     */
    public List<String> value() {
        return this.value;
    }

    /**
     * Set the text value of this TXT record.
     *
     * @param value the value value to set
     * @return the TxtRecord object itself.
     */
    public TxtRecord withValue(List<String> value) {
        this.value = value;
        return this;
    }

}
