// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The ServicePrincipalUpdateParameters model. */
@Immutable
public final class ServicePrincipalUpdateParameters extends ServicePrincipalBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServicePrincipalUpdateParameters.class);

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
