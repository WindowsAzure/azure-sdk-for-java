// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DebugSetting model. */
@Fluent
public final class DebugSetting {
    /*
     * Specifies the type of information to log for debugging. The permitted
     * values are none, requestContent, responseContent, or both requestContent
     * and responseContent separated by a comma. The default is none. When
     * setting this value, carefully consider the type of information you are
     * passing in during deployment. By logging information about the request
     * or response, you could potentially expose sensitive data that is
     * retrieved through the deployment operations.
     */
    @JsonProperty(value = "detailLevel")
    private String detailLevel;

    /**
     * Get the detailLevel property: Specifies the type of information to log for debugging. The permitted values are
     * none, requestContent, responseContent, or both requestContent and responseContent separated by a comma. The
     * default is none. When setting this value, carefully consider the type of information you are passing in during
     * deployment. By logging information about the request or response, you could potentially expose sensitive data
     * that is retrieved through the deployment operations.
     *
     * @return the detailLevel value.
     */
    public String detailLevel() {
        return this.detailLevel;
    }

    /**
     * Set the detailLevel property: Specifies the type of information to log for debugging. The permitted values are
     * none, requestContent, responseContent, or both requestContent and responseContent separated by a comma. The
     * default is none. When setting this value, carefully consider the type of information you are passing in during
     * deployment. By logging information about the request or response, you could potentially expose sensitive data
     * that is retrieved through the deployment operations.
     *
     * @param detailLevel the detailLevel value to set.
     * @return the DebugSetting object itself.
     */
    public DebugSetting withDetailLevel(String detailLevel) {
        this.detailLevel = detailLevel;
        return this;
    }
}
