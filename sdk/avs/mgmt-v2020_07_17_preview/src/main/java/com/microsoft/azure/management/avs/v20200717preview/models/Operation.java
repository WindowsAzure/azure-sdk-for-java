/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_07_17_preview.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A REST API operation.
 */
public class Operation {
    /**
     * Name of the operation being performed on this object.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Contains the localized display information for this operation.
     */
    @JsonProperty(value = "display", access = JsonProperty.Access.WRITE_ONLY)
    private OperationDisplay display;

    /**
     * Gets or sets a value indicating whether the operation is a data action
     * or not.
     */
    @JsonProperty(value = "isDataAction")
    private Boolean isDataAction;

    /**
     * Origin of the operation.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /**
     * Properties of the operation.
     */
    @JsonProperty(value = "properties")
    private OperationProperties properties;

    /**
     * Get name of the operation being performed on this object.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get contains the localized display information for this operation.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Get gets or sets a value indicating whether the operation is a data action or not.
     *
     * @return the isDataAction value
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set gets or sets a value indicating whether the operation is a data action or not.
     *
     * @param isDataAction the isDataAction value to set
     * @return the Operation object itself.
     */
    public Operation withIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get origin of the operation.
     *
     * @return the origin value
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set origin of the operation.
     *
     * @param origin the origin value to set
     * @return the Operation object itself.
     */
    public Operation withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get properties of the operation.
     *
     * @return the properties value
     */
    public OperationProperties properties() {
        return this.properties;
    }

    /**
     * Set properties of the operation.
     *
     * @param properties the properties value to set
     * @return the Operation object itself.
     */
    public Operation withProperties(OperationProperties properties) {
        this.properties = properties;
        return this;
    }

}
