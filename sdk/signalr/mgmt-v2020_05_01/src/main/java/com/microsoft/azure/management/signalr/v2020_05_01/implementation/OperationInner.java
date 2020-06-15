/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2020_05_01.implementation;

import com.microsoft.azure.management.signalr.v2020_05_01.OperationDisplay;
import com.microsoft.azure.management.signalr.v2020_05_01.OperationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * REST API operation supported by SignalR resource provider.
 */
public class OperationInner {
    /**
     * Name of the operation with format: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * If the operation is a data action. (for data plane rbac).
     */
    @JsonProperty(value = "isDataAction")
    private Boolean isDataAction;

    /**
     * The object that describes the operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /**
     * Optional. The intended executor of the operation; governs the display of
     * the operation in the RBAC UX and the audit logs UX.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /**
     * Extra properties for the operation.
     */
    @JsonProperty(value = "properties")
    private OperationProperties properties;

    /**
     * Get name of the operation with format: {provider}/{resource}/{operation}.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the operation with format: {provider}/{resource}/{operation}.
     *
     * @param name the name value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get if the operation is a data action. (for data plane rbac).
     *
     * @return the isDataAction value
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set if the operation is a data action. (for data plane rbac).
     *
     * @param isDataAction the isDataAction value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get the object that describes the operation.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the object that describes the operation.
     *
     * @param display the display value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get optional. The intended executor of the operation; governs the display of the operation in the RBAC UX and the audit logs UX.
     *
     * @return the origin value
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set optional. The intended executor of the operation; governs the display of the operation in the RBAC UX and the audit logs UX.
     *
     * @param origin the origin value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get extra properties for the operation.
     *
     * @return the properties value
     */
    public OperationProperties properties() {
        return this.properties;
    }

    /**
     * Set extra properties for the operation.
     *
     * @param properties the properties value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withProperties(OperationProperties properties) {
        this.properties = properties;
        return this;
    }

}
