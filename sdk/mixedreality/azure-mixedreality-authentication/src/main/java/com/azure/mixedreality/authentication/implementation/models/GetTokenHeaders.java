// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.mixedreality.authentication.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GetTokenHeaders model. */
@Fluent
public final class GetTokenHeaders {
    /*
     * The MS-CV property.
     */
    @JsonProperty(value = "MS-CV")
    private String msCV;

    /**
     * Get the msCV property: The MS-CV property.
     *
     * @return the msCV value.
     */
    public String getMsCV() {
        return this.msCV;
    }

    /**
     * Set the msCV property: The MS-CV property.
     *
     * @param msCV the msCV value to set.
     * @return the GetTokenHeaders object itself.
     */
    public GetTokenHeaders setMsCV(String msCV) {
        this.msCV = msCV;
        return this;
    }
}
