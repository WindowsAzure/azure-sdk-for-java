/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation;

import java.util.List;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.ConnectorMetadataDetails;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Gets the list of connectors and run profile names.
 */
public class ConnectorMetadataInner {
    /**
     * The list of connectors.
     */
    @JsonProperty(value = "connectors")
    private List<ConnectorMetadataDetails> connectors;

    /**
     * The list of run profile names.
     */
    @JsonProperty(value = "runProfileNames")
    private List<String> runProfileNames;

    /**
     * Get the list of connectors.
     *
     * @return the connectors value
     */
    public List<ConnectorMetadataDetails> connectors() {
        return this.connectors;
    }

    /**
     * Set the list of connectors.
     *
     * @param connectors the connectors value to set
     * @return the ConnectorMetadataInner object itself.
     */
    public ConnectorMetadataInner withConnectors(List<ConnectorMetadataDetails> connectors) {
        this.connectors = connectors;
        return this;
    }

    /**
     * Get the list of run profile names.
     *
     * @return the runProfileNames value
     */
    public List<String> runProfileNames() {
        return this.runProfileNames;
    }

    /**
     * Set the list of run profile names.
     *
     * @param runProfileNames the runProfileNames value to set
     * @return the ConnectorMetadataInner object itself.
     */
    public ConnectorMetadataInner withRunProfileNames(List<String> runProfileNames) {
        this.runProfileNames = runProfileNames;
        return this;
    }

}
