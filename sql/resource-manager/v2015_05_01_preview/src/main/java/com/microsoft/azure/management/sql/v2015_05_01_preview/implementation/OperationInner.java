/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview.implementation;

import com.microsoft.azure.management.sql.v2015_05_01_preview.OperationDisplay;
import com.microsoft.azure.management.sql.v2015_05_01_preview.OperationOrigin;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SQL REST API operation definition.
 */
public class OperationInner {
    /**
     * The name of the operation being performed on this particular object.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The localized display information for this particular operation /
     * action.
     */
    @JsonProperty(value = "display", access = JsonProperty.Access.WRITE_ONLY)
    private OperationDisplay display;

    /**
     * The intended executor of the operation. Possible values include: 'user',
     * 'system'.
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
     * Get the localized display information for this particular operation / action.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Get the intended executor of the operation. Possible values include: 'user', 'system'.
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
