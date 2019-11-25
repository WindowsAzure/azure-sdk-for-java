/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Filters to list backup items.
 */
public class GetProtectedItemQueryObject {
    /**
     * Specifies if the additional information should be provided for this
     * item.
     */
    @JsonProperty(value = "expand")
    private String expand;

    /**
     * Get specifies if the additional information should be provided for this item.
     *
     * @return the expand value
     */
    public String expand() {
        return this.expand;
    }

    /**
     * Set specifies if the additional information should be provided for this item.
     *
     * @param expand the expand value to set
     * @return the GetProtectedItemQueryObject object itself.
     */
    public GetProtectedItemQueryObject withExpand(String expand) {
        this.expand = expand;
        return this;
    }

}
