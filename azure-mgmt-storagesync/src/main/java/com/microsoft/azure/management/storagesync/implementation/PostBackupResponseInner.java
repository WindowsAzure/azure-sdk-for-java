/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Post Backup Response.
 */
@JsonFlatten
public class PostBackupResponseInner {
    /**
     * cloud endpoint Name.
     */
    @JsonProperty(value = "backupMetadata.cloudEndpointName", access = JsonProperty.Access.WRITE_ONLY)
    private String cloudEndpointName;

    /**
     * Get cloud endpoint Name.
     *
     * @return the cloudEndpointName value
     */
    public String cloudEndpointName() {
        return this.cloudEndpointName;
    }

}
