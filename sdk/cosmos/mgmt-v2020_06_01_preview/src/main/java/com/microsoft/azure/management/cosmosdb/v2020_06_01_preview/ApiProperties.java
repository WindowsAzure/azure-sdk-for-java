/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ApiProperties model.
 */
public class ApiProperties {
    /**
     * Describes the ServerVersion of an a MongoDB account. Possible values
     * include: '3.2', '3.6'.
     */
    @JsonProperty(value = "serverVersion")
    private ServerVersion serverVersion;

    /**
     * Get describes the ServerVersion of an a MongoDB account. Possible values include: '3.2', '3.6'.
     *
     * @return the serverVersion value
     */
    public ServerVersion serverVersion() {
        return this.serverVersion;
    }

    /**
     * Set describes the ServerVersion of an a MongoDB account. Possible values include: '3.2', '3.6'.
     *
     * @param serverVersion the serverVersion value to set
     * @return the ApiProperties object itself.
     */
    public ApiProperties withServerVersion(ServerVersion serverVersion) {
        this.serverVersion = serverVersion;
        return this;
    }

}
