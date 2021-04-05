/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the cloud service role sku.
 */
public class CloudServiceRoleSku {
    /**
     * The sku name. NOTE: If the new SKU is not supported on the hardware the
     * cloud service is currently on, you need to delete and recreate the cloud
     * service or move back to the old sku.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Specifies the tier of the cloud service. Possible Values are &lt;br
     * /&gt;&lt;br /&gt; **Standard** &lt;br /&gt;&lt;br /&gt; **Basic**.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /**
     * Specifies the number of role instances in the cloud service.
     */
    @JsonProperty(value = "capacity")
    private Long capacity;

    /**
     * Get the sku name. NOTE: If the new SKU is not supported on the hardware the cloud service is currently on, you need to delete and recreate the cloud service or move back to the old sku.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the sku name. NOTE: If the new SKU is not supported on the hardware the cloud service is currently on, you need to delete and recreate the cloud service or move back to the old sku.
     *
     * @param name the name value to set
     * @return the CloudServiceRoleSku object itself.
     */
    public CloudServiceRoleSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get specifies the tier of the cloud service. Possible Values are &lt;br /&gt;&lt;br /&gt; **Standard** &lt;br /&gt;&lt;br /&gt; **Basic**.
     *
     * @return the tier value
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set specifies the tier of the cloud service. Possible Values are &lt;br /&gt;&lt;br /&gt; **Standard** &lt;br /&gt;&lt;br /&gt; **Basic**.
     *
     * @param tier the tier value to set
     * @return the CloudServiceRoleSku object itself.
     */
    public CloudServiceRoleSku withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get specifies the number of role instances in the cloud service.
     *
     * @return the capacity value
     */
    public Long capacity() {
        return this.capacity;
    }

    /**
     * Set specifies the number of role instances in the cloud service.
     *
     * @param capacity the capacity value to set
     * @return the CloudServiceRoleSku object itself.
     */
    public CloudServiceRoleSku withCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }

}
