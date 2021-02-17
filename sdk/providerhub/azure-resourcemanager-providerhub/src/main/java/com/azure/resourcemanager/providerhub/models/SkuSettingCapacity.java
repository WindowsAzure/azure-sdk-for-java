// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The SkuSettingCapacity model. */
@Immutable
public final class SkuSettingCapacity extends SkuCapacity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SkuSettingCapacity.class);

    /** {@inheritDoc} */
    @Override
    public SkuSettingCapacity withMinimum(int minimum) {
        super.withMinimum(minimum);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SkuSettingCapacity withMaximum(Integer maximum) {
        super.withMaximum(maximum);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SkuSettingCapacity withDefaultProperty(Integer defaultProperty) {
        super.withDefaultProperty(defaultProperty);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SkuSettingCapacity withScaleType(SkuScaleType scaleType) {
        super.withScaleType(scaleType);
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
