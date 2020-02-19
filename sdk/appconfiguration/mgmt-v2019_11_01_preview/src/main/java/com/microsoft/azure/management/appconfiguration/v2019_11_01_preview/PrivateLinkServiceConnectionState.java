/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appconfiguration.v2019_11_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The state of a private link service connection.
 */
public class PrivateLinkServiceConnectionState {
    /**
     * The private link service connection status. Possible values include:
     * 'Pending', 'Approved', 'Rejected', 'Disconnected'.
     */
    @JsonProperty(value = "status")
    private ConnectionStatus status;

    /**
     * The private link service connection description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Any action that is required beyond basic workflow (approve/ reject/
     * disconnect). Possible values include: 'None', 'Recreate'.
     */
    @JsonProperty(value = "actionsRequired", access = JsonProperty.Access.WRITE_ONLY)
    private ActionsRequired actionsRequired;

    /**
     * Get the private link service connection status. Possible values include: 'Pending', 'Approved', 'Rejected', 'Disconnected'.
     *
     * @return the status value
     */
    public ConnectionStatus status() {
        return this.status;
    }

    /**
     * Set the private link service connection status. Possible values include: 'Pending', 'Approved', 'Rejected', 'Disconnected'.
     *
     * @param status the status value to set
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withStatus(ConnectionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the private link service connection description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the private link service connection description.
     *
     * @param description the description value to set
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get any action that is required beyond basic workflow (approve/ reject/ disconnect). Possible values include: 'None', 'Recreate'.
     *
     * @return the actionsRequired value
     */
    public ActionsRequired actionsRequired() {
        return this.actionsRequired;
    }

}
