/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2020_01_01.implementation;

import com.microsoft.azure.management.mariadb.v2020_01_01.OperationDisplay;
import com.microsoft.azure.management.mariadb.v2020_01_01.OperationOrigin;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * REST API operation definition.
 */
public class OperationInner {
    /**
     * The name of the operation being performed on this particular object.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The localized display information for this particular operation or
     * action.
     */
    @JsonProperty(value = "display", access = JsonProperty.Access.WRITE_ONLY)
    private OperationDisplay display;

    /**
     * The intended executor of the operation. Possible values include:
     * 'NotSpecified', 'user', 'system'.
     */
    @JsonProperty(value = "origin", access = JsonProperty.Access.WRITE_ONLY)
    private OperationOrigin origin;

    /**
     * Additional descriptions for the operation.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, Object> properties;

    /**
     * Get the name of the operation being performed on this particular object.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the localized display information for this particular operation or action.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Get the intended executor of the operation. Possible values include: 'NotSpecified', 'user', 'system'.
     *
     * @return the origin value
     */
    public OperationOrigin origin() {
        return this.origin;
    }

    /**
     * Get additional descriptions for the operation.
     *
     * @return the properties value
     */
    public Map<String, Object> properties() {
        return this.properties;
    }

}
