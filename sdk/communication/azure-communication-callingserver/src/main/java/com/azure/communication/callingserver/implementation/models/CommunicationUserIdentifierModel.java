// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A user that got created with an Azure Communication Services resource. */
@Fluent
public final class CommunicationUserIdentifierModel {
    /*
     * The Id of the communication user.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the id property: The Id of the communication user.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The Id of the communication user.
     *
     * @param id the id value to set.
     * @return the CommunicationUserIdentifierModel object itself.
     */
    public CommunicationUserIdentifierModel setId(String id) {
        this.id = id;
        return this;
    }
}
