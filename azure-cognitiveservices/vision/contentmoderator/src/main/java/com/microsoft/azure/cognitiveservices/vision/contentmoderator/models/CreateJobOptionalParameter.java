/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CreateJobOptionalParameter model.
 */
public class CreateJobOptionalParameter {
    /**
     * Callback endpoint for posting the create job result.
     */
    @JsonProperty(value = "callBackEndpoint")
    private String callBackEndpoint;

    /**
     * Gets or sets the preferred language for the response.
     */
    @JsonProperty(value = "this\\.client\\.acceptLanguage()")
    private String acceptLanguage;

    /**
     * Get the callBackEndpoint value.
     *
     * @return the callBackEndpoint value
     */
    public String callBackEndpoint() {
        return this.callBackEndpoint;
    }

    /**
     * Set the callBackEndpoint value.
     *
     * @param callBackEndpoint the callBackEndpoint value to set
     * @return the CreateJobOptionalParameter object itself.
     */
    public CreateJobOptionalParameter withCallBackEndpoint(String callBackEndpoint) {
        this.callBackEndpoint = callBackEndpoint;
        return this;
    }

    /**
     * Get the acceptLanguage value.
     *
     * @return the acceptLanguage value
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Set the acceptLanguage value.
     *
     * @param acceptLanguage the acceptLanguage value to set
     * @return the CreateJobOptionalParameter object itself.
     */
    public CreateJobOptionalParameter withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

}
