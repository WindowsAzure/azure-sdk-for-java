/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Authorize request.
 */
public class AuthorizeRequest {
    /**
     * Resource id of the remote volume.
     */
    @JsonProperty(value = "remoteVolumeResourceId")
    private String remoteVolumeResourceId;

    /**
     * Get resource id of the remote volume.
     *
     * @return the remoteVolumeResourceId value
     */
    public String remoteVolumeResourceId() {
        return this.remoteVolumeResourceId;
    }

    /**
     * Set resource id of the remote volume.
     *
     * @param remoteVolumeResourceId the remoteVolumeResourceId value to set
     * @return the AuthorizeRequest object itself.
     */
    public AuthorizeRequest withRemoteVolumeResourceId(String remoteVolumeResourceId) {
        this.remoteVolumeResourceId = remoteVolumeResourceId;
        return this;
    }

}
