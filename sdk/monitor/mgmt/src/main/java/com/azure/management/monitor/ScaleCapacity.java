// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ScaleCapacity model. */
@Fluent
public final class ScaleCapacity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScaleCapacity.class);

    /*
     * the minimum number of instances for the resource.
     */
    @JsonProperty(value = "minimum", required = true)
    private String minimum;

    /*
     * the maximum number of instances for the resource. The actual maximum
     * number of instances is limited by the cores that are available in the
     * subscription.
     */
    @JsonProperty(value = "maximum", required = true)
    private String maximum;

    /*
     * the number of instances that will be set if metrics are not available
     * for evaluation. The default is only used if the current instance count
     * is lower than the default.
     */
    @JsonProperty(value = "default", required = true)
    private String defaultProperty;

    /**
     * Get the minimum property: the minimum number of instances for the resource.
     *
     * @return the minimum value.
     */
    public String minimum() {
        return this.minimum;
    }

    /**
     * Set the minimum property: the minimum number of instances for the resource.
     *
     * @param minimum the minimum value to set.
     * @return the ScaleCapacity object itself.
     */
    public ScaleCapacity withMinimum(String minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the maximum property: the maximum number of instances for the resource. The actual maximum number of
     * instances is limited by the cores that are available in the subscription.
     *
     * @return the maximum value.
     */
    public String maximum() {
        return this.maximum;
    }

    /**
     * Set the maximum property: the maximum number of instances for the resource. The actual maximum number of
     * instances is limited by the cores that are available in the subscription.
     *
     * @param maximum the maximum value to set.
     * @return the ScaleCapacity object itself.
     */
    public ScaleCapacity withMaximum(String maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Get the defaultProperty property: the number of instances that will be set if metrics are not available for
     * evaluation. The default is only used if the current instance count is lower than the default.
     *
     * @return the defaultProperty value.
     */
    public String defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty property: the number of instances that will be set if metrics are not available for
     * evaluation. The default is only used if the current instance count is lower than the default.
     *
     * @param defaultProperty the defaultProperty value to set.
     * @return the ScaleCapacity object itself.
     */
    public ScaleCapacity withDefaultProperty(String defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (minimum() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property minimum in model ScaleCapacity"));
        }
        if (maximum() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property maximum in model ScaleCapacity"));
        }
        if (defaultProperty() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property defaultProperty in model ScaleCapacity"));
        }
    }
}
