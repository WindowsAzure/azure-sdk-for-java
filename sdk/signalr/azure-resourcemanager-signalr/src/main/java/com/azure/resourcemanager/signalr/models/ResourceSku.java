// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The billing information of the SignalR resource. */
@Fluent
public final class ResourceSku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceSku.class);

    /*
     * The name of the SKU. Required.
     *
     * Allowed values: Standard_S1, Free_F1
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Optional tier of this particular SKU. 'Standard' or 'Free'.
     *
     * `Basic` is deprecated, use `Standard` instead.
     */
    @JsonProperty(value = "tier")
    private SignalRSkuTier tier;

    /*
     * Optional string. For future use.
     */
    @JsonProperty(value = "size")
    private String size;

    /*
     * Optional string. For future use.
     */
    @JsonProperty(value = "family")
    private String family;

    /*
     * Optional, integer. The unit count of SignalR resource. 1 by default.
     *
     * If present, following values are allowed:
     * Free: 1
     * Standard: 1,2,5,10,20,50,100
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /**
     * Get the name property: The name of the SKU. Required.
     *
     * <p>Allowed values: Standard_S1, Free_F1.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the SKU. Required.
     *
     * <p>Allowed values: Standard_S1, Free_F1.
     *
     * @param name the name value to set.
     * @return the ResourceSku object itself.
     */
    public ResourceSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: Optional tier of this particular SKU. 'Standard' or 'Free'.
     *
     * <p>`Basic` is deprecated, use `Standard` instead.
     *
     * @return the tier value.
     */
    public SignalRSkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Optional tier of this particular SKU. 'Standard' or 'Free'.
     *
     * <p>`Basic` is deprecated, use `Standard` instead.
     *
     * @param tier the tier value to set.
     * @return the ResourceSku object itself.
     */
    public ResourceSku withTier(SignalRSkuTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the size property: Optional string. For future use.
     *
     * @return the size value.
     */
    public String size() {
        return this.size;
    }

    /**
     * Set the size property: Optional string. For future use.
     *
     * @param size the size value to set.
     * @return the ResourceSku object itself.
     */
    public ResourceSku withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the family property: Optional string. For future use.
     *
     * @return the family value.
     */
    public String family() {
        return this.family;
    }

    /**
     * Set the family property: Optional string. For future use.
     *
     * @param family the family value to set.
     * @return the ResourceSku object itself.
     */
    public ResourceSku withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get the capacity property: Optional, integer. The unit count of SignalR resource. 1 by default.
     *
     * <p>If present, following values are allowed: Free: 1 Standard: 1,2,5,10,20,50,100.
     *
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Optional, integer. The unit count of SignalR resource. 1 by default.
     *
     * <p>If present, following values are allowed: Free: 1 Standard: 1,2,5,10,20,50,100.
     *
     * @param capacity the capacity value to set.
     * @return the ResourceSku object itself.
     */
    public ResourceSku withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model ResourceSku"));
        }
    }
}
