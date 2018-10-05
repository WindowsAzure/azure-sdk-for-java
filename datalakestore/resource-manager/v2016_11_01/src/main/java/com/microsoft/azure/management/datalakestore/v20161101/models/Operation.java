/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2016_11_01.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An available operation for Data Lake Store.
 */
public class Operation {
    /**
     * The name of the operation.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The display information for the operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /**
     * The intended executor of the operation. Possible values include: 'user',
     * 'system', 'user,system'.
     */
    @JsonProperty(value = "origin", access = JsonProperty.Access.WRITE_ONLY)
    private OperationOrigin origin;

    /**
     * Get the name of the operation.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the display information for the operation.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display information for the operation.
     *
     * @param display the display value to set
     * @return the Operation object itself.
     */
    public Operation withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the intended executor of the operation. Possible values include: 'user', 'system', 'user,system'.
     *
     * @return the origin value
     */
    public OperationOrigin origin() {
        return this.origin;
    }

}
