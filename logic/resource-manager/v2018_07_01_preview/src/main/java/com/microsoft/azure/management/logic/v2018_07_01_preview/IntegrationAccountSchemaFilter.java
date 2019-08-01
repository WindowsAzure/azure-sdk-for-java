/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The integration account schema filter for odata query.
 */
public class IntegrationAccountSchemaFilter {
    /**
     * The schema type of integration account schema. Possible values include:
     * 'NotSpecified', 'Xml'.
     */
    @JsonProperty(value = "schemaType", required = true)
    private SchemaType schemaType;

    /**
     * Get the schema type of integration account schema. Possible values include: 'NotSpecified', 'Xml'.
     *
     * @return the schemaType value
     */
    public SchemaType schemaType() {
        return this.schemaType;
    }

    /**
     * Set the schema type of integration account schema. Possible values include: 'NotSpecified', 'Xml'.
     *
     * @param schemaType the schemaType value to set
     * @return the IntegrationAccountSchemaFilter object itself.
     */
    public IntegrationAccountSchemaFilter withSchemaType(SchemaType schemaType) {
        this.schemaType = schemaType;
        return this;
    }

}
