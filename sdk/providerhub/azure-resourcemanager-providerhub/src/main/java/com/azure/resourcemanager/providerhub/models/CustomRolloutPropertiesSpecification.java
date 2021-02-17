// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.providerhub.fluent.models.CustomRolloutSpecificationInner;
import com.azure.resourcemanager.providerhub.fluent.models.ProviderRegistrationInner;
import com.azure.resourcemanager.providerhub.fluent.models.ResourceTypeRegistrationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

/** The CustomRolloutPropertiesSpecification model. */
@Immutable
public final class CustomRolloutPropertiesSpecification extends CustomRolloutSpecificationInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomRolloutPropertiesSpecification.class);

    /** {@inheritDoc} */
    @Override
    public CustomRolloutPropertiesSpecification withCanary(TrafficRegions canary) {
        super.withCanary(canary);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomRolloutPropertiesSpecification withProviderRegistration(
        ProviderRegistrationInner providerRegistration) {
        super.withProviderRegistration(providerRegistration);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomRolloutPropertiesSpecification withResourceTypeRegistrations(
        List<ResourceTypeRegistrationInner> resourceTypeRegistrations) {
        super.withResourceTypeRegistrations(resourceTypeRegistrations);
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
