/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The integration account map filter for odata query.
 */
public class IntegrationAccountMapFilter {
    /**
     * The map type of integration account map. Possible values include:
     * 'NotSpecified', 'Xslt', 'Xslt20', 'Xslt30', 'Liquid'.
     */
    @JsonProperty(value = "mapType", required = true)
    private MapType mapType;

    /**
     * Get the map type of integration account map. Possible values include: 'NotSpecified', 'Xslt', 'Xslt20', 'Xslt30', 'Liquid'.
     *
     * @return the mapType value
     */
    public MapType mapType() {
        return this.mapType;
    }

    /**
     * Set the map type of integration account map. Possible values include: 'NotSpecified', 'Xslt', 'Xslt20', 'Xslt30', 'Liquid'.
     *
     * @param mapType the mapType value to set
     * @return the IntegrationAccountMapFilter object itself.
     */
    public IntegrationAccountMapFilter withMapType(MapType mapType) {
        this.mapType = mapType;
        return this;
    }

}
