/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.azure.search.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a resource's usage and quota.
 */
public class ResourceCounter {
    /**
     * The resource usage amount.
     */
    @JsonProperty(value = "usage")
    private long usage;

    /**
     * The resource amount quota.
     */
    @JsonProperty(value = "quota")
    private Long quota;

    /**
     * Get the resource usage amount.
     *
     * @return the usage value
     */
    public long usage() {
        return this.usage;
    }

    /**
     * Set the resource usage amount.
     *
     * @param usage the usage value to set
     * @return the ResourceCounter object itself.
     */
    public ResourceCounter withUsage(long usage) {
        this.usage = usage;
        return this;
    }

    /**
     * Get the resource amount quota.
     *
     * @return the quota value
     */
    public Long quota() {
        return this.quota;
    }

    /**
     * Set the resource amount quota.
     *
     * @param quota the quota value to set
     * @return the ResourceCounter object itself.
     */
    public ResourceCounter withQuota(Long quota) {
        this.quota = quota;
        return this;
    }

}
