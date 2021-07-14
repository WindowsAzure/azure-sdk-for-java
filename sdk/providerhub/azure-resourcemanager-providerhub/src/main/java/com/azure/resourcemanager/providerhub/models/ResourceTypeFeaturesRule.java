// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The ResourceTypeFeaturesRule model. */
@Fluent
public final class ResourceTypeFeaturesRule extends FeaturesRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceTypeFeaturesRule.class);

    /** {@inheritDoc} */
    @Override
    public ResourceTypeFeaturesRule withRequiredFeaturesPolicy(FeaturesPolicy requiredFeaturesPolicy) {
        super.withRequiredFeaturesPolicy(requiredFeaturesPolicy);
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
