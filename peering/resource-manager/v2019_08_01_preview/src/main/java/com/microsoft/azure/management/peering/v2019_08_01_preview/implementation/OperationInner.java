/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2019_08_01_preview.implementation;

import com.microsoft.azure.management.peering.v2019_08_01_preview.OperationDisplayInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The peering API operation.
 */
public class OperationInner {
    /**
     * The name of the operation.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The information related to the operation.
     */
    @JsonProperty(value = "display", access = JsonProperty.Access.WRITE_ONLY)
    private OperationDisplayInfo display;

    /**
     * The flag that indicates whether the operation applies to data plane.
     */
    @JsonProperty(value = "isDataAction", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDataAction;

    /**
     * Get the name of the operation.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the information related to the operation.
     *
     * @return the display value
     */
    public OperationDisplayInfo display() {
        return this.display;
    }

    /**
     * Get the flag that indicates whether the operation applies to data plane.
     *
     * @return the isDataAction value
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

}
