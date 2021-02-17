// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

/** The ResourceProviderManifestPropertiesProviderAuthentication model. */
@Immutable
public final class ResourceProviderManifestPropertiesProviderAuthentication extends ResourceProviderAuthentication {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(ResourceProviderManifestPropertiesProviderAuthentication.class);

    /** {@inheritDoc} */
    @Override
    public ResourceProviderManifestPropertiesProviderAuthentication withAllowedAudiences(
        List<String> allowedAudiences) {
        super.withAllowedAudiences(allowedAudiences);
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
