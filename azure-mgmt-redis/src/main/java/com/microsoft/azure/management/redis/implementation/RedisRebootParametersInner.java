/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.implementation;

import com.microsoft.azure.management.redis.RebootType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies which Redis node(s) to reboot.
 */
public class RedisRebootParametersInner {
    /**
     * Which Redis node(s) to reboot. Depending on this value data loss is
     * possible. Possible values include: 'PrimaryNode', 'SecondaryNode',
     * 'AllNodes'.
     */
    @JsonProperty(required = true)
    private RebootType rebootType;

    /**
     * If clustering is enabled, the ID of the shard to be rebooted.
     */
    private Integer shardId;

    /**
     * Get the rebootType value.
     *
     * @return the rebootType value
     */
    public RebootType rebootType() {
        return this.rebootType;
    }

    /**
     * Set the rebootType value.
     *
     * @param rebootType the rebootType value to set
     * @return the RedisRebootParametersInner object itself.
     */
    public RedisRebootParametersInner withRebootType(RebootType rebootType) {
        this.rebootType = rebootType;
        return this;
    }

    /**
     * Get the shardId value.
     *
     * @return the shardId value
     */
    public Integer shardId() {
        return this.shardId;
    }

    /**
     * Set the shardId value.
     *
     * @param shardId the shardId value to set
     * @return the RedisRebootParametersInner object itself.
     */
    public RedisRebootParametersInner withShardId(Integer shardId) {
        this.shardId = shardId;
        return this;
    }

}
