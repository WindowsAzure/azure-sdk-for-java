// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.providerhub.fluent.models.ProviderRegistrationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The CustomRolloutSpecificationProviderRegistration model. */
@Fluent
public final class CustomRolloutSpecificationProviderRegistration extends ProviderRegistrationInner {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(CustomRolloutSpecificationProviderRegistration.class);

    /** {@inheritDoc} */
    @Override
    public CustomRolloutSpecificationProviderRegistration withProperties(ProviderRegistrationProperties properties) {
        super.withProperties(properties);
        return this;
    }

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
