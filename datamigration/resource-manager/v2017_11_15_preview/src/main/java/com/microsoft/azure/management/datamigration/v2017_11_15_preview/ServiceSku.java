/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2017_11_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An Azure SKU instance.
 */
public class ServiceSku {
    /**
     * The unique name of the SKU, such as 'P3'.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The tier of the SKU, such as 'Free', 'Basic', 'Standard', or 'Premium'.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /**
     * The SKU family, used when the service has multiple performance classes
     * within a tier, such as 'A', 'D', etc. for virtual machines.
     */
    @JsonProperty(value = "family")
    private String family;

    /**
     * The size of the SKU, used when the name alone does not denote a service
     * size or when a SKU has multiple performance classes within a family,
     * e.g. 'A1' for virtual machines.
     */
    @JsonProperty(value = "size")
    private String size;

    /**
     * The capacity of the SKU, if it supports scaling.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /**
     * Get the unique name of the SKU, such as 'P3'.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the unique name of the SKU, such as 'P3'.
     *
     * @param name the name value to set
     * @return the ServiceSku object itself.
     */
    public ServiceSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier of the SKU, such as 'Free', 'Basic', 'Standard', or 'Premium'.
     *
     * @return the tier value
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier of the SKU, such as 'Free', 'Basic', 'Standard', or 'Premium'.
     *
     * @param tier the tier value to set
     * @return the ServiceSku object itself.
     */
    public ServiceSku withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the SKU family, used when the service has multiple performance classes within a tier, such as 'A', 'D', etc. for virtual machines.
     *
     * @return the family value
     */
    public String family() {
        return this.family;
    }

    /**
     * Set the SKU family, used when the service has multiple performance classes within a tier, such as 'A', 'D', etc. for virtual machines.
     *
     * @param family the family value to set
     * @return the ServiceSku object itself.
     */
    public ServiceSku withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get the size of the SKU, used when the name alone does not denote a service size or when a SKU has multiple performance classes within a family, e.g. 'A1' for virtual machines.
     *
     * @return the size value
     */
    public String size() {
        return this.size;
    }

    /**
     * Set the size of the SKU, used when the name alone does not denote a service size or when a SKU has multiple performance classes within a family, e.g. 'A1' for virtual machines.
     *
     * @param size the size value to set
     * @return the ServiceSku object itself.
     */
    public ServiceSku withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the capacity of the SKU, if it supports scaling.
     *
     * @return the capacity value
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity of the SKU, if it supports scaling.
     *
     * @param capacity the capacity value to set
     * @return the ServiceSku object itself.
     */
    public ServiceSku withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

}
