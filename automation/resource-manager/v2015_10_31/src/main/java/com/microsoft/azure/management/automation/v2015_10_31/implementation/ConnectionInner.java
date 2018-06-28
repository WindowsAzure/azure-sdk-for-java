/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.management.automation.v2015_10_31.ConnectionTypeAssociationProperty;
import java.util.Map;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Definition of the connection.
 */
@JsonFlatten
public class ConnectionInner extends ProxyResource {
    /**
     * Gets or sets the connectionType of the connection.
     */
    @JsonProperty(value = "properties.connectionType")
    private ConnectionTypeAssociationProperty connectionType;

    /**
     * Gets the field definition values of the connection.
     */
    @JsonProperty(value = "properties.fieldDefinitionValues", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> fieldDefinitionValues;

    /**
     * Gets the creation time.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * Gets the last modified time.
     */
    @JsonProperty(value = "properties.lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModifiedTime;

    /**
     * Gets or sets the description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Get gets or sets the connectionType of the connection.
     *
     * @return the connectionType value
     */
    public ConnectionTypeAssociationProperty connectionType() {
        return this.connectionType;
    }

    /**
     * Set gets or sets the connectionType of the connection.
     *
     * @param connectionType the connectionType value to set
     * @return the ConnectionInner object itself.
     */
    public ConnectionInner withConnectionType(ConnectionTypeAssociationProperty connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * Get gets the field definition values of the connection.
     *
     * @return the fieldDefinitionValues value
     */
    public Map<String, String> fieldDefinitionValues() {
        return this.fieldDefinitionValues;
    }

    /**
     * Get gets the creation time.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get gets the last modified time.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get gets or sets the description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set gets or sets the description.
     *
     * @param description the description value to set
     * @return the ConnectionInner object itself.
     */
    public ConnectionInner withDescription(String description) {
        this.description = description;
        return this;
    }

}
