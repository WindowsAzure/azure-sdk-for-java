/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters supplied to the create or update connection type operation.
 */
@JsonFlatten
public class ConnectionTypeCreateOrUpdateParameters {
    /**
     * Gets or sets the name of the connection type.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Gets or sets a Boolean value to indicate if the connection type is
     * global.
     */
    @JsonProperty(value = "properties.isGlobal")
    private Boolean isGlobal;

    /**
     * Gets or sets the field definitions of the connection type.
     */
    @JsonProperty(value = "properties.fieldDefinitions", required = true)
    private Map<String, FieldDefinition> fieldDefinitions;

    /**
     * Get gets or sets the name of the connection type.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets or sets the name of the connection type.
     *
     * @param name the name value to set
     * @return the ConnectionTypeCreateOrUpdateParameters object itself.
     */
    public ConnectionTypeCreateOrUpdateParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get gets or sets a Boolean value to indicate if the connection type is global.
     *
     * @return the isGlobal value
     */
    public Boolean isGlobal() {
        return this.isGlobal;
    }

    /**
     * Set gets or sets a Boolean value to indicate if the connection type is global.
     *
     * @param isGlobal the isGlobal value to set
     * @return the ConnectionTypeCreateOrUpdateParameters object itself.
     */
    public ConnectionTypeCreateOrUpdateParameters withIsGlobal(Boolean isGlobal) {
        this.isGlobal = isGlobal;
        return this;
    }

    /**
     * Get gets or sets the field definitions of the connection type.
     *
     * @return the fieldDefinitions value
     */
    public Map<String, FieldDefinition> fieldDefinitions() {
        return this.fieldDefinitions;
    }

    /**
     * Set gets or sets the field definitions of the connection type.
     *
     * @param fieldDefinitions the fieldDefinitions value to set
     * @return the ConnectionTypeCreateOrUpdateParameters object itself.
     */
    public ConnectionTypeCreateOrUpdateParameters withFieldDefinitions(Map<String, FieldDefinition> fieldDefinitions) {
        this.fieldDefinitions = fieldDefinitions;
        return this;
    }

}
