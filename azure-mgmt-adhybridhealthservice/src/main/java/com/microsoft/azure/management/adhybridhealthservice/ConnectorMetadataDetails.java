/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of the connector.
 */
public class ConnectorMetadataDetails {
    /**
     * The Connector Id.
     */
    @JsonProperty(value = "connectorId")
    private String connectorId;

    /**
     * The Connector Display Name.
     */
    @JsonProperty(value = "connectorDisplayName")
    private String connectorDisplayName;

    /**
     * Get the Connector Id.
     *
     * @return the connectorId value
     */
    public String connectorId() {
        return this.connectorId;
    }

    /**
     * Set the Connector Id.
     *
     * @param connectorId the connectorId value to set
     * @return the ConnectorMetadataDetails object itself.
     */
    public ConnectorMetadataDetails withConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }

    /**
     * Get the Connector Display Name.
     *
     * @return the connectorDisplayName value
     */
    public String connectorDisplayName() {
        return this.connectorDisplayName;
    }

    /**
     * Set the Connector Display Name.
     *
     * @param connectorDisplayName the connectorDisplayName value to set
     * @return the ConnectorMetadataDetails object itself.
     */
    public ConnectorMetadataDetails withConnectorDisplayName(String connectorDisplayName) {
        this.connectorDisplayName = connectorDisplayName;
        return this;
    }

}
