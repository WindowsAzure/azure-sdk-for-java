// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

/** The visibility list of the private link service. */
@Immutable
public final class PrivateLinkServicePropertiesVisibility extends ResourceSet {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkServicePropertiesVisibility.class);

    /** {@inheritDoc} */
    @Override
    public PrivateLinkServicePropertiesVisibility withSubscriptions(List<String> subscriptions) {
        super.withSubscriptions(subscriptions);
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
