// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Test migrate input properties. */
@Fluent
public final class TestMigrateInputProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TestMigrateInputProperties.class);

    /*
     * The provider specific details.
     */
    @JsonProperty(value = "providerSpecificDetails", required = true)
    private TestMigrateProviderSpecificInput providerSpecificDetails;

    /**
     * Get the providerSpecificDetails property: The provider specific details.
     *
     * @return the providerSpecificDetails value.
     */
    public TestMigrateProviderSpecificInput providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails property: The provider specific details.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set.
     * @return the TestMigrateInputProperties object itself.
     */
    public TestMigrateInputProperties withProviderSpecificDetails(
        TestMigrateProviderSpecificInput providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (providerSpecificDetails() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property providerSpecificDetails in model TestMigrateInputProperties"));
        } else {
            providerSpecificDetails().validate();
        }
    }
}
