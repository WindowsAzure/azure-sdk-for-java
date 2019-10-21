/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment instance payload.
 */
public class DeploymentInstance {
    /**
     * Name of the deployment instance.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Status of the deployment instance.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * Failed reason of the deployment instance.
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private String reason;

    /**
     * Discovery status of the deployment instance.
     */
    @JsonProperty(value = "discoveryStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String discoveryStatus;

    /**
     * Get name of the deployment instance.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get status of the deployment instance.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Get failed reason of the deployment instance.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Get discovery status of the deployment instance.
     *
     * @return the discoveryStatus value
     */
    public String discoveryStatus() {
        return this.discoveryStatus;
    }

}
