/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Target details for file / folder restore.
 */
public class InstantItemRecoveryTarget {
    /**
     * List of client scripts.
     */
    @JsonProperty(value = "clientScripts")
    private List<ClientScriptForConnect> clientScripts;

    /**
     * Get list of client scripts.
     *
     * @return the clientScripts value
     */
    public List<ClientScriptForConnect> clientScripts() {
        return this.clientScripts;
    }

    /**
     * Set list of client scripts.
     *
     * @param clientScripts the clientScripts value to set
     * @return the InstantItemRecoveryTarget object itself.
     */
    public InstantItemRecoveryTarget withClientScripts(List<ClientScriptForConnect> clientScripts) {
        this.clientScripts = clientScripts;
        return this;
    }

}
