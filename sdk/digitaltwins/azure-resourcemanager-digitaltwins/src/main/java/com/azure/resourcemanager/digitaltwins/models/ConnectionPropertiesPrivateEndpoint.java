// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The ConnectionPropertiesPrivateEndpoint model. */
@Immutable
public final class ConnectionPropertiesPrivateEndpoint extends PrivateEndpoint {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionPropertiesPrivateEndpoint.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
