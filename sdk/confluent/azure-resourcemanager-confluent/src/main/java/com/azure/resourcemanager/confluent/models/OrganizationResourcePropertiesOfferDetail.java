// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** Confluent offer detail. */
@Immutable
public final class OrganizationResourcePropertiesOfferDetail extends OfferDetail {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OrganizationResourcePropertiesOfferDetail.class);

    /** {@inheritDoc} */
    @Override
    public OrganizationResourcePropertiesOfferDetail withPublisherId(String publisherId) {
        super.withPublisherId(publisherId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrganizationResourcePropertiesOfferDetail withId(String id) {
        super.withId(id);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrganizationResourcePropertiesOfferDetail withPlanId(String planId) {
        super.withPlanId(planId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrganizationResourcePropertiesOfferDetail withPlanName(String planName) {
        super.withPlanName(planName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrganizationResourcePropertiesOfferDetail withTermUnit(String termUnit) {
        super.withTermUnit(termUnit);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrganizationResourcePropertiesOfferDetail withStatus(SaaSOfferStatus status) {
        super.withStatus(status);
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
