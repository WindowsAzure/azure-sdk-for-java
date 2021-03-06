// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.powerbidedicated.fluent.models.AutoScaleVCoreInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An array of auto scale v-core resources. */
@Fluent
public final class AutoScaleVCoreListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutoScaleVCoreListResult.class);

    /*
     * An array of auto scale v-core resources.
     */
    @JsonProperty(value = "value", required = true)
    private List<AutoScaleVCoreInner> value;

    /**
     * Get the value property: An array of auto scale v-core resources.
     *
     * @return the value value.
     */
    public List<AutoScaleVCoreInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of auto scale v-core resources.
     *
     * @param value the value value to set.
     * @return the AutoScaleVCoreListResult object itself.
     */
    public AutoScaleVCoreListResult withValue(List<AutoScaleVCoreInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model AutoScaleVCoreListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
