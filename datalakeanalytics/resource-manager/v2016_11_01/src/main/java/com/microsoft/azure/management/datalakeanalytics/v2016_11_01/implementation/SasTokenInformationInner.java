/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2016_11_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SAS token information.
 */
public class SasTokenInformationInner {
    /**
     * The access token for the associated Azure Storage Container.
     */
    @JsonProperty(value = "accessToken", access = JsonProperty.Access.WRITE_ONLY)
    private String accessToken;

    /**
     * Get the access token for the associated Azure Storage Container.
     *
     * @return the accessToken value
     */
    public String accessToken() {
        return this.accessToken;
    }

}
