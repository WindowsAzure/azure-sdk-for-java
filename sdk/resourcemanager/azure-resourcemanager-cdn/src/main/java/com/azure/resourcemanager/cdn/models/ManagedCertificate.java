// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** Managed Certificate used for https. */
@Immutable
public final class ManagedCertificate extends Certificate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedCertificate.class);

    /** {@inheritDoc} */
    @Override
    public ManagedCertificate withSubject(String subject) {
        super.withSubject(subject);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedCertificate withExpirationDate(String expirationDate) {
        super.withExpirationDate(expirationDate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedCertificate withThumbprint(String thumbprint) {
        super.withThumbprint(thumbprint);
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
