/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2017_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The capability information in the specified sku, including file encryption,
 * network acls, change notification, etc.
 */
public class SKUCapability {
    /**
     * The name of capability, The capability information in the specified sku,
     * including file encryption, network acls, change notification, etc.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * A string value to indicate states of given capability. Possibly 'true'
     * or 'false'.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * Get the name of capability, The capability information in the specified sku, including file encryption, network acls, change notification, etc.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get a string value to indicate states of given capability. Possibly 'true' or 'false'.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

}
