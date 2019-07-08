/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Query parameter to enumerate Protectable items.
 */
public class ProtectableItemQueryParameter {
    /**
     * State of the Protectable item query filter.
     */
    @JsonProperty(value = "state")
    private String state;

    /**
     * Get state of the Protectable item query filter.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Set state of the Protectable item query filter.
     *
     * @param state the state value to set
     * @return the ProtectableItemQueryParameter object itself.
     */
    public ProtectableItemQueryParameter withState(String state) {
        this.state = state;
        return this;
    }

}
