/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Reponse body for generating an upload URI.
 */
public class GenerateUploadUriResponseInner {
    /**
     * The upload URI for the VHD.
     */
    @JsonProperty(value = "uploadUri")
    private String uploadUri;

    /**
     * Get the upload URI for the VHD.
     *
     * @return the uploadUri value
     */
    public String uploadUri() {
        return this.uploadUri;
    }

    /**
     * Set the upload URI for the VHD.
     *
     * @param uploadUri the uploadUri value to set
     * @return the GenerateUploadUriResponseInner object itself.
     */
    public GenerateUploadUriResponseInner withUploadUri(String uploadUri) {
        this.uploadUri = uploadUri;
        return this;
    }

}
