/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents HTTPS job input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = JobInputHttp.class)
@JsonTypeName("#Microsoft.Media.JobInputHttp")
public class JobInputHttp extends JobInputClip {
    /**
     * Base URI for HTTPS job input. It will be concatenated with provided file
     * names. If no base uri is given, then the provided file list is assumed
     * to be fully qualified uris. Maximum length of 4000 characters.
     */
    @JsonProperty(value = "baseUri")
    private String baseUri;

    /**
     * Get base URI for HTTPS job input. It will be concatenated with provided file names. If no base uri is given, then the provided file list is assumed to be fully qualified uris. Maximum length of 4000 characters.
     *
     * @return the baseUri value
     */
    public String baseUri() {
        return this.baseUri;
    }

    /**
     * Set base URI for HTTPS job input. It will be concatenated with provided file names. If no base uri is given, then the provided file list is assumed to be fully qualified uris. Maximum length of 4000 characters.
     *
     * @param baseUri the baseUri value to set
     * @return the JobInputHttp object itself.
     */
    public JobInputHttp withBaseUri(String baseUri) {
        this.baseUri = baseUri;
        return this;
    }

}
